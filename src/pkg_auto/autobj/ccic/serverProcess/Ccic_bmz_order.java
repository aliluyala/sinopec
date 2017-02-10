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
 * ��س��� - ����վ  -����
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
    *  �����ձ���Ϣ���鵽ƥ��kindDTO[] kinds,����kinds���ɲ�������x_bjm�뱨������price_detial���ݣ������ø���������Ϣ��
    *  @param jycode 
    *  
    * @return
    * @throws Cls_exception
    */
	private boolean setKind(String jycode) throws Cls_exception {
		log.error("ccic_bmz_order:����������Ϣ");
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
			if (kindCode.equals("A")) {// ������ʧ���� 1
				this.setX_sunshi(1);
				this.setF_sunshi(kind.getPremium());
				this.setE_sunshi(kind.getAmount());
				if ("1".equals(kind.getKindFlag()))
					bjm[0] = "1";
				bprice_detail.append("������ʧ��:"+kind.getPremium()+"Ԫ;");
			}
			if (kindCode.equals("G1")) {// ȫ�������� 3
				this.setX_daoq(1);
				this.setF_daoq(kind.getPremium());
				this.setE_daoq(kind.getAmount());
				if ("1".equals(kind.getKindFlag()))
					bjm[2] = "1";
				bprice_detail.append("������:"+kind.getPremium()+"Ԫ;");
			}
			if (kindCode.equals("Z")) {// ��ȼ��ʧ��
				this.setX_ziran(1);
				this.setF_ziran(kind.getPremium());
				this.setE_ziran(kind.getAmount());
				bprice_detail.append("��ȼ��:"+kind.getPremium()+"Ԫ;");
			}
			if (kindCode.equals("B")) {// ���������α��� 2
				be = (int) (kind.getAmount() / 10000);
				this.setX_3zhe(be);
				this.setF_3zhe(kind.getPremium());
				if ("1".equals(kind.getKindFlag()))
					bjm[1] = "1";
				bprice_detail.append("������:"+kind.getPremium()+"Ԫ;");
			}
			if (kindCode.equals("D3")) {// ��ʻԱ������Ա������ 4
				be = (int) (kind.getAmount() / 10000);
				this.setX_siji(be);
				this.setF_siji(kind.getPremium());
				if ("1".equals(kind.getKindFlag()))
					bjm[3] = "1";
				bprice_detail.append("˾��������:"+kind.getPremium()+"Ԫ;");
			}
			if (kindCode.equals("D4")) {// �˿ͳ�����Ա������ 5
				be = (int) (kind.getUnitAmount() / 10000);
				this.setX_chke(be);
				this.setF_chke(kind.getPremium());
				if ("1".equals(kind.getKindFlag()))
					bjm[4] = "1";
				bprice_detail.append("�˿�������:"+kind.getPremium()+"Ԫ;");
			}
			if (kindCode.equals("L")) {// ��������ʧ�� 6
				be = (int) (kind.getAmount() / 1);
				this.setX_hhen(be);
				this.setF_hhen(kind.getPremium());
				if ("1".equals(kind.getKindFlag()))
					bjm[5] = "1";
				bprice_detail.append("������:"+kind.getPremium()+"Ԫ;");
			}
			if (kindCode.equals("F")) {// ��������������
				if ("1".equals(kind.getModeCode()))
					this.setX_boli(1);
				if ("2".equals(kind.getModeCode()))
					this.setX_boli(2);
				this.setF_boli(kind.getPremium());
				bprice_detail.append("������:"+kind.getPremium()+"Ԫ;");
			}
			if (kindCode.equals("A6")) {// ������ʧ�����޷��ҵ���������Լ��
				this.setX_3(1);
				this.setF_3(kind.getPremium());
				bprice_detail.append("�޵�������Լ��:"+kind.getPremium()+"Ԫ;");
			}
			if (kindCode.equals("BZ")) {// ��ͨ�¹�����ǿ�Ʊ���
				this.setX_jq(1);
				this.setF_jq(kind.getPremium());
				bprice_detail.append("��ǿ��:"+kind.getPremium()+"Ԫ;");
			}
			if (kindCode.equals("M")) {// ����������Լ����
				//bjm_mark = 1;
				this.setF_bjm(kind.getPremium());
				bprice_detail.append("��������:"+kind.getPremium()+"Ԫ;");
			}
		}// end for
		//if (bjm_mark == 1) {
			StringBuffer sbjm = new StringBuffer();
			for (String s : bjm) {
				sbjm.append(s);
			}
			this.setX_bjm(sbjm.toString());
			log.error("��������X_bjm = "+sbjm);
		//}
		bprice_detail.append(null==this.getPrice_detail()?"":this.getPrice_detail());
		this.setPrice_detail(bprice_detail.toString());
		return tag;
	}
   /**
    * ���ݽ��׺Ų�ѯ�õ������б�KindDTO[]
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
    * ���ó���˰��Ϣ���鵽ƥ��carTaxDTO cartax,��cartax���ó���˰��Ϣ
    * @param jycode 
    */
	private boolean setCartax(String jycode) throws Cls_exception {
		log.error("ccic_bmz_order:���ó���˰��Ϣ");
		boolean tag = false;
		CarTaxDTO cartax = getCartaxDTO(jycode);
		StringBuffer bprice_detail = new StringBuffer();
		if (null != cartax) {
			if ("0".equals(cartax.getTaxFlag())) {
				this.setX_chchsh(1);
				this.setF_chchsh(Double.parseDouble(cartax.getSumPayment()));
				bprice_detail.append("����˰:"+cartax.getSumPayment()+"Ԫ;");
				bprice_detail.append(null==this.getPrice_detail()?"":this.getPrice_detail());
				this.setPrice_detail(bprice_detail.toString());
			}
			tag = true;
		}
		log.error("="+tag);
		return tag;
	}
   /**
    * ���ݽ��׺Ų�ѯ������˰CarTaxDTO
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
    * ���ó���������Ϣ
    * @param serial_no
    * @return
    * @throws Cls_exception
    */
	private boolean setCarXx(String serial_no) throws Cls_exception {
		log.error("ccic_bmz_order:���ó���������Ϣ");
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		String stmp = "";
		boolean tag = false;
		StringBuffer sql = new StringBuffer();
		sql.append("select t.licenseNo,t.licenseType,t.frameNo,t.enrollDate,t.engineNo,t.chgOwnerFlag,to_char(t.startDate,'yyyy-mm-dd') as startdate,");
		sql.append("t.Orgcode,t.opercode,t.brandEN,a.seat,a.industryVehicleName,a.fullWeight,a.vtonnage,");
		sql.append("t.querySequenceNo,t.querySequenceBZNo,t.quotationBIID,t.quotationCIID,t.quotationNoBI,t.quotationNoCI,");// ���صĸ�����ѯ��
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
					this.setChllx(8);// С��
				if ("01".equals(stmp) || "15".equals(stmp))
					this.setChllx(9);// ��
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
    * ����Ͷ������Ϣ����ѯ��ƥ���Ͷ����privy ��������Ϣ��
    * @param jycode 
    * @return
    * @throws Cls_exception
    */
	private boolean setPrivy(String jycode) throws Cls_exception {
		log.error("ccic_bmz_order:����Ͷ������Ϣ");
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
    * ���ݽ��׺Ų�ѯ��Ͷ����PrivyDTO
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
    * ���ô���������������������绰�����д���,
    * @return
    * @throws Cls_exception
   */
	private boolean setCljg() throws Cls_exception {
		log.error("ccic_bmz_order:���ô��������Ϣ");
		String jgh = this.getOrg_code();
		boolean tag = false;
		Cls_zd zd = new Cls_zd();
		this.setCity_code(jgh.substring(0, 2));
		this.setChzh(zd.GetJgname(jgh));
		//this.setChzh("����Է�����վ");
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
	 * ��ѯ ����  ���չ�˾��Ӧ�Ĵ������ ������
	 * @param orgcode ������
	 * @param gsxh ���չ�˾���
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
	 * �ڱ���վ�������ݿ���ڲ�������
	 * @return ������
	 * @throws Exception
	 */
	private int insertByObj() throws Exception {
		log.error("�������վ�������ݿ⣺");
	    int id = getNewId();
	    log.error("�����ţ�"+id);
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
			con.setAutoCommit(true);// �ָ�Ĭ��	
			if (a>0)
			 { b=id;
			   log.error(id+"����ɹ�");
			 }
		} catch (SQLException se) {
			log.error("Ccic_bmz_order.insertByObj():"+se.toString());
			se.printStackTrace();
			try {
					if (con != null) {
					con.rollback();//����sql�쳣������ع�
					con.setAutoCommit(true);//�����ύ��ʽΪĬ�Ϸ�ʽ			
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
	 * �ɽ��׺ţ���Ž��Զ�����ϵͳ������ת��������վ����
	 * @param jycode �Զ����۳��Ͳ�ѯ���ؽ��׺�
	 * @param serial_no �Զ����۶������
	 * @return  ����վ������
	 */
	public int saveToBmz(String jycode,String serial_no) {
		log.error("ccic_bmz_order:׼��д�����վ������");
		this.setYw_type(7);// ��ر������ 7
		this.setD_message("");// Ͷ������( �������� ��ͳ����)
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
				    	    else log.error("���󣺾�ȷ���۶���д�����վ---���ó���˰��Ϣʧ��");
				    	} else log.error("���󣺾�ȷ���۶���д�����վ---���ô��������Ϣʧ��");					
				    } else log.error("���󣺾�ȷ���۶���д�����վ---�������ֻ�����Ϣʧ��");
				} else log.error("���󣺾�ȷ���۶���д�����վ---����Ͷ������Ϣʧ��");
			 } else  log.error("���󣺾�ȷ���۶���д�����վ---���ó���������Ϣʧ��");

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
