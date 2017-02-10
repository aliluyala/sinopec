/**
 * 
 */
package pkg_AccidentPolicy.AccidPolicyPre;

import java.sql.SQLException;
import java.sql.SQLRecoverableException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_connect80;
import pkg_sinopec.Cls_e_tmp;
import pkg_sinopec.Cls_exception;

/**
 * @author Administrator
 *
 */
public class POrderStatisticslList {
	private static Logger log = Logger
	.getLogger(POrderStatisticslList.class);  
	public Cls_e_tmp getYearList(String citycode,String qxcode,String rq,int bxgs) throws Cls_exception {
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		//Double dsum = 0.0;
		Cls_e_tmp tmp = new Cls_e_tmp();
		StringBuffer sqlInsert = new StringBuffer();
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			sqlInsert
					.append("SELECT sum(sum_price) as d1,sum(policy_num) as n1 FROM kcs_insurance_accident_ddmx t");
			sqlInsert.append(" where order_type='6' and city_code='" + citycode
					+ "' ");
			if (!"00".equals(qxcode))
				sqlInsert.append(" and substr(org_code,3,2)='" + qxcode + "' ");
			sqlInsert.append(" and proce_time>= trunc(to_date('"+rq+"','yyyy-mm-dd'),'yyyy')");
			sqlInsert.append(" and to_char(proce_time,'yyyy-mm-dd')<='"+rq+"' ");
			if (bxgs>0)
			    sqlInsert.append(" and yw_type="+bxgs);
			// log.error(sqlInsert.toString());
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				//dsum = rs.getDouble("d1");
				tmp.setD1(rs.getDouble("d1"));
				tmp.setNum1(rs.getInt("n1"));
			}
		} catch (Exception e) {
			log.error(e.toString());
			throw new Cls_exception(
					"DownExcelPOrderStatisticslList.getDayList() "
							+ e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"DownExcelPOrderStatisticslList.getDayList() "
									+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"DownExcelPOrderStatisticslList.getDayList() "
									+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"DownExcelPOrderStatisticslList.getDayList() "
									+ e.toString());
				}
				conn = null;
			}

		}
		return tmp;
	}
	public Cls_e_tmp getMonList(String citycode,String qxcode,String rq,int bxgs) throws Cls_exception {
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		//Double dsum = 0.0;
		Cls_e_tmp tmp = new Cls_e_tmp();
		StringBuffer sqlInsert = new StringBuffer();
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			sqlInsert
					.append("SELECT sum(sum_price) as d1,sum(policy_num) as n1  FROM kcs_insurance_accident_ddmx t");
			sqlInsert.append(" where order_type='6' and city_code='" + citycode
					+ "' ");
			if (!"00".equals(qxcode))
				sqlInsert.append(" and substr(org_code,3,2)='" + qxcode + "' ");
			sqlInsert.append(" and proce_time>= trunc(to_date('"+rq+"','yyyy-mm-dd'),'mm')");
			sqlInsert.append(" and to_char(proce_time,'yyyy-mm-dd')<='"+rq+"' ");
			if (bxgs>0)
			    sqlInsert.append(" and yw_type="+bxgs);
			// log.error(sqlInsert.toString());
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				//dsum = rs.getDouble("d1");
				tmp.setD1(rs.getDouble("d1"));
				tmp.setNum1(rs.getInt("n1"));
			}
		} catch (Exception e) {
			log.error(e.toString());
			throw new Cls_exception(
					"DownExcelPOrderStatisticslList.getDayList() "
							+ e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"DownExcelPOrderStatisticslList.getDayList() "
									+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"DownExcelPOrderStatisticslList.getDayList() "
									+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"DownExcelPOrderStatisticslList.getDayList() "
									+ e.toString());
				}
				conn = null;
			}

		}
		return tmp;
	}
	public Cls_e_tmp getDayList(String citycode,String qxcode,String rq,int bxgs) throws Cls_exception {
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		//Double dsum = 0.0;
		Cls_e_tmp tmp = new Cls_e_tmp();
		StringBuffer sqlInsert = new StringBuffer();
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			sqlInsert
					.append("SELECT sum(sum_price) as d1,sum(policy_num) as n1  FROM kcs_insurance_accident_ddmx t");
			sqlInsert.append(" where order_type='6' and city_code='" + citycode
					+ "' ");
			if (!"00".equals(qxcode))
				sqlInsert.append(" and substr(org_code,3,2)='" + qxcode + "' ");
			sqlInsert.append(" and to_char(proce_time,'yyyy-mm-dd')='"+rq+"'");
			if (bxgs>0)
			    sqlInsert.append(" and yw_type="+bxgs);
			// log.error(sqlInsert.toString());
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				//dsum = rs.getDouble("d1");
				tmp.setD1(rs.getDouble("d1"));
				tmp.setNum1(rs.getInt("n1"));
			}
		} catch (Exception e) {
			log.error(e.toString());
			throw new Cls_exception(
					"DownExcelPOrderStatisticslList.getDayList() "
							+ e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"DownExcelPOrderStatisticslList.getDayList() "
									+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"DownExcelPOrderStatisticslList.getDayList() "
									+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"DownExcelPOrderStatisticslList.getDayList() "
									+ e.toString());
				}
				conn = null;
			}

		}
		return tmp;
	}
	public List<Integer> getBelongBxgsList(String citycode) throws Cls_exception{
	    	ArrayList<Integer> rtnAL = new ArrayList<Integer>();
			java.sql.Connection conn = null;
			java.sql.PreparedStatement pstmt = null;
			java.sql.ResultSet rs = null;
			StringBuffer sql = new StringBuffer();
			sql.append("select distinct yw_type from kcs_insurance_accident where  ");
			sql.append("salescity like '%"+citycode+"%' or salescity like '%00%'");
			try {
				Cls_connect cn = new Cls_connect();
				conn = cn.connect().getConnection();
				pstmt = conn.prepareStatement(sql.toString());
			
				rs = pstmt.executeQuery();
				while (rs.next()) {
					rtnAL.add(rs.getInt("yw_type"));
				}
			} catch(SQLRecoverableException e){
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				throw new Cls_exception("DownExcelPOrderStatisticslList.getBelongBxgsList() "
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
					throw new Cls_exception("DownExcelPOrderStatisticslList.getBelongBxgsList()"
							+ e.toString());
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
			throw new Cls_exception("DownExcelPOrderDetialList.GetQxdm() "
					+ e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"DownExcelPOrderDetialList.GetQxdm()"
									+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"DownExcelPOrderDetialList.GetQxdm()"
									+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"DownExcelPOrderDetialList.GetQxdm()"
									+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}
/**
 * 
 * @param countycode
 * @param qrq
 * @param zrq
 * @return d1-保费合计  n1-订单数  n2-团队号  s1-团队名  d2-保费计划 s2-完成比例
 * @throws Cls_exception
 */
	public List<Cls_e_tmp> getCountyTj(String countycode,String qrq,String zrq) throws Cls_exception {
		List<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		DecimalFormat df = new DecimalFormat("#0.00");
		int teamcode = 0;
		CTeam team = new CTeam();
		rtnAL = getCountyTeamTj(countycode,qrq,zrq);
		for (Cls_e_tmp tmp:rtnAL) {
			teamcode = tmp.getNum2();
			if (teamcode >0) {
				team.initialize(teamcode);
				tmp.setS1(team.getName());
				tmp.setD2(team.getPremium_plan());
				tmp.setS2(df.format(tmp.getD1()*100/tmp.getD2())+"%");
			} else {
			    tmp.setS1("无团队");
			    tmp.setD2(0);
			    tmp.setS2("0");
			}			
		}
		return rtnAL;
	}
	private List<Cls_e_tmp> getCountyTeamTj(String countycode,String qrq,String zrq) throws Cls_exception {
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		StringBuffer sqlInsert = new StringBuffer();
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			sqlInsert
					.append("SELECT sum(sum_price) as d1,sum(policy_num) as n1,team_code  FROM kcs_insurance_accident_ddmx t");
			sqlInsert.append(" where order_type='6' and county_code='" + countycode
					+ "' ");
			sqlInsert.append(" and proce_time>=TO_DATE('"+qrq+"','yyyy-mm-dd')");
			sqlInsert.append(" and proce_time<=TO_DATE('"+zrq+"-23-59-59','yyyy-mm-dd-hh24-mi-ss')");
            sqlInsert.append(" group by team_code");
			log.error(sqlInsert.toString());
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();
			Cls_e_tmp tmp;
			while (rs.next()) {
				tmp = new Cls_e_tmp();
				tmp.setD1(rs.getDouble("d1"));
				tmp.setNum1(rs.getInt("n1"));
				tmp.setNum2(rs.getInt("team_code"));
				rtnAL.add(tmp);
				tmp = null;
			}
		} catch (Exception e) {
			log.error(e.toString());
			throw new Cls_exception(
					"DownExcelPOrderStatisticslList.getCountyTeamTj() "
							+ e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"DownExcelPOrderStatisticslList.getCountyTeamTj() "
									+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"DownExcelPOrderStatisticslList.getCountyTeamTj() "
									+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception(
							"DownExcelPOrderStatisticslList.getCountyTeamTj() "
									+ e.toString());
				}
				conn = null;
			}

		}
		return rtnAL;
	}
}
