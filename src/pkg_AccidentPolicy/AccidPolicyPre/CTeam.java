/**
 * 
 */
package pkg_AccidentPolicy.AccidPolicyPre;

import java.sql.BatchUpdateException;
import java.sql.SQLException;
import java.sql.SQLRecoverableException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import pkg_AccidentPolicy.pojo.CountyTeam;
import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_exception;

/**
 * @author Administrator
 * 团队管理
 */
public class CTeam extends CountyTeam {
	private Logger log = Logger.getLogger(CTeam.class);
	public boolean initialize(int teamcode) throws Cls_exception {
		//log.error("查询团队信息：" + teamcode);
		boolean ret = false;
		if (teamcode == 0) {
			log.error("CTeam.initialize() teamcode is null");
			throw new NullPointerException(
					"CTeam.initialize() teamcode is null");
		}
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("select * from  kcs_insurance_team where serial_no="
						+ teamcode);
		java.sql.Connection con = null;
		java.sql.PreparedStatement stmt = null;
		java.sql.ResultSet rs = null;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			stmt = con.prepareStatement(sqlInsert.toString());
			rs = stmt.executeQuery();
			while (rs.next()) {
				ret = true;
				this.setTeam_code(rs.getInt("serial_no"));
				this.setName(rs.getString("name"));
				this.setOrgcode(rs.getString("orgcode"));
				this.setPremium_plan(rs.getDouble("premium_plan"));
				this.setCounty_code(rs.getString("county_code"));
				GetJgBmzXx();
			}
		} catch (SQLException se) {
			log.error("CTeam.initialize():" + se.toString());
			se.printStackTrace();
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.initialize()"
							+ e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.initialize()"
							+ e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.initialize()"
							+ e.toString());
				}
				con = null;
			}
		}
		return ret;
	}
	public boolean initialize(String orgcode) throws Cls_exception {
		//log.error("查询团队信息：" + teamcode);
		boolean ret = false;
		if (orgcode == null||"".equals(orgcode)) {
			log.error("CTeam.initialize() orgcode is null");
			throw new NullPointerException(
					"CTeam.initialize() orgcode is null");
		}
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("select * from  kcs_insurance_team where orgcode='"
						+ orgcode +"'");
		java.sql.Connection con = null;
		java.sql.PreparedStatement stmt = null;
		java.sql.ResultSet rs = null;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			stmt = con.prepareStatement(sqlInsert.toString());
			rs = stmt.executeQuery();
			while (rs.next()) {
				ret = true;
				this.setTeam_code(rs.getInt("serial_no"));
				this.setName(rs.getString("name"));
				this.setOrgcode(rs.getString("orgcode"));
				this.setPremium_plan(rs.getDouble("premium_plan"));
				this.setCounty_code(rs.getString("county_code"));
				GetJgBmzXx();
			}
		} catch (SQLException se) {
			log.error("CTeam.initialize():" + se.toString());
			se.printStackTrace();
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.initialize()"
							+ e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.initialize()"
							+ e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.initialize()"
							+ e.toString());
				}
				con = null;
			}
		}
		return ret;
	}
	public int orgNum() throws Cls_exception {
		int a = 0;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			String sql = "select count(*) from kcs_insurance_team_org where team_code ="+this.getTeam_code();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				a = rs.getInt(1);
			}
		} catch (Exception e) {
			throw new Cls_exception("CTeam.orgNum()   " + e.toString());
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
				throw new Cls_exception("CTeam.orgNum()  finally"
						+ e.toString());
			}
		}
		return a;
	}
	public List<CountyTeam> getOrgList_page(int p,
			int ev) throws Cls_exception {
		ArrayList<CountyTeam> rtnAL = new ArrayList<CountyTeam>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select * from (select my_table.*,rownum as my_rownum from ( ");
		sql.append("select * from kcs_insurance_team_org where team_code ="+this.getTeam_code());
		sql.append(" order by serial_no desc");
		sql.append(" ) my_table where rownum<" + ev);
		sql.append(" ) where my_rownum>=" + p);
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());		
			rs = pstmt.executeQuery();
			CountyTeam tmp_jg;
			while (rs.next()) {
				tmp_jg = new CountyTeam();
				tmp_jg.setSerial_no(rs.getInt("serial_no"));
                tmp_jg.setOrgcode(rs.getString("orgcode"));
                tmp_jg.GetJgBmzXx();
                
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch(SQLRecoverableException e){
			log.error("CTeam.getOrgList_page:"+e.toString());
			e.printStackTrace();
		} catch (SQLException e) {
			log.error(e.toString());
			e.printStackTrace();
		} catch (Exception e) {
			log.error(e.toString());
			throw new Cls_exception("CTeam.getOrgList_page() "
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
				throw new Cls_exception("CTeam.getOrgList_page()"
						+ e.toString());
			}

		}

		return rtnAL;   	
	}
	private Map<String, Object> addOrgToTeam(String orgcode) throws Cls_exception {
		log.error("添加团队机构：" + orgcode + " to "+this.getTeam_code());
		Map<String, Object> map = new HashMap<String, Object>();
		boolean ret = false;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("insert into kcs_insurance_team_org(serial_no,");
		sqlInsert.append("team_code,orgcode)");
		sqlInsert.append(" values(AUTOQUOTE_ID.nextval,"+this.getTeam_code()+",'"+orgcode+"')");
		String sql1 = sqlInsert.toString();
		sqlInsert.delete(0, sqlInsert.length());
		sqlInsert.append("update kcs_insurance_accident_ddmx set team_code="+this.getTeam_code());
		sqlInsert.append(",county_code='"+this.getCounty_code()+"'");
		sqlInsert.append(" where team_code=0 and org_code='"+orgcode+"'");
		String sql2 = sqlInsert.toString();
		java.sql.Connection con = null;
		Statement stmt = null;
		java.sql.ResultSet rs = null;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt = con.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			int[ ] a = stmt.executeBatch();
			con.commit();
			con.setAutoCommit(true);// 恢复默认
			if (a[0]>0)
               ret = true;
		} catch (SQLException se) {
			log.error("CTeam.addOrgToTeam():" + se.toString());
			se.printStackTrace();
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.addOrgToTeam()" + e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.addOrgToTeam()" + e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.addOrgToTeam()" + e.toString());
				}
				con = null;
			}
		}
		if (ret) {
			map.put("tag", true);
			map.put("info", "机构添加成功。");
		} else {
			map.put("tag", false);
			map.put("info", "添加失败，请联系管理员。");
		}
		return map;
	}
	public Map<String, Object>  delTeam() throws Cls_exception {
		log.error("删除团队：" + this.getName() + " / "+this.getTeam_code());
		Map<String, Object> map = new HashMap<String, Object>();
		boolean ret = false;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("delete from kcs_insurance_team_org where team_code="+this.getTeam_code());
		String sql1 = sqlInsert.toString();
		sqlInsert.delete(0, sqlInsert.length());
		sqlInsert.append("delete from kcs_insurance_team where serial_no="+this.getTeam_code());
		String sql2 = sqlInsert.toString();
		sqlInsert.delete(0, sqlInsert.length());
		sqlInsert.append("update kcs_insurance_accident_ddmx set team_code=0,county_code = substr(org_code,0,4)");
		sqlInsert.append(" where team_code="+this.getTeam_code());
		String sql3 = sqlInsert.toString();
		java.sql.Connection con = null;
		Statement stmt = null;
		java.sql.ResultSet rs = null;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt = con.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			int[ ] a = stmt.executeBatch();
			con.commit();
			con.setAutoCommit(true);// 恢复默认
			if (a[0]>0 && a[1]>0)
               ret = true;
			
		}catch (BatchUpdateException see) {
			log.error("批处理异常："+see.toString());
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} catch (SQLException se) {
			log.error("CTeam.delTeam():" + se.toString());
			se.printStackTrace();
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.delTeam()" + e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.delTeam()" + e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.delTeam()" + e.toString());
				}
				con = null;
			}
		}
		if (ret) {
			map.put("tag", true);
			map.put("info", this.getName()+"团队已删除");
		} else {
			map.put("tag", false);
			map.put("info", "删除失败，请联系管理员。");
		}
		return map;
	}
	public Map<String, Object>  delOrg(int serial_no) throws Cls_exception {
		log.error("删除团队下机构：" + this.getName() + " / "+serial_no);
		Map<String, Object> map = new HashMap<String, Object>();
		boolean ret = false;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("delete from kcs_insurance_team_org where serial_no="+serial_no);
		String sql = sqlInsert.toString();
		java.sql.Connection con = null;
		java.sql.PreparedStatement stmt = null;
		java.sql.ResultSet rs = null;
		int a = 0;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt = con.prepareStatement(sql);

            a = stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认
			if (a > 0) {
				ret = true;
			}			
		} catch (SQLException se) {
			log.error("CTeam.delOrg():" + se.toString());
			se.printStackTrace();
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.delOrg()" + e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.delOrg()" + e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.delOrg()" + e.toString());
				}
				con = null;
			}
		}
		if (ret) {
			map.put("tag", true);
			map.put("info", "机构已删除成功。");
		} else {
			map.put("tag", false);
			map.put("info", "删除失败，请联系管理员。");
		}
		return map;
	}
	private boolean modTeam() throws Cls_exception {
		log.info("修改团队信息："+this.getTeam_code());
		boolean ret = false;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("update kcs_insurance_team set name=?,orgcode=?,premium_plan=?");
		sqlInsert.append(" where serial_no=?");
		java.sql.Connection con = null;
		java.sql.PreparedStatement stmt = null;
		java.sql.ResultSet rs = null;
		int a = 0;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt = con.prepareStatement(sqlInsert.toString());
			stmt.setString(1, this.getName());
			stmt.setString(2, this.getOrgcode());
			stmt.setDouble(3, this.getPremium_plan());
			stmt.setInt(4, this.getTeam_code());
            a = stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认
			if (a > 0) {
				ret = true;
			}
		} catch (SQLException se) {
			log.error("CTeam.modTeam():" + se.toString());
			se.printStackTrace();
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.modTeam()" + e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.modTeam()" + e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.modTeam()" + e.toString());
				}
				con = null;
			}
		}
		return ret;
	}
	private boolean modTeamNewOrg() throws Cls_exception {
		log.error("修改团队添加新管理机构：" + this.getName());
		boolean ret = false;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("insert into kcs_insurance_team_org(serial_no,team_code,orgcode)");
		sqlInsert.append(" values(AUTOQUOTE_ID.nextval,"+this.getTeam_code()+",'"+this.getOrgcode()+"')");
		String sql1 = sqlInsert.toString();
		sqlInsert.delete(0, sqlInsert.length());
		sqlInsert.append("update kcs_insurance_team set name='"+this.getName()+"',orgcode='");
		sqlInsert.append(this.getOrgcode()+"',premium_plan="+this.getPremium_plan());
		sqlInsert.append(" where serial_no="+this.getTeam_code());
		String sql2 = sqlInsert.toString();
		sqlInsert.delete(0, sqlInsert.length());
		sqlInsert.append("update kcs_insurance_accident_ddmx set team_code="+this.getTeam_code());
		sqlInsert.append(",county_code='"+this.getCounty_code()+"'");
		sqlInsert.append(" where team_code=0 and org_code='"+this.getOrgcode()+"'");
		String sql3 = sqlInsert.toString();
		java.sql.Connection con = null;
		Statement stmt = null;
		java.sql.ResultSet rs = null;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt = con.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			int[ ] a = stmt.executeBatch();
			con.commit();
			con.setAutoCommit(true);// 恢复默认
			if (a[0]>0 && a[1]>0)
               ret = true;
			
		}catch (BatchUpdateException see) {
			log.error("批处理异常："+see.toString());
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} catch (SQLException se) {
			log.error("CTeam.addOrgToTeam():" + se.toString());
			se.printStackTrace();
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.addOrgToTeam()" + e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.addOrgToTeam()" + e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.addOrgToTeam()" + e.toString());
				}
				con = null;
			}
		}
		return ret;	
	}
	private boolean addTeam(int teamcode )throws Cls_exception {
		log.error("添加团队：" + this.getName() + " / "+teamcode);
		boolean ret = false;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("insert into kcs_insurance_team_org(serial_no,team_code,orgcode)");
		sqlInsert.append(" values(AUTOQUOTE_ID.nextval,"+teamcode+",'"+this.getOrgcode()+"')");
		String sql1 = sqlInsert.toString();
		sqlInsert.delete(0, sqlInsert.length());
		sqlInsert.append("insert into kcs_insurance_team(serial_no,name,orgcode,premium_plan,county_code)");
		sqlInsert.append(" values("+teamcode+",'"+this.getName()+"','"+this.getOrgcode()+"',"+this.getPremium_plan());
		sqlInsert.append(" ,'"+this.getCounty_code()+"')");
		String sql2 = sqlInsert.toString();
		sqlInsert.delete(0, sqlInsert.length());
		sqlInsert.append("update kcs_insurance_accident_ddmx set team_code="+teamcode);
		sqlInsert.append(",county_code='"+this.getCounty_code()+"'");
		sqlInsert.append(" where team_code=0 and org_code='"+this.getOrgcode()+"'");
		String sql3 = sqlInsert.toString();
		java.sql.Connection con = null;
		Statement stmt = null;
		java.sql.ResultSet rs = null;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt = con.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			int[ ] a = stmt.executeBatch();
			con.commit();
			con.setAutoCommit(true);// 恢复默认
			if (a[0]>0 && a[1]>0)
               ret = true;
			
		}catch (BatchUpdateException see) {
			log.error("批处理异常："+see.toString());
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} catch (SQLException se) {
			log.error("CTeam.addOrgToTeam():" + se.toString());
			se.printStackTrace();
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.addOrgToTeam()" + e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.addOrgToTeam()" + e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("CTeam.addOrgToTeam()" + e.toString());
				}
				con = null;
			}
		}
		return ret;
	}
   /*
    * 保存团队信息
    */
	public Map<String, Object> saveTeam() throws Cls_exception {
    	Map<String, Object> map = new HashMap<String, Object>();
    	if (this.getOrgcode() == null || "".equals(this.getOrgcode())) {
    		map.put("tag", false);
			map.put("info", "机构号为空。");
    	} else {
    		int teamcode = getNewId();
    		if (isFreeOrg(this.getOrgcode())) {
    			boolean tag = addTeam(teamcode);
    			if (tag) {
    				map.put("tag", true);
        			map.put("info", this.getOrgcode()+"已划入团队");
    			} else {
    				map.put("tag", false);
        			map.put("info", "划入失败，请联系管理员。");
    			}
    			
    		} else {
    			map.put("tag", false);
    			map.put("info", "该机构号已存在团队，不能重复划归。");
    		}
    	}
    	
		return map;
    }
	public  Map<String, Object> addOrg(String orgcode) throws Cls_exception {
		Map<String, Object> map = new HashMap<String, Object>();
		if (orgcode == null || "".equals(orgcode)) {
			map.put("tag", false);
			map.put("info", "机构号为空。");
		} else {
			if (isFreeOrg(orgcode)) {
				map = addOrgToTeam(orgcode);				
			} else {
				map.put("tag", false);
    			map.put("info", "该机构号已存在团队，不能重复划归。");
			}
		}
		return map;
	}
	public Map<String,Object> modTeam(String act) throws Cls_exception {
		Map<String, Object> map = new HashMap<String, Object>();
		boolean tag = false;
		if ("mod".equals(act)) {
			tag = modTeam();
			map.put("tag", tag);
			if (tag) 
				map.put("info", "团队信息修改成功。");
			 else
				map.put("info", "团队信息修改失败，请联系管理员。");
		} else if ("mod_add".equals(act)) {
			tag = modTeamNewOrg();
		    map.put("tag", tag);
		    if (tag)
		    	map.put("info", "团队信息修改成功。");
		    else 
		    	map.put("info", "团队信息修改失败，请联系管理员。");
		} else {
			map.put("tag", false);
			map.put("info", "团队修改类型参数不正确。");
		}
			
		return map;
	}
    /*
     * 获取新的团队号
     */
    private int getNewId() throws Cls_exception {
		int id = 0;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select AUTOQUOTE_ID.nextval from dual");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());

			rs = pstmt.executeQuery();
			while (rs.next()) {
				id = rs.getInt(1);
			}
		} catch (SQLRecoverableException e) {
			log.error("POrder.getNewId()" + e.toString());
			e.printStackTrace();
		} catch (SQLException e) {
			log.error("POrder.getNewId()" + e.toString());
			throw new Cls_exception("POrder.getNewId() " + e.toString());
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
				throw new Cls_exception("POrder.getNewId()" + e.toString());
			}

		}

		return id;
	}
    /*
     * 是否是该团队成员机构
     */
    public boolean isMemberOrg(String orgcode) throws Cls_exception{
    	boolean ret = false;
		int a =0;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("SELECT count(*) FROM kcs_insurance_team_org where orgcode=? and team_code=?");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			pstmt.setString(1, orgcode);
			pstmt.setInt(2, this.getTeam_code());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				a = rs.getInt(1);
				if (a>0)
				   ret = true;
			}
		} catch (Exception e) {
			log.error(e.toString());
			throw new Cls_exception("CTeam.isMemberOrg()   " + e.toString());
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
				throw new Cls_exception("CTeam.isMemberOrg()  finally"
						+ e.toString());
			}
		}
		return ret;	
    }
    /*
     * 是否是其他团队成员机构
     */
    public boolean isOtherMemberOrg(String orgcode) throws Cls_exception{
    	boolean ret = false;
		int a =0;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("SELECT count(*) FROM kcs_insurance_team_org where orgcode=? and team_code<>?");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			pstmt.setString(1, orgcode);
			pstmt.setInt(2, this.getTeam_code());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				a = rs.getInt(1);
				if (a>0)
				   ret = true;
			}
		} catch (Exception e) {
			log.error(e.toString());
			throw new Cls_exception("CTeam.isMemberOrg()   " + e.toString());
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
				throw new Cls_exception("CTeam.isMemberOrg()  finally"
						+ e.toString());
			}
		}
		return ret;	
    }
}
