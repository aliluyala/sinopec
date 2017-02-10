/**
 * 
 */
package pkg_auto.autobj.ccic.serverProcess;

import java.sql.SQLException;
import java.sql.SQLRecoverableException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.ccic.gwservice.car.fgcpiprecisequote.AnnualTaxDTO;
import com.ccic.gwservice.car.fgcpiprecisequote.CarTaxDTO;
import com.ccic.gwservice.car.fgcpiprecisequote.KindDTO;
import com.ccic.gwservice.car.fgcpiprecisequote.PrivyDTO;

import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_e_bx;
import pkg_sinopec.Cls_exception;
import pkg_sinopec.Cls_zd;

/**
 * @author Administrator
 * 大地车险 - 便民站  -订单
 */
public class Ccic_bmz_order extends Cls_e_bx {
	private Logger log = Logger.getLogger(Ccic_bmz_order.class);
	private String querySequenceNo = "";
	private String querySequenceBZNo = "";
	private String quotationBIID = "";
	private String quotationCIID = "";
	private String quotationNoBI = "";
	private String quotationNoCI = "";
	private final int bj_mark = 1;

	public String getQuerySequenceNo() {
		return querySequenceNo;
	}

	public String getQuerySequenceBZNo() {
		return querySequenceBZNo;
	}

	public String getQuotationBIID() {
		return quotationBIID;
	}

	public String getQuotationCIID() {
		return quotationCIID;
	}

	public String getQuotationNoBI() {
		return quotationNoBI;
	}

	public String getQuotationNoCI() {
		return quotationNoCI;
	}

	public void setQuerySequenceNo(String querySequenceNo) {
		this.querySequenceNo = querySequenceNo;
	}

	public void setQuerySequenceBZNo(String querySequenceBZNo) {
		this.querySequenceBZNo = querySequenceBZNo;
	}

	public void setQuotationBIID(String quotationBIID) {
		this.quotationBIID = quotationBIID;
	}

	public void setQuotationCIID(String quotationCIID) {
		this.quotationCIID = quotationCIID;
	}

	public void setQuotationNoBI(String quotationNoBI) {
		this.quotationNoBI = quotationNoBI;
	}

	public void setQuotationNoCI(String quotationNoCI) {
		this.quotationNoCI = quotationNoCI;
	}

