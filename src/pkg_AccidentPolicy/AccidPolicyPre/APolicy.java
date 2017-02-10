/**
 * 
 */
package pkg_AccidentPolicy.AccidPolicyPre;

import java.sql.SQLException;
import java.sql.SQLRecoverableException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

import pkg_AccidentPolicy.pojo.AccidentPolicy;
import pkg_AccidentPolicy.pojo.AccidentPolicyKind;
import pkg_AccidentPolicy.pojo.TempObj;
import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_exception;

/**
 * @author Administrator
 * 
 */
public class APolicy extends AccidentPolicy {
	private Logger log = Logger.getLogger(APolicy.class);

	public boolean modify(int serial_no) throws Cls_exception {
		log.error("修改卡单种类信息：" + serial_no + "/");
		boolean ret = false;
		if (serial_no == 0) {
			log.error("APlicy.modify() serial_no is null");
			throw new NullPointerException("APlicy.modify() serial_no is null");
		}
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("update kcs_insurance_accident set yw_type=?,name=?,picture_sfz=?,picture_jshz=?,");
		sqlInsert
				.append("brief=?,tb_mode=?,rule_exp=?,tb_exp=?,salescity=?,rq=sysdate where serial_no=?");
		java.sql.Connection con = null;
		java.sql.PreparedStatement stmt = null;
		java.sql.ResultSet rs = null;
		int a = 0;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt = con.prepareStatement(sqlInsert.toString());
			stmt.setInt(1, this.getYw_type());
			stmt.setString(2, this.getName());
			stmt.setInt(3, this.getPicture_sfz());
			stmt.setInt(4, this.getPicture_jshz());
			stmt.setString(5, this.getBrief());
			stmt.setString(6, this.getTb_mode());
			stmt.setString(7, this.getRule_exp());
			stmt.setString(8, this.getTb_exp());
			stmt.setString(9, this.getSalescity());
			stmt.setInt(10, serial_no);

			a = stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认
			if (a > 0) {
				ret = true;
			}
		} catch (SQLException se) {
			log.error("APlicy.modify():" + se.toString());
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
					throw new Cls_exception("APlicy.modify()" + e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("APlicy.modify()" + e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("APlicy.modify()" + e.toString());
				}
				con = null;
			}
		}
		return ret;
	}

	public boolean save() throws Cls_exception {
		log.error("保存卡单种类信息：" + this.getName() + "/");
		boolean ret = false;
		if (this.getName() == null) {
			log.error("APlicy.save() name is null");
			throw new NullPointerException("APlicy.save() name is null");
		}
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("insert into kcs_insurance_accident values(AUTOQUOTE_ID.nextval,");
		sqlInsert.append("?,?,?,?,?,?,sysdate,?,?,?,?)");
		java.sql.Connection con = null;
		java.sql.PreparedStatement stmt = null;
		java.sql.ResultSet rs = null;
		int a = 0;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt = con.prepareStatement(sqlInsert.toString());
			stmt.setInt(1, this.getYw_type());
			stmt.setString(2, this.getName());
			stmt.setInt(3, this.getPicture_sfz());
			stmt.setInt(4, this.getPicture_jshz());
			stmt.setInt(5, this.getPicture_syr());
			stmt.setString(6, this.getBrief());
			stmt.setString(7, this.getTb_mode());
			stmt.setString(8, this.getRule_exp());
			stmt.setString(9, this.getTb_exp());
			stmt.setString(10, this.getSalescity());

			a = stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认
			if (a > 0) {
				ret = true;
			}
		} catch (SQLException se) {
			log.error("APlicy.save():" + se.toString());
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
					throw new Cls_exception("APlicy.save()" + e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("APlicy.save()" + e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("APlicy.save()" + e.toString());
				}
				con = null;
			}
		}
		return ret;
	}

	public boolean initialize(int serial_no) throws Cls_exception {
		log.error("查询卡单种类信息：" + serial_no);
		boolean ret = false;
		if (serial_no == 0) {
			log.error("APlicy.initialize() serial_no is null");
			throw new NullPointerException(
					"APlicy.initialize() serial_no is null");
		}
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("select * from  kcs_insurance_accident where serial_no="
						+ serial_no);
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
				this.setSerial_no(rs.getInt("serial_no"));
				this.setYw_type(rs.getInt("yw_type"));
				this.setName(rs.getString("name"));
				this.setPicture_sfz(rs.getInt("picture_sfz"));
				this.setPicture_jshz(rs.getInt("picture_jshz"));
				this.setPicture_syr(rs.getInt("picture_syr"));
				this.setBrief(rs.getString("brief"));
				this.setTb_mode(rs.getString("tb_mode"));
				this.setRule_exp(rs.getString("rule_exp"));
				this.setTb_exp(rs.getString("tb_exp"));
				this.setSalescity(rs.getString("salescity"));
			}
		} catch (SQLException se) {
			log.error("APlicy.initialize():" + se.toString());
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
					throw new Cls_exception("APlicy.initialize()"
							+ e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("APlicy.initialize()"
							+ e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("APlicy.initialize()"
							+ e.toString());
				}
				con = null;
			}
		}
		return ret;
	}
	/**
	 * 2016年6月12号修改后，未更新到83服务器
	 * @param serial_no
	 * @return
	 * @throws Cls_exception
	 */
    public List<TempObj> getKind(int serial_no) throws Cls_exception{
    	log.error("查询卡单下产品款别信息：" + serial_no);
    	if (serial_no == 0) {
			log.error("APlicy.getKind() serial_no is null");
			throw new NullPointerException(
					"APlicy.getKind() serial_no is null");
		}
    	
    	List<TempObj> lretu = new ArrayList<TempObj>();
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("select kind,serial_no from  kcs_insurance_kind where mark=1 and plicy_no="
						+ serial_no);
		java.sql.Connection con = null;
		java.sql.PreparedStatement stmt = null;
		java.sql.ResultSet rs = null;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			stmt = con.prepareStatement(sqlInsert.toString());
			rs = stmt.executeQuery();
			while (rs.next()) {
				TempObj tobj = new TempObj();
				tobj.setS1(rs.getString("kind"));
				tobj.setInt1(rs.getInt("serial_no"));
				lretu.add(tobj);
			} 
		} catch (SQLException se) {
			log.error("APlicy.getKind():" + se.toString());
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
					throw new Cls_exception("APlicy.getKind()"
							+ e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("APlicy.getKind()"
							+ e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("APlicy.getKind()"
							+ e.toString());
				}
				con = null;
			}
		}
		return lretu;
    }
    private List<AccidentPolicyKind> getKinds(int serial_no) throws Cls_exception{
    	log.error("查询卡单下产品款别信息：" + serial_no);
    	if (serial_no == 0) {
			log.error("APlicy.getKinds() serial_no is null");
			throw new NullPointerException(
					"APlicy.getKinds() serial_no is null");
		}
    	
    	List<AccidentPolicyKind> lretu = new ArrayList<AccidentPolicyKind>();
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("select * from  kcs_insurance_kind where mark=1 and plicy_no="
						+ serial_no);
		java.sql.Connection con = null;
		java.sql.PreparedStatement stmt = null;
		java.sql.ResultSet rs = null;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			stmt = con.prepareStatement(sqlInsert.toString());
			rs = stmt.executeQuery();
			AccidentPolicyKind temp ;
			while (rs.next()) {
				temp = new AccidentPolicyKind();
				 temp.setKind_id(rs.getInt("serial_no"));
				 temp.setKind(rs.getString("kind"));
				 temp.setPrice(rs.getDouble("price"));
				 if (rs.getInt("maxlimite")== 0 ) 
					 temp.setS_maxlimite("");
				 else 
					 temp.setS_maxlimite(rs.getInt("maxlimite")+"");
				 temp.setMaxlimite(rs.getInt("maxlimite"));
				 temp.setPicture_id(rs.getString("picture_id"));
				 
				lretu.add(temp);
			} 
		} catch (SQLException se) {
			log.error("APlicy.getKinds():" + se.toString());
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
					throw new Cls_exception("APlicy.getKinds()"
							+ e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("APlicy.getKinds()"
							+ e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("APlicy.getKinds()"
							+ e.toString());
				}
				con = null;
			}
		}
		return lretu;
    }
    public List<AccidentPolicyKind> getKinds(int serial_no,String citycode) throws Cls_exception{
    	List<AccidentPolicyKind> lretu = new ArrayList<AccidentPolicyKind>();
    	lretu = getKinds(serial_no);
    	APolicyKind apkind = new APolicyKind();
    	for (AccidentPolicyKind kind : lretu) {
    		kind.setSales(apkind.sales(kind.getKind_id(), citycode));
    		kind.setStocks(apkind.stocks(kind.getKind_id(), citycode));
    	}
    	return lretu;
    }
    public boolean has_cljg(String orgcode) throws Cls_exception {
		boolean tag = false;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		String citycode = "", councode = "";
		String sql = "";
		try {
			if (!"".equals(orgcode) && orgcode.length() == 8) {
				citycode = orgcode.substring(0, 2);
				councode = orgcode.substring(2, 4);
				sql = "select * from (select * from kcs_specbxcljg where city_code='"
						+ citycode
						+ "' and gsxh="
						+ this.getYw_type()
						+ " and (coun_code like '%"
						+ councode
						+ "%' or coun_code like '%00%') and yw_mark>1) where rownum=1";
				log.info(sql);

				Cls_connect cn = new Cls_connect();
				conn = cn.connect().getConnection();
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					tag = true;
				}
			}
		} catch (SQLRecoverableException e) {
			log.error(e.toString());
			throw new Cls_exception("APolicy.has_cljg() " + e.toString());
		} catch (SQLException e) {
			log.error(e.toString());
			throw new Cls_exception("APolicy.has_cljg() " + e.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("APolicy.has_cljg()" + e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("APolicy.has_cljg()" + e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("APolicy.has_cljg()" + e.toString());
				}
				conn = null;
			}
		}
		return tag;
	}
}
