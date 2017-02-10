/**
 * 精确询价返回数据的处理
 */
package pkg_auto.autobj.ccic.serverProcess;

import java.sql.BatchUpdateException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;

import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_exception;
import pkg_sinopec.Dunxin_tp;

import pkg_auto.autobj.pojo.CarPQRJson;

import com.ccic.gwservice.car.fgcpiprecisequote.CarTaxDTO;
import com.ccic.gwservice.car.fgcpiprecisequote.FGPreciseQuoteResponse;
import com.ccic.gwservice.car.fgcpiprecisequote.KindDTO;
import com.ccic.gwservice.car.fgcpiprecisequote.PreciseQuoteResponseDTO;

/**
 * @author Administrator
 * 
 */
public class Ccic_CarFGPreciseQuoteOut {
	private Logger log = Logger.getLogger(Ccic_CarFGPreciseQuoteOut.class);

	public String fgCarPQResponseToFront(FGPreciseQuoteResponse fgResponse,
			String serial_no, String jycode, String quotationType) {
		String retu = "";
		if (fgResponse == null) {
			retu =  "{\"flag\":\"false\",\"info\":\"response为空\"}";
			log.error(retu);
		} else {
			com.ccic.gwservice.car.fgcpiprecisequote.ResponseHeadDTO responseHead = fgResponse
					.getResponseHead();
			int mark = responseHead.getStatus();
			if (mark == 0) {// 查询成功
				log.error("报价成功！");
				retu = fgCarPrecQ_success(fgResponse.getResponseBody(), jycode,
						serial_no, quotationType);

			} else {// 查询失败
				retu = fgCarPrecQ_faile(fgResponse);
			}
		}

		return retu;
	}

	/**
	 * 精确报价成功后信息处理
	 * 
	 * @param responseBody
	 * @param jycode
	 * @param serial_no
	 * @return
	 */
	private String fgCarPrecQ_success(PreciseQuoteResponseDTO responseBody,
			String jycode, String serial_no, String quotationType) {
		JSONObject jb = null;
		boolean tag = false;
		String info = "精确报价成功！";
		int bmz_ddid=0;
		try {
			String[] sqls = getStrBatchSql(responseBody, jycode, serial_no,quotationType);//根据返回内容，生成批sql语句		
			if (null != sqls) {
				log.error("报价成功：生成批处理语句");
				if (sqls.length > 0) {
					tag = execBatchSql(sqls);//执行批处理语句
					if (tag) {
						Ccic_bmz_order ccic_order = new Ccic_bmz_order();
						bmz_ddid= ccic_order.saveToBmz(jycode,serial_no);//在便民站数据库插入已报价订单
						if (bmz_ddid>0) {
							info = info +"便民站订单生成成功。可在菜单【车险订单查询】中找到【订单号"+bmz_ddid+"】并进行投保。总费用";
						    info = info +ccic_order.getSum_price()+"元["+ccic_order.getPrice_detail()+"]";  
						    //给客户手机发送短信
						    String dxnr="大地车险为您报价,保费"+ccic_order.getSum_price()+"元["+ccic_order.getPrice_detail()+"]。欢迎您至下单邮政便民站投保。";
						    Dunxin_tp message = new Dunxin_tp();
						    String messreturn = message.SendXx(ccic_order.getTele_no(), dxnr, ccic_order.getCity_code());
						    log.error("短信："+messreturn);
						} else {
							tag = false;
							info = info +"便民站订单生成失败。请联系管理员。";
						}
					} else info = info +"报价详细数据记录失败。请联系管理员。<br>";
							
				} else info="批处理语句为空，请联系管理员。";
                  
			} else {
                info = "批处理语句生成不成功，请联系管理员。";
			}
			log.error(info);
			if (tag) {
				CarPQRJson carJ = new CarPQRJson();
				  carJ.setJycode(jycode);
				  carJ.setFlag(true);
				  carJ.setInfo(info);
				  carJ.setSerial_no(bmz_ddid);
				jb = JSONObject.fromObject(carJ);	
			} else {
				CarPQRJson carJ = new CarPQRJson();
			      carJ.setFlag(tag);
			      carJ.setInfo(info);
			      jb = JSONObject.fromObject(carJ);
			}
		} catch (Cls_exception e) {
			log.error(e.toString());
			e.printStackTrace();
			log.error("{\"flag\":\"false\",\"info\":\"报价返回数据处理异常\"}");
			return "{\"flag\":\"false\",\"info\":\"报价返回数据处理异常\"}";
		} catch (Exception e) {
			log.error(e.toString());
			e.printStackTrace();
			log.error("{\"flag\":\"false\",\"info\":\"报价返回数据处理异常\"}");
			return "{\"flag\":\"false\",\"info\":\"报价返回数据处理异常\"}";
		}
		return jb.toString();
	}

