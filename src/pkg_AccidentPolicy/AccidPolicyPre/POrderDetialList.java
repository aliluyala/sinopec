/**
 * 
 */
package pkg_AccidentPolicy.AccidPolicyPre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import pkg_AccidentPolicy.pojo.PolicyOrder;
import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_connect80;
import pkg_sinopec.Cls_e_tmp;
import pkg_sinopec.Cls_exception;

/**
 * @author Administrator
 *
 */
public class POrderDetialList {
	private static Logger log = Logger
	.getLogger(POrderDetialList.class);
	public Map<String, String> getSumPrice(String tsql, String citycode,
			String qxcode) throws Cls_exception {
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		Double sp = 0.0;
		int num = 0;
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			sqlInsert
					.append("SELECT sum(sum_price),count(*)  FROM kcs_insurance_accident_ddmx t");
			sqlInsert.append(" where order_type='6' and city_code='" + citycode
					+ "' ");
			if (!"00".equals(qxcode))
				sqlInsert.append(" and substr(org_code,3,2)='" + qxcode + "' ");
			sqlInsert.append(tsql);
			// log.error(sqlInsert.toString());
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				sp = rs.getDouble(1);
				num = rs.getInt(2);
			}
		} catch (Exception e) {
			log.error(e.toString());
			throw new Cls_exception("POrderDetialList.getSumPrice() "
					+ e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"POrderDetialList.getSumPrice()"
									+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"POrderDetialList.getSumPrice()"
									+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"POrderDetialList.getSumPrice()"
									+ e.toString());
				}
				conn = null;
			}

		}
		Map<String, String> map = new HashMap<String, String>();
		map.put("num", num + "");
		map.put("price", sp + "");
		return map;
	}
	/**
	 * 查询地市出单订单明细
	 * @param tsql
	 * @param qxcode
	 * @return
	 * @throws Cls_exception
	 */
	public List<PolicyOrder> getTeamSList(String tsql, String citycode,
			String qxcode) throws Cls_exception{
		List<PolicyOrder> rtnAL= new ArrayList<PolicyOrder>();
		rtnAL = getQxSuccessList(tsql,citycode,qxcode);
		CTeam team = new CTeam();
		int teamcode = 0;
		for (PolicyOrder tmp:rtnAL) {
			teamcode = tmp.getTeam_code();
			if (teamcode >0) {
				team.initialize(teamcode);
				tmp.setVin(team.getName());
			} else {
				tmp.setVin("无团队");
			}			
		}
		return rtnAL;
	}
	public List<PolicyOrder> getQxSuccessList(String tsql, String citycode,
			String qxcode) throws Cls_exception {
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		ArrayList<PolicyOrder> rtnAL = new ArrayList<PolicyOrder>();
		StringBuffer sqlInsert = new StringBuffer();
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			sqlInsert
					.append("SELECT to_char(proce_time,'yyyy-mm-dd') as sproce_time,opercode,yw_type,");
			sqlInsert
					.append("org_code,org_code_name,org_tel,sum_price,policy_name,team_code  FROM kcs_insurance_accident_ddmx t");
			sqlInsert.append(" where order_type='6' and city_code='" + citycode
					+ "' ");
			if (!"00".equals(qxcode))
				sqlInsert.append(" and substr(org_code,3,2)='" + qxcode + "' ");
			sqlInsert.append(tsql + " ORDER BY serial_no desc");
			// log.error(sqlInsert.toString());
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();
			PolicyOrder tmp_jg;
			while (rs.next()) {
				tmp_jg = new PolicyOrder();
				tmp_jg.setSproce_time(rs.getString("sproce_time"));
				tmp_jg.setOrg_code(rs.getString("org_code"));
				tmp_jg.setOpercode(rs.getString("opercode"));
				tmp_jg.setYw_type(rs.getInt("yw_type"));
				tmp_jg.setPolicy_name(rs.getString("policy_name"));
				tmp_jg.setSum_price(rs.getDouble("sum_price"));
				if (rs.getString("org_tel") != null)
					tmp_jg.setOrg_tel(rs.getString("org_tel"));
				tmp_jg.setOrg_code_name(rs.getString("org_code_name"));
				tmp_jg.setTeam_code(rs.getInt("team_code"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			log.error(e.toString());
			throw new Cls_exception(
					"POrderDetialList.getQxSuccessList() "
							+ e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"POrderDetialList.getQxSuccessList()"
									+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"POrderDetialList.getQxSuccessList()"
									+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"POrderDetialList.getQxSuccessList()"
									+ e.toString());
				}
				conn = null;
			}

		}
		return rtnAL;

	}

	/**
	 * 查询某地市所有区县名称代码
	 * 
	 * @return
	 */
	public List<Cls_e_tmp> GetQxdm(String cityno) throws Cls_exception {
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		try {
			Cls_connect80 cn = new Cls_connect80();
			conn = cn.connect().getConnection();
			pstmt = conn
					.prepareStatement("select coun_no,para_value from esseapp.kcs_para t where city_no=? and coun_no<>'00'  order by coun_no");
			pstmt.setString(1, cityno);
			rs = pstmt.executeQuery();
			Cls_e_tmp v_tmp;
			while (rs.next()) {
				v_tmp = new Cls_e_tmp();
				v_tmp.setS1(rs.getString("coun_no"));
				v_tmp.setS2(rs.getString("para_value"));
				rtnAL.add(v_tmp);
				v_tmp = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("POrderDetialList.GetQxdm() "
					+ e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"POrderDetialList.GetQxdm()"
									+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"POrderDetialList.GetQxdm()"
									+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"POrderDetialList.GetQxdm()"
									+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}
	/**
	 * 查询某区县出单订单明细
	 * @param tsql
	 * @param qxcode
	 * @return
	 * @throws Cls_exception
	 */
	public List<PolicyOrder> getQxTeamSList(String tsql, String qxcode) throws Cls_exception{
		List<PolicyOrder> rtnAL= new ArrayList<PolicyOrder>();
		rtnAL = getQxTeamSuccessList(tsql,qxcode);
		CTeam team = new CTeam();
		int teamcode = 0;
		for (PolicyOrder tmp:rtnAL) {
			teamcode = tmp.getTeam_code();
			if (teamcode >0) {
				team.initialize(teamcode);
				tmp.setVin(team.getName());
			} else {
				tmp.setVin("无团队");
			}			
		}
		return rtnAL;
	}
	private List<PolicyOrder> getQxTeamSuccessList(String tsql, String qxcode)
	  throws Cls_exception {
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		ArrayList<PolicyOrder> rtnAL = new ArrayList<PolicyOrder>();
		StringBuffer sqlInsert = new StringBuffer();
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			sqlInsert
					.append("SELECT to_char(proce_time,'yyyy-mm-dd') as sproce_time,opercode,yw_type,team_code,");
			sqlInsert
					.append("org_code,org_code_name,sum_price,policy_name,policy_num  FROM kcs_insurance_accident_ddmx t");
			sqlInsert.append(" where order_type='6' and county_code='" + qxcode
					+ "' ");
			
			sqlInsert.append(tsql + " ORDER BY team_code,serial_no desc");
			// log.error(sqlInsert.toString());
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();
			PolicyOrder tmp_jg;
			while (rs.next()) {
				tmp_jg = new PolicyOrder();
				tmp_jg.setSproce_time(rs.getString("sproce_time"));
				tmp_jg.setOrg_code(rs.getString("org_code"));
				tmp_jg.setOpercode(rs.getString("opercode"));
				tmp_jg.setYw_type(rs.getInt("yw_type"));
				tmp_jg.setPolicy_name(rs.getString("policy_name"));
				tmp_jg.setSum_price(rs.getDouble("sum_price"));
				tmp_jg.setOrg_code_name(rs.getString("org_code_name"));
				tmp_jg.setPolicy_num(rs.getInt("policy_num"));
				tmp_jg.setTeam_code(rs.getInt("team_code"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			log.error(e.toString());
			throw new Cls_exception(
					"POrderDetialList.getTeamSuccessList() "
							+ e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"POrderDetialList.getTeamSuccessList()"
									+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"POrderDetialList.getTeamSuccessList()"
									+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"POrderDetialList.getQxSuccessList()"
									+ e.toString());
				}
				conn = null;
			}

		}
		return rtnAL;

	}
	/**
	 * 查询某区县出单总份数和总保费
	 * @param tsql
	 * @param qxcode
	 * @return
	 * @throws Cls_exception
	 */
	public Map<String, String> getQxSumPrice(String tsql, 
			String qxcode) throws Cls_exception {
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		Double sp = 0.0;
		int num = 0;
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			sqlInsert
					.append("SELECT sum(sum_price),sum(policy_num)  FROM kcs_insurance_accident_ddmx t");
			sqlInsert.append(" where order_type='6' and county_code='" + qxcode
					+ "' ");
			sqlInsert.append(tsql);
			// log.error(sqlInsert.toString());
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				sp = rs.getDouble(1);
				num = rs.getInt(2);
			}
		} catch (Exception e) {
			log.error(e.toString());
			throw new Cls_exception("POrderDetialList.getSumPrice() "
					+ e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"POrderDetialList.getSumPrice()"
									+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"POrderDetialList.getSumPrice()"
									+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"POrderDetialList.getSumPrice()"
									+ e.toString());
				}
				conn = null;
			}

		}
		Map<String, String> map = new HashMap<String, String>();
		map.put("num", num + "");
		map.put("price", sp + "");
		return map;
	}
	/**
	 * 查询某团队下出单订单明细
	 * @param tsql
	 * @param teamcode 团队号
	 * @return
	 * @throws Cls_exception
	 */
	public List<PolicyOrder> getTeamSuccessList(String tsql, int teamcode)
	  throws Cls_exception {
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		ArrayList<PolicyOrder> rtnAL = new ArrayList<PolicyOrder>();
		StringBuffer sqlInsert = new StringBuffer();
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			sqlInsert
					.append("SELECT to_char(proce_time,'yyyy-mm-dd') as sproce_time,opercode,yw_type,team_code,");
			sqlInsert
					.append("org_code,org_code_name,sum_price,policy_name,policy_num  FROM kcs_insurance_accident_ddmx t");
			sqlInsert.append(" where order_type='6' and team_code=" + teamcode);
								
			sqlInsert.append(tsql + " ORDER BY serial_no desc");
			// log.error(sqlInsert.toString());
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();
			PolicyOrder tmp_jg;
			while (rs.next()) {
				tmp_jg = new PolicyOrder();
				tmp_jg.setSproce_time(rs.getString("sproce_time"));
				tmp_jg.setOrg_code(rs.getString("org_code"));
				tmp_jg.setOpercode(rs.getString("opercode"));
				tmp_jg.setYw_type(rs.getInt("yw_type"));
				tmp_jg.setPolicy_name(rs.getString("policy_name"));
				tmp_jg.setSum_price(rs.getDouble("sum_price"));
				tmp_jg.setOrg_code_name(rs.getString("org_code_name"));
				tmp_jg.setPolicy_num(rs.getInt("policy_num"));
				//tmp_jg.setTeam_code(rs.getInt("team_code"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			log.error(e.toString());
			throw new Cls_exception(
					"POrderDetialList.getTeamSuccessList() "
							+ e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"POrderDetialList.getTeamSuccessList()"
									+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"POrderDetialList.getTeamSuccessList()"
									+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"POrderDetialList.getTeamSuccessList()"
									+ e.toString());
				}
				conn = null;
			}

		}
		return rtnAL;

	}
	/**
	 * 查询某团队出单总份数和总保费
	 * @param tsql
	 * @param qxcode
	 * @return
	 * @throws Cls_exception
	 */
	public Map<String, String> getTeamSumPrice(String tsql, 
			int teamcode) throws Cls_exception {
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		Double sp = 0.0;
		int num = 0;
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			sqlInsert
					.append("SELECT sum(sum_price),sum(policy_num)  FROM kcs_insurance_accident_ddmx t");
			sqlInsert.append(" where order_type='6' and team_code=" + teamcode);
					
			sqlInsert.append(tsql);
			// log.error(sqlInsert.toString());
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				sp = rs.getDouble(1);
				num = rs.getInt(2);
			}
		} catch (Exception e) {
			log.error(e.toString());
			throw new Cls_exception("POrderDetialList.getTeamSumPrice() "
					+ e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"POrderDetialList.getTeamSumPrice()"
									+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"POrderDetialList.getTeamSumPrice()"
									+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"POrderDetialList.getTeamSumPrice()"
									+ e.toString());
				}
				conn = null;
			}

		}
		Map<String, String> map = new HashMap<String, String>();
		map.put("num", num + "");
		map.put("price", sp + "");
		return map;
	}
}
