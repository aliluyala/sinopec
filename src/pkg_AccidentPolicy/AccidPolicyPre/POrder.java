package pkg_AccidentPolicy.AccidPolicyPre;

import java.sql.SQLException;
import java.sql.SQLRecoverableException;

import org.apache.log4j.Logger;

import pkg_AccidentPolicy.pojo.PolicyOrder;
import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_exception;
import pkg_sinopec.Cls_zd;

/**
 * @author Administrator
 * 
 */
public class POrder extends PolicyOrder {
	private Logger log = Logger.getLogger(POrder.class);
	private boolean set_team() throws Cls_exception {
		boolean tag = false;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		String  councode = "";
		String sql = "";
		try {
			String orgcode = this.getOrg_code();
			councode = orgcode.substring(0, 4);
			this.setCounty_code(councode);
			if (!"".equals(orgcode) && orgcode.length() == 8) {
				sql = "select t.team_code,b.county_code from kcs_insurance_team b,kcs_insurance_team_org t "
					  +"where t.team_code=b.serial_no and t.orgcode='"
					  +orgcode +"'";
				Cls_connect cn = new Cls_connect();
				conn = cn.connect().getConnection();
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					tag = true;
					this.setTeam_code(rs.getInt("team_code"));
					this.setCounty_code(rs.getString("county_code"));
				} 
			}
		} catch (SQLRecoverableException e) {
			log.error(e.toString());
			throw new Cls_exception("POrder.set_team() " + e.toString());
		} catch (SQLException e) {
			log.error(e.toString());
			throw new Cls_exception("POrder.set_team() " + e.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("POrder.set_team()" + e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("POrder.set_team()" + e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("POrder.set_team()" + e.toString());
				}
				conn = null;
			}
		}
		return tag;
	}
	public boolean set_cljg() throws Cls_exception {
		boolean tag = false;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		String citycode = "", councode = "";
		String sql = "";
		try {
			String orgcode = this.getOrg_code();
			log.error(orgcode);
			if (!"".equals(orgcode) && orgcode.length() == 8) {
				citycode = orgcode.substring(0, 2);
				councode = orgcode.substring(2, 4);
				log.error(citycode+"/"+councode);
				sql = "select * from (select * from kcs_specbxcljg where city_code='"
						+ citycode
						+ "' and gsxh="
						+ this.getYw_type()
						+ " and (coun_code like '%"
						+ councode
						+ "%' or coun_code like '%00%') and yw_mark>1) where rownum=1";
				log.error(sql);

				Cls_connect cn = new Cls_connect();
				conn = cn.connect().getConnection();
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					tag = true;
					this.setOper_orgcode(rs.getString("oper_orgcode"));
					this.setOper_orgcode_tel(rs.getString("hm"));
				}
			}
		} catch (SQLRecoverableException e) {
			log.error(e.toString());
			throw new Cls_exception("POrder.set_cljg() " + e.toString());
		} catch (SQLException e) {
			log.error(e.toString());
			throw new Cls_exception("POrder.set_cljg() " + e.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("POrder.set_cljg()" + e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("POrder.set_cljg()" + e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("POrder.set_cljg()" + e.toString());
				}
				conn = null;
			}
		}
		return tag;
	}

