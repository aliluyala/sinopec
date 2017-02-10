package pkg_sinopec;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
/**
 * @author Administrator
 *
 */
public class Cls_l_bx {
	private  Logger log = Logger.getLogger(Cls_l_bx.class);
	public boolean set_bxtb(int id,String opercode,String post_address,String relashi) throws Exception {
		log.error("订单发起投保："+id);
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("update kcs_specbaoxian set proce_time=SYSDATE,order_type='5',oper_opercode=?,post_address=?,relashi=?  where id=?");

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
			stmt.setString(2, post_address);
			stmt.setString(3, relashi);
		    stmt.setInt(4, id);
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
							 throw new Cls_exception("Cls_l_bx.set_bxtb()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_bx.set_bxtb()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_bx.set_bxtb()"+e.toString());
						}
				   con =null;
							}
		}
		return tag;	
}
	public boolean set_bxtb67(int id,String opercode,String post_address,String fzr,String fzrxm,String fzrdh,String relashi) throws Exception {
		log.error("订单发起投保："+id);
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("update kcs_specbaoxian set proce_time=SYSDATE,order_type='5',oper_opercode=?,post_address=?, ");
		sqlInsert.append("fzr=?,fzrxm=?,org_tel=?,relashi=?  where id=?");
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
			stmt.setString(2, post_address);
			stmt.setString(3, fzr);
			stmt.setString(4, fzrxm);
			stmt.setString(5, fzrdh);
			stmt.setString(6, relashi);
		    stmt.setInt(7, id);
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
							 throw new Cls_exception("Cls_l_bx.set_bxtb()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_bx.set_bxtb()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_bx.set_bxtb()"+e.toString());
						}
				   con =null;
							}
		}
		return tag;	
}
	public boolean set_bxtb62(int id,String opercode,String post_address,String fzr,String fzrxm,String fzrdh,String relashi) throws Exception {
		log.error("订单发起投保："+id);
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("update kcs_specbaoxian set proce_time=SYSDATE,order_type='5',oper_opercode=?,post_address=?, ");
		sqlInsert.append("fzr=?,fzrxm=?,fzrq=?,relashi=?  where id=?");
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
			stmt.setString(2, post_address);
			stmt.setString(3, fzr);
			stmt.setString(4, fzrxm);
			stmt.setString(5, fzrdh);
			stmt.setString(6, relashi);
		    stmt.setInt(7, id);
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
							 throw new Cls_exception("Cls_l_bx.set_bxtb()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_bx.set_bxtb()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_bx.set_bxtb()"+e.toString());
						}
				   con =null;
							}
		}
		return tag;	
}	
	public boolean set_withkk(String mailnum,String bxrq,String opercode,int id,String zjls) throws Exception {
		log.error("订单"+id+"扣款成功返回资金流水号："+zjls);
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("update kcs_specbaoxian set proce_time=SYSDATE,order_type='6',order_mark='1',order_result='1',");
        sqlInsert.append("mail_num=?,oper_opercode=?,zjlsh=?,bxrq=?  where id=?");
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
		    stmt.setInt(5, id);
		    stmt.setString(1, mailnum);
		    stmt.setString(2, opercode);
		    stmt.setString(3, zjls);
		    stmt.setString(4, bxrq);
			a=stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认	
			if (a>0)
			 {
				 tag=true;
				 log.error("订单"+id+"扣款成功--已标记");
			 }
		} catch (SQLException se) {
			log.error("订单"+id+"扣款成功--标记不成功");
			log.error(se.toString());
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
							 throw new Cls_exception("Cls_l_bx.set_ddzht()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_bx.set_ddzht()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_bx.set_ddzht()"+e.toString());
						}
				   con =null;
							}
		}
		return tag;	
	
}
	public boolean set_withcd(String mailnum,String bxrq,String opercode,int id,String zjls) throws Exception {
	log.error("订单直接出单："+id);
	StringBuffer sqlInsert = new StringBuffer();
	sqlInsert.append("update kcs_specbaoxian set proce_time=SYSDATE,order_type='6',order_result='1',");
    sqlInsert.append("mail_num=?,oper_opercode=?,zjlsh=?,bxrq=?  where id=?");
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
	    stmt.setInt(5, id);
	    stmt.setString(1, mailnum);
	    stmt.setString(2, opercode);
	    stmt.setString(3, zjls);
	    stmt.setString(4, bxrq);
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
						 throw new Cls_exception("Cls_l_bx.set_ddzht()"+e.toString());
					}
			     rs=null;  
						}
						if (stmt!=null) {
			try{
							stmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_bx.set_ddzht()"+e.toString());
					}
			     stmt=null;
						}
						if (con!=null){
			try{
							con.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_bx.set_ddzht()"+e.toString());
					}
			   con =null;
						}
	}
	return tag;	

}
	public boolean set_ddzht(int id,String result,String message) throws Exception {
		log.error("冲正订单状态设置：冲正订单号"+id+","+message);
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("update kcs_specbaoxian set order_result=?,t_message=? where id=?");

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
							 throw new Cls_exception("Cls_l_bx.set_ddzht()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_bx.set_ddzht()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_bx.set_ddzht()"+e.toString());
						}
				   con =null;
							}
		}
		return tag;	
	
}
	public boolean set_errdd(int id) throws Exception {
		log.error("订单异常："+id);
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("update kcs_specbaoxian set proce_time=SYSDATE,order_type='7',order_result='2',order_mark='2' where id=?");

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
							 throw new Cls_exception("Cls_l_bx.set_errdd()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_bx.set_errdd()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_bx.set_errdd()"+e.toString());
						}
				   con =null;
							}
		}
		return tag;	
	
}
	public int get_chzhid(int id) throws Exception {
		log.error("订单需要冲正："+id);
		int a=0;
		//boolean tag = false;
		Cls_e_bx tmpdd = new Cls_e_bx();
		tmpdd=get_byid(id);
		tmpdd.setOrder_type("4");
		tmpdd.setAdd_message(""+id);
		tmpdd.setOrder_result("0");
		a=insertChzhObj(tmpdd);
		log.error(id+"的冲正号："+a);
	/*	
		StringBuffer sqlInsert = new StringBuffer();
		Cls_gg gg = new Cls_gg();
		a =gg.getint("select SINOP_ID.nextval from dual");
		sqlInsert.append("insert into  kcs_specbaoxian t (select "+a+","+a+",a.org_code,a.opercode,a.oper_orgcode,a.oper_opercode,a.yw_type,");
		sqlInsert.append("0,'0',0,'0',0,0,0,'0','0','0','0','0','0','0','0','0','0',0,0,0,0,0,0,0,0,'0',0,0,'"+id+"',a.order_time,a.bj_time,a.order_mark,");
		sqlInsert.append("SYSDATE,'4','0',a.city_code,1,a.t_message,a.d_message,a.org_tel,a.zjlsh,a.xgrq,0,0,0,0,0,0,0,0,0,0,0,0,0,0,'0','0' from kcs_specbaoxian a where id="+id+")");
		tag=gg.update(sqlInsert.toString());
		sqlInsert=null;
		if (!tag) a=0;*/
		return a;
	}	
	public boolean set_bj(Cls_e_bx obj) throws Exception {
		
	    if (obj == null) {
	        throw new NullPointerException("kcs_bx obj");
	      }
	    log.error("订单报价："+obj.getId());
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("update kcs_specbaoxian set bj_time=SYSDATE,order_type='1',oper_opercode=?,price=?,sum_price=?,f_sunshi=?,f_3zhe=?,f_daoq=?,");
		sqlInsert.append("f_siji=?,f_chke=?,f_ziran=?,f_hhen=?,f_boli=?,f_bjm=?,f_jq=?,f_chchsh=?,price_detail=?,e_sunshi=?,e_daoq=?,e_ziran=?,f_3=?  where id=?");

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
			stmt.setString(1, obj.getOper_opercode());
			stmt.setDouble(2, obj.getPrice());
			stmt.setDouble(3, obj.getSum_price());
			stmt.setDouble(4, obj.getF_sunshi());
			stmt.setDouble(5, obj.getF_3zhe());
			stmt.setDouble(6, obj.getF_daoq());
			stmt.setDouble(7, obj.getF_siji());
			stmt.setDouble(8, obj.getF_chke());
			stmt.setDouble(9, obj.getF_ziran());
			stmt.setDouble(10, obj.getF_hhen());
			stmt.setDouble(11, obj.getF_boli());
			stmt.setDouble(12, obj.getF_bjm());
			stmt.setDouble(13, obj.getF_jq());
			stmt.setDouble(14, obj.getF_chchsh());
			stmt.setString(15, obj.getPrice_detail());
			stmt.setDouble(16, obj.getE_sunshi());
			stmt.setDouble(17, obj.getE_daoq());
			stmt.setDouble(18, obj.getE_ziran());
			stmt.setDouble(19, obj.getF_3());
		    stmt.setInt(20, obj.getId());
		    
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
							 throw new Cls_exception("Cls_l_bx.set_bj()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_bx.set_bj()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_bx.set_bj()"+e.toString());
						}
				   con =null;
							}
		}
		return tag;	
}
	public boolean set_zbj(Cls_e_bx obj) throws Exception {
	    if (obj == null) {
	        throw new NullPointerException("kcs_bx obj");
	      }
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("update kcs_specbaoxian set xgrq=SYSDATE,order_type='1',oper_opercode=?,price=?,sum_price=?,f_sunshi=?,f_3zhe=?,f_daoq=?,");
		sqlInsert.append("f_siji=?,f_chke=?,f_ziran=?,f_hhen=?,f_boli=?,f_bjm=?,f_jq=?,f_chchsh=?,price_detail=?,e_sunshi=?,e_daoq=?,e_ziran=?,f_3=?  where id=?");

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
			stmt.setString(1, obj.getOper_opercode());
			stmt.setDouble(2, obj.getPrice());
			stmt.setDouble(3, obj.getSum_price());
			stmt.setDouble(4, obj.getF_sunshi());
			stmt.setDouble(5, obj.getF_3zhe());
			stmt.setDouble(6, obj.getF_daoq());
			stmt.setDouble(7, obj.getF_siji());
			stmt.setDouble(8, obj.getF_chke());
			stmt.setDouble(9, obj.getF_ziran());
			stmt.setDouble(10, obj.getF_hhen());
			stmt.setDouble(11, obj.getF_boli());
			stmt.setDouble(12, obj.getF_bjm());
			stmt.setDouble(13, obj.getF_jq());
			stmt.setDouble(14, obj.getF_chchsh());
			stmt.setString(15, obj.getPrice_detail());
			stmt.setDouble(16, obj.getE_sunshi());
			stmt.setDouble(17, obj.getE_daoq());
			stmt.setDouble(18, obj.getE_ziran());
			stmt.setDouble(19, obj.getF_3());
		    stmt.setInt(20, obj.getId());
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
							 throw new Cls_exception("Cls_l_bx.set_bj()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_bx.set_bj()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_bx.set_bj()"+e.toString());
						}
				   con =null;
							}
		}
		return tag;	
}	
	public boolean set_td(int id,String opercode,String td_yy) throws Exception {
		log.error("订单退单："+id);
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("update kcs_specbaoxian set proce_time=SYSDATE,order_type='2',oper_opercode=?,t_message=?  where id=?");

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
			stmt.setString(2, td_yy);
		    stmt.setInt(3, id);
			a=stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认	
			if (a>0)
			 {
				 tag=true;
				 log.error("订单退单："+id+"--标记成功");
			 }
		} catch (SQLException se) {
			se.printStackTrace();
			log.error("订单退单："+id+"--标记不成功");
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
							 throw new Cls_exception("Cls_l_bx.set_td()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_bx.set_td()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_bx.set_td()"+e.toString());
						}
				   con =null;
							}
		}
		return tag;	
}	
	public boolean ddlock(int dd_id) throws Exception {
	    if (dd_id==0) {
	        throw new NullPointerException("dd_id");
	      }
	    StringBuffer sqlUpdate = new StringBuffer();
	    sqlUpdate.append("update kcs_specbaoxian set lock_mark=1 where id=");
	    sqlUpdate.append(dd_id);
	    Cls_gg gg = new Cls_gg();
	    boolean tag = gg.update(sqlUpdate.toString());
	    gg = null;
	    sqlUpdate = null;
		return tag;
	}

	public boolean RevokeByDdid(int dd_id) throws Exception {
	    if (dd_id==0) {
	        throw new NullPointerException("dd_id");
	      }
	    StringBuffer sqlUpdate = new StringBuffer();
	    sqlUpdate.append("update kcs_specbaoxian set order_result='1',order_type='3',t_message='站点撤销订单' where id=");
	    sqlUpdate.append(dd_id+" and order_type='0'");
	    Cls_gg gg = new Cls_gg();
	    boolean tag = gg.update(sqlUpdate.toString());
	    gg = null;
	    sqlUpdate = null;
		return tag;
	}	
	public int insertByObj(Cls_e_bx obj) throws Exception {
	    if (obj == null) {
	        throw new NullPointerException("kcs_bx obj");
	      }	
	    Cls_gg gg = new Cls_gg();
	    int id = gg.getint("select SINOP_ID.nextval from dual");
	    StringBuffer sqlInsert = new StringBuffer();
	    sqlInsert.append("insert into kcs_specbaoxian(id,serial_no,org_code,opercode,oper_orgcode," );
	    sqlInsert.append("yw_type,cphm,cjhm,fdjhm,ppxh,zhc_rq,tele_no,name,sfzid,sfz_addr,x_sunshi,x_3zhe,x_daoq,x_siji,x_chke,x_ziran,x_hhen," );	   
	    sqlInsert.append("x_boli,x_bjm,x_jq,x_chchsh,order_time,city_code,org_tel,invoice,chzh,relashi,d_message,wztx,add_message,owner,chllx,fzrq,");
	    sqlInsert.append("c_zhl,h_zhl,bxrq,x_3) values ("+id+",?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,");
	    sqlInsert.append("?,?,?,?,sysdate,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
	    java.sql.Connection con=null;
		java.sql.PreparedStatement stmt=null;
		java.sql.ResultSet rs=null;
		int a=0,b=0;
		try {
			Cls_connect cn = new Cls_connect();
	    	con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement(sqlInsert.toString());
	        stmt.setInt(1, id);
	        stmt.setString(2, obj.getOrg_code());
	        stmt.setString(3, obj.getOpercode());
	        stmt.setString(4, obj.getOper_orgcode());
	        stmt.setInt(5, obj.getYw_type());
	        stmt.setString(6, obj.getCphm());
	        stmt.setString(7, obj.getCjhm());
	        stmt.setString(8, obj.getFdjhm());
	        stmt.setString(9, obj.getPpxh());
	        stmt.setString(10, obj.getZhc_rq());
	        stmt.setString(11, obj.getTele_no());
	        stmt.setString(12, obj.getName());
	        stmt.setString(13, obj.getSfzid());
	        stmt.setString(14, obj.getSfz_addr());
	        stmt.setInt(15, obj.getX_sunshi());
	        stmt.setInt(16, obj.getX_3zhe());
	        stmt.setInt(17, obj.getX_daoq());
	        stmt.setInt(18, obj.getX_siji());
	        stmt.setInt(19, obj.getX_chke());
	        stmt.setInt(20, obj.getX_ziran());
	        stmt.setInt(21, obj.getX_hhen());
	        stmt.setInt(22, obj.getX_boli());
	        stmt.setString(23, obj.getX_bjm());
	        stmt.setInt(24, obj.getX_jq());
	        stmt.setInt(25, obj.getX_chchsh());
	        stmt.setString(26, obj.getCity_code());
	        stmt.setString(27, obj.getOrg_tel());
	        stmt.setInt(28, obj.getInvoice());
	        stmt.setString(29, obj.getChzh());
	        stmt.setString(30, obj.getRelashi());
	        stmt.setString(31, obj.getD_message());
	        stmt.setInt(32, obj.getWztx());
	        stmt.setString(33, obj.getAdd_message());
	        stmt.setString(34, obj.getOwner());
	        stmt.setInt(35, obj.getChllx());
	        stmt.setString(36, obj.getFzrq());
	        stmt.setInt(37, obj.getC_zhl());
	        stmt.setInt(38, obj.getH_zhl());
	        stmt.setString(39, obj.getBxrq());
	        stmt.setInt(40, obj.getX_3());
		  	a=stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认	
			if (a>0)
			 { b=id;
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
							 throw new Cls_exception("Cls_l_bx.insertByObj()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_bx.insertByObj()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_bx.insertByObj()"+e.toString());
						}
				   con =null;
							}
		}
		return b;	
	}
	public List<Cls_e_bx> select_by_tj(String tsql) throws Cls_exception {
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		ArrayList<Cls_e_bx> rtnAL = new ArrayList<Cls_e_bx>();
	 try{	
		 Cls_connect cn = new Cls_connect();
	    conn = cn.connect().getConnection();
		pstmt=conn.prepareStatement("select to_char(order_time,'yyyy-mm-dd hh24:mi:ss') as sorder_time,to_char(bj_time,'yyyy-mm-dd hh24:mi:ss') as sbj_time,to_char(proce_time,'yyyy-mm-dd hh24:mi:ss') as sproce_time,t.* from  kcs_specbaoxian t where order_type<>'4' "+tsql);
		rs=pstmt.executeQuery();

		Cls_e_bx tmp_jg;
		
		while(rs.next()) {
		  tmp_jg=new Cls_e_bx();
		  tmp_jg.setId(rs.getInt("id"));
		  tmp_jg.setSerial_no(rs.getInt("serial_no"));
		  tmp_jg.setOrg_code(rs.getString("org_code"));
		  tmp_jg.setOpercode(rs.getString("opercode")); 
		  tmp_jg.setCity_code(rs.getString("city_code"));
		  tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
		  tmp_jg.setOper_opercode(rs.getString("oper_opercode"));
		  tmp_jg.setYw_type(rs.getInt("yw_type"));
		  tmp_jg.setWztx(rs.getInt("wztx"));
		  tmp_jg.setPost_address(rs.getString("post_address"));
		  tmp_jg.setPrice_detail(rs.getString("price_detail"));
		  tmp_jg.setPrice(rs.getDouble("price"));
		  tmp_jg.setSum_price(rs.getDouble("sum_price")); 
		  tmp_jg.setMail_num(rs.getString("mail_num"));
		  tmp_jg.setCphm(rs.getString("cphm"));
		  tmp_jg.setCjhm(rs.getString("cjhm"));
		  tmp_jg.setFdjhm(rs.getString("fdjhm"));
		  tmp_jg.setPpxh(rs.getString("ppxh"));
		  tmp_jg.setZhc_rq(rs.getString("zhc_rq"));
		  tmp_jg.setTele_no(rs.getString("tele_no"));
		  tmp_jg.setName(rs.getString("name"));
		  tmp_jg.setSfzid(rs.getString("sfzid"));
		  tmp_jg.setSfz_addr(rs.getString("sfz_addr"));
		  tmp_jg.setSorder_time(rs.getString("sorder_time"));
		  tmp_jg.setOrder_mark(rs.getString("order_mark"));
		  tmp_jg.setSproce_time(rs.getString("sproce_time"));
		  tmp_jg.setSbj_time(rs.getString("sbj_time"));
		  tmp_jg.setOrder_type(rs.getString("order_type"));
		  tmp_jg.setOrder_result(rs.getString("order_result"));
		  tmp_jg.setLock_mark(rs.getInt("lock_mark"));
		  tmp_jg.setOrg_tel(rs.getString("org_tel"));
		  tmp_jg.setZjlsh(rs.getString("zjlsh"));
		  tmp_jg.setT_message(rs.getString("t_message"));
		  tmp_jg.setChzh(rs.getString("chzh"));
		  tmp_jg.setRelashi(rs.getString("relashi"));
		  tmp_jg.setD_message(rs.getString("d_message"));
		  tmp_jg.setAdd_message(rs.getString("add_message"));
		  tmp_jg.setOwner(rs.getString("owner"));
		  tmp_jg.setChllx(rs.getInt("chllx"));
		  tmp_jg.setFzrq(rs.getString("fzrq"));
		  tmp_jg.setC_zhl(rs.getInt("c_zhl"));
		  tmp_jg.setH_zhl(rs.getInt("h_zhl"));
		  tmp_jg.setBxrq(rs.getString("bxrq"));
		  tmp_jg.setFzr(rs.getString("fzr"));
		  tmp_jg.setFzrxm(rs.getString("fzrxm"));
		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}		 
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_bx.select_by_tj() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_bx.select_by_tj()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_bx.select_by_tj()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_bx.select_by_tj()"+e.toString());
					}
			   conn =null;
						}
			
		}
	return rtnAL;
		}
	public  List<Cls_e_bx>  select_bypage2(String tsql, int p, int ev) throws Cls_exception {
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		ArrayList<Cls_e_bx> rtnAL = new ArrayList<Cls_e_bx>();
		StringBuffer sqlInsert = new StringBuffer();
	 try{	
		 Cls_connect cn = new Cls_connect();
	 	conn = cn.connect().getConnection();
	 	sqlInsert.append("SELECT to_char(order_time,'yyyy-mm-dd hh24:mi:ss') as sorder_time,to_char(bj_time,'yyyy-mm-dd hh24:mi:ss') as sbj_time,to_char(proce_time,'yyyy-mm-dd hh24:mi:ss') as sproce_time,");
	 	sqlInsert.append("sum_price,tele_no,name,order_mark,order_type,order_result,yw_type,lock_mark,cphm,d_message,");
	 	sqlInsert.append(" id,serial_no,org_code,opercode,city_code,oper_orgcode,oper_opercode  FROM kcs_specbaoxian t");
	 	sqlInsert.append(" WHERE ROWID IN (");
	 	sqlInsert.append(" SELECT rid FROM (");
	 	sqlInsert.append(" SELECT rid, ROWNUM AS rn FROM (");
	 	sqlInsert.append(" SELECT ROWID rid FROM kcs_specbaoxian");
	 	sqlInsert.append(" where "+tsql);
	 	sqlInsert.append(" ORDER BY id desc");
	 	sqlInsert.append(" ) t1 WHERE  ROWNUM<"+ev);
	 	sqlInsert.append(" ) t2 WHERE  rn>="+p);
	 	sqlInsert.append(" ) ORDER BY id desc");
	 	pstmt=conn.prepareStatement(sqlInsert.toString());
		rs=pstmt.executeQuery();
		Cls_e_bx tmp_jg;
		while(rs.next()) {
			  tmp_jg=new Cls_e_bx();
			  tmp_jg.setId(rs.getInt("id"));
			  tmp_jg.setSerial_no(rs.getInt("serial_no"));
			  tmp_jg.setOrg_code(rs.getString("org_code"));
			  tmp_jg.setOpercode(rs.getString("opercode")); 
			  tmp_jg.setCity_code(rs.getString("city_code"));
			  tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
			  tmp_jg.setOper_opercode(rs.getString("oper_opercode"));
			  tmp_jg.setSum_price(rs.getDouble("sum_price")); 
			  tmp_jg.setTele_no(rs.getString("tele_no"));
			  tmp_jg.setName(rs.getString("name"));
			  tmp_jg.setSorder_time(rs.getString("sorder_time"));
			  tmp_jg.setOrder_mark(rs.getString("order_mark"));
			  tmp_jg.setSproce_time(rs.getString("sproce_time"));
			  tmp_jg.setSbj_time(rs.getString("sbj_time"));
			  tmp_jg.setOrder_type(rs.getString("order_type"));
			  tmp_jg.setYw_type(rs.getInt("yw_type"));
			  tmp_jg.setLock_mark(rs.getInt("lock_mark"));
			  tmp_jg.setCphm(rs.getString("cphm"));
			  tmp_jg.setD_message(rs.getString("d_message"));
			  rtnAL.add(tmp_jg);
		      tmp_jg=null;
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_hcpddmx.select_bypage2() "+e.toString());
	 }	
	finally{
			
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_hcpddmx.select_bypage2()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_hcpddmx.select_bypage2()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_hcpddmx.select_bypage2()"+e.toString());
					}
			   conn =null;
						}
			
		}
	return rtnAL;

		}
	public List<Cls_e_bx> select_bypage(String tsql, int p, int ev) throws Cls_exception {
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		ArrayList<Cls_e_bx> rtnAL = new ArrayList<Cls_e_bx>();
	 try{	
		 Cls_connect cn = new Cls_connect();
	    conn = cn.connect().getConnection();
		pstmt=conn.prepareStatement("select * from (select my_table.*,rownum as my_rownum from ("+tsql+ ") my_table where rownum<"+ev+") where my_rownum>="+p);
		rs=pstmt.executeQuery();

		Cls_e_bx tmp_jg;
		
		while(rs.next()) {
		  tmp_jg=new Cls_e_bx();
		  tmp_jg.setId(rs.getInt("id"));
		  tmp_jg.setSerial_no(rs.getInt("serial_no"));
		  tmp_jg.setOrg_code(rs.getString("org_code"));
		  tmp_jg.setOpercode(rs.getString("opercode")); 
		  tmp_jg.setCity_code(rs.getString("city_code"));
		  tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
		  tmp_jg.setOper_opercode(rs.getString("oper_opercode"));
		  tmp_jg.setSum_price(rs.getDouble("sum_price")); 
		  tmp_jg.setTele_no(rs.getString("tele_no"));
		  tmp_jg.setName(rs.getString("name"));
		  tmp_jg.setSorder_time(rs.getString("sorder_time"));
		  tmp_jg.setOrder_mark(rs.getString("order_mark"));
		  tmp_jg.setSproce_time(rs.getString("sproce_time"));
		  tmp_jg.setSbj_time(rs.getString("sbj_time"));
		  tmp_jg.setOrder_type(rs.getString("order_type"));
		  tmp_jg.setYw_type(rs.getInt("yw_type"));
		  tmp_jg.setLock_mark(rs.getInt("lock_mark"));
		  tmp_jg.setCphm(rs.getString("cphm"));
		  tmp_jg.setPpxh(rs.getString("ppxh"));
		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}		 
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_bx.select_bypage() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_bx.select_bypage()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_bx.select_bypage()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_bx.select_bypage()"+e.toString());
					}
			   conn =null;
						}
			
		}
	return rtnAL;
		}
	public List<Cls_e_bx> select_byid(int id) throws Cls_exception {
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		ArrayList<Cls_e_bx> rtnAL = new ArrayList<Cls_e_bx>();
	 try{	
		 Cls_connect cn = new Cls_connect();
	    conn = cn.connect().getConnection();
		pstmt=conn.prepareStatement("select to_char(order_time,'yyyy-mm-dd hh24:mi:ss') as sorder_time,to_char(bj_time,'yyyy-mm-dd hh24:mi:ss') as sbj_time,to_char(proce_time,'yyyy-mm-dd hh24:mi:ss') as sproce_time,t.* from  kcs_specbaoxian t where id="+id);
		rs=pstmt.executeQuery();

		Cls_e_bx tmp_jg;
		
		while(rs.next()) {
		  tmp_jg=new Cls_e_bx();
		  tmp_jg.setId(rs.getInt("id"));
		  tmp_jg.setSerial_no(rs.getInt("serial_no"));
		  tmp_jg.setOrg_code(rs.getString("org_code"));
		  tmp_jg.setOpercode(rs.getString("opercode")); 
		  tmp_jg.setCity_code(rs.getString("city_code"));
		  tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
		  tmp_jg.setOper_opercode(rs.getString("oper_opercode"));
		  tmp_jg.setYw_type(rs.getInt("yw_type"));
		  tmp_jg.setWztx(rs.getInt("wztx"));
		  tmp_jg.setPost_address(rs.getString("post_address"));
		  tmp_jg.setPrice_detail(rs.getString("price_detail"));
		  tmp_jg.setPrice(rs.getDouble("price"));
		  tmp_jg.setSum_price(rs.getDouble("sum_price")); 
		  tmp_jg.setMail_num(rs.getString("mail_num"));
		  tmp_jg.setCphm(rs.getString("cphm"));
		  tmp_jg.setCjhm(rs.getString("cjhm"));
		  tmp_jg.setFdjhm(rs.getString("fdjhm"));
		  tmp_jg.setPpxh(rs.getString("ppxh"));
		  tmp_jg.setZhc_rq(rs.getString("zhc_rq"));
		  tmp_jg.setTele_no(rs.getString("tele_no"));
		  tmp_jg.setName(rs.getString("name"));
		  tmp_jg.setSfzid(rs.getString("sfzid"));
		  tmp_jg.setSfz_addr(rs.getString("sfz_addr"));
		  tmp_jg.setX_sunshi(rs.getInt("x_sunshi"));
		  tmp_jg.setX_3zhe(rs.getInt("x_3zhe"));
		  tmp_jg.setX_daoq(rs.getInt("x_daoq"));
		  tmp_jg.setX_siji(rs.getInt("x_siji"));
		  tmp_jg.setX_chke(rs.getInt("x_chke"));
		  tmp_jg.setX_ziran(rs.getInt("x_ziran"));
		  tmp_jg.setX_hhen(rs.getInt("x_hhen"));
		  tmp_jg.setX_boli(rs.getInt("x_boli"));
		  tmp_jg.setX_bjm(rs.getString("x_bjm"));
		  tmp_jg.setX_jq(rs.getInt("x_jq"));
		  tmp_jg.setX_chchsh(rs.getInt("x_chchsh"));
		  tmp_jg.setF_sunshi(rs.getDouble("f_sunshi"));
		  tmp_jg.setF_3zhe(rs.getDouble("f_3zhe"));
		  tmp_jg.setF_daoq(rs.getDouble("f_daoq"));
		  tmp_jg.setF_siji(rs.getDouble("f_siji"));
		  tmp_jg.setF_chke(rs.getDouble("f_chke"));
		  tmp_jg.setF_ziran(rs.getDouble("f_ziran"));
		  tmp_jg.setF_hhen(rs.getDouble("f_hhen"));
		  tmp_jg.setF_bjm(rs.getDouble("f_bjm"));
		  tmp_jg.setF_boli(rs.getDouble("f_boli"));
		  tmp_jg.setF_jq(rs.getDouble("f_jq"));
		  tmp_jg.setF_chchsh(rs.getDouble("f_chchsh"));
		  tmp_jg.setSorder_time(rs.getString("sorder_time"));
		  tmp_jg.setOrder_mark(rs.getString("order_mark"));
		  tmp_jg.setSproce_time(rs.getString("sproce_time"));
		  tmp_jg.setSbj_time(rs.getString("sbj_time"));
		  tmp_jg.setOrder_type(rs.getString("order_type"));
		  tmp_jg.setOrder_result(rs.getString("order_result"));
		  tmp_jg.setLock_mark(rs.getInt("lock_mark"));
		  tmp_jg.setOrg_tel(rs.getString("org_tel"));
		  tmp_jg.setZjlsh(rs.getString("zjlsh"));
		  tmp_jg.setT_message(rs.getString("t_message"));
		  tmp_jg.setE_sunshi(rs.getDouble("e_sunshi"));
		  tmp_jg.setE_daoq(rs.getDouble("e_daoq"));
		  tmp_jg.setE_ziran(rs.getDouble("e_ziran"));
		  tmp_jg.setInvoice(rs.getInt("invoice"));
		  tmp_jg.setChzh(rs.getString("chzh"));
		  tmp_jg.setRelashi(rs.getString("relashi"));
		  tmp_jg.setD_message(rs.getString("d_message"));
		  tmp_jg.setAdd_message(rs.getString("add_message"));
		  tmp_jg.setOwner(rs.getString("owner"));
		  tmp_jg.setChllx(rs.getInt("chllx"));
		  tmp_jg.setFzrq(rs.getString("fzrq"));
		  tmp_jg.setC_zhl(rs.getInt("c_zhl"));
		  tmp_jg.setH_zhl(rs.getInt("h_zhl"));
		  tmp_jg.setBxrq(rs.getString("bxrq"));
		  tmp_jg.setFzr(rs.getString("fzr"));
		  tmp_jg.setFzrxm(rs.getString("fzrxm"));
		  tmp_jg.setX_3(rs.getInt("x_3"));
		  tmp_jg.setF_3(rs.getDouble("f_3"));
		  tmp_jg.setBjmark(rs.getInt("bj_mark"));
		  tmp_jg.setQuotationBINo(rs.getString("quotationNoBI"));
		  tmp_jg.setQuotationCINo(rs.getString("quotationNoCI"));
		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}		 
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_bx.select_byid() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_bx.select_byid()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_bx.select_byid()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_bx.select_byid()"+e.toString());
					}
			   conn =null;
						}
			
		}
	return rtnAL;
		}
	private int insertChzhObj(Cls_e_bx obj) throws Exception {
	    if (obj == null) {
	        throw new NullPointerException("kcs_bx obj");
	      }	
	    Cls_gg gg = new Cls_gg();
	    int id = gg.getint("select SINOP_ID.nextval from dual");
	    log.error("订单生成冲正订单："+obj.getAdd_message()+",冲正号码："+id);	    
	    StringBuffer sqlInsert = new StringBuffer();
	    sqlInsert.append("insert into kcs_specbaoxian(id,serial_no,org_code,opercode,oper_orgcode," );
	    sqlInsert.append("yw_type,cphm," );	   
	    sqlInsert.append("order_time,city_code,add_message,");
	    sqlInsert.append("order_type) values ("+id+",?,?,");
	    sqlInsert.append("?,?,?,?,sysdate,?,?,?)");
	    java.sql.Connection con=null;
		java.sql.PreparedStatement stmt=null;
		java.sql.ResultSet rs=null;
		int a=0,b=0;
		try {
			Cls_connect cn = new Cls_connect();
	    	con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement(sqlInsert.toString());
	        stmt.setInt(1, id);
	        stmt.setString(2, obj.getOrg_code());
	        stmt.setString(3, obj.getOpercode());
	        stmt.setString(4, obj.getOper_orgcode());
	        stmt.setInt(5, obj.getYw_type());
	        stmt.setString(6, obj.getCphm());
	        stmt.setString(7, obj.getCity_code());
	        stmt.setString(8, obj.getAdd_message());
	        stmt.setString(9, obj.getOrder_type()); 
   		  	a=stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认	
			if (a>0)
			 { b=id;
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
							 throw new Cls_exception("Cls_l_bx.insertByObj()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_bx.insertByObj()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_bx.insertByObj()"+e.toString());
						}
				   con =null;
							}
		}
		return b;	
	}
	private Cls_e_bx get_byid(int id) throws Cls_exception {
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		Cls_e_bx tmp_jg = new Cls_e_bx();
	 try{	
		 Cls_connect cn = new Cls_connect();
	    conn = cn.connect().getConnection();
		pstmt=conn.prepareStatement("select to_char(order_time,'yyyy-mm-dd hh24:mi:ss') as sorder_time,to_char(bj_time,'yyyy-mm-dd hh24:mi:ss') as sbj_time,to_char(proce_time,'yyyy-mm-dd hh24:mi:ss') as sproce_time,t.* from  kcs_specbaoxian t where id="+id);
		rs=pstmt.executeQuery();	
		while(rs.next()) {
		  tmp_jg.setId(rs.getInt("id"));
		  tmp_jg.setSerial_no(rs.getInt("serial_no"));
		  tmp_jg.setOrg_code(rs.getString("org_code"));
		  tmp_jg.setOpercode(rs.getString("opercode")); 
		  tmp_jg.setCity_code(rs.getString("city_code"));
		  tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
		  tmp_jg.setOper_opercode(rs.getString("oper_opercode"));
		  tmp_jg.setYw_type(rs.getInt("yw_type"));
		  tmp_jg.setWztx(rs.getInt("wztx"));
		  tmp_jg.setPost_address(rs.getString("post_address"));
		  tmp_jg.setPrice_detail(rs.getString("price_detail"));
		  tmp_jg.setPrice(rs.getDouble("price"));
		  tmp_jg.setSum_price(rs.getDouble("sum_price")); 
		  tmp_jg.setMail_num(rs.getString("mail_num"));
		  tmp_jg.setCphm(rs.getString("cphm"));
		  tmp_jg.setCjhm(rs.getString("cjhm"));
		  tmp_jg.setFdjhm(rs.getString("fdjhm"));
		  tmp_jg.setPpxh(rs.getString("ppxh"));
		  tmp_jg.setZhc_rq(rs.getString("zhc_rq"));
		  tmp_jg.setTele_no(rs.getString("tele_no"));
		  tmp_jg.setName(rs.getString("name"));
		  tmp_jg.setSfzid(rs.getString("sfzid"));
		  tmp_jg.setSfz_addr(rs.getString("sfz_addr"));
		  tmp_jg.setX_sunshi(rs.getInt("x_sunshi"));
		  tmp_jg.setX_3zhe(rs.getInt("x_3zhe"));
		  tmp_jg.setX_daoq(rs.getInt("x_daoq"));
		  tmp_jg.setX_siji(rs.getInt("x_siji"));
		  tmp_jg.setX_chke(rs.getInt("x_chke"));
		  tmp_jg.setX_ziran(rs.getInt("x_ziran"));
		  tmp_jg.setX_hhen(rs.getInt("x_hhen"));
		  tmp_jg.setX_boli(rs.getInt("x_boli"));
		  tmp_jg.setX_bjm(rs.getString("x_bjm"));
		  tmp_jg.setX_jq(rs.getInt("x_jq"));
		  tmp_jg.setX_chchsh(rs.getInt("x_chchsh"));
		  tmp_jg.setF_sunshi(rs.getDouble("f_sunshi"));
		  tmp_jg.setF_3zhe(rs.getDouble("f_3zhe"));
		  tmp_jg.setF_daoq(rs.getDouble("f_daoq"));
		  tmp_jg.setF_siji(rs.getDouble("f_siji"));
		  tmp_jg.setF_chke(rs.getDouble("f_chke"));
		  tmp_jg.setF_ziran(rs.getDouble("f_ziran"));
		  tmp_jg.setF_hhen(rs.getDouble("f_hhen"));
		  tmp_jg.setF_bjm(rs.getDouble("f_bjm"));
		  tmp_jg.setF_boli(rs.getDouble("f_boli"));
		  tmp_jg.setF_jq(rs.getDouble("f_jq"));
		  tmp_jg.setF_chchsh(rs.getDouble("f_chchsh"));
		  tmp_jg.setSorder_time(rs.getString("sorder_time"));
		  tmp_jg.setOrder_mark(rs.getString("order_mark"));
		  tmp_jg.setSproce_time(rs.getString("sproce_time"));
		  tmp_jg.setSbj_time(rs.getString("sbj_time"));
		  tmp_jg.setOrder_type(rs.getString("order_type"));
		  tmp_jg.setOrder_result(rs.getString("order_result"));
		  tmp_jg.setLock_mark(rs.getInt("lock_mark"));
		  tmp_jg.setOrg_tel(rs.getString("org_tel"));
		  tmp_jg.setZjlsh(rs.getString("zjlsh"));
		  tmp_jg.setT_message(rs.getString("t_message"));
		  tmp_jg.setE_sunshi(rs.getDouble("e_sunshi"));
		  tmp_jg.setE_daoq(rs.getDouble("e_daoq"));
		  tmp_jg.setE_ziran(rs.getDouble("e_ziran"));
		  tmp_jg.setInvoice(rs.getInt("invoice"));
		  tmp_jg.setChzh(rs.getString("chzh"));
		  tmp_jg.setRelashi(rs.getString("relashi"));
		  tmp_jg.setD_message(rs.getString("d_message"));
		  tmp_jg.setAdd_message(rs.getString("add_message"));
		  tmp_jg.setOwner(rs.getString("owner"));
		  tmp_jg.setChllx(rs.getInt("chllx"));
		  tmp_jg.setFzrq(rs.getString("fzrq"));
		  tmp_jg.setC_zhl(rs.getInt("c_zhl"));
		  tmp_jg.setH_zhl(rs.getInt("h_zhl"));
		  tmp_jg.setBxrq(rs.getString("bxrq"));
		  tmp_jg.setFzr(rs.getString("fzr"));
		  tmp_jg.setFzrxm(rs.getString("fzrxm"));
					}		 
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_bx.select_byid() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_bx.select_byid()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_bx.select_byid()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_bx.select_byid()"+e.toString());
					}
			   conn =null;
						}
			
		}
	return tmp_jg;
		}
	public boolean in_khxx(int sno) throws Exception{
		boolean tag= false;String sql="";
		List<Cls_e_bx> rtnAL = new ArrayList<Cls_e_bx>();
		rtnAL = select_byid(sno);
		int con=0;
		Cls_gg gg = new Cls_gg();
		Cls_zd zd = new Cls_zd();
		//con=gg.getrow(" kcs_specbxkh  where cphm='"+rtnAL.get(0).getCphm()+"' and bxrq=add_months(to_date('"+rtnAL.get(0).getBxrq()+"','yyyy-mm-dd'),12)-1 and mark>0");
		con=gg.getrow(" kcs_specbxkh  where cphm='"+rtnAL.get(0).getCphm()+"'  and mark>0");
		String tbgs=zd.GetBxgs(rtnAL.get(0).getYw_type());
		if (con==0) {			
			String jgm=zd.GetJgname(rtnAL.get(0).getOrg_code());
		    sql="insert into kcs_specbxkh(serial_no,org_code,opercode,name,tel,cphm,bxrq,tbgs,citycode,time,mark,c_dw) values (TFEE_ID.nextval,'"+rtnAL.get(0).getOrg_code()+"','"+rtnAL.get(0).getOpercode();
		    sql=sql+"','"+rtnAL.get(0).getName()+"','"+rtnAL.get(0).getTele_no()+"','"+rtnAL.get(0).getCphm()+"',add_months(to_date('"+rtnAL.get(0).getBxrq()+"','yyyy-mm-dd'),12)-1,'";
		    sql=sql+tbgs+"','"+rtnAL.get(0).getCity_code()+"',sysdate,1,'"+jgm+"')";
            tag =gg.update(sql);			
		 } else {
			 sql= "update kcs_specbxkh set bxrq=add_months(to_date('"+rtnAL.get(0).getBxrq()+"','yyyy-mm-dd'),12)-1,tbgs='"+tbgs+"' where cphm='"+rtnAL.get(0).getCphm()+"'  and mark>0";
			 tag =gg.update(sql);
		 }
		
		return tag;
	}
	public List<Cls_e_bx> select_by_stj(String tsql) throws Cls_exception {
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		ArrayList<Cls_e_bx> rtnAL = new ArrayList<Cls_e_bx>();
		StringBuffer sqlInsert = new StringBuffer();
	 try{	
		 Cls_connect cn = new Cls_connect();
	    conn = cn.connect().getConnection();
	    sqlInsert.append("select to_char(order_time,'yyyy-mm-dd hh24:mi:ss') as sorder_time,to_char(proce_time,'yyyy-mm-dd hh24:mi:ss') as sproce_time,");
	    sqlInsert.append("id,org_code,opercode,city_code,oper_orgcode,oper_opercode,yw_type,name,tele_no,cphm,ppxh,d_message,price_detail,");
	    sqlInsert.append("order_mark,order_type,sum_price,f_sunshi+f_3zhe+f_daoq+f_siji+f_chke+f_ziran+f_hhen+f_boli+f_bjm+f_3 as syx,f_jq,f_chchsh");
		sqlInsert.append(" from  kcs_specbaoxian t where  order_type='6' "+tsql+" order by city_code");
	    pstmt=conn.prepareStatement(sqlInsert.toString());
		rs=pstmt.executeQuery();
		Cls_e_bx tmp_jg;
		while(rs.next()) {
		  tmp_jg=new Cls_e_bx();
		  tmp_jg.setId(rs.getInt("id"));
		  tmp_jg.setOrg_code(rs.getString("org_code"));
		  tmp_jg.setOpercode(rs.getString("opercode")); 
		  tmp_jg.setCity_code(rs.getString("city_code"));
		  tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
		  tmp_jg.setOper_opercode(rs.getString("oper_opercode"));
		  tmp_jg.setYw_type(rs.getInt("yw_type"));
          tmp_jg.setName(rs.getString("name"));	
          tmp_jg.setTele_no(rs.getString("tele_no"));
          tmp_jg.setCphm(rs.getString("cphm"));
          tmp_jg.setPpxh(rs.getString("ppxh"));
          tmp_jg.setD_message(rs.getString("d_message"));
          tmp_jg.setPrice_detail(rs.getString("price_detail"));
          tmp_jg.setOrder_mark(rs.getString("order_mark"));
          tmp_jg.setOrder_type(rs.getString("order_type"));
          tmp_jg.setSum_price(rs.getDouble("sum_price"));
          tmp_jg.setSorder_time(rs.getString("sorder_time"));
          tmp_jg.setSproce_time(rs.getString("sproce_time"));
          tmp_jg.setF_sunshi(rs.getDouble("syx"));
          tmp_jg.setF_jq(rs.getDouble("f_jq"));
          tmp_jg.setF_chchsh(rs.getDouble("f_chchsh"));
  
		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}		 
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_bx.select_by_stj() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_bx.select_by_stj()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_bx.select_by_stj()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_bx.select_by_stj()"+e.toString());
					}
			   conn =null;
						}
			
		}
	return rtnAL;
		}	
	public List<Cls_e_bx> select_by_dstj(String tsql) throws Cls_exception {
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		ArrayList<Cls_e_bx> rtnAL = new ArrayList<Cls_e_bx>();
		StringBuffer sqlInsert = new StringBuffer();
	 try{	
		 Cls_connect cn = new Cls_connect();
	    conn = cn.connect().getConnection();
	    sqlInsert.append("select to_char(order_time,'yyyy-mm-dd hh24:mi:ss') as sorder_time,to_char(proce_time,'yyyy-mm-dd hh24:mi:ss') as sproce_time,bxrq,");
	    sqlInsert.append("id,org_code,opercode,city_code,oper_orgcode,oper_opercode,yw_type,name,tele_no,cphm,ppxh,d_message,price_detail,zjlsh,mail_num,");
	    sqlInsert.append("order_mark,order_type,sum_price,f_sunshi+f_3zhe+f_daoq+f_siji+f_chke+f_ziran+f_hhen+f_boli+f_bjm+f_3 as syx,f_jq,f_chchsh,relashi,chzh,");
	    sqlInsert.append("fzr,fzrxm,fzrq");
		sqlInsert.append(" from  kcs_specbaoxian t where  order_type<>'4' "+tsql+" order by city_code");
	    pstmt=conn.prepareStatement(sqlInsert.toString());
		rs=pstmt.executeQuery();
		Cls_e_bx tmp_jg;
		while(rs.next()) {
		  tmp_jg=new Cls_e_bx();
		  tmp_jg.setId(rs.getInt("id"));
		  tmp_jg.setOrg_code(rs.getString("org_code"));
		  tmp_jg.setOpercode(rs.getString("opercode")); 
		  tmp_jg.setCity_code(rs.getString("city_code"));
		  tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
		  tmp_jg.setOper_opercode(rs.getString("oper_opercode"));
		  tmp_jg.setYw_type(rs.getInt("yw_type"));
          tmp_jg.setName(rs.getString("name"));	
          tmp_jg.setTele_no(rs.getString("tele_no"));
          tmp_jg.setCphm(rs.getString("cphm"));
          tmp_jg.setPpxh(rs.getString("ppxh"));
          tmp_jg.setD_message(rs.getString("d_message"));
          tmp_jg.setPrice_detail(rs.getString("price_detail"));
          tmp_jg.setOrder_mark(rs.getString("order_mark"));
          tmp_jg.setOrder_type(rs.getString("order_type"));
          tmp_jg.setSum_price(rs.getDouble("sum_price"));
          tmp_jg.setSorder_time(rs.getString("sorder_time"));
          tmp_jg.setSproce_time(rs.getString("sproce_time"));
          tmp_jg.setF_sunshi(rs.getDouble("syx"));
          tmp_jg.setF_jq(rs.getDouble("f_jq"));
          tmp_jg.setF_chchsh(rs.getDouble("f_chchsh"));
          tmp_jg.setMail_num(rs.getString("mail_num"));
          tmp_jg.setZjlsh(rs.getString("zjlsh"));
          tmp_jg.setBxrq(rs.getString("bxrq"));
          tmp_jg.setRelashi(rs.getString("relashi"));
          tmp_jg.setChzh(rs.getString("chzh"));
          tmp_jg.setFzr(rs.getString("fzr"));
          tmp_jg.setFzrxm(rs.getString("fzrxm"));
          tmp_jg.setFzrq(rs.getString("fzrq"));
          
		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}		 
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_bx.select_by_dstj() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_bx.select_by_dstj()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_bx.select_by_dstj()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_bx.select_by_dstj()"+e.toString());
					}
			   conn =null;
						}
			
		}
	return rtnAL;
		}	
	public boolean isonlytb(String cphm) throws Cls_exception {
		boolean tag = false;
	    if (cphm == null||"".equals(cphm))
	    	return false;
	    else {
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
	 try{	
		 Cls_connect cn = new Cls_connect();
		 conn = cn.connect().getConnection();
		 pstmt=conn.prepareStatement("select count(*) from kcs_specbaoxian where  cphm=?  and order_type='5'");

		 pstmt.setString(1, cphm);
		 rs=pstmt.executeQuery();

		while(rs.next()) {
			int a = rs.getInt(1);
			if (a==0) tag = true;
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_bx.isonlytb() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_bx.isonlytb()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_bx.isonlytb()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_bx.isonlytb()"+e.toString());
					}
			   conn =null;
						}
		}
	return tag;	
	}
  }
}
