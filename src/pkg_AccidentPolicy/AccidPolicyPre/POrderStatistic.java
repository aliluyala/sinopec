package pkg_AccidentPolicy.AccidPolicyPre;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_e_tmp;
import pkg_sinopec.Cls_exception;

/**
 * @author Administrator
 *
 */
public class POrderStatistic {
	private Logger log = Logger.getLogger(POrderStatistic.class);
	 public int getNum(String sql) throws Cls_exception {
			int a = 0;
			java.sql.Connection conn = null;
			java.sql.PreparedStatement pstmt = null;
			java.sql.ResultSet rs = null;

			try {
				Cls_connect cn = new Cls_connect();
				conn = cn.connect().getConnection();
				String tsql = "SELECT COUNT(*) FROM kcs_insurance_accident_ddmx where order_type='6' "+sql;
				log.error(tsql);
				pstmt = conn.prepareStatement(tsql);
                rs = pstmt.executeQuery();

				while (rs.next()) {
					a = rs.getInt(1);
				}
			} catch (Exception e) {
				log.error(e.toString());
				throw new Cls_exception("POrderStatistic.getNum()   " + e.toString());
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
					throw new Cls_exception("POrderStatistic.getNum()  finally"
							+ e.toString());
				}
			}
			log.error(a);
			return a;
		}	
	 /**
		 * 全省出单，按地市分组
		 * 
		 * @param sql
		 * @return 订单数量，保费合计
		 * @throws Cls_exception
		 */
		public List<Cls_e_tmp> qs_tjb(String sql) throws Cls_exception {
			ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
			java.sql.Connection conn = null;
			java.sql.PreparedStatement pstmt = null;
			java.sql.ResultSet rs = null;
			StringBuffer sqlInsert = new StringBuffer();
			sqlInsert
					.append("select city_code,count(*) as ddnum,sum(sum_price) as sumj");
			sqlInsert
					.append(" from kcs_insurance_accident_ddmx t  where  order_type='6' ");
			sqlInsert.append(sql);
			sqlInsert.append("   group by city_code order by city_code");
			try {
				Cls_connect cn = new Cls_connect();
				conn = cn.connect().getConnection();
				pstmt = conn.prepareStatement(sqlInsert.toString());
				rs = pstmt.executeQuery();

				while (rs.next()) {
					Cls_e_tmp tmp_jg = new Cls_e_tmp();
					tmp_jg.setS1(rs.getString("city_code"));
					tmp_jg.setNum1(rs.getInt("ddnum"));
					tmp_jg.setD1(rs.getDouble("sumj"));
					rtnAL.add(tmp_jg);
					tmp_jg = null;
				}
			} catch (Exception e) {
				log.error("POrderStatistic.qs_tjb():"+e.toString());
				throw new Cls_exception("POrderStatistic.qs_tjb() " + e.toString());
			} finally {

				if (rs != null) {
					try {
						rs.close();
					} catch (Exception e) {
						throw new Cls_exception("POrderStatistic.qs_tjb()"
								+ e.toString());
					}
					rs = null;
				}
				if (pstmt != null) {
					try {
						pstmt.close();
					} catch (Exception e) {
						throw new Cls_exception("POrderStatistic.qs_tjb()"
								+ e.toString());
					}
					pstmt = null;
				}
				if (conn != null) {
					try {
						conn.close();
					} catch (Exception e) {
						throw new Cls_exception("POrderStatistic.qs_tjb()"
								+ e.toString());
					}
					conn = null;
				}
			}
			return rtnAL;
		}
		/**
		 * 某地市 出单 按 保险公司分组
		 * 
		 * @param sql
		 * @param citycode
		 * @return 订单数量，保费合计
		 * @throws Cls_exception
		 */
		public List<Cls_e_tmp> qs_tjb(String sql, String citycode)
				throws Cls_exception {
			ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
			java.sql.Connection conn = null;
			java.sql.PreparedStatement pstmt = null;
			java.sql.ResultSet rs = null;
			StringBuffer sqlInsert = new StringBuffer();
			sqlInsert
					.append("select count(*) as ddnum,sum(sum_price) as sumj,");
			sqlInsert
					.append("yw_type from kcs_insurance_accident_ddmx t  where  order_type='6' and city_code='");
			sqlInsert.append(citycode);
			sqlInsert.append("' ");
			sqlInsert.append(sql);
			sqlInsert.append("   group by yw_type  order by yw_type");
			try {
				Cls_connect cn = new Cls_connect();
				conn = cn.connect().getConnection();
				pstmt = conn.prepareStatement(sqlInsert.toString());
				rs = pstmt.executeQuery();

				while (rs.next()) {
					Cls_e_tmp tmp_jg = new Cls_e_tmp();
					// tmp_jg.setNum3(rs.getInt("order_type"));
					tmp_jg.setNum1(rs.getInt("ddnum"));
					tmp_jg.setNum2(rs.getInt("yw_type"));
					tmp_jg.setD1(rs.getDouble("sumj"));
					rtnAL.add(tmp_jg);
					tmp_jg = null;
				}
			} catch (Exception e) {
				log.error("POrderStatistic.qs_tjb(s1,s2):"+e.toString());
				throw new Cls_exception("Cls_l_bxtj.qs_tjb() " + e.toString());
			} finally {

				if (rs != null) {
					try {
						rs.close();
					} catch (Exception e) {
						throw new Cls_exception("POrderStatistic.qs_tjb()"
								+ e.toString());
					}
					rs = null;
				}
				if (pstmt != null) {
					try {
						pstmt.close();
					} catch (Exception e) {
						throw new Cls_exception("POrderStatistic.qs_tjb()"
								+ e.toString());
					}
					pstmt = null;
				}
				if (conn != null) {
					try {
						conn.close();
					} catch (Exception e) {
						throw new Cls_exception("POrderStatistic.qs_tjb()"
								+ e.toString());
					}
					conn = null;
				}
			}
			return rtnAL;
		}
		 /**
		 * 全市出单，按区县分组---保险公司后台统计
		 * 
		 * @param sql
		 * @return 订单数量，保费合计
		 * @throws Cls_exception
		 */
		public List<Cls_e_tmp> qx_tjb_bxgs(String sql) throws Cls_exception {
			ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
			java.sql.Connection conn = null;
			java.sql.PreparedStatement pstmt = null;
			java.sql.ResultSet rs = null;
			StringBuffer sqlInsert = new StringBuffer();
			sqlInsert
					.append("select count(*) as ddnum,sum(sum_price) as sumj,sum(policy_num) as bdnum,");
			sqlInsert
					.append(" substr(org_code,3,2) as qxcode from kcs_insurance_accident_ddmx t  where  order_type='6' ");
			sqlInsert.append(sql);
			sqlInsert.append("   group by substr(org_code,3,2) order by substr(org_code,3,2)");
			try {
				Cls_connect cn = new Cls_connect();
				conn = cn.connect().getConnection();
				pstmt = conn.prepareStatement(sqlInsert.toString());
				rs = pstmt.executeQuery();

				while (rs.next()) {
					Cls_e_tmp tmp_jg = new Cls_e_tmp();
					tmp_jg.setS1(rs.getString("qxcode"));
					tmp_jg.setNum1(rs.getInt("ddnum"));
					tmp_jg.setD1(rs.getDouble("sumj"));
					tmp_jg.setNum2(rs.getInt("bdnum"));
					rtnAL.add(tmp_jg);
					tmp_jg = null;
				}
			} catch (Exception e) {
				log.error("POrderStatistic.qx_tjb_bxgs():"+e.toString());
				throw new Cls_exception("POrderStatistic.qx_tjb_bxgs() " + e.toString());
			} finally {

				if (rs != null) {
					try {
						rs.close();
					} catch (Exception e) {
						throw new Cls_exception("POrderStatistic.qx_tjb_bxgs()"
								+ e.toString());
					}
					rs = null;
				}
				if (pstmt != null) {
					try {
						pstmt.close();
					} catch (Exception e) {
						throw new Cls_exception("POrderStatistic.qx_tjb_bxgs()"
								+ e.toString());
					}
					pstmt = null;
				}
				if (conn != null) {
					try {
						conn.close();
					} catch (Exception e) {
						throw new Cls_exception("POrderStatistic.qx_tjb_bxgs()"
								+ e.toString());
					}
					conn = null;
				}
			}
			return rtnAL;
		}
}