	private int getNewId() throws Cls_exception {
		int id = 0;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select SINOP_ID.nextval from dual");
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

	public int insert() throws Exception {
		if (this.getOrg_code() == null || "".equals(this.getOrg_code())) {
			throw new NullPointerException("PolicyOrder is null");
		}
		int id = getNewId();
		String orgname = "";
		Cls_zd zd = new Cls_zd();
		orgname = zd.GetJgname(this.getOrg_code());
		set_team();
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("insert into kcs_insurance_accident_ddmx(serial_no,org_code,opercode,oper_orgcode,kind_id,policy_no,");
		sqlInsert
				.append("yw_type,policy_name,policy_price,policy_num,sum_price,order_time,city_code,org_tel,tbr_name,tbr_tel,");
		sqlInsert
				.append("tbr_sfz,tbr_addr,insured_name,insured_tel,relation,insured_id,insured_idnum,insured_name2,");
		sqlInsert
				.append("insured_id2,insured_idnum2,insured_name3,insured_id3,insured_idnum3,insured_name4,insured_id4,");
		sqlInsert
				.append("insured_idnum4,insured_name5,insured_id5,insured_idnum5,post_mark,org_code_name,order_type,t_message,");
		sqlInsert.append("insured_job,insured_school,vin,team_code,county_code) values (" + id + ",");
		sqlInsert
				.append("?,?,?,?,?,?,?,?,?,?,sysdate,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

		java.sql.Connection con = null;
		java.sql.PreparedStatement stmt = null;
		java.sql.ResultSet rs = null;
		int a = 0, b = 0;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt = con.prepareStatement(sqlInsert.toString());
			stmt.setString(1, this.getOrg_code());
			stmt.setString(2, this.getOpercode());
			stmt.setString(3, this.getOper_orgcode());
			stmt.setInt(4, this.getKind_id());
			stmt.setInt(5, this.getPolicy_no());
			stmt.setInt(6, this.getYw_type());
			stmt.setString(7, this.getPolicy_name());
			stmt.setDouble(8, this.getPolicy_price());
			stmt.setInt(9, this.getPolicy_num());
			stmt.setDouble(10, this.getSum_price());
			stmt.setString(11, this.getCity_code());
			stmt.setString(12, this.getOrg_tel());
			stmt.setString(13, this.getTbr_name());
			stmt.setString(14, this.getTbr_tel());
			stmt.setString(15, this.getTbr_sfz());
			stmt.setString(16, this.getTbr_addr());
			stmt.setString(17, this.getInsured_name());
			stmt.setString(18, this.getInsured_tel());
			stmt.setString(19, this.getRelation());
			stmt.setString(20, this.getInsured_id());
			stmt.setString(21, this.getInsured_idnum());
			stmt.setString(22, this.getInsured_name2());
			stmt.setString(23, this.getInsured_id2());
			stmt.setString(24, this.getInsured_idnum2());
			stmt.setString(25, this.getInsured_name3());
			stmt.setString(26, this.getInsured_id3());
			stmt.setString(27, this.getInsured_idnum3());
			stmt.setString(28, this.getInsured_name4());
			stmt.setString(29, this.getInsured_id4());
			stmt.setString(30, this.getInsured_idnum4());
			stmt.setString(31, this.getInsured_name5());
			stmt.setString(32, this.getInsured_id5());
			stmt.setString(33, this.getInsured_idnum5());
			stmt.setString(34, this.getPost_mark());
			stmt.setString(35, orgname);
			stmt.setString(36, "".equals(this.getOrder_type())?"0":this.getOrder_type());
			stmt.setString(37, this.getT_message());
			stmt.setString(38, this.getInsured_job());
			stmt.setString(39, this.getInsured_school());
			stmt.setString(40, this.getVin());
			stmt.setInt(41, this.getTeam_code());
			stmt.setString(42, this.getCounty_code());
			a = stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认
			if (a > 0) {
				b = id;
			}
			log.error("生成订单：" + id + "/id=" + b);
		} catch (SQLException se) {
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
					throw new Cls_exception("POrder.insert()" + e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("POrder.insert()" + e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("POrder.insert()" + e.toString());
				}
				con = null;
			}
		}
		return b;
	}

	public boolean initialize(int serial_no) throws Cls_exception {
		log.error("查询卡单订单信息：" + serial_no);
		boolean ret = false;
		if (serial_no == 0) {
			log.error("POrder.initialize() serial_no is null");
			throw new NullPointerException(
					"POrder.initialize() serial_no is null");
		}
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("select to_char(order_time,'yyyy-mm-dd hh24:mi:ss') as sorder_time,");
		sqlInsert
				.append("to_char(proce_time,'yyyy-mm-dd hh24:mi:ss') as sproce_time,");
		sqlInsert
				.append(" t.* from  kcs_insurance_accident_ddmx t where serial_no="
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
				this.setSorder_time(rs.getString("sorder_time"));
				if (rs.getString("sproce_time") != null)
					this.setSproce_time(rs.getString("sproce_time"));
				this.setOrg_code(rs.getString("org_code"));
				this.setOpercode(rs.getString("opercode"));
				this.setOper_orgcode(rs.getString("oper_orgcode"));
				this.setOper_opercode(rs.getString("oper_opercode"));
				this.setKind_id(rs.getInt("kind_id"));
				this.setPolicy_no(rs.getInt("policy_no"));
				this.setYw_type(rs.getInt("yw_type"));
				this.setPolicy_name(rs.getString("policy_name"));
				this.setPolicy_price(rs.getDouble("policy_price"));
				this.setPolicy_num(rs.getInt("policy_num"));
				this.setSum_price(rs.getDouble("sum_price"));
				this.setOrder_mark(rs.getString("order_mark"));
				this.setOrder_type(rs.getString("order_type"));
				this.setOrder_result(rs.getString("order_result"));
				this.setCity_code(rs.getString("city_code"));
				this.setLock_mark(rs.getInt("lock_mark"));
				this.setT_message(rs.getString("t_message"));
				if (rs.getString("org_tel") != null)
					this.setOrg_tel(rs.getString("org_tel"));
				this.setZjlsh(rs.getString("zjlsh"));
				this.setTbr_name(rs.getString("tbr_name"));
				this.setTbr_tel(rs.getString("tbr_tel"));
				this.setTbr_sfz(rs.getString("tbr_sfz"));
				this.setTbr_addr(rs.getString("tbr_addr"));
				this.setInsured_name(rs.getString("insured_name"));
				this.setInsured_tel(rs.getString("insured_tel"));
				this.setRelation(rs.getString("relation"));
				this.setInsured_id(rs.getString("insured_id"));
				if (rs.getString("insured_idnum") != null)
					this.setInsured_idnum(rs.getString("insured_idnum"));
				this.setInsured_name2(rs.getString("insured_name2"));
				this.setInsured_id2(rs.getString("insured_id2"));
				this.setInsured_idnum2(rs.getString("insured_idnum2"));
				this.setInsured_name3(rs.getString("insured_name3"));
				this.setInsured_id3(rs.getString("insured_id3"));
				this.setInsured_idnum3(rs.getString("insured_idnum3"));
				this.setInsured_name4(rs.getString("insured_name4"));
				this.setInsured_id4(rs.getString("insured_id4"));
				this.setInsured_idnum4(rs.getString("insured_idnum4"));
				this.setInsured_name5(rs.getString("insured_name5"));
				this.setInsured_id5(rs.getString("insured_id5"));
				this.setInsured_idnum5(rs.getString("insured_idnum5"));
				if (rs.getString("post_mark") != null)
					this.setPost_mark(rs.getString("post_mark"));
				this.setOrg_code_name(rs.getString("org_code_name"));
				this.setMail_num(rs.getString("mail_num"));
				this.setInsured_job(rs.getString("insured_job"));
				this.setInsured_school(rs.getString("insured_school"));
				this.setVin(rs.getString("vin"));
				this.setCounty_code(rs.getString("county_code"));
			}
		} catch (SQLException se) {
			log.error("POrder.initialize():" + se.toString());
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
					throw new Cls_exception("POrder.initialize()"
							+ e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("POrder.initialize()"
							+ e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("POrder.initialize()"
							+ e.toString());
				}
				con = null;
			}
		}
		return ret;
	}

