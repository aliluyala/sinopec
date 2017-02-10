/**
 * 
 */
package pkg_sinopec;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * 
 */
public class Cls_l_jgtj {
	public List<Cls_e_tmp> zj_tjb(String sql, String qxcode)
			throws Cls_exception {
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("select count(*) as ddnum,sum(sum_price) as sumj,sum(f_chchsh) as schchsh,chzh,org_code,");
		sqlInsert
				.append("sum(f_sunshi+f_3zhe+f_daoq+f_siji+f_chke+f_ziran+f_hhen+f_boli+f_bjm+f_jq+f_3) as ssyx");
		sqlInsert
				.append(" from kcs_specbaoxian t  where  order_type='6' and substr(org_code,0,4)='");
		sqlInsert.append(qxcode);
		sqlInsert.append("' ");
		sqlInsert.append(sql);
		//sqlInsert.append("   group by org_code  order by org_code");
		sqlInsert.append("   group by org_code,chzh  order by org_code,chzh");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Cls_e_tmp tmp_jg = new Cls_e_tmp();
				// tmp_jg.setNum3(rs.getInt("order_type"));
				tmp_jg.setS1(rs.getString("org_code"));
				tmp_jg.setS2(rs.getString("chzh"));
				tmp_jg.setNum1(rs.getInt("ddnum"));
				tmp_jg.setD1(rs.getDouble("sumj"));
				tmp_jg.setD2(rs.getDouble("ssyx"));
				tmp_jg.setD3(rs.getDouble("schchsh"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_jgtj.zj_tjb() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgtj.zj_tjb()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgtj.zj_tjb()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgtj.zj_tjb()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}

	public List<Cls_e_tmp> qx_tjb(String sql) throws Cls_exception {
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("select count(*) as n1,city_code, substr(org_code,3,2) as s2  from (select distinct org_code,city_code, substr(org_code,3,2) from kcs_specbaoxian t ");
		sqlInsert.append(" where order_type=6 " + sql);
		sqlInsert
				.append("  ) group by city_code, substr(org_code,3,2)  order by city_code, substr(org_code,3,2)");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Cls_e_tmp tmp_jg = new Cls_e_tmp();
				tmp_jg.setS1(rs.getString("city_code"));
				tmp_jg.setS2(rs.getString("s2"));
				tmp_jg.setNum1(rs.getInt("n1"));

				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_jgtj.qx_tjb() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgtj.qx_tjb()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgtj.qx_tjb()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgtj.qx_tjb()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}

	public List<Cls_e_tmp> s_tjb(String sql) throws Cls_exception {
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("select count(*) as n1,city_code from (select distinct org_code,city_code from kcs_specbaoxian t ");
		sqlInsert.append(" where order_type=6  " + sql);
		sqlInsert.append("  ) group by city_code order by city_code");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Cls_e_tmp tmp_jg = new Cls_e_tmp();
				tmp_jg.setS1(rs.getString("city_code"));
				tmp_jg.setNum1(rs.getInt("n1"));

				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_jgtj.s_tjb() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgtj.s_tjb()" + e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgtj.s_tjb()" + e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgtj.s_tjb()" + e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}

}
