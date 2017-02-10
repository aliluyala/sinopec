/**
 * 
 */
package pkg_AccidentPolicy.AccidPolicyPre;

import java.sql.SQLException;
import java.sql.SQLRecoverableException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import pkg_AccidentPolicy.pojo.AccidentPolicyKind;
import pkg_AccidentPolicy.pojo.TempObj;
import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_exception;

/**
 * @author Administrator
 *
 */
public class APolicyKind extends AccidentPolicyKind {
	private  Logger log = Logger.getLogger(APolicyKind.class); 
	public boolean save() throws Cls_exception {
		log.error("保存卡单产品信息：" + this.getName() + "/"+this.getKind());
		boolean ret = false;
		if (this.getKind() == null) {
			log.error("APlicyKind.save() kind is null");
			throw new NullPointerException("APlicyKind.save() kind is null");
		}
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("insert into kcs_insurance_kind(serial_no,yw_type,");
		sqlInsert.append("name,plicy_no,kind,price,maxlimite,picture_id,mark,suminsured)");
		sqlInsert.append(" values(AUTOQUOTE_ID.nextval,");
		sqlInsert.append("?,?,?,?,?,?,?,1,?)");
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
			stmt.setInt(3, this.getPolicy_no());
			stmt.setString(4, this.getKind());
			stmt.setDouble(5, this.getPrice());
			stmt.setInt(6, this.getMaxlimite());
			stmt.setString(7, this.getPicture_id());
			stmt.setDouble(8, this.getSuminsured());
            a = stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认
			if (a > 0) {
				ret = true;
			}
		} catch (SQLException se) {
			log.error("APlicyKind.save():" + se.toString());
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
					throw new Cls_exception("APlicyKind.save()" + e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("APlicyKind.save()" + e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("APlicyKind.save()" + e.toString());
				}
				con = null;
			}
		}
		return ret;
	}
	public boolean modify(int serial_no) throws Cls_exception {
		log.error("修改卡单产品信息：" + serial_no + "/");
		boolean ret = false;
		if (serial_no == 0) {
			log.error("APlicyKind.modify() serial_no is null");
			throw new NullPointerException("APlicyKind.modify() serial_no is null");
		}
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("update kcs_insurance_kind set kind=?,price=?,maxlimite=?,picture_id=?,");
		sqlInsert
				.append("suminsured=? where serial_no=?");
		java.sql.Connection con = null;
		java.sql.PreparedStatement stmt = null;
		java.sql.ResultSet rs = null;
		int a = 0;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt = con.prepareStatement(sqlInsert.toString());
            stmt.setString(1, this.getKind());
            stmt.setDouble(2, this.getPrice());
            stmt.setInt(3, this.getMaxlimite());
            stmt.setString(4, this.getPicture_id());
            stmt.setDouble(5, this.getSuminsured());
			stmt.setInt(6, serial_no);

			a = stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认
			if (a > 0) {
				ret = true;
			}
		} catch (SQLException se) {
			log.error("APlicyKind.modify():" + se.toString());
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
					throw new Cls_exception("APlicyKind.modify()" + e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("APlicyKind.modify()" + e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("APlicyKind.modify()" + e.toString());
				}
				con = null;
			}
		}
		return ret;
	}
	public int sales(int id,String citycode) throws Cls_exception{
		int a = 0;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			sqlInsert.append("SELECT sum(policy_num) FROM kcs_insurance_accident_ddmx where ");
			sqlInsert.append(" kind_id = ? and order_type = '6'");
			sqlInsert.append(" and city_code = ?");
			pstmt = conn.prepareStatement(sqlInsert.toString());
			pstmt.setInt(1, id);
			pstmt.setString(2, citycode);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				a = rs.getInt(1);
			}
		} catch (Exception e) {
			throw new Cls_exception("APlicyKind.sales()   " + e.toString());
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
				throw new Cls_exception("APlicyKind.sales()  finally"
						+ e.toString());
			}
		}
		return a;	
	}
	public int stocks(int id,String citycode) throws Cls_exception{
		int a = 0;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;

		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			String sql = "SELECT stocks FROM kcs_insurance_stocks where plicy_kind_no="+id+" and belongcity='"+citycode+"'";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				a = rs.getInt(1);
			}
		} catch (Exception e) {
			throw new Cls_exception("APlicyKind.stocks()   " + e.toString());
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
				throw new Cls_exception("APlicyKind.stocks()  finally"
						+ e.toString());
			}
		}
		return a;	
	}
	public boolean isFristStocks(String citycode) throws Cls_exception{
		boolean tag = true;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("SELECT stocks FROM kcs_insurance_stocks where plicy_kind_no=?");
		sqlInsert.append(" and belongcity=?");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			pstmt.setInt(1, this.getSerial_no());
			pstmt.setString(2, citycode);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				tag = false;
			}
			log.error(this.getSerial_no()+" isFristMod="+tag);
		} catch (Exception e) {
			throw new Cls_exception("APlicyKind.isFristMod()   " + e.toString());
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
				throw new Cls_exception("APlicyKind.isFristMod()  finally"
						+ e.toString());
			}
		}
		return tag;	
	}
	public boolean setStocks(int stocks,String citycode) throws Cls_exception{
			log.error("修改卡单库存："+this.getSerial_no());
			boolean ret = false;
			 StringBuffer sqlInsert = new StringBuffer();
			 sqlInsert.append("update kcs_insurance_stocks set stocks=?");
			 sqlInsert.append(" where plicy_kind_no=? and belongcity=?");
			 log.error(sqlInsert.toString());
			    java.sql.Connection con=null;
				java.sql.PreparedStatement stmt=null;
				java.sql.ResultSet rs=null;
				int a=0;
				try {
					Cls_connect cn = new Cls_connect();
			    	con = cn.connect().getConnection();
					con.setAutoCommit(false);
					stmt=con.prepareStatement(sqlInsert.toString());
			        stmt.setInt(1, stocks);
			        stmt.setInt(2, this.getSerial_no());
			        stmt.setString(3, citycode);

				  	a=stmt.executeUpdate();
					con.commit();
					con.setAutoCommit(true);// 恢复默认	
					if (a>0)
					 { ret = true;
					 }
				} catch (SQLException se) {
					log.error("APlicyKind.setStocks():"+se.toString());
					se.printStackTrace();
					try {
							if (con != null) {
							con.rollback();//出现sql异常，事务回滚
							con.setAutoCommit(true);//设置提交方式为默认方式			
							}
					} catch (SQLException se1) {
						se1.printStackTrace();
					}
				   return false;
				} finally {
					if (rs!=null){
						try{
							rs.close();}
						catch(Exception e){
									 throw new Cls_exception("APlicyKind.setStocks()"+e.toString());
								}
						     rs=null;  
									}
									if (stmt!=null) {
						try{
										stmt.close();}
						catch(Exception e){
									 throw new Cls_exception("APlicyKind.setStocks()"+e.toString());
								}
						     stmt=null;
									}
									if (con!=null){
						try{
										con.close();
						}catch(Exception e){
									 throw new Cls_exception("APlicyKind.setStocks()"+e.toString());
								}
						   con =null;
									}
				}   
	     return ret;	      	
	    }
	public boolean subtractStocks(int stocks,int kind_id,String citycode) throws Cls_exception{
		log.error("减卡单库存："+kind_id);
		boolean ret = false;
		 StringBuffer sqlInsert = new StringBuffer();
		 sqlInsert.append("update kcs_insurance_stocks set stocks=stocks - ?");
		 sqlInsert.append(" where plicy_kind_no=? and belongcity=?");
		 log.error(sqlInsert.toString());
		    java.sql.Connection con=null;
			java.sql.PreparedStatement stmt=null;
			java.sql.ResultSet rs=null;
			int a=0;
			try {
				Cls_connect cn = new Cls_connect();
		    	con = cn.connect().getConnection();
				con.setAutoCommit(false);
				stmt=con.prepareStatement(sqlInsert.toString());
		        stmt.setInt(1, stocks);
		        stmt.setInt(2, kind_id);
		        stmt.setString(3, citycode);

			  	a=stmt.executeUpdate();
				con.commit();
				con.setAutoCommit(true);// 恢复默认	
				if (a>0)
				 { ret = true;
				 }
			} catch (SQLException se) {
				log.error("APlicyKind.subtractStocks():"+se.toString());
				se.printStackTrace();
				try {
						if (con != null) {
						con.rollback();//出现sql异常，事务回滚
						con.setAutoCommit(true);//设置提交方式为默认方式			
						}
				} catch (SQLException se1) {
					se1.printStackTrace();
				}
			   return false;
			} finally {
				if (rs!=null){
					try{
						rs.close();}
					catch(Exception e){
								 throw new Cls_exception("APlicyKind.subtractStocks()"+e.toString());
							}
					     rs=null;  
								}
								if (stmt!=null) {
					try{
									stmt.close();}
					catch(Exception e){
								 throw new Cls_exception("APlicyKind.subtractStocks()"+e.toString());
							}
					     stmt=null;
								}
								if (con!=null){
					try{
									con.close();
					}catch(Exception e){
								 throw new Cls_exception("APlicyKind.subtractStocks()"+e.toString());
							}
					   con =null;
								}
			}   
     return ret;	      	
    }
	public boolean FristStocks(int stocks,String citycode) throws Cls_exception{
		log.error("写入卡单库存："+this.getSerial_no());
		boolean ret = false;
		 StringBuffer sqlInsert = new StringBuffer();
		 sqlInsert.append("insert into kcs_insurance_stocks(serial_no,plicy_kind_no,stocks,belongcity)");
		 sqlInsert.append(" values(AUTOQUOTE_ID.nextval,?,?,?)");
		 log.error(sqlInsert.toString());
		    java.sql.Connection con=null;
			java.sql.PreparedStatement stmt=null;
			java.sql.ResultSet rs=null;
			int a=0;
			try {
				Cls_connect cn = new Cls_connect();
		    	con = cn.connect().getConnection();
				con.setAutoCommit(false);
				stmt=con.prepareStatement(sqlInsert.toString());
				stmt.setInt(1, this.getSerial_no());
		        stmt.setInt(2, stocks);		        
		        stmt.setString(3, citycode);

			  	a=stmt.executeUpdate();
				con.commit();
				con.setAutoCommit(true);// 恢复默认	
				if (a>0)
				 { ret = true;
				 }
			} catch (SQLException se) {
				log.error("APlicyKind.FristStocks():"+se.toString());
				se.printStackTrace();
				try {
						if (con != null) {
						con.rollback();//出现sql异常，事务回滚
						con.setAutoCommit(true);//设置提交方式为默认方式			
						}
				} catch (SQLException se1) {
					se1.printStackTrace();
				}
			   return false;
			} finally {
				if (rs!=null){
					try{
						rs.close();}
					catch(Exception e){
								 throw new Cls_exception("APlicyKind.FristStocks()"+e.toString());
							}
					     rs=null;  
								}
								if (stmt!=null) {
					try{
									stmt.close();}
					catch(Exception e){
								 throw new Cls_exception("APlicyKind.FristStocks()"+e.toString());
							}
					     stmt=null;
								}
								if (con!=null){
					try{
									con.close();
					}catch(Exception e){
								 throw new Cls_exception("APlicyKind.FristStocks()"+e.toString());
							}
					   con =null;
								}
			}   
     return ret;	      	
    }	
	public boolean initialize(int serial_no,String citycode) throws Cls_exception{
		boolean ret = false;
		ret = initialize(serial_no);
		int sales = sales(serial_no,citycode);
		int stocks = stocks(serial_no,citycode);
		this.setSales(sales);
		this.setStocks(stocks);
		this.setXm_list(getBxzr(serial_no));
		return ret;
	}
	public boolean initialize(int serial_no) throws Cls_exception {
			log.error("查询卡单产品信息：" + serial_no);
			boolean ret = false;
			if (serial_no == 0) {
				log.error("APlicyKind.initialize() serial_no is null");
				throw new NullPointerException(
						"APlicyKind.initialize() serial_no is null");
			}
			StringBuffer sqlInsert = new StringBuffer();
			sqlInsert
					.append("select * from  kcs_insurance_kind where serial_no="
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
                    this.setPolicy_no(rs.getInt("plicy_no"));
                    this.setKind(rs.getString("kind"));
                    this.setPrice(rs.getDouble("price"));
                    this.setMaxlimite(rs.getInt("maxlimite"));
                    this.setPicture_id(rs.getString("picture_id"));
                    if (rs.getInt("maxlimite")== 0 ) 
                    	this.setS_maxlimite("不限");
   			    	 else 
   					    this.setS_maxlimite(rs.getInt("maxlimite")+"");
                    this.setSuminsured(rs.getDouble("suminsured"));
				}
			} catch (SQLException se) {
				log.error("APlicyKind.initialize():" + se.toString());
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
						throw new Cls_exception("APlicyKind.initialize()"
								+ e.toString());
					}
					rs = null;
				}
				if (stmt != null) {
					try {
						stmt.close();
					} catch (Exception e) {
						throw new Cls_exception("APlicyKind.initialize()"
								+ e.toString());
					}
					stmt = null;
				}
				if (con != null) {
					try {
						con.close();
					} catch (Exception e) {
						throw new Cls_exception("APlicyKind.initialize()"
								+ e.toString());
					}
					con = null;
				}
			}
			return ret;
		}
    public boolean drop(int serial_no) throws Cls_exception {
    	log.error("删除卡单产品：" + serial_no + "/");
		boolean ret = false;
		if (serial_no == 0) {
			log.error("APlicyKind.drop() serial_no is null");
			throw new NullPointerException("APlicyKind.drop() serial_no is null");
		}
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("update kcs_insurance_kind set mark=0");
		sqlInsert
				.append(" where serial_no=?");
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
			log.error("APlicyKind.drop():" + se.toString());
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
					throw new Cls_exception("APlicyKind.drop()" + e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("APlicyKind.drop()" + e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("APlicyKind.drop()" + e.toString());
				}
				con = null;
			}
		}
		return ret;
    }
    public String getStrBxzr()  throws Cls_exception{
    	StringBuffer sql = new StringBuffer();
		List<TempObj> listObj = getBxzr(this.getSerial_no());
		int i = 1;
		sql.append("<table class=\\\"table table-bordered\\\"><tr>");
			sql.append("<th style=\\\"width: 10px\\\">#</th><th>保险责任</th><th>保额</th>");
			sql.append("<th style=\\\"width: 50px\\\">操作</th></tr>");
		for (TempObj tem: listObj) {			
			sql.append("<tr><td>"+i+".</td><td>"+tem.getS1()+"</td><td>"+tem.getS2()+"</td>");
			sql.append("<td><input type=\\\"button\\\" class=\\\"btn btn-default btn-sm\\\" value=\\\"删除\\\"");
			sql.append(" onClick=\\\"delxm("+tem.getInt1()+")\\\"></td>");
			i++;
		}
		sql.append("</table>");
		return sql.toString();
    }
    private List<TempObj> getBxzr(int serial_no) throws Cls_exception{
		ArrayList<TempObj> rtnAL = new ArrayList<TempObj>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select * from kcs_insurance_kind_xm where kind_no=");
		sql.append(serial_no+" order by serial_no");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());

			rs = pstmt.executeQuery();
			TempObj tmp_jg;
			while (rs.next()) {
				tmp_jg = new TempObj();
				tmp_jg.setInt1(rs.getInt("serial_no"));
				tmp_jg.setS1(rs.getString("bx_zr"));
				tmp_jg.setS2(rs.getString("suminsured"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (SQLRecoverableException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			throw new Cls_exception("APlicyKind.getBxzr() "
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
				throw new Cls_exception("APlicyKind.getBxzr()"
						+ e.toString());
			}

		}

		return rtnAL;
	}
}