   /**
    *  设置险别信息，查到匹配kindDTO[] kinds,遍历kinds生成不计免赔x_bjm与报价详情price_detial内容，并设置各个险种信息。
    *  @param jycode 
    *  
    * @return
    * @throws Cls_exception
    */
	private boolean setKind(String jycode) throws Cls_exception {
		log.error("ccic_bmz_order:设置险种信息");
		KindDTO[] kinds = getKindDTO(jycode);
		boolean tag = false;
		String kindCode = "";
		int be = 0;
		String[] bjm = {"0","0","0","0","0","0"};
		if (null != kinds)
			tag = true;
		StringBuffer bprice_detail = new StringBuffer();
		for (KindDTO kind : kinds) {
			kindCode = kind.getKindCode();
			if (kindCode.equals("A")) {// 车辆损失保险 1
				this.setX_sunshi(1);
				this.setF_sunshi(kind.getPremium());
				this.setE_sunshi(kind.getAmount());
				if ("1".equals(kind.getKindFlag()))
					bjm[0] = "1";
				bprice_detail.append("车辆损失险:"+kind.getPremium()+"元;");
			}
			if (kindCode.equals("G1")) {// 全车盗抢险 3
				this.setX_daoq(1);
				this.setF_daoq(kind.getPremium());
				this.setE_daoq(kind.getAmount());
				if ("1".equals(kind.getKindFlag()))
					bjm[2] = "1";
				bprice_detail.append("盗抢险:"+kind.getPremium()+"元;");
			}
			if (kindCode.equals("Z")) {// 自燃损失险
				this.setX_ziran(1);
				this.setF_ziran(kind.getPremium());
				this.setE_ziran(kind.getAmount());
				bprice_detail.append("自燃险:"+kind.getPremium()+"元;");
			}
			if (kindCode.equals("B")) {// 第三者责任保险 2
				be = (int) (kind.getAmount() / 10000);
				this.setX_3zhe(be);
				this.setF_3zhe(kind.getPremium());
				if ("1".equals(kind.getKindFlag()))
					bjm[1] = "1";
				bprice_detail.append("三者险:"+kind.getPremium()+"元;");
			}
			if (kindCode.equals("D3")) {// 驾驶员车上人员责任险 4
				be = (int) (kind.getAmount() / 10000);
				this.setX_siji(be);
				this.setF_siji(kind.getPremium());
				if ("1".equals(kind.getKindFlag()))
					bjm[3] = "1";
				bprice_detail.append("司机责任险:"+kind.getPremium()+"元;");
			}
			if (kindCode.equals("D4")) {// 乘客车上人员责任险 5
				be = (int) (kind.getUnitAmount() / 10000);
				this.setX_chke(be);
				this.setF_chke(kind.getPremium());
				if ("1".equals(kind.getKindFlag()))
					bjm[4] = "1";
				bprice_detail.append("乘客责任险:"+kind.getPremium()+"元;");
			}
			if (kindCode.equals("L")) {// 车身划痕损失险 6
				be = (int) (kind.getAmount() / 1);
				this.setX_hhen(be);
				this.setF_hhen(kind.getPremium());
				if ("1".equals(kind.getKindFlag()))
					bjm[5] = "1";
				bprice_detail.append("划痕险:"+kind.getPremium()+"元;");
			}
			if (kindCode.equals("F")) {// 玻璃单独破碎险
				if ("1".equals(kind.getModeCode()))
					this.setX_boli(1);
				if ("2".equals(kind.getModeCode()))
					this.setX_boli(2);
				this.setF_boli(kind.getPremium());
				bprice_detail.append("玻璃险:"+kind.getPremium()+"元;");
			}
			if (kindCode.equals("A6")) {// 车辆损失保险无法找到第三方特约险
				this.setX_3(1);
				this.setF_3(kind.getPremium());
				bprice_detail.append("无第三方特约险:"+kind.getPremium()+"元;");
			}
			if (kindCode.equals("BZ")) {// 交通事故责任强制保险
				this.setX_jq(1);
				this.setF_jq(kind.getPremium());
				bprice_detail.append("交强险:"+kind.getPremium()+"元;");
			}
			if (kindCode.equals("M")) {// 不计免赔特约条款
				//bjm_mark = 1;
				this.setF_bjm(kind.getPremium());
				bprice_detail.append("不计免赔:"+kind.getPremium()+"元;");
			}
		}// end for
		//if (bjm_mark == 1) {
			StringBuffer sbjm = new StringBuffer();
			for (String s : bjm) {
				sbjm.append(s);
			}
			this.setX_bjm(sbjm.toString());
			log.error("不计免赔X_bjm = "+sbjm);
		//}
		bprice_detail.append(null==this.getPrice_detail()?"":this.getPrice_detail());
		this.setPrice_detail(bprice_detail.toString());
		return tag;
	}
   /**
    * 根据交易号查询得到险种列表KindDTO[]
    * @param jycode
    * @return
    * @throws Cls_exception
    */
	private KindDTO[] getKindDTO(String jycode) throws Cls_exception {
		ArrayList<KindDTO> rtnAL = new ArrayList<KindDTO>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		KindDTO[] kinds = null;
		int size = 0;
		StringBuffer sql = new StringBuffer();
		sql.append("select * from kcs_ccic_kinddto where MESSAGEID='");
		sql.append(jycode);
		sql.append("'");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());

