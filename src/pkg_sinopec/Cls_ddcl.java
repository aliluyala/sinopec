
package pkg_sinopec;

import java.sql.SQLException;

import org.apache.log4j.Logger;

/**
 * @author Administrator
 *
 */
public class Cls_ddcl {
	private  Logger log = Logger.getLogger(Cls_ddcl.class);
	public boolean set_td(int id,String opercode,String tdyy) throws Exception {
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("update kcs_specddmx set proce_time=SYSDATE,order_type='2',order_result='1',oper_opercode=?,t_message=? where id=?");
        log.error("订单退单："+id);
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
			stmt.setString(1, opercode);
			stmt.setString(2, tdyy);
		    stmt.setInt(3, id);
			a=stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认	
			if (a>0)
			 {
				 tag=true;
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
							 throw new Cls_exception("Cls_ddcl.set_td()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_ddcl.set_td()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_ddcl.set_td()"+e.toString());
						}
				   con =null;
							}
		}
		return tag;	
	
}
	public boolean set_jyk(int id,String cardnum) throws Exception {
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("update kcs_specddmx set fjcard=? where id=?");

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
			stmt.setString(1, cardnum);
		    stmt.setInt(2, id);
			a=stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认	
			if (a>0)
			 {
				 tag=true;
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
							 throw new Cls_exception("Cls_ddcl.set_jyk()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_ddcl.set_jyk()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_ddcl.set_jyk()"+e.toString());
						}
				   con =null;
							}
		}
		return tag;	
	
}
	public boolean set_hyk(int id,String cardnum) throws Exception {
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("update kcs_specddmx set card_num=? where id=?");

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
			stmt.setString(1, cardnum);
		    stmt.setInt(2, id);
			a=stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认	
			if (a>0)
			 {
				 tag=true;
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
							 throw new Cls_exception("Cls_ddcl.set_hyk()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_ddcl.set_hyk()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_ddcl.set_hyk()"+e.toString());
						}
				   con =null;
							}
		}
		return tag;	
	
}
	public boolean set_errdd(int id) throws Exception {
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("update kcs_specddmx set proce_time=SYSDATE,order_type='7',order_result='2',order_mark='2' where id=?");

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
							 throw new Cls_exception("Cls_ddcl.set_errdd()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_ddcl.set_errdd()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_ddcl.set_errdd()"+e.toString());
						}
				   con =null;
							}
		}
		return tag;	
	
}
	public boolean set_ddchzh(int id) throws Exception {
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("update kcs_specddmx set proce_time=SYSDATE,order_type='2',order_result='1',t_message='扣款不成功，已冲正' where id=?");

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
							 throw new Cls_exception("Cls_ddcl.set_ddchzh()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_ddcl.set_ddchzh()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_ddcl.set_ddchzh()"+e.toString());
						}
				   con =null;
							}
		}
		return tag;	
	
}
	public boolean set_ddzht(int id,String result,String message) throws Exception {
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("update kcs_specddmx set order_result=?,t_message=? where id=?");

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
							 throw new Cls_exception("Cls_ddcl.set_ddzht()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_ddcl.set_ddzht()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_ddcl.set_ddzht()"+e.toString());
						}
				   con =null;
							}
		}
		return tag;	
	
}
	public boolean set_withkk(String mailnum,String opercode,int id,String zjls) throws Exception {
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("update kcs_specddmx set proce_time=SYSDATE,order_type='1',order_mark='1',order_result='1',");
        sqlInsert.append("mail_num=?,oper_opercode=?,zjlsh=?  where id=?");
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
		    stmt.setInt(4, id);
		    stmt.setString(1, mailnum);
		    stmt.setString(2, opercode);
		    stmt.setString(3, zjls);
			a=stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认	
			if (a>0)
			 {
				 tag=true;
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
							 throw new Cls_exception("Cls_ddcl.set_ddzht()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_ddcl.set_ddzht()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_ddcl.set_ddzht()"+e.toString());
						}
				   con =null;
							}
		}
		return tag;	
	
}
	public boolean set_withoutkk(String mailnum,String opercode,int id) throws Exception {
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("update kcs_specddmx set proce_time=SYSDATE,order_type='1',order_mark='0',order_result='1',");
        sqlInsert.append("mail_num=?,oper_opercode=?  where id=?");
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
		    stmt.setString(1, mailnum);
		    stmt.setString(2, opercode);
			a=stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认	
			if (a>0)
			 {
				 tag=true;
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
							 throw new Cls_exception("Cls_ddcl.set_withoutkk()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_ddcl.set_withoutkk()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_ddcl.set_withoutkk()"+e.toString());
						}
				   con =null;
							}
		}
		return tag;	
	
}
	public int get_chzhid(int id,int chzhid) throws Exception {
		int a=0,b=0;
		StringBuffer sqlInsert = new StringBuffer();
		Cls_gg gg = new Cls_gg();
		a =gg.getint("select SINOP_ID.nextval from dual");
		sqlInsert.append("insert into  kcs_specddmx t (select "+chzhid+",a.org_code,a.opercode,a.oper_orgcode,a.oper_opercode,a.yw_type,");
		sqlInsert.append("a.card_mark,'0','0',0,'0',0,'0',0,0,0,'0','0','0','0','0','"+id+"',a.order_time,a.order_mark,");
		sqlInsert.append("SYSDATE,'4','0',a.city_code,1,a.t_message,a.d_message,a.org_tel,a.zjlsh,a.hyf_no,"+a+",a.chxrq,a.fjcard,a.zl,a.xgrq from kcs_specddmx a where id="+id+")");
		if (gg.update(sqlInsert.toString())) b=a;
		sqlInsert=null;
		return b;
	}
	public int get_lbchzhid(int id) throws Exception {
		int a=0,b=0;
		StringBuffer sqlInsert = new StringBuffer();
		Cls_gg gg = new Cls_gg();
		a =gg.getint("select SINOP_ID.nextval from dual");
		sqlInsert.append("insert into  kcs_specddmx t (select "+a+",a.org_code,a.opercode,a.oper_orgcode,a.oper_opercode,a.yw_type,");
		sqlInsert.append("a.card_mark,'0','0',0,'0',0,'0',0,0,0,'0','0','0','0','0','"+id+"',a.order_time,a.order_mark,");
		sqlInsert.append("SYSDATE,'4','0',a.city_code,1,a.t_message,a.d_message,a.org_tel,a.zjlsh,a.hyf_no,"+a+",a.chxrq,a.fjcard,a.zl,a.xgrq from kcs_specddmx a where id="+id+")");
		if (gg.update(sqlInsert.toString())) b=a;
		sqlInsert=null;
		return b;
	}	
	
	public boolean updByObj(Cls_e_spec obj) throws Exception {
	    if (obj == null) {
	        throw new NullPointerException("kcs_spec obj");
	      }	
	    StringBuffer sqlInsert = new StringBuffer();
	    sqlInsert.append("update kcs_specddmx set name=?,sfzid=?,card_num=?,cphm=?,cjhm=?,tele_no=?,zl=?,fjcard=?," );
	    sqlInsert.append("post_address=?,xgrq=sysdate " );	   
	    sqlInsert.append(" where id=?");
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
	        stmt.setString(1, obj.getName());			
	        stmt.setString(2, obj.getSfzid());		
            stmt.setString(3, obj.getCard_num());	        
	        stmt.setString(4, obj.getCphm());	        
	        stmt.setString(5, obj.getCjhm());	
	        stmt.setString(6, obj.getTele_no());	        
	        stmt.setString(7, obj.getZl());	 
	        stmt.setString(8, obj.getFjcard());	        
	        stmt.setString(9, obj.getPost_address());	        
	        stmt.setInt(10, obj.getId());

		  	a=stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认	
			if (a>0)
			 {
				 tag=true;
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
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_ddcl.updbyobj()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_ddcl.updbyobj()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_ddcl.updbyobj()"+e.toString());
						}
				   con =null;
							}
		}
		return tag;	
	}
}