	public boolean cancel(int serial_no) throws Cls_exception {
		log.error("撤销订单：" + serial_no + "/");
		boolean ret = false;
		if (serial_no == 0) {
			log.error("POrder.cancel() serial_no is null");
			throw new NullPointerException("POrder.cancel() serial_no is null");
		}
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("update kcs_insurance_accident_ddmx set order_result='1',order_type='3',t_message='站点撤销订单'");
		sqlInsert
				.append(" where serial_no=? and order_type='0' and lock_mark=0");
		java.sql.Connection con = null;
		java.sql.PreparedStatement stmt = null;
		java.sql.ResultSet rs = null;
		int a = 0;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt = con.prepareStatement(sqlInsert.toString());
			stmt.setInt(1, serial_no);

			a = stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认
			if (a > 0) {
				ret = true;
			}
		} catch (SQLException se) {
			log.error("POrder.cancel():" + se.toString());
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
					throw new Cls_exception("POrder.cancel()" + e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("POrder.cancel()" + e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("POrder.cancel()" + e.toString());
				}
				con = null;
			}
		}
		return ret;
	}

	public boolean lock(int serial_no) throws Cls_exception {
		log.error("锁定订单：" + serial_no + "/");
		boolean ret = false;
		if (serial_no == 0) {
			log.error("POrder.lock() serial_no is null");
			throw new NullPointerException("POrder.lock() serial_no is null");
		}
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("update kcs_insurance_accident_ddmx set lock_mark=1 ");
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
			stmt.setInt(1, serial_no);

			a = stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认
			if (a > 0) {
				ret = true;
			}
		} catch (SQLException se) {
			log.error("POrder.lock():" + se.toString());
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
					throw new Cls_exception("POrder.lock()" + e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("POrder.lock()" + e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("POrder.lock()" + e.toString());
				}
				con = null;
			}
		}
		return ret;
	}

	public int lockMark(int serial_no) throws Cls_exception {
		int mark = 0;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select lock_mark from  kcs_insurance_accident_ddmx where serial_no="
				+ serial_no);
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());

			rs = pstmt.executeQuery();
			while (rs.next()) {
				mark = rs.getInt(1);
			}
		} catch (SQLRecoverableException e) {
			log.error("POrder.lockMark()" + e.toString());
			e.printStackTrace();
		} catch (SQLException e) {
			log.error("POrder.lockMark()" + e.toString());
			throw new Cls_exception("POrder.lockMark() " + e.toString());
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
				throw new Cls_exception("POrder.lockMark()" + e.toString());
			}
		}
		return mark;
	}

	public boolean sendBack(int id, String opercode, String td_yy)
			throws Exception {
		log.error("订单退单：" + id);
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("update kcs_insurance_accident_ddmx set proce_time=SYSDATE,order_type='2',oper_opercode=?,t_message=?  where serial_no=?");

		boolean tag = false;
		java.sql.Connection con = null;
		java.sql.PreparedStatement stmt = null;
		java.sql.ResultSet rs = null;
		int a = 0;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt = con.prepareStatement(sqlInsert.toString());
			stmt.setString(1, opercode);
			stmt.setString(2, td_yy);
			stmt.setInt(3, id);
			a = stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认
			if (a > 0) {
				tag = true;
				log.error("订单退单：" + id + "--标记成功");
			}
		} catch (SQLException se) {
			log.error(se.toString());
			se.printStackTrace();
			log.error("订单退单：" + id + "--标记不成功");
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} finally {
			sqlInsert = null;
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("POrder.sendBack()" + e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("POrder.sendBack()" + e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("POrder.sendBack()" + e.toString());
				}
				con = null;
			}
		}
		return tag;
	}

	public boolean setSuccess(int id, String opercode, String mailnum,
			String zjls) throws Exception {
		log.error("订单" + id + "扣款成功返回资金流水号：" + zjls);
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("update kcs_insurance_accident_ddmx set proce_time=SYSDATE,order_type='6',order_mark='1',order_result='1',");
		sqlInsert.append("mail_num=?,oper_opercode=?,zjlsh=?  where serial_no=?");
		boolean tag = false;
		java.sql.Connection con = null;
		java.sql.PreparedStatement stmt = null;
		java.sql.ResultSet rs = null;
		int a = 0;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt = con.prepareStatement(sqlInsert.toString());
			stmt.setString(1, mailnum);
			stmt.setString(2, opercode);
			stmt.setString(3, zjls);
			stmt.setInt(4, id);
			a = stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认
			if (a > 0) {
				tag = true;
				log.error("订单" + id + "扣款成功--已标记");
			}
		} catch (SQLException se) {
			log.error(se.toString());
			se.printStackTrace();
			log.error("订单" + id + "扣款成功--标记不成功");
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} finally {
			sqlInsert = null;
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("POrder.setSuccess()"
							+ e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("POrder.setSuccess()"
							+ e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("POrder.setSuccess()"
							+ e.toString());
				}
				con = null;
			}
		}
		return tag;
	}
	public boolean setSuccessWithoutKk(int id, String opercode, String mailnum,
			String zjls) throws Exception {
		log.error("订单" + id + "直接出单，资金流水号：" + zjls);
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("update kcs_insurance_accident_ddmx set proce_time=SYSDATE,order_type='6',order_result='1',");
		sqlInsert.append("mail_num=?,oper_opercode=?,zjlsh=?  where serial_no=?");
		boolean tag = false;
		java.sql.Connection con = null;
		java.sql.PreparedStatement stmt = null;
		java.sql.ResultSet rs = null;
		int a = 0;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt = con.prepareStatement(sqlInsert.toString());
			stmt.setString(1, mailnum);
			stmt.setString(2, opercode);
			stmt.setString(3, zjls);
			stmt.setInt(4, id);
			a = stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认
			if (a > 0) {
				tag = true;
				log.error("订单" + id + "直接出单成功--已标记");
			}
		} catch (SQLException se) {
			log.error(se.toString());
			se.printStackTrace();
			log.error("订单" + id + "直接出单成功--标记不成功");
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} finally {
			sqlInsert = null;
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("POrder.setSuccessWithoutKk()"
							+ e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("POrder.setSuccessWithoutKk()"
							+ e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("POrder.setSuccessWithoutKk()"
							+ e.toString());
				}
				con = null;
			}
		}
		return tag;
	}

	public int get_chzhid(int id) throws Exception {
		log.error("订单需要冲正："+id);
		int a=0;
		// boolean tag = false;
		// tag =initialize(id);
		// if (tag) {
		    this.setOrder_type("4");
		    this.setT_message(""+id);
		    a=insert();
		// }
		 log.error(id+"的冲正号："+a);
		return a;
	}	

	public boolean abnormal(int id) throws Exception {
		log.error("订单异常："+id);
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("update kcs_insurance_accident_ddmx set proce_time=SYSDATE,order_type='7',order_result='2',order_mark='2' where serial_no=?");

		boolean tag=false;
		java.sql.Connection con=null;
		java.sql.PreparedStatement stmt=null;
		java.sql.ResultSet rs=null;
		int a=0;
		try {
			Cls_connect cn = new Cls_connect();
        	con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement(sqlInsert.toString());
		    stmt.setInt(1, id);
			a=stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认	
			if (a>0)
			 {
				 tag=true;
				 log.error("订单"+id+"异常--已标记");
			 }
		} catch (SQLException se) {
			se.printStackTrace();
			try {
					if (con != null) {
						log.error("订单"+id+"异常--标记不成功");	
					    con.rollback();//出现sql异常，事务回滚
					    con.setAutoCommit(true);//设置提交方式为默认方式			
					}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} finally {
			sqlInsert=null;
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception("POrder.abnormal()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("POrder.abnormal()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("POrder.abnormal()"+e.toString());
						}
				   con =null;
							}
		}
		return tag;	
	
}
	public boolean set_ddzht(int id,String result,String message) throws Exception {
		log.error("冲正订单状态设置：冲正订单号"+id+","+message);
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("update kcs_insurance_accident_ddmx set order_result=?,t_message=? where serial_no=?");

		boolean tag=false;
		java.sql.Connection con=null;
		java.sql.PreparedStatement stmt=null;
		java.sql.ResultSet rs=null;
		int a=0;
		try {
			Cls_connect cn = new Cls_connect();
        	con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement(sqlInsert.toString());
		    stmt.setInt(3, id);
		    stmt.setString(1, result);
		    stmt.setString(2, message);
			a=stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认	
			if (a>0)
			 {
				 tag=true;
				 log.error("冲正订单"+id+"--已设置状态");
			 }
		} catch (SQLException se) {
			se.printStackTrace();
			try {
					if (con != null) {
					con.rollback();//出现sql异常，事务回滚
					con.setAutoCommit(true);//设置提交方式为默认方式			
					}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} finally {
			sqlInsert=null;
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception("POrder.set_ddzht()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("POrder.set_ddzht()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("POrder.set_ddzht()"+e.toString());
						}
				   con =null;
							}
		}
		return tag;	
	
}
}