	/**
	 * 核对分项金额
	
	private boolean checkPremium(PreciseQuoteResponseDTO rBody, String jycode,
			int serial_no) {
		double sumPremium = Double.parseDouble(rBody.getSumPremium());// 总保费
		double sumProfit = Double.parseDouble(rBody.getSumProfit());// 总优惠金额
		double sumTax = Double.parseDouble(rBody.getSumTax());// 总支付税金
		double kind_premium = 0.0;
		KindDTO[] kinds = rBody.getKinds();
		for (KindDTO kind : kinds) {
			kind_premium = kind_premium + kind.getPremium();
		}
		CarTaxDTO cartax = rBody.getCarTax();
		if (null != cartax)
			kind_premium = kind_premium
					+ Double.parseDouble(cartax.getSumPayment());
		boolean tag = false;
		if (sumPremium + sumTax - sumProfit == kind_premium)
			tag = true;
		return tag;
	} */
/**
 * 执行批量Sql语句
 * 
 */
	private boolean execBatchSql(String[] sqls) throws Cls_exception {
		boolean tag = true;
		java.sql.Connection con = null;
		Statement stmt = null;
		java.sql.ResultSet rs = null;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt = con.createStatement();
			for (String sql : sqls) {
				stmt.addBatch(sql);
			}

			int[] counts = stmt.executeBatch();
			con.commit();
			stmt.close();
			int num = counts.length;
			for (int i = 0; i < num; i++) {
				if (counts[i] <= 0)
					tag = tag && false;
			}
			con.setAutoCommit(true);// 恢复默认
		} catch (BatchUpdateException see) {
			log.error("批处理异常：" + see.toString());
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} catch (SQLException se) {
			log.error("批处理sql异常：" + se.toString());
			se.printStackTrace();
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} catch (Exception e) {
			log.error("exeBatchSql:" + e.toString());
			e.printStackTrace();
			if (con != null) {
				try {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"Ccic_CarFGPreciseQuoteOut .execBatchSql()"
									+ e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"Ccic_CarFGPreciseQuoteOut .execBatchSql()"
									+ e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"Ccic_CarFGPreciseQuoteOut .execBatchSql()"
									+ e.toString());
				}
				con = null;
			}
		}
		return tag;

	}

	/**
	 * 根据返回的responseDTO,返回要执行的Sql语句数组。
	 * @param  quotationType 报价类型，用于判断是否有车船税的返回内容
	 * @param  jycode,serial_no 数据标定
	 */
	private String[] getStrBatchSql(PreciseQuoteResponseDTO rBody,
			String jycode, String serial_no, String quotationType) {
		String[] sqls = null;
		ArrayList<String> rtnAL = new ArrayList<String>();
		StringBuffer sql = new StringBuffer();
		sql.append("update KCS_CCIC_CARDTO set ");
		if (null!=rBody.getSumProfit())
		sql.append("sumProfit="+rBody.getSumProfit()+",");
		if (null!=rBody.getSumTax())
			sql.append("sumTax="+rBody.getSumTax()+",");		
		sql.append("querySequenceNo='"+rBody.getQuerySequenceNo()+"',querySequenceBZNo='"+rBody.getQuerySequenceBZNo()+"',");
		sql.append("quotationBIID='"+rBody.getQuotationBIId()+"',quotationCIID='"+rBody.getQuotationCIId()+"',quotationNoBI='"+rBody.getQuotationBINo()+"',");
		sql.append("quotationNoCI='"+rBody.getQuotationCINo()+"',sumAmount="+rBody.getSumAmount()+",sumPremium="+rBody.getSumPremium()+",");	
		sql.append(" succ_mark=1");
		sql.append(" where serial_no=" + serial_no + " and MESSAGEID='"
				+ jycode + "'");
		rtnAL.add(sql.toString());
		sql.delete(0, sql.length());
		KindDTO[] kinds = rBody.getKinds();
		if (kinds != null) {
			for (KindDTO kind : kinds) {
				sql.append("update kcs_ccic_kinddto");
				sql.append(" set benchmarkPremium="+ kind.getBenchmarkPremium() + ",premium="+ kind.getPremium());
				sql.append("  where MESSAGEID='" + jycode + "' and kindCode='"+kind.getKindCode()+"'");
				rtnAL.add(sql.toString());
				sql.delete(0, sql.length());
			}
		}
		if (quotationType.equals("1") || quotationType.equals("3")) {
			CarTaxDTO cartax = rBody.getCarTax();
			if (null!=cartax) {
			sql.append("update kcs_ccic_cartaxdto ");
			sql.append(" set benchmarkTax=" + cartax.getBenchmarkTax()
					+ ",tax=" + cartax.getTax() + ",");
			sql.append(" taxOverdue=" + cartax.getTaxOverdue() + ",surCharge="
					+ cartax.getSurCharge() + ",sumPayment="
					+ cartax.getSumPayment());
			sql.append("  where MESSAGEID='" + jycode + "' and taxflag='"+cartax.getTaxFlag()+"'");
			rtnAL.add(sql.toString());
			sql.delete(0, sql.length());
			}
		}
		int size = rtnAL.size();
		if (size > 0)
			sqls = (String[]) rtnAL.toArray(new String[size]);
		return sqls;

	}

	/**
	 * 精确报价失败的返回信息
	 * 
	 * @param fgResponse
	 * @return
	 */
	private String fgCarPrecQ_faile(FGPreciseQuoteResponse fgResponse) {
		JSONObject jb = null;
		CarPQRJson carJ = new CarPQRJson();
		carJ.setFlag(false);
		carJ.setInfo("保险公司接口查询失败,代码："
				+ fgResponse.getResponseHead().getReturnCode()
				+ fgResponse.getResponseHead().getReturnMessage());
		jb = JSONObject.fromObject(carJ);
		log.error("保险公司接口查询失败,代码："+ fgResponse.getResponseHead().getReturnCode()
				+ fgResponse.getResponseHead().getReturnMessage());
		return jb.toString();
	}

}
