/**
 * 
 */
package pkg_sinopec;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleTypes;

/**
 * @author Administrator
 *
 */
public class Cls_l_specddmx {

	public List<Cls_e_spec> select_by_tj(String tsql) throws Cls_exception{
		ArrayList<Cls_e_spec> rtnAL = new ArrayList<Cls_e_spec>();
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;

	 try{	
		Cls_connect cn = new Cls_connect();
	    conn = cn.connect().getConnection();
		pstmt=conn.prepareStatement(tsql);
		rs=pstmt.executeQuery();
		Cls_e_spec tmp_jg;
		
		while(rs.next()) {
		  tmp_jg=new Cls_e_spec();
		  tmp_jg.setSerial_no(rs.getInt("serial_no"));
		  tmp_jg.setOrg_code(rs.getString("org_code"));
		  tmp_jg.setOpercode(rs.getString("opercode")); 
		  tmp_jg.setCity_code(rs.getString("city_code"));
		  tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
		  tmp_jg.setOper_opercode(rs.getString("oper_opercode"));
		  tmp_jg.setSum_price(rs.getDouble("sum_price")); 
		  tmp_jg.setTele_no(rs.getString("tele_no"));
		  tmp_jg.setName(rs.getString("name"));
		  tmp_jg.setCjhm(rs.getString("cjhm"));
		  tmp_jg.setWztx(rs.getInt("wztx"));
		  tmp_jg.setPrice(rs.getDouble("price"));
		  tmp_jg.setYjf(rs.getDouble("yjf"));
		  tmp_jg.setAdd_message(rs.getString("add_message"));
		  tmp_jg.setSorder_time(rs.getString("sorder_time"));
		  tmp_jg.setOrder_mark(rs.getString("order_mark"));
		  tmp_jg.setSproce_time(rs.getString("sproce_time"));
		  tmp_jg.setOrder_type(rs.getString("order_type"));
		  tmp_jg.setOrder_result(rs.getString("order_result"));
		  tmp_jg.setT_message(rs.getString("t_message"));
		  tmp_jg.setD_message(rs.getString("d_message"));
		  tmp_jg.setOrg_tel(rs.getString("org_tel")); 
		  tmp_jg.setZjlsh(rs.getString("zjlsh"));
		  tmp_jg.setCard_mark(rs.getInt("card_mark"));
		  tmp_jg.setCard_num(rs.getString("card_num"));
		  tmp_jg.setCphm(rs.getString("cphm"));
		  tmp_jg.setInv_to(rs.getString("inv_to"));
		  tmp_jg.setInvoice(rs.getInt("invoice"));
		  tmp_jg.setMail_num(rs.getString("mail_num"));
		  tmp_jg.setPost_address(rs.getString("post_address"));
		  tmp_jg.setSfzid(rs.getString("sfzid"));
		  tmp_jg.setYw_type(rs.getInt("yw_type"));
		  tmp_jg.setLock_mark(rs.getInt("lock_mark"));
		  tmp_jg.setHyf_no(rs.getInt("hyf_no"));
		  tmp_jg.setId(rs.getInt("id"));
		  tmp_jg.setChxrq(rs.getString("chxrq"));
		  tmp_jg.setFjcard(rs.getString("fjcard"));
		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}

		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_specddmx.select_bytj() "+e.toString());
	 }	
	finally{
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_specddmx.select_bytj()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_specddmx.select_bytj()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_specddmx.select_bytj()"+e.toString());
					}
			   conn =null;
						}
			
		}
	return rtnAL;
	}
	public List<Cls_e_spec> select_byid(int id) throws Cls_exception{
		ArrayList<Cls_e_spec> rtnAL = new ArrayList<Cls_e_spec>();
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;

	 try{	
		Cls_connect cn = new Cls_connect();
	    conn = cn.connect().getConnection();
		pstmt=conn.prepareStatement("select to_char(order_time,'yyyy-mm-dd hh24:mi:ss') as sorder_time,to_char(proce_time,'yyyy-mm-dd hh24:mi:ss') as sproce_time,t.* from kcs_specddmx t where id=?");
		pstmt.setInt(1, id);
		rs=pstmt.executeQuery();
		Cls_e_spec tmp_jg;
		
		while(rs.next()) {
		  tmp_jg=new Cls_e_spec();
		  tmp_jg.setSerial_no(rs.getInt("serial_no"));
		  tmp_jg.setOrg_code(rs.getString("org_code"));
		  tmp_jg.setOpercode(rs.getString("opercode")); 
		  tmp_jg.setCity_code(rs.getString("city_code"));
		  tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
		  tmp_jg.setOper_opercode(rs.getString("oper_opercode"));
		  tmp_jg.setSum_price(rs.getInt("sum_price")); 
		  tmp_jg.setTele_no(rs.getString("tele_no"));
		  tmp_jg.setName(rs.getString("name"));
		  tmp_jg.setCjhm(rs.getString("cjhm"));
		  tmp_jg.setWztx(rs.getInt("wztx"));
		  tmp_jg.setPrice(rs.getDouble("price"));
		  tmp_jg.setYjf(rs.getDouble("yjf"));
		  tmp_jg.setAdd_message(rs.getString("add_message"));
		  tmp_jg.setSorder_time(rs.getString("sorder_time"));
		  tmp_jg.setOrder_mark(rs.getString("order_mark"));
		  tmp_jg.setSproce_time(rs.getString("sproce_time"));
		  tmp_jg.setOrder_type(rs.getString("order_type"));
		  tmp_jg.setOrder_result(rs.getString("order_result"));
		  tmp_jg.setT_message(rs.getString("t_message"));
		  tmp_jg.setD_message(rs.getString("d_message"));
		  tmp_jg.setOrg_tel(rs.getString("org_tel")); 
		  tmp_jg.setZjlsh(rs.getString("zjlsh"));
		  tmp_jg.setCard_mark(rs.getInt("card_mark"));
		  tmp_jg.setCard_num(rs.getString("card_num"));
		  tmp_jg.setCphm(rs.getString("cphm"));
		  tmp_jg.setInv_to(rs.getString("inv_to"));
		  tmp_jg.setInvoice(rs.getInt("invoice"));
		  tmp_jg.setMail_num(rs.getString("mail_num"));
		  tmp_jg.setPost_address(rs.getString("post_address"));
		  tmp_jg.setSfzid(rs.getString("sfzid"));
		  tmp_jg.setYw_type(rs.getInt("yw_type"));
		  tmp_jg.setLock_mark(rs.getInt("lock_mark"));
		  tmp_jg.setHyf_no(rs.getInt("hyf_no"));
		  tmp_jg.setId(rs.getInt("id"));
		  tmp_jg.setChxrq(rs.getString("chxrq"));
		  tmp_jg.setFjcard(rs.getString("fjcard"));
		  tmp_jg.setZl(rs.getString("zl"));
		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}

		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_specddmx.select_byid() "+e.toString());
	 }	
	finally{
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_specddmx.select_byid()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_specddmx.select_byid()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_specddmx.select_byid()"+e.toString());
					}
			   conn =null;
						}
			
		}
	return rtnAL;
	}
	public List<Cls_e_spec> select_bypage(String tsql, int p, int ev) throws Cls_exception {
		    
			java.sql.Connection conn=null;
			java.sql.PreparedStatement pstmt=null;
			java.sql.ResultSet rs=null;
			ArrayList<Cls_e_spec> rtnAL = new ArrayList<Cls_e_spec>();
		 try{	
				Cls_connect cn = new Cls_connect();
		    	conn = cn.connect().getConnection();
			pstmt=conn.prepareStatement("select * from (select my_table.*,rownum as my_rownum from ("+tsql+ ") my_table where rownum<"+ev+") where my_rownum>="+p);
			rs=pstmt.executeQuery();

			Cls_e_spec tmp_jg;
			
			while(rs.next()) {
			  tmp_jg=new Cls_e_spec();
			  tmp_jg.setSerial_no(rs.getInt("serial_no"));
			  tmp_jg.setOrg_code(rs.getString("org_code"));
			  tmp_jg.setOpercode(rs.getString("opercode")); 
			  tmp_jg.setCity_code(rs.getString("city_code"));
			  tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
			  tmp_jg.setOper_opercode(rs.getString("oper_opercode"));
			  tmp_jg.setSum_price(rs.getInt("sum_price")); 
			  tmp_jg.setPrice(rs.getDouble("price"));
			  tmp_jg.setYjf(rs.getDouble("yjf"));
			  tmp_jg.setTele_no(rs.getString("tele_no"));
			  tmp_jg.setName(rs.getString("name"));
			  tmp_jg.setSorder_time(rs.getString("sorder_time"));
			  tmp_jg.setOrder_mark(rs.getString("order_mark"));
			  tmp_jg.setSproce_time(rs.getString("sproce_time"));
			  tmp_jg.setOrder_type(rs.getString("order_type"));
			  tmp_jg.setCard_num(rs.getString("card_num"));
			  tmp_jg.setYw_type(rs.getInt("yw_type"));
			  tmp_jg.setLock_mark(rs.getInt("lock_mark"));
			  tmp_jg.setSfzid(rs.getString("sfzid"));
			  tmp_jg.setCphm(rs.getString("cphm"));
			  tmp_jg.setId(rs.getInt("id"));
			  tmp_jg.setFjcard(rs.getString("fjcard"));
			  tmp_jg.setCjhm(rs.getString("cjhm"));
			  tmp_jg.setHyf_no(rs.getInt("hyf_no"));
			  tmp_jg.setMail_num(rs.getString("mail_num"));
			  rtnAL.add(tmp_jg);
		      tmp_jg=null;
						}		 
			 }
		  catch(Exception e){
				throw new Cls_exception("Cls_l_specddmx.select_bypage() "+e.toString());
		 }	
		finally{
			
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_specddmx.select_bypage()"+e.toString());
						}
				     rs=null;  
							}
							if (pstmt!=null) {
				try{
								pstmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_specddmx.select_bypage()"+e.toString());
						}
				     pstmt=null;
							}
							if (conn!=null){
				try{
								conn.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_specddmx.select_bypage()"+e.toString());
						}
				   conn =null;
							}
				
			}
		return rtnAL;
			}	
	public int insertByObj(Cls_e_spec obj) throws Exception {
	    if (obj == null) {
	        throw new NullPointerException("kcs_spec obj");
	      }	
	    StringBuffer sqlInsert = new StringBuffer();
	    sqlInsert.append("insert into kcs_specddmx(serial_no,org_code,opercode,oper_orgcode," );
	    sqlInsert.append("yw_type,card_mark,cphm,cjhm,wztx,post_address," );	   
	    sqlInsert.append("invoice,inv_to,price,yjf,sum_price,tele_no,name,sfzid,order_time,city_code,org_tel,card_num,hyf_no,id,chxrq,zl) values (");
	    sqlInsert.append("?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,sysdate,?,?,?,?,SINOP_ID.nextval,?,'02') returning id into ?");
	    java.sql.Connection con=null;
		OraclePreparedStatement  stmt=null;
		java.sql.ResultSet rs=null;
		int a=0,id=0;
		try {
			Cls_connect cn = new Cls_connect();
	    	con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt=(OraclePreparedStatement) con.prepareStatement(sqlInsert.toString());
	        stmt.setInt(1, obj.getSerial_no());
	        stmt.setString(2, obj.getOrg_code());
	        stmt.setString(3, obj.getOpercode());
	        stmt.setString(4, obj.getOper_orgcode());
	        stmt.setInt(5, obj.getYw_type());
	        stmt.setInt(6, obj.getCard_mark());
	        stmt.setString(7, obj.getCphm());
	        stmt.setString(8, obj.getCjhm());
	        stmt.setInt(9, obj.getWztx());
	        stmt.setString(10, obj.getPost_address());
	        stmt.setInt(11, obj.getInvoice());
	        stmt.setString(12, obj.getInv_to());
	        stmt.setDouble(13, obj.getPrice());
	        stmt.setDouble(14, obj.getYjf());
	        stmt.setDouble(15, obj.getSum_price());
	        stmt.setString(16, obj.getTele_no());
	        stmt.setString(17, obj.getName());
	        stmt.setString(18, obj.getSfzid());
	        stmt.setString(19, obj.getCity_code());
	        stmt.setString(20, obj.getOrg_tel());
            stmt.setString(21, obj.getCard_num());
            stmt.setInt(22, obj.getHyf_no());
            stmt.setString(23, obj.getChxrq());
            stmt.registerReturnParameter(24, OracleTypes.INTEGER);
		  	a=stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认	
			if (a>0)
			 {
				 rs = stmt.getReturnResultSet(); // rest is not null 
		            while (rs.next()) {
		                 id = rs.getInt(1);
		            }

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
							 throw new Cls_exception("Cls_l_specddmx.insertByObj()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_specddmx.insertByObj()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_specddmx.insertByObj()"+e.toString());
						}
				   con =null;
							}
		}
		return id;	
	}
	public int insertByObj2(Cls_e_spec obj) throws Exception {
	    if (obj == null) {
	        throw new NullPointerException("kcs_spec obj");
	      }	
	    Cls_gg gg = new Cls_gg();
	    int id = gg.getint("select SINOP_ID.nextval from dual");
	    StringBuffer sqlInsert = new StringBuffer();
	    sqlInsert.append("insert into kcs_specddmx(serial_no,org_code,opercode,oper_orgcode," );
	    sqlInsert.append("yw_type,card_mark,cphm,cjhm,wztx,post_address," );	   
	    sqlInsert.append("invoice,inv_to,price,yjf,sum_price,tele_no,name,sfzid,order_time,city_code,org_tel,card_num,hyf_no,id,chxrq,zl) values (");
	    sqlInsert.append("?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,sysdate,?,?,?,?,"+id+",?,'02')");
	    java.sql.Connection con=null;
		java.sql.PreparedStatement stmt=null;
		java.sql.ResultSet rs=null;
		int a=0,b=0;
		try {
			Cls_connect cn = new Cls_connect();
	    	con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement(sqlInsert.toString());
	        stmt.setInt(1, obj.getSerial_no());
	        stmt.setString(2, obj.getOrg_code());
	        stmt.setString(3, obj.getOpercode());
	        stmt.setString(4, obj.getOper_orgcode());
	        stmt.setInt(5, obj.getYw_type());
	        stmt.setInt(6, obj.getCard_mark());
	        stmt.setString(7, obj.getCphm());
	        stmt.setString(8, obj.getCjhm());
	        stmt.setInt(9, obj.getWztx());
	        stmt.setString(10, obj.getPost_address());
	        stmt.setInt(11, obj.getInvoice());
	        stmt.setString(12, obj.getInv_to());
	        stmt.setDouble(13, obj.getPrice());
	        stmt.setDouble(14, obj.getYjf());
	        stmt.setDouble(15, obj.getSum_price());
	        stmt.setString(16, obj.getTele_no());
	        stmt.setString(17, obj.getName());
	        stmt.setString(18, obj.getSfzid());
	        stmt.setString(19, obj.getCity_code());
	        stmt.setString(20, obj.getOrg_tel());
            stmt.setString(21, obj.getCard_num());
            stmt.setInt(22, obj.getHyf_no());
            stmt.setString(23, obj.getChxrq());
		  	a=stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认	
			if (a>0)
			 {
				 b=id;
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
							 throw new Cls_exception("Cls_l_specddmx.insertByObj()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_specddmx.insertByObj()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_specddmx.insertByObj()"+e.toString());
						}
				   con =null;
							}
		}
		return b;	
	}
	public boolean insertByObj3(Cls_e_spec obj) throws Exception {
	    if (obj == null) {
	        throw new NullPointerException("kcs_spec obj");
	      }	
	    StringBuffer sqlInsert = new StringBuffer();
	    sqlInsert.append("insert into kcs_specddmx(serial_no,org_code,opercode,oper_orgcode," );
	    sqlInsert.append("yw_type,card_mark,cphm,cjhm,wztx,post_address," );	   
	    sqlInsert.append("invoice,inv_to,price,yjf,sum_price,tele_no,name,sfzid,order_time,city_code,org_tel,card_num,hyf_no,id,chxrq,zl) values (");
	    sqlInsert.append("?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,sysdate,?,?,?,?,SINOP_ID.nextval,?,'02')");
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
	        stmt.setInt(1, obj.getSerial_no());
	        stmt.setString(2, obj.getOrg_code());
	        stmt.setString(3, obj.getOpercode());
	        stmt.setString(4, obj.getOper_orgcode());
	        stmt.setInt(5, obj.getYw_type());
	        stmt.setInt(6, obj.getCard_mark());
	        stmt.setString(7, obj.getCphm());
	        stmt.setString(8, obj.getCjhm());
	        stmt.setInt(9, obj.getWztx());
	        stmt.setString(10, obj.getPost_address());
	        stmt.setInt(11, obj.getInvoice());
	        stmt.setString(12, obj.getInv_to());
	        stmt.setDouble(13, obj.getPrice());
	        stmt.setDouble(14, obj.getYjf());
	        stmt.setDouble(15, obj.getSum_price());
	        stmt.setString(16, obj.getTele_no());
	        stmt.setString(17, obj.getName());
	        stmt.setString(18, obj.getSfzid());
	        stmt.setString(19, obj.getCity_code());
	        stmt.setString(20, obj.getOrg_tel());
            stmt.setString(21, obj.getCard_num());
            stmt.setInt(22, obj.getHyf_no());
            stmt.setString(23, obj.getChxrq());
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
							 throw new Cls_exception("Cls_l_specddmx.insertByObj()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_specddmx.insertByObj()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_specddmx.insertByObj()"+e.toString());
						}
				   con =null;
							}
		}
		return tag;	
	}
	public boolean deletByDdid(int dd_id,String org_code) throws Exception {
	    StringBuffer sqlUpdate = new StringBuffer();
	    sqlUpdate.append("delete from kcs_specddmx where org_code='"+org_code);
	    sqlUpdate.append("' and id="+dd_id);
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
	    sqlUpdate.append("update kcs_specddmx set order_result='1',order_type='3',t_message='站点撤销订单' where id=");
	    sqlUpdate.append(dd_id+" and order_type='0'");
	    Cls_gg gg = new Cls_gg();
	    boolean tag = gg.update(sqlUpdate.toString());
	    gg = null;
	    sqlUpdate = null;
		return tag;
	}
	public boolean ddlock(int dd_id) throws Exception {
	    if (dd_id==0) {
	        throw new NullPointerException("dd_id");
	      }
	    StringBuffer sqlUpdate = new StringBuffer();
	    sqlUpdate.append("update kcs_specddmx set lock_mark=1 where id=");
	    sqlUpdate.append(dd_id);
	    Cls_gg gg = new Cls_gg();
	    boolean tag = gg.update(sqlUpdate.toString());
	    gg = null;
	    sqlUpdate = null;
		return tag;
	}
	public int get_shpddid() throws Exception {
		int a=0;
		Cls_gg gg = new Cls_gg();
		a =gg.getint("select SHPDDMX_S.nextval from dual");
		/*StringBuffer sqlInsert = new StringBuffer();
		int maxid=gg.getint("select SHPDDMX_S.nextval from dual");
		sqlInsert.append("insert into  kcs_shpddmx(serial_no,dd_id,org_code,opercode,oper_orgcode,shp_no,shp_type_no,shp_mch,shp_type_mch,");
		sqlInsert.append("shp_number,per_price,sum_price,ddsum_price,post_addr,tele_no,name,order_time,city_code,order_type) values("+maxid+","+maxid+",");
		sqlInsert.append("'62009999','100001','62009999',152,1,'中国石化加油ic卡','卡票类商品',1,0,0,0,'0','0','0',SYSDATE,'62','2')");
		boolean emp = gg.update(sqlInsert.toString());
		if (emp) a = maxid;
		sqlInsert=null;*/
		return a;
	}
	public int get_hcpddid() throws Exception {
		int a=0;		
		Cls_gg gg = new Cls_gg();
		a =gg.getint("select HCP_DDID.nextval from dual");
		/*StringBuffer sqlInsert = new StringBuffer();
	    int maxid=gg.maxid(" kcs_hcpddmx")+1;
		sqlInsert.append("insert into kcs_hcpddmx(serial_no,org_code,opercode,oper_orgcode,begin_date,train_no,train_type,ticket_type,begin_station,end_station,");
		sqlInsert.append("ticket_number,per_price,deli_fee,sum_price,tele_no,proc_orgcode,order_type) values("+maxid+",'62009999','100001','62009999','0000-00-00','0','0','0','sinopec',");
		sqlInsert.append("'加油卡',0,0,0,0,'0','62','4')");
		boolean emp = gg.update(sqlInsert.toString());
		if (emp) a = maxid;
		sqlInsert=null;*/
		return a;
	}
	public int insertLbByObj(Cls_e_spec obj) throws Exception {
	    if (obj == null) {
	        throw new NullPointerException("kcs_spec obj");
	      }	
	    Cls_gg gg = new Cls_gg();
	    int id = gg.getint("select SINOP_ID.nextval from dual");
	    StringBuffer sqlInsert = new StringBuffer();
	    sqlInsert.append("insert into kcs_specddmx(serial_no,org_code,opercode,oper_orgcode," );
	    sqlInsert.append("yw_type,card_mark,cphm,cjhm,wztx,post_address," );	   
	    sqlInsert.append("invoice,inv_to,price,yjf,sum_price,tele_no,name,sfzid,order_time,city_code,org_tel,card_num,hyf_no,id,chxrq,zl) values (");
	    sqlInsert.append("?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,sysdate,?,?,?,?,"+id+",?,'02')");
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
	        stmt.setInt(6, obj.getCard_mark());
	        stmt.setString(7, obj.getCphm());
	        stmt.setString(8, "未返");
	        stmt.setInt(9, obj.getWztx());
	        stmt.setString(10, obj.getPost_address());
	        stmt.setInt(11, obj.getInvoice());
	        stmt.setString(12, obj.getInv_to());
	        stmt.setDouble(13, obj.getPrice());
	        stmt.setDouble(14, obj.getYjf());
	        stmt.setDouble(15, obj.getSum_price());
	        stmt.setString(16, obj.getTele_no());
	        stmt.setString(17, obj.getName());
	        stmt.setString(18, obj.getSfzid());
	        stmt.setString(19, obj.getCity_code());
	        stmt.setString(20, obj.getOrg_tel());
            stmt.setString(21, obj.getCard_num());
            stmt.setInt(22, obj.getHyf_no());
            stmt.setString(23, obj.getChxrq());
		  	a=stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认	
			if (a>0)
			 {
				 b=id;
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
							 throw new Cls_exception("Cls_l_specddmx.insertLbByObj()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_specddmx.insertLbByObj()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_specddmx.insertLbByObj()"+e.toString());
						}
				   con =null;
							}
		}
		return b;	
	}
}