			rs = pstmt.executeQuery();
			KindDTO kind;
			while (rs.next()) {
				kind = new KindDTO();
				kind.setKindCode(rs.getString("kindCode"));
				kind.setKindName(rs.getString("kindname"));
				kind.setAmount(rs.getDouble("amount"));
				kind.setModeCode(rs.getString("modeCode"));
				kind.setKindFlag(rs.getString("kindFlag"));
				kind.setPremium(rs.getDouble("premium"));
				kind.setUnitAmount(rs.getDouble("unitAmount"));
				rtnAL.add(kind);
				kind = null;
			}
			if (null != rtnAL)
				size = rtnAL.size();
			if (size > 0)
				kinds = (KindDTO[]) rtnAL.toArray(new KindDTO[size]);
		} catch (SQLRecoverableException e) {
			log.error("ccic_bmz_order.getKindDto:"+e.toString());
			e.printStackTrace();
		} catch (SQLException e) {
			log.error("ccic_bmz_order.getKindDto:"+e.toString());
			e.printStackTrace();
		} catch (Exception e) {
			log.error("ccic_bmz_order.getKindDto:"+e.toString());
			throw new Cls_exception("Ccic_tobmz.getKindDTO() " + e.toString());
		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				throw new Cls_exception("Ccic_tobmz.getKindDTO()"
						+ e.toString());
			}

		}
		return kinds;
	}

   /**
    * 设置车船税信息，查到匹配carTaxDTO cartax,由cartax设置车船税信息
    * @param jycode 
    */
	private boolean setCartax(String jycode) throws Cls_exception {
		log.error("ccic_bmz_order:设置车船税信息");
		boolean tag = false;
		CarTaxDTO cartax = getCartaxDTO(jycode);
		StringBuffer bprice_detail = new StringBuffer();
		if (null != cartax) {
			if ("0".equals(cartax.getTaxFlag())) {
				this.setX_chchsh(1);
				this.setF_chchsh(Double.parseDouble(cartax.getSumPayment()));
				bprice_detail.append("车船税:"+cartax.getSumPayment()+"元;");
				bprice_detail.append(null==this.getPrice_detail()?"":this.getPrice_detail());
				this.setPrice_detail(bprice_detail.toString());
			}
			tag = true;
		}
		log.error("="+tag);
		return tag;
	}
   /**
    * 根据交易号查询到车船税CarTaxDTO
    * @param jycode
    * @return
    * @throws Cls_exception
    */
	private CarTaxDTO getCartaxDTO(String jycode) throws Cls_exception {
		CarTaxDTO cartax = new CarTaxDTO();
		AnnualTaxDTO tax = new AnnualTaxDTO();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select * from kcs_ccic_cartaxdto where MESSAGEID='");
		sql.append(jycode);
		sql.append("'");
		//log.error(sql.toString());
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				//log.error("taxflag=" + rs.getString("taxflag") + "/"
						//+ rs.getString("taxStartDate"));
				cartax.setTaxFlag(rs.getString("taxflag"));
				cartax.setSumPayment(rs.getString("sumPayment"));
				tax.setTaxStartDate(rs.getString("taxStartDate"));
			}
		} catch (SQLRecoverableException e) {
			log.error("ccic_bmz_order.getCartaxDTO:"+e.toString());
			e.printStackTrace();
		} catch (SQLException e) {
			log.error("ccic_bmz_order.getCartaxDTO:"+e.toString());
			e.printStackTrace();
		} catch (Exception e) {
			log.error("ccic_bmz_order.getCartaxDTO:"+e.toString());
			throw new Cls_exception("ccic_bmz_order.getCartaxDTO " + e.toString());
		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				throw new Cls_exception("ccic_bmz_order.getCartaxDTO"
						+ e.toString());
			}

		}
		cartax.setCurrentTaxDue(tax);
		return cartax;
	}
   /**
    * 设置车辆基本信息
    * @param serial_no
    * @return
    * @throws Cls_exception
    */
	private boolean setCarXx(String serial_no) throws Cls_exception {
		log.error("ccic_bmz_order:设置车辆基本信息");
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		String stmp = "";
		boolean tag = false;
		StringBuffer sql = new StringBuffer();
		sql.append("select t.licenseNo,t.licenseType,t.frameNo,t.enrollDate,t.engineNo,t.chgOwnerFlag,to_char(t.startDate,'yyyy-mm-dd') as startdate,");
		sql.append("t.Orgcode,t.opercode,t.brandEN,a.seat,a.industryVehicleName,a.fullWeight,a.vtonnage,");
		sql.append("t.querySequenceNo,t.querySequenceBZNo,t.quotationBIID,t.quotationCIID,t.quotationNoBI,t.quotationNoCI,");// 返回的各个查询码
		sql.append("t.sumPremium+t.sumTax as price");
		sql.append(" from kcs_ccic_cardto t,kcs_ccic_carmodeldto a ");
		sql.append(" where t.serial_no=" + serial_no
				+ " and a.messageid=t.messageid and t.modelcode=a.modelcode");
		//log.error(sql.toString());
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				tag = true;
				this.setCphm(rs.getString("licenseNo"));
				stmp = rs.getString("licenseType");
				if ("02".equals(stmp))
					this.setChllx(8);// 小车
				if ("01".equals(stmp) || "15".equals(stmp))
					this.setChllx(9);// 大车
				this.setFdjhm(rs.getString("engineNo"));
				this.setCjhm(rs.getString("frameNo"));
				this.setWztx(rs.getInt("chgOwnerFlag"));
				this.setBxrq(rs.getString("startdate"));
				this.setInvoice(rs.getInt("seat"));
				this.setPpxh(rs.getString("brandEN"));
				this.setC_zhl(rs.getInt("fullWeight"));
				this.setH_zhl(rs.getInt("vtonnage"));
				this.setQuerySequenceBZNo(rs.getString("querySequenceBZNo"));
				this.setQuerySequenceNo(rs.getString("querySequenceNo"));
				this.setQuotationBIID(rs.getString("quotationBIID"));
				this.setQuotationCIID(rs.getString("quotationCIID"));
				this.setQuotationNoBI(rs.getString("quotationNoBI"));
				this.setQuotationNoCI(rs.getString("quotationNoCI"));
				this.setPrice(rs.getDouble("price"));
				this.setSum_price(rs.getDouble("price"));
				this.setOpercode(rs.getString("opercode"));
				this.setOrg_code(rs.getString("orgcode"));
			}
		} catch (SQLRecoverableException e) {
			log.error("ccic_bmz_order.setCarXx:"+e.toString());
			e.printStackTrace();
		} catch (SQLException e) {
			log.error("ccic_bmz_order.setCarXx:"+e.toString());
			e.printStackTrace();
		} catch (Exception e) {
			log.error("ccic_bmz_order.setCarXx:"+e.toString());
			throw new Cls_exception("ccic_bmz_order.setCarXx: " + e.toString());
		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				throw new Cls_exception("ccic_bmz_order.setCarXx:"
						+ e.toString());
			}

		}
		return tag;
	}

   /**
    * 设置投保人信息，查询到匹配的投保人privy 并设置信息。
    * @param jycode 
    * @return
    * @throws Cls_exception
    */
	private boolean setPrivy(String jycode) throws Cls_exception {
		log.error("ccic_bmz_order:设置投保人信息");
		PrivyDTO privy = getPrivyDTO(jycode);
		boolean tag = false;
		if (null != privy) {
			this.setTele_no(privy.getMobile());
			this.setName(privy.getInsuredName());
			this.setSfzid(privy.getIdentifyNumber());
			tag = true;
		}
		return tag;
	}
   /**
    * 根据交易号查询到投保人PrivyDTO
    * @param jycode
    * @return
    * @throws Cls_exception
    */
	private PrivyDTO getPrivyDTO(String jycode) throws Cls_exception {
		PrivyDTO privy = new PrivyDTO();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select * from KCS_CCIC_PRIVYDTO where MESSAGEID='");
		sql.append(jycode);
		sql.append("' and insuredFlag='0100000'");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				privy = new PrivyDTO();
				privy.setInsuredName(rs.getString("insuredName"));
				privy.setIdentifyNumber(rs.getString("identifyNumber"));
				privy.setMobile(rs.getString("mobile"));
			}
		} catch (SQLRecoverableException e) {
			log.error("ccic_bmz_order.getPrivyDTO:"+e.toString());
			e.printStackTrace();
		} catch (SQLException e) {
			log.error("ccic_bmz_order.getPrivyDTO:"+e.toString());
			e.printStackTrace();
		} catch (Exception e) {
			log.error("ccic_bmz_order.getPrivyDTO:"+e.toString());
			throw new Cls_exception("ccic_bmz_order.getPrivyDTO:" + e.toString());
		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				throw new Cls_exception("ccic_bmz_order.getPrivyDTO:"
						+ e.toString());
			}

		}
		return privy;

	}
   /**
    * 设置处理机构、机构名，机构电话，城市代码,
    * @return
    * @throws Cls_exception
   */
	private boolean setCljg() throws Cls_exception {
		log.error("ccic_bmz_order:设置处理机构信息");
		String jgh = this.getOrg_code();
		boolean tag = false;
		Cls_zd zd = new Cls_zd();
		this.setCity_code(jgh.substring(0, 2));
		this.setChzh(zd.GetJgname(jgh));
		//this.setChzh("荷香苑店便民站");
		this.setOrg_tel(zd.GetJgtel(jgh));
		List<String> jg = new ArrayList<String>();
		jg = get_cljg(jgh, this.getYw_type());
		if (null!=jg&&jg.size()>0) {
			this.setOper_orgcode(jg.get(0));
			tag = true;
		}
        return tag;
	}
	/**
	 * 查询 机构  保险公司对应的处理机构 机构号
	 * @param orgcode 机构号
	 * @param gsxh 保险公司序号
	 * @return
	 * @throws Cls_exception
	 */
	private List<String> get_cljg(String orgcode, int gsxh)
			throws Cls_exception {
		ArrayList<String> rtnAL = new ArrayList<String>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		String citycode = "", councode = "";
		try {
			if (orgcode.length() == 8) {
				citycode = orgcode.substring(0, 2);
				councode = orgcode.substring(2, 4);
			}
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn
					.prepareStatement("select oper_orgcode from kcs_specbxcljg where city_code='"
							+ citycode
							+ "' and gsxh="
							+ gsxh
							+ " and (coun_code like '%"
							+ councode
							+ "%' or coun_code like '%00%')");
			rs = pstmt.executeQuery();

			while (rs.next()) {		
				rtnAL.add(rs.getString("oper_orgcode"));
			}
		} catch (Exception e) {
			log.error("ccic_bmz_order.get_cljg():"+e.toString());
			throw new Cls_exception("ccic_bmz_order.get_cljg() " + e.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("ccic_bmz_order.get_cljg()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("ccic_bmz_order.get_cljg()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("ccic_bmz_order.get_cljg()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}
	/**
	 * 在便民站订单数据库表内插入数据
	 * @return 订单号
	 * @throws Exception
	 */
	private int insertByObj() throws Exception {
		log.error("插入便民站订单数据库：");
	    int id = getNewId();
	    log.error("订单号："+id);
	    StringBuffer sqlInsert = new StringBuffer();
	    sqlInsert.append("insert into kcs_specbaoxian(id,serial_no,org_code,opercode,oper_orgcode," );
	    sqlInsert.append("yw_type,cphm,cjhm,fdjhm,ppxh,zhc_rq,tele_no,name,sfzid,x_sunshi,x_3zhe,x_daoq,x_siji,x_chke,x_ziran,x_hhen," );	   
	    sqlInsert.append("x_boli,x_bjm,x_jq,x_chchsh,order_time,bj_time,order_type,city_code,org_tel,invoice,chzh,d_message,wztx,chllx,fzrq,");
	    sqlInsert.append("c_zhl,h_zhl,bxrq,x_3,price,sum_price,f_sunshi,f_3zhe,f_daoq,f_siji,f_chke,f_ziran,f_hhen,f_boli,f_bjm,f_jq,f_chchsh");
	    sqlInsert.append(",e_sunshi,e_daoq,e_ziran,f_3,price_detail,bj_mark,quotationNoBI,quotationNoCI) values ("+id+",?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,");
	    sqlInsert.append("?,?,?,?,sysdate,sysdate,'1',?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
	    java.sql.Connection con=null;
		java.sql.PreparedStatement stmt=null;
		java.sql.ResultSet rs=null;
		int a=0,b=0;
		try {
			Cls_connect cn = new Cls_connect();
	    	con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement(sqlInsert.toString());
            stmt.setInt(1, id);
	        stmt.setString(2, this.getOrg_code());
	        stmt.setString(3, this.getOpercode());
	        stmt.setString(4, this.getOper_orgcode());
	        stmt.setInt(5, this.getYw_type());
	        stmt.setString(6, this.getCphm());
	        stmt.setString(7, this.getCjhm());
	        stmt.setString(8, this.getFdjhm());
	        stmt.setString(9, this.getPpxh());
	        stmt.setString(10, this.getZhc_rq());
	        stmt.setString(11, this.getTele_no());
	        stmt.setString(12, this.getName());
	        stmt.setString(13, this.getSfzid());
	        stmt.setInt(14, this.getX_sunshi());
	        stmt.setInt(15, this.getX_3zhe());
	        stmt.setInt(16, this.getX_daoq());
	        stmt.setInt(17, this.getX_siji());
	        stmt.setInt(18, this.getX_chke());
	        stmt.setInt(19, this.getX_ziran());
	        stmt.setInt(20, this.getX_hhen());
	        stmt.setInt(21, this.getX_boli());
	        stmt.setString(22, this.getX_bjm());
	        stmt.setInt(23, this.getX_jq());
	        stmt.setInt(24, this.getX_chchsh());
	        stmt.setString(25, this.getCity_code());
	        stmt.setString(26, this.getOrg_tel());
	        stmt.setInt(27, this.getInvoice());
	        stmt.setString(28, this.getChzh());
	        stmt.setString(29, this.getD_message());
	        stmt.setInt(30, this.getWztx());
	        stmt.setInt(31, this.getChllx());
	        stmt.setString(32, this.getFzrq());
	        stmt.setInt(33, this.getC_zhl());
	        stmt.setInt(34, this.getH_zhl());
	        stmt.setString(35, this.getBxrq());
	        stmt.setInt(36, this.getX_3());
	        stmt.setDouble(37, this.getPrice());
			stmt.setDouble(38, this.getSum_price());
			stmt.setDouble(39, this.getF_sunshi());
			stmt.setDouble(40, this.getF_3zhe());
			stmt.setDouble(41, this.getF_daoq());
			stmt.setDouble(42, this.getF_siji());
			stmt.setDouble(43, this.getF_chke());
			stmt.setDouble(44, this.getF_ziran());
			stmt.setDouble(45, this.getF_hhen());
			stmt.setDouble(46, this.getF_boli());
			stmt.setDouble(47, this.getF_bjm());
			stmt.setDouble(48, this.getF_jq());
			stmt.setDouble(49, this.getF_chchsh());
			stmt.setDouble(50, this.getE_sunshi());
			stmt.setDouble(51, this.getE_daoq());
			stmt.setDouble(52, this.getE_ziran());
			stmt.setDouble(53, this.getF_3());
			stmt.setString(54, this.getPrice_detail());
			stmt.setInt(55, this.bj_mark);
			stmt.setString(56, this.getQuotationNoBI());
			stmt.setString(57, this.getQuotationNoCI());
		  	a=stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认	
			if (a>0)
			 { b=id;
			   log.error(id+"插入成功");
			 }
		} catch (SQLException se) {
			log.error("Ccic_bmz_order.insertByObj():"+se.toString());
			se.printStackTrace();
			try {
					if (con != null) {
					con.rollback();//出现sql异常，事务回滚
					con.setAutoCommit(true);//设置提交方式为默认方式			
					}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} finally {
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception("Ccic_bmz_order.insertByObj()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Ccic_bmz_order.insertByObj()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Ccic_bmz_order.insertByObj()"+e.toString());
						}
				   con =null;
							}
		}
		return b;	
	}
	/**
	 * 由交易号，序号将自动报价系统内数据转化到便民站数据
	 * @param jycode 自动报价车型查询返回交易号
	 * @param serial_no 自动报价订单序号
	 * @return  便民站订单号
	 */
	public int saveToBmz(String jycode,String serial_no) {
		log.error("ccic_bmz_order:准备写入便民站订单库");
		this.setYw_type(7);// 大地保险序号 7
		this.setD_message("");// 投保渠道( 电销渠道 传统渠道)
		int ddid=0;
		boolean tag = false;
		try {
			tag = setCarXx(serial_no);
			if (tag) {
				tag = setPrivy(jycode);				
				if (tag) {
					tag = setKind(jycode);
				    if (tag) {
				    	tag = setCljg();
				    	if (tag) {
				    		tag = setCartax(jycode);
				    	    if (tag)
				    		   ddid =insertByObj();
				    	    else log.error("错误：精确报价订单写入便民站---设置车船税信息失败");
				    	} else log.error("错误：精确报价订单写入便民站---设置处理机构信息失败");					
				    } else log.error("错误：精确报价订单写入便民站---设置险种基本信息失败");
				} else log.error("错误：精确报价订单写入便民站---设置投保人信息失败");
			 } else  log.error("错误：精确报价订单写入便民站---设置车辆基本信息失败");

		} catch (Cls_exception e) {
			log.error("saveToBmz:"+e.toString());
			e.printStackTrace();
		} catch (Exception e) {
			log.error("saveToBmz:"+e.toString());
			e.printStackTrace();
		}
		return ddid;
	}
	 private int getNewId() throws Cls_exception{
		    int id=0;
			java.sql.Connection conn = null;
			java.sql.PreparedStatement pstmt = null;
			java.sql.ResultSet rs = null;
			StringBuffer sql = new StringBuffer();
			sql.append("select SINOP_ID.nextval from dual");
			try {
				Cls_connect cn = new Cls_connect();
				conn = cn.connect().getConnection();
				pstmt = conn.prepareStatement(sql.toString());
			
				rs = pstmt.executeQuery();
				while (rs.next()) {
	                  id=rs.getInt(1);
				}
			} catch(SQLRecoverableException e){
				log.error("ccic_bmz_order.getNewId():"+e.toString());
				e.printStackTrace();
			} catch (SQLException e) {
				log.error("ccic_bmz_order.getNewId():"+e.toString());
				throw new Cls_exception("ccic_bmz_order.getNewId() "
						+ e.toString());
			} finally {

				try {
					if (rs != null) {
						rs.close();
					}
					if (pstmt != null) {
						pstmt.close();
					}
					if (conn != null) {
						conn.close();
					}
				} catch (Exception e) {
					throw new Cls_exception("ccic_bmz_order.getNewId()"
							+ e.toString());
				}

			}

			return id; 
	  }
}
