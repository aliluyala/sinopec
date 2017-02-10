package pkg_sinopec;

/**
 * @author Administrator
 * 
 */
public class BxOrder {
	public int ByCphm(String cphm) throws Cls_exception {
		String sql = "select count(*) from kcs_specbaoxian where cphm='" + cphm
				+ "' and order_type='6'";
		Cls_gg gg = new Cls_gg();
		int num = 0;
		num = gg.getint(sql);
		return num;
	}
	public int intByKhxx(String cphm) throws Cls_exception {
		String sql = "select count(*) from kcs_specbxkh where cphm='" + cphm
				+ "' and mark=1";
		//System.out.println(sql);
		Cls_gg gg = new Cls_gg();
		int num = 0;
		num = gg.getint(sql);
		return num;
	}
	public Cls_e_bx ByCphm(String cphm, int type) throws Cls_exception {
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		Cls_e_bx tmp_jg = new Cls_e_bx();
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			sqlInsert
					.append("select chzh,cjhm,name,sfzid,tele_no,wztx,owner,d_message,fzrq,chllx,invoice,zhc_rq,c_zhl,");
			sqlInsert
					.append("x_sunshi,x_3zhe,x_daoq,x_siji,x_chke,x_ziran,x_hhen,x_boli,x_bjm,x_jq,x_chchsh,x_3,");
			sqlInsert
					.append("h_zhl,fdjhm,sfz_addr,ppxh,cphm from kcs_specbaoxian where id in");
			sqlInsert
					.append(" (select max(id) from kcs_specbaoxian where cphm='");
			sqlInsert.append(cphm);
			sqlInsert.append("'");
			if (type > 0)
				sqlInsert.append(" and order_type='6'");
			sqlInsert.append(")");
			//System.out.println("type="+type);
			//System.out.println("sql="+sqlInsert.toString());
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				tmp_jg.setCphm(rs.getString("cphm"));
				tmp_jg.setChzh(rs.getString("chzh"));
				tmp_jg.setCjhm(rs.getString("cjhm"));
				tmp_jg.setName(rs.getString("name"));
				tmp_jg.setSfzid(rs.getString("sfzid"));
				tmp_jg.setTele_no(rs.getString("tele_no"));
				tmp_jg.setWztx(rs.getInt("wztx"));
				tmp_jg.setOwner(rs.getString("owner"));
				tmp_jg.setD_message(rs.getString("d_message"));
				tmp_jg.setFzrq(rs.getString("fzrq"));
				tmp_jg.setChllx(rs.getInt("chllx"));
				tmp_jg.setInvoice(rs.getInt("invoice"));
				tmp_jg.setZhc_rq(rs.getString("zhc_rq"));
				tmp_jg.setC_zhl(rs.getInt("c_zhl"));
				tmp_jg.setH_zhl(rs.getInt("h_zhl"));
				tmp_jg.setFdjhm(rs.getString("fdjhm"));
				tmp_jg.setSfz_addr(rs.getString("sfz_addr"));
				tmp_jg.setPpxh(rs.getString("ppxh"));
				tmp_jg.setX_sunshi(rs.getInt("x_sunshi"));
				tmp_jg.setX_3zhe(rs.getInt("x_3zhe"));
				tmp_jg.setX_daoq(rs.getInt("x_daoq"));
				tmp_jg.setX_siji(rs.getInt("x_siji"));
				tmp_jg.setX_chke(rs.getInt("x_chke"));
				tmp_jg.setX_ziran(rs.getInt("x_ziran"));
				tmp_jg.setX_hhen(rs.getInt("x_hhen"));
				tmp_jg.setX_boli(rs.getInt("x_boli"));
				tmp_jg.setX_bjm(rs.getString("x_bjm"));
				tmp_jg.setX_jq(rs.getInt("x_jq"));
				tmp_jg.setX_chchsh(rs.getInt("x_chchsh"));
                tmp_jg.setX_3(rs.getInt("x_3"));
			}
		} catch (Exception e) {
			throw new Cls_exception("BxOrder.ByCphm() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("BxOrder.ByCphm()" + e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("BxOrder.ByCphm()" + e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("BxOrder.ByCphm()" + e.toString());
				}
				conn = null;
			}

		}
		return tmp_jg;
	}
	public Cls_e_bx byKhxx(String cphm) throws Cls_exception {
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		Cls_e_bx tmp_jg = new Cls_e_bx();
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			sqlInsert
					.append("select name,tel,to_char(bxrq,'yyyy-mm-dd') as bxrq,cphm");
			sqlInsert
					.append("  from kcs_specbxkh where serial_no in");
			sqlInsert
					.append(" (select max(serial_no) from kcs_specbxkh where cphm='");
			sqlInsert.append(cphm);
			sqlInsert.append("'");
			sqlInsert.append(")");
			//System.out.println("sql="+sqlInsert.toString());
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				tmp_jg.setCphm(rs.getString("cphm"));
				tmp_jg.setName(rs.getString("name"));
				tmp_jg.setTele_no(rs.getString("tel"));
				tmp_jg.setZhc_rq(rs.getString("bxrq"));
				
			}
		} catch (Exception e) {
			throw new Cls_exception("BxOrder.byKhxx() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("BxOrder.byKhxx()" + e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("BxOrder.byKhxx()" + e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("BxOrder.byKhxx()" + e.toString());
				}
				conn = null;
			}

		}
		return tmp_jg;
	}
	public String Xx_cphm(Cls_e_bx ddxx,int type) throws Cls_exception {
		String retu = "";
		StringBuffer buf = new StringBuffer();
		// System.out.println("=="+ddxx.getCphm());
		if (type>0) {
			String bjm = ddxx.getX_bjm();
			Cls_zd zd = new Cls_zd();
			int[] ibjm=zd.toints(bjm);
			buf.append("{\"flog\":\"ok\",");
			buf.append("\"x_sunshi\":\""+ddxx.getX_sunshi()+"\",\"x_3zhe\":\""+ddxx.getX_3zhe()+"\",");
			buf.append("\"x_daoq\":\""+ddxx.getX_daoq()+"\",\"x_siji\":\""+ddxx.getX_siji()+"\",");
			buf.append("\"x_chke\":\""+ddxx.getX_chke()+"\",\"x_ziran\":\""+ddxx.getX_ziran()+"\",");
			buf.append("\"x_hhen\":\""+ddxx.getX_hhen()+"\",\"x_boli\":\""+ddxx.getX_boli()+"\",");
			buf.append("\"x_bjm0\":\""+ibjm[0]+"\",\"x_bjm1\":\""+ibjm[1]+"\",\"x_bjm2\":\""+ibjm[2]+"\",");
			buf.append("\"x_bjm3\":\""+ibjm[3]+"\",\"x_bjm4\":\""+ibjm[4]+"\",\"x_bjm5\":\""+ibjm[5]+"\",");
			buf.append("\"x_jq\":\""+ddxx.getX_jq()+"\",");
			buf.append("\"x_chchsh\":\""+ddxx.getX_chchsh()+"\",");
			buf.append("\"x_3\":\""+ddxx.getX_3()+"\",");
		} else
			buf.append("{\"flog\":\"ok2\",");			
		buf.append("\"chzh\":\"" + ddxx.getChzh()+ "\",\"cjhm\":\"" + ddxx.getCjhm() + "\",");
		buf.append("\"name\":\"" + ddxx.getName() + "\",\"sfzid\":\""+ ddxx.getSfzid() + "\",");
		buf.append("\"tele_no\":\"" + ddxx.getTele_no() + "\",\"wztx\":\""+ ddxx.getWztx() + "\",");
		buf.append("\"owner\":\"" + ddxx.getOwner() + "\",\"d_message\":\""+ ddxx.getD_message() + "\",");
		buf.append("\"fzrq\":\"" + ddxx.getFzrq() + "\",\"chllx\":\""+ ddxx.getChllx() + "\",");
		buf.append("\"invoice\":\"" + ddxx.getInvoice() + "\",\"zhc_rq\":\""+ ddxx.getZhc_rq() + "\",");
		buf.append("\"c_zhl\":\"" + ddxx.getC_zhl() + "\",\"h_zhl\":\""	+ ddxx.getH_zhl() + "\",");
		buf.append("\"fdjhm\":\"" + ddxx.getFdjhm() + "\",\"sfz_addr\":\""+ ddxx.getSfz_addr() + "\",");
		buf.append("\"ppxh\":\"" + ddxx.getPpxh() + "\"}");
		retu = buf.toString().replaceAll("null", "");

		return retu;
	}
	public String Xx_khxx(Cls_e_bx ddxx) throws Cls_exception{
		String retu = "";
		StringBuffer buf = new StringBuffer();
		buf.append("{\"flog\":\"ok3\",");
		buf.append("\"name\":\""+ddxx.getName()+"\",\"tele_no\":\""+ddxx.getTele_no()+"\",\"zhc_rq\":\""+ddxx.getZhc_rq()+"\"}");
		retu = buf.toString().replaceAll("null", "");
		return retu;
	}
}
