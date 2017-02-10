/**
 * 
 */
package pkg_AccidentPolicy.AccidPolicyPre;

import java.sql.SQLException;
import java.sql.SQLRecoverableException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import pkg_AccidentPolicy.pojo.CountyTeam;
import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_exception;

/**
 * @author Administrator
 *
 */
public class County {
	private Logger log = Logger.getLogger(County.class);
	public int getCount(String county_code) throws Cls_exception {
		int a = 0;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			String sql = "select count(*) from kcs_insurance_team where county_code ='"+county_code+"'";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				a = rs.getInt(1);
			}
		} catch (Exception e) {
			throw new Cls_exception("County.getCount()   " + e.toString());
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
				throw new Cls_exception("County.getCount()  finally"
						+ e.toString());
			}
		}
		return a;
	}
	public List<CountyTeam> getTeamList_page(String county_code,int p,
			int ev) throws Cls_exception {
		ArrayList<CountyTeam> rtnAL = new ArrayList<CountyTeam>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select * from (select my_table.*,rownum as my_rownum from ( ");
		sql.append("select * from kcs_insurance_team where county_code ='"+county_code);
		sql.append("' order by serial_no desc");
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
                tmp_jg.setTeam_code(rs.getInt("serial_no"));
                tmp_jg.setName(rs.getString("name"));
                tmp_jg.setOrgcode(rs.getString("orgcode"));
                tmp_jg.setPremium_plan(rs.getDouble("premium_plan"));
                
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch(SQLRecoverableException e){
			log.error(e.toString());
			e.printStackTrace();
		} catch (SQLException e) {
			log.error(e.toString());
			e.printStackTrace();
		} catch (Exception e) {
			log.error(e.toString());
			throw new Cls_exception("County.getTeamList_page() "
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
				throw new Cls_exception("County.getTeamList_page()"
						+ e.toString());
			}

		}

		return rtnAL;   	
	}
	/*
	 * 该区县是否已存在团队名称
	 */
    public boolean isDuplicateName(String name,String qxcode) throws Cls_exception{
    	boolean ret = false;
		int a =0;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("SELECT count(*) FROM kcs_insurance_team where name=? and county_code=?");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			pstmt.setString(1, name);
			pstmt.setString(2, qxcode);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				a = rs.getInt(1);
				if (a>0)
				   ret = true;
			}
			log.error(name+"- duplicate:"+ret);
		} catch (Exception e) {
			log.error(e.toString());
			throw new Cls_exception("County.isDuplicateName()   " + e.toString());
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
				throw new Cls_exception("County.isDuplicateName()  finally"
						+ e.toString());
			}
		}
		return ret;	
    }
}
