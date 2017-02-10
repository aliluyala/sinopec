/**
 * 
 */
package pkg_AccidentPolicy.AccidPolicyPre;

import java.sql.SQLException;
import java.sql.SQLRecoverableException;
import java.util.ArrayList;
import java.util.List;

import pkg_AccidentPolicy.pojo.AccidentPolicy;
import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_exception;

/**
 * @author Administrator
 *
 */
public class APolicyList {
	 public List<AccidentPolicy> getBelongList(String citycode,int bxgs) throws Cls_exception{
	    	ArrayList<AccidentPolicy> rtnAL = new ArrayList<AccidentPolicy>();
			java.sql.Connection conn = null;
			java.sql.PreparedStatement pstmt = null;
			java.sql.ResultSet rs = null;
			StringBuffer sql = new StringBuffer();
			sql.append("select * from kcs_insurance_accident where  yw_type="+bxgs);
			sql.append(" and (salescity like '%"+citycode+"%' or salescity like '%00%')");
			sql.append(" and yw_type in ( select yw_type from kcs_insurance_kind where mark=1)");
			sql.append(" order by serial_no");
			try {
				Cls_connect cn = new Cls_connect();
				conn = cn.connect().getConnection();
				pstmt = conn.prepareStatement(sql.toString());
			
				rs = pstmt.executeQuery();
				AccidentPolicy tmp_jg;
				while (rs.next()) {
					tmp_jg = new AccidentPolicy();
	                tmp_jg.setSerial_no(rs.getInt("serial_no"));
	                tmp_jg.setName(rs.getString("name"));
                    tmp_jg.setBrief(rs.getString("brief"));
                    tmp_jg.setTb_exp(rs.getString("tb_exp"));
                    tmp_jg.setRule_exp(rs.getString("rule_exp"));
					rtnAL.add(tmp_jg);
					tmp_jg = null;
				}
			} catch(SQLRecoverableException e){
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				throw new Cls_exception("APlicyList.getBelongList() "
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
					throw new Cls_exception("APlicyList.getBelongList()"
							+ e.toString());
				}

			}

			return rtnAL;   	
	    }
	 public List<Integer> getBelongBxgsList(String citycode) throws Cls_exception{
	    	ArrayList<Integer> rtnAL = new ArrayList<Integer>();
			java.sql.Connection conn = null;
			java.sql.PreparedStatement pstmt = null;
			java.sql.ResultSet rs = null;
			StringBuffer sql = new StringBuffer();
			sql.append("select distinct yw_type from kcs_insurance_accident where  ");
			sql.append("salescity like '%"+citycode+"%' or salescity like '%00%'");
			sql.append(" and yw_type in ( select yw_type from kcs_insurance_kind where mark=1) order by yw_type desc");
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
				throw new Cls_exception("APlicyList.getBelongBxgsList() "
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
					throw new Cls_exception("APlicyList.getBelongBxgsList()"
							+ e.toString());
				}

			}

			return rtnAL;   	
	    }
	 public List<AccidentPolicy> getList_page(int p,int ev) throws Cls_exception{
	    	ArrayList<AccidentPolicy> rtnAL = new ArrayList<AccidentPolicy>();
			java.sql.Connection conn = null;
			java.sql.PreparedStatement pstmt = null;
			java.sql.ResultSet rs = null;
			StringBuffer sql = new StringBuffer();
			sql.append("select * from (select my_table.*,rownum as my_rownum from ( ");
			sql.append("select * from kcs_insurance_accident  order by serial_no desc");
			sql.append(" ) my_table where rownum<" + ev);
			sql.append(" ) where my_rownum>=" + p);
			try {
				Cls_connect cn = new Cls_connect();
				conn = cn.connect().getConnection();
				pstmt = conn.prepareStatement(sql.toString());
			
				rs = pstmt.executeQuery();
				AccidentPolicy tmp_jg;
				while (rs.next()) {
					tmp_jg = new AccidentPolicy();
	                tmp_jg.setSerial_no(rs.getInt("serial_no"));
	                tmp_jg.setYw_type(rs.getInt("yw_type"));
	                tmp_jg.setName(rs.getString("name"));
              tmp_jg.setBrief(rs.getString("brief"));
              tmp_jg.setSalescity(rs.getString("salescity"));
              tmp_jg.setTb_mode(rs.getString("tb_mode"));
					rtnAL.add(tmp_jg);
					tmp_jg = null;
				}
			} catch(SQLRecoverableException e){
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				throw new Cls_exception("APlicyList.getList() "
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
					throw new Cls_exception("APlicyList.getList()"
							+ e.toString());
				}

			}

			return rtnAL;   	
	    }
	 public int getNum(String citycode) throws Cls_exception {
			int a = 0;
			java.sql.Connection conn = null;
			java.sql.PreparedStatement pstmt = null;
			java.sql.ResultSet rs = null;

			try {
				Cls_connect cn = new Cls_connect();
				conn = cn.connect().getConnection();
				String sql = "SELECT COUNT(*) FROM kcs_insurance_accident ";
				pstmt = conn.prepareStatement(sql);

				rs = pstmt.executeQuery();

				while (rs.next()) {
					a = rs.getInt(1);
				}
			} catch (Exception e) {
				throw new Cls_exception("APlicyList.getNum()   " + e.toString());
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
					throw new Cls_exception("APlicyList.getNum()  finally"
							+ e.toString());
				}
			}
			return a;
		}	 
	 
}
