/**
 * ��ȷѯ�۷������ݵĴ���
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
			retu =  "{\"flag\":\"false\",\"info\":\"responseΪ��\"}";
			log.error(retu);
		} else {
			com.ccic.gwservice.car.fgcpiprecisequote.ResponseHeadDTO responseHead = fgResponse
					.getResponseHead();
			int mark = responseHead.getStatus();
			if (mark == 0) {// ��ѯ�ɹ�
				log.error("���۳ɹ���");
				retu = fgCarPrecQ_success(fgResponse.getResponseBody(), jycode,
						serial_no, quotationType);

			} else {// ��ѯʧ��
				retu = fgCarPrecQ_faile(fgResponse);
			}
		}

		return retu;
	}

	/**
	 * ��ȷ���۳ɹ�����Ϣ����
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
		String info = "��ȷ���۳ɹ���";
		int bmz_ddid=0;
		try {
			String[] sqls = getStrBatchSql(responseBody, jycode, serial_no,quotationType);//���ݷ������ݣ�������sql���		
			if (null != sqls) {
				log.error("���۳ɹ����������������");
				if (sqls.length > 0) {
					tag = execBatchSql(sqls);//ִ�����������
					if (tag) {
						Ccic_bmz_order ccic_order = new Ccic_bmz_order();
						bmz_ddid= ccic_order.saveToBmz(jycode,serial_no);//�ڱ���վ���ݿ�����ѱ��۶���
						if (bmz_ddid>0) {
							info = info +"����վ�������ɳɹ������ڲ˵������ն�����ѯ�����ҵ���������"+bmz_ddid+"��������Ͷ�����ܷ���";
						    info = info +ccic_order.getSum_price()+"Ԫ["+ccic_order.getPrice_detail()+"]";  
						    //���ͻ��ֻ����Ͷ���
						    String dxnr="��س���Ϊ������,����"+ccic_order.getSum_price()+"Ԫ["+ccic_order.getPrice_detail()+"]����ӭ�����µ���������վͶ����";
						    Dunxin_tp message = new Dunxin_tp();
						    String messreturn = message.SendXx(ccic_order.getTele_no(), dxnr, ccic_order.getCity_code());
						    log.error("���ţ�"+messreturn);
						} else {
							tag = false;
							info = info +"����վ��������ʧ�ܡ�����ϵ����Ա��";
						}
					} else info = info +"������ϸ���ݼ�¼ʧ�ܡ�����ϵ����Ա��<br>";
							
				} else info="���������Ϊ�գ�����ϵ����Ա��";
                  
			} else {
                info = "������������ɲ��ɹ�������ϵ����Ա��";
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
			log.error("{\"flag\":\"false\",\"info\":\"���۷������ݴ����쳣\"}");
			return "{\"flag\":\"false\",\"info\":\"���۷������ݴ����쳣\"}";
		} catch (Exception e) {
			log.error(e.toString());
			e.printStackTrace();
			log.error("{\"flag\":\"false\",\"info\":\"���۷������ݴ����쳣\"}");
			return "{\"flag\":\"false\",\"info\":\"���۷������ݴ����쳣\"}";
		}
		return jb.toString();
	}

	/**
	 * �˶Է�����
	
	private boolean checkPremium(PreciseQuoteResponseDTO rBody, String jycode,
			int serial_no) {
		double sumPremium = Double.parseDouble(rBody.getSumPremium());// �ܱ���
		double sumProfit = Double.parseDouble(rBody.getSumProfit());// ���Żݽ��
		double sumTax = Double.parseDouble(rBody.getSumTax());// ��֧��˰��
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
 * ִ������Sql���
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
			con.setAutoCommit(true);// �ָ�Ĭ��
		} catch (BatchUpdateException see) {
			log.error("�������쳣��" + see.toString());
			try {
				if (con != null) {
					con.rollback();// ����sql�쳣������ع�
					con.setAutoCommit(true);// �����ύ��ʽΪĬ�Ϸ�ʽ
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} catch (SQLException se) {
			log.error("������sql�쳣��" + se.toString());
			se.printStackTrace();
			try {
				if (con != null) {
					con.rollback();// ����sql�쳣������ع�
					con.setAutoCommit(true);// �����ύ��ʽΪĬ�Ϸ�ʽ
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} catch (Exception e) {
			log.error("exeBatchSql:" + e.toString());
			e.printStackTrace();
			if (con != null) {
				try {
					con.rollback();// ����sql�쳣������ع�
					con.setAutoCommit(true);// �����ύ��ʽΪĬ�Ϸ�ʽ
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
	 * ���ݷ��ص�responseDTO,����Ҫִ�е�Sql������顣
	 * @param  quotationType �������ͣ������ж��Ƿ��г���˰�ķ�������
	 * @param  jycode,serial_no ���ݱ궨
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
	 * ��ȷ����ʧ�ܵķ�����Ϣ
	 * 
	 * @param fgResponse
	 * @return
	 */
	private String fgCarPrecQ_faile(FGPreciseQuoteResponse fgResponse) {
		JSONObject jb = null;
		CarPQRJson carJ = new CarPQRJson();
		carJ.setFlag(false);
		carJ.setInfo("���չ�˾�ӿڲ�ѯʧ��,���룺"
				+ fgResponse.getResponseHead().getReturnCode()
				+ fgResponse.getResponseHead().getReturnMessage());
		jb = JSONObject.fromObject(carJ);
		log.error("���չ�˾�ӿڲ�ѯʧ��,���룺"+ fgResponse.getResponseHead().getReturnCode()
				+ fgResponse.getResponseHead().getReturnMessage());
		return jb.toString();
	}

}
