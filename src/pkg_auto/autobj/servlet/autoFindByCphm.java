package pkg_auto.autobj.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_e_bx;
import pkg_sinopec.Cls_exception;

/**
 * @author Administrator
 * 
 */
public class autoFindByCphm extends HttpServlet {
	private Logger log = Logger.getLogger(autoFindByCphm.class);
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String retu = "";
		int num = 0;
		String cphm = (String) request.getParameter("cphm");
		log.error("cphm=" + cphm);
		Cls_e_bx tmpdd = new Cls_e_bx();
		try {
			num = byCphmAuto(cphm);
			if (num>0) {
				tmpdd =  byCphmAuto(cphm, num);
				log.error("tmpdd cphm="+tmpdd.getCphm());	
			}else {
				num = byCphm(cphm);
			    log.error("bycphm:"+num);
			    tmpdd = byCphm(cphm, num);
			    log.error("tmpdd cphm="+tmpdd.getCphm());			   
			}	
			 if (cphm.equals(tmpdd.getCphm()))
				    retu = returnXx(tmpdd);
			    else
				    retu = "{\"flog\":\"no\"}";
		} catch (Cls_exception e) {
			log.error("findbycphm:" + e.toString());
			e.printStackTrace();
		}
		log.error("retu=" + retu);
		// System.out.println("retu="+retu);
		response.setContentType("text/x-json;charset=UTF-8");// ·µ»Øjson¸ñÊ½
		response.getWriter().write(retu);
		response.getWriter().flush();
		response.getWriter().close();
	}

	private int byCphm(String cphm) throws Cls_exception {
		String sql = "select count(*) from kcs_specbaoxian where cphm='" + cphm
				+ "' and order_type='6'";
		log.error(sql);
		int num = 0;
		num = getcount_baoxian(sql);
		return num;
	}
	private int byCphmAuto(String cphm) throws Cls_exception {
		String sql = "select count(*) from KCS_CCIC_CARDTO where licenseNo='" + cphm
				+ "'";
		log.error(sql);
		int num = 0;
		num = getcount_baoxian(sql);
		return num;
	}
	private Cls_e_bx byCphm(String cphm, int type) throws Cls_exception {
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		Cls_e_bx tmp_jg = new Cls_e_bx();
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			sqlInsert
					.append(" select case  when city_code='62' then '' else zhc_rq end as zhcrq, ");
			sqlInsert.append("cjhm,fdjhm,cphm,ppxh from kcs_specbaoxian where id in");
			sqlInsert
					.append(" (select max(id) from kcs_specbaoxian where cphm='");
			sqlInsert.append(cphm);
			sqlInsert.append("'");
			if (type > 0)
				sqlInsert.append(" and order_type='6'");
			sqlInsert.append(")");
			log.error(sqlInsert.toString());
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				tmp_jg.setCphm(rs.getString("cphm"));
				tmp_jg.setFdjhm(rs.getString("fdjhm"));
				tmp_jg.setCjhm(rs.getString("cjhm"));
                tmp_jg.setZhc_rq(rs.getString("zhcrq"));
                tmp_jg.setPpxh(rs.getString("ppxh"));
			}
		} catch (Exception e) {
			log.error(e.toString());
			throw new Cls_exception("autofindBycphm.ByCphm() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("autofindBycphm.ByCphm()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("autofindBycphm.ByCphm()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("autofindBycphm.ByCphm()"
							+ e.toString());
				}
				conn = null;
			}

		}
		return tmp_jg;
	}
	private Cls_e_bx byCphmAuto(String cphm, int type) throws Cls_exception {
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		Cls_e_bx tmp_jg = new Cls_e_bx();
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			sqlInsert.append(" select enrollDate,frameNo,engineNo,licenseNo, ");
			sqlInsert.append("brandEN from KCS_CCIC_CARDTO where serial_no in");
			sqlInsert.append(" (select max(serial_no) from KCS_CCIC_CARDTO where licenseNo='");
			sqlInsert.append(cphm);
			sqlInsert.append("'");
			sqlInsert.append(")");
			log.error(sqlInsert.toString());
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				tmp_jg.setCphm(rs.getString("licenseNo"));
				tmp_jg.setFdjhm(rs.getString("engineNo"));
				tmp_jg.setCjhm(rs.getString("frameNo"));
                tmp_jg.setZhc_rq(rs.getString("enrollDate"));
                tmp_jg.setPpxh(rs.getString("brandEN"));
			}
		} catch (Exception e) {
			log.error(e.toString());
			throw new Cls_exception("autofindBycphm.ByCphmAuto() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("autofindBycphm.ByCphmAuto()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("autofindBycphm.ByCphmAuto()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("autofindBycphm.ByCphmAuto()"
							+ e.toString());
				}
				conn = null;
			}

		}
		return tmp_jg;
	}
	private String returnXx(Cls_e_bx ddxx) throws Cls_exception {
		String retu = "";
		StringBuffer buf = new StringBuffer();
		buf.append("{\"flog\":\"ok\",");
		buf.append("\"cjhm\":\"" + ddxx.getCjhm() + "\",\"fdjhm\":\""
				+ ddxx.getFdjhm() + "\",\"zhcrq\":\""+ ddxx.getZhc_rq() +"\",");
		buf.append("\"ppxh\":\""+ removeChineseCharacters(ddxx.getPpxh()) +"\"}");
		retu = buf.toString().replaceAll("null", "");
		return retu;
	}
    private String removeChineseCharacters(String sourstr) {
    	String str = "";
    	if (sourstr !=null && !"".equals(sourstr))
    		str = sourstr.replaceAll("[\u4e00-\u9fa5]", "").toUpperCase();
    	return str;
    }
	private int getcount_baoxian(String tsql) throws Cls_exception {
		int a = 0;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;

		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(tsql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				a = rs.getInt(1);
			}
		} catch (Exception e) {
			log.error("getcount_baoxian:" + e.toString());
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
				log.error("getcount_baoxian:" + e.toString());
			}
		}

		return a;
	}
}
