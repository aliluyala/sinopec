package pkg_sinopec;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class Cls_l_ddtj {
	public List<Cls_e_tmp> tj_byqx2(String sql,String citycode) throws Cls_exception {
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
			java.sql.Connection conn=null;
			java.sql.PreparedStatement pstmt=null;
			java.sql.ResultSet rs=null;

		 try{	
			 Cls_connect cn = new Cls_connect();
	     	 conn = cn.connect().getConnection();
			 pstmt=conn.prepareStatement("select count(*) as n1,sum(sum_price) as d1, substr(org_code,3,2) as s1,sum(price) as d2,sum(yjf) as d3 from kcs_specddmx t where city_code='"+citycode+"' and  order_type='1' and order_mark='1' "+sql+" group by substr(org_code,3,2)");
			 rs=pstmt.executeQuery();

			while(rs.next()) {
			 Cls_e_tmp tmp_jg=new Cls_e_tmp();
			  tmp_jg.setNum1(rs.getInt("n1"));
			  tmp_jg.setS1(rs.getString("s1"));
              tmp_jg.setD1(rs.getDouble("d1"));
              tmp_jg.setD2(rs.getDouble("d2"));
              tmp_jg.setD3(rs.getDouble("d3"));
			  rtnAL.add(tmp_jg);
		      tmp_jg=null;
						}
			 }
		  catch(Exception e){
				throw new Cls_exception("Cls_l_ddtj.tj_byqx() "+e.toString());
		 }	
		finally{
			
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.tj_byqx()"+e.toString());
						}
				     rs=null;  
							}
							if (pstmt!=null) {
				try{
								pstmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.tj_byqx()"+e.toString());
						}
				     pstmt=null;
							}
							if (conn!=null){
				try{
								conn.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.tj_byqx()"+e.toString());
						}
				   conn =null;
							}
			}
		return rtnAL;
			}
	public List<Cls_e_tmp> tj_byqx(String sql,String citycode) throws Cls_exception {
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
			java.sql.Connection conn=null;
			java.sql.PreparedStatement pstmt=null;
			java.sql.ResultSet rs=null;
			StringBuffer sqlInsert = new StringBuffer();
		 try{	
			 Cls_connect cn = new Cls_connect();
	     	 conn = cn.connect().getConnection();
	     	sqlInsert.append("select hyf_no,count(*) as n1,sum(sum_price) as d1, substr(org_code,3,2) as s1,sum(price) as d2,sum(yjf) as d3 ");
	     	sqlInsert.append(" from kcs_specddmx t where city_code='"+citycode+"' and  order_type='1' and order_mark='1' ");
	     	sqlInsert.append(sql+" group by substr(org_code,3,2),hyf_no order by substr(org_code,3,2)");
			 pstmt=conn.prepareStatement(sqlInsert.toString());
			 rs=pstmt.executeQuery();

			while(rs.next()) {
			 Cls_e_tmp tmp_jg=new Cls_e_tmp();
			  tmp_jg.setNum2(rs.getInt("hyf_no"));
			  tmp_jg.setNum1(rs.getInt("n1"));
			  tmp_jg.setS1(rs.getString("s1"));
              tmp_jg.setD1(rs.getDouble("d1"));
              tmp_jg.setD2(rs.getDouble("d2"));
              tmp_jg.setD3(rs.getDouble("d3"));
			  rtnAL.add(tmp_jg);
		      tmp_jg=null;
						}
			 }
		  catch(Exception e){
				throw new Cls_exception("Cls_l_ddtj.tj_byqx() "+e.toString());
		 }	
		finally{
			
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.tj_byqx()"+e.toString());
						}
				     rs=null;  
							}
							if (pstmt!=null) {
				try{
								pstmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.tj_byqx()"+e.toString());
						}
				     pstmt=null;
							}
							if (conn!=null){
				try{
								conn.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.tj_byqx()"+e.toString());
						}
				   conn =null;
							}
			}
		return rtnAL;
			}
	/**
	 * 机构下单统计
	 * @param qx
	 * @param sql
	 * @return
	 * @throws Cls_exception
	 */
	public List<Cls_e_tmp> tj_byzj(String qx,String sql) throws Cls_exception {
		    ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
			java.sql.Connection conn=null;
			java.sql.PreparedStatement pstmt=null;
			java.sql.ResultSet rs=null;

		 try{	
			 Cls_connect cn = new Cls_connect();
	     	 conn = cn.connect().getConnection();
			 pstmt=conn.prepareStatement("select hyf_no,count(*) as n1,sum(sum_price) as d1, org_code as s1,sum(price) as d2,sum(yjf) as d3 from kcs_specddmx t where  order_type='1' and order_mark='1' and substr(org_code,0,4)='"+qx+"' "+sql+" group by org_code,hyf_no");
    		 rs=pstmt.executeQuery();

			while(rs.next()) {
				Cls_e_tmp tmp_jg=new Cls_e_tmp();
				  tmp_jg.setNum2(rs.getInt("hyf_no"));
				  tmp_jg.setNum1(rs.getInt("n1"));
				  tmp_jg.setS1(rs.getString("s1"));
	              tmp_jg.setD1(rs.getDouble("d1"));
	              tmp_jg.setD2(rs.getDouble("d2"));
	              tmp_jg.setD3(rs.getDouble("d3"));
			  rtnAL.add(tmp_jg);
		      tmp_jg=null;
						}

			 }
		  catch(Exception e){
				throw new Cls_exception("Cls_l_ddtj.tj_byzj() "+e.toString());
		 }	
		finally{
			
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.tj_byzj()"+e.toString());
						}
				     rs=null;  
							}
							if (pstmt!=null) {
				try{
								pstmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.tj_byzj()"+e.toString());
						}
				     pstmt=null;
							}
							if (conn!=null){
				try{
								conn.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.tj_byzj()"+e.toString());
						}
				   conn =null;
							}
			}
		return rtnAL;
			}	
	public List<Cls_e_tmp> tj_byds(String sql) throws Cls_exception {
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
			java.sql.Connection conn=null;
			java.sql.PreparedStatement pstmt=null;
			java.sql.ResultSet rs=null;
		 try{	
			 Cls_connect cn = new Cls_connect();
	     	 conn = cn.connect().getConnection();
			 pstmt=conn.prepareStatement("select hyf_no,count(*) as n1,sum(sum_price) as d1, city_code as s1,sum(price) as d2,sum(yjf) as d3 from kcs_specddmx t where  order_type='1' and order_mark='1' "+sql+" group by city_code,hyf_no order by city_code");
			 rs=pstmt.executeQuery();

			while(rs.next()) {
			 Cls_e_tmp tmp_jg=new Cls_e_tmp();
			  tmp_jg.setNum2(rs.getInt("hyf_no"));
			  tmp_jg.setNum1(rs.getInt("n1"));
			  tmp_jg.setS1(rs.getString("s1"));
              tmp_jg.setD1(rs.getDouble("d1"));
              tmp_jg.setD2(rs.getDouble("d2"));
              tmp_jg.setD3(rs.getDouble("d3"));
			  rtnAL.add(tmp_jg);
		      tmp_jg=null;
						}
			 }
		  catch(Exception e){
				throw new Cls_exception("Cls_l_ddtj.tj_byds() "+e.toString());
		 }	
		finally{
			
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.tj_byds()"+e.toString());
						}
				     rs=null;  
							}
							if (pstmt!=null) {
				try{
								pstmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.tj_byds()"+e.toString());
						}
				     pstmt=null;
							}
							if (conn!=null){
				try{
								conn.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.tj_byds()"+e.toString());
						}
				   conn =null;
							}
			}
		return rtnAL;
			}
	public List<Cls_e_tmp> tj_byds2(String sql) throws Cls_exception {
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
			java.sql.Connection conn=null;
			java.sql.PreparedStatement pstmt=null;
			java.sql.ResultSet rs=null;
		 try{	
			 Cls_connect cn = new Cls_connect();
	     	 conn = cn.connect().getConnection();
			 pstmt=conn.prepareStatement("select count(*) as n1,sum(sum_price) as d1, city_code as s1,sum(price) as d2,sum(yjf) as d3 from kcs_specddmx t where  order_type='1' and order_mark='1' "+sql+" group by city_code");
			 rs=pstmt.executeQuery();
			 Cls_e_tmp tmp_jg;
			while(rs.next()) {
			tmp_jg=new Cls_e_tmp();
			  tmp_jg.setNum1(rs.getInt("n1"));
			  tmp_jg.setS1(rs.getString("s1"));
              tmp_jg.setD1(rs.getDouble("d1"));
              tmp_jg.setD2(rs.getDouble("d2"));
              tmp_jg.setD3(rs.getDouble("d3"));
			  rtnAL.add(tmp_jg);
		      tmp_jg=null;
						}
			 }
		  catch(Exception e){
				throw new Cls_exception("Cls_l_ddtj.tj_byds2() "+e.toString());
		 }	
		finally{
			
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.tj_byds2()"+e.toString());
						}
				     rs=null;  
							}
							if (pstmt!=null) {
				try{
								pstmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.tj_byds2()"+e.toString());
						}
				     pstmt=null;
							}
							if (conn!=null){
				try{
								conn.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.tj_byds2()"+e.toString());
						}
				   conn =null;
							}
			}
		return rtnAL;
			}		
	
	public List<Cls_e_tmp> stj_byzj(String qx,String sql) throws Cls_exception {
	    ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;

	 try{	
		 Cls_connect cn = new Cls_connect();
     	conn = cn.connect().getConnection();
		 pstmt=conn.prepareStatement("select hyf_no,count(*) as n1,sum(sum_price) as d1, org_code as s1,sum(price) as d2,sum(yjf) as d3 from kcs_specddmx t where  order_type='1' and order_mark='1' and city_code='"+qx+"' "+sql+" group by org_code,hyf_no");
    	rs=pstmt.executeQuery();
    	Cls_e_tmp tmp_jg;
		while(rs.next()) {
			 tmp_jg=new Cls_e_tmp();
			  tmp_jg.setNum2(rs.getInt("hyf_no"));
			  tmp_jg.setNum1(rs.getInt("n1"));
			  tmp_jg.setS1(rs.getString("s1"));
              tmp_jg.setD1(rs.getDouble("d1"));
              tmp_jg.setD2(rs.getDouble("d2"));
              tmp_jg.setD3(rs.getDouble("d3"));
		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}

		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_ddtj.stj_byzj() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_ddtj.stj_byzj()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_ddtj.stj_byzj()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_ddtj.stj_byzj()"+e.toString());
					}
			   conn =null;
						}
		}
	return rtnAL;
		}	
	public List<Cls_e_tmp> tj_byorg(String org_code,String sql) throws Cls_exception {
	    ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;

	 try{	
		 Cls_connect cn = new Cls_connect();
     	conn = cn.connect().getConnection();
		 pstmt=conn.prepareStatement("select count(*) as n1,sum(sum_price) as d1,sum(price) as d2,sum(yjf) as d3 from kcs_specddmx t where  order_type<>'4' and org_code='"+org_code+"' "+sql);
    	rs=pstmt.executeQuery();
    	Cls_e_tmp tmp_jg;
		while(rs.next()) {
			 tmp_jg=new Cls_e_tmp();
			  tmp_jg.setNum1(rs.getInt("n1"));
              tmp_jg.setD1(rs.getDouble("d1"));
              tmp_jg.setD2(rs.getDouble("d2"));
              tmp_jg.setD3(rs.getDouble("d3"));
		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}

		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_ddtj.tj_byorg() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_ddtj.tj_byorg()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_ddtj.tj_byorg()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_ddtj.tj_byorg()"+e.toString());
					}
			   conn =null;
						}
		}
	return rtnAL;
		}	
	public List<Cls_e_tmp> bx_stjb(String sql) throws Cls_exception {
	    ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;

	 try{	
		 Cls_connect cn = new Cls_connect();
     	 conn = cn.connect().getConnection();
     	StringBuffer sqlInsert = new StringBuffer();
     	sqlInsert.append("select city_code,count(*) as n1,sum(sum_price) as d1 from kcs_specbaoxian t where  order_type<>'3' and order_type<>'4' and order_type<>'7' ");
     	sqlInsert.append(sql);
		sqlInsert.append("   group by proc_orgcode  order by proc_orgcode");
     	pstmt=conn.prepareStatement(sqlInsert.toString());
    	rs=pstmt.executeQuery();
    	Cls_e_tmp tmp_jg;
		while(rs.next()) {
			 tmp_jg=new Cls_e_tmp();
			  tmp_jg.setNum1(rs.getInt("n1"));
              tmp_jg.setD1(rs.getDouble("d1"));
              tmp_jg.setS1(rs.getString("city_code"));
		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}

		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_ddtj.bx_stjb() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_ddtj.bx_stjb()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_ddtj.bx_stjb()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_ddtj.bx_stjb()"+e.toString());
					}
			   conn =null;
						}
		}
	return rtnAL;
		}		
	public List<Cls_e_tmp> bx_stjb(String sql,String citycode) throws Cls_exception {
	    ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;

	 try{	
		 Cls_connect cn = new Cls_connect();
     	 conn = cn.connect().getConnection();
     	StringBuffer sqlInsert = new StringBuffer();
     	sqlInsert.append("select city_code,count(*) as n1,sum(sum_price) as d1 from kcs_specbaoxian t where  order_type<>'3' and order_type<>'4' and order_type<>'7' ");
     	sqlInsert.append(sql);
		sqlInsert.append("   group by proc_orgcode  order by proc_orgcode");
     	pstmt=conn.prepareStatement(sqlInsert.toString());
    	rs=pstmt.executeQuery();

		while(rs.next()) {
			Cls_e_tmp tmp_jg=new Cls_e_tmp();
			  tmp_jg.setNum1(rs.getInt("n1"));
              tmp_jg.setD1(rs.getDouble("d1"));
              tmp_jg.setS1(rs.getString("city_code"));
		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}

		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_ddtj.bx_stjb() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_ddtj.bx_stjb()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_ddtj.bx_stjb()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_ddtj.bx_stjb()"+e.toString());
					}
			   conn =null;
						}
		}
	return rtnAL;
		}	
	public List<Cls_e_tmp> lb_byds(String sql) throws Cls_exception {
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
			java.sql.Connection conn=null;
			java.sql.PreparedStatement pstmt=null;
			java.sql.ResultSet rs=null;
		 try{	
			 Cls_connect cn = new Cls_connect();
	     	 conn = cn.connect().getConnection();
			 pstmt=conn.prepareStatement("select hyf_no,count(*) as n1,sum(sum_price) as d1, cphm as s1,sum(price) as d2,sum(yjf) as d3 from kcs_specddmx t where  order_type='1' and order_mark='1' "+sql+" group by cphm,hyf_no order by cphm");
			 rs=pstmt.executeQuery();

			while(rs.next()) {
			 Cls_e_tmp tmp_jg=new Cls_e_tmp();
			  tmp_jg.setNum2(rs.getInt("hyf_no"));
			  tmp_jg.setNum1(rs.getInt("n1"));
			  tmp_jg.setS1(rs.getString("s1"));
              tmp_jg.setD1(rs.getDouble("d1"));
              tmp_jg.setD2(rs.getDouble("d2"));
              tmp_jg.setD3(rs.getDouble("d3"));
			  rtnAL.add(tmp_jg);
		      tmp_jg=null;
						}
			 }
		  catch(Exception e){
				throw new Cls_exception("Cls_l_ddtj.lb_byds() "+e.toString());
		 }	
		finally{
			
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.lb_byds()"+e.toString());
						}
				     rs=null;  
							}
							if (pstmt!=null) {
				try{
								pstmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.lb_byds()"+e.toString());
						}
				     pstmt=null;
							}
							if (conn!=null){
				try{
								conn.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.lb_byds()"+e.toString());
						}
				   conn =null;
							}
			}
		return rtnAL;
			}	
	public List<Cls_e_tmp> lb_byds2(String sql) throws Cls_exception {
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
			java.sql.Connection conn=null;
			java.sql.PreparedStatement pstmt=null;
			java.sql.ResultSet rs=null;
		 try{	
			 Cls_connect cn = new Cls_connect();
	     	 conn = cn.connect().getConnection();
			 pstmt=conn.prepareStatement("select count(*) as n1,sum(sum_price) as d1, cphm as s1,sum(price) as d2,sum(yjf) as d3 from kcs_specddmx t where  order_type='1' and order_mark='1' "+sql+" group by cphm");
			 rs=pstmt.executeQuery();
			 Cls_e_tmp tmp_jg;
			while(rs.next()) {
			tmp_jg=new Cls_e_tmp();
			  tmp_jg.setNum1(rs.getInt("n1"));
			  tmp_jg.setS1(rs.getString("s1"));
              tmp_jg.setD1(rs.getDouble("d1"));
              tmp_jg.setD2(rs.getDouble("d2"));
              tmp_jg.setD3(rs.getDouble("d3"));
			  rtnAL.add(tmp_jg);
		      tmp_jg=null;
						}
			 }
		  catch(Exception e){
				throw new Cls_exception("Cls_l_ddtj.lb_byds2() "+e.toString());
		 }	
		finally{
			
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.lb_byds2()"+e.toString());
						}
				     rs=null;  
							}
							if (pstmt!=null) {
				try{
								pstmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.lb_byds2()"+e.toString());
						}
				     pstmt=null;
							}
							if (conn!=null){
				try{
								conn.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.lb_byds2()"+e.toString());
						}
				   conn =null;
							}
			}
		return rtnAL;
			}		
	public List<Cls_e_tmp> slb_byzj(String qx,String sql) throws Cls_exception {
	    ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;

	 try{	
		 Cls_connect cn = new Cls_connect();
     	conn = cn.connect().getConnection();
		 pstmt=conn.prepareStatement("select hyf_no,count(*) as n1,sum(sum_price) as d1, org_code as s1,sum(price) as d2,sum(yjf) as d3 from kcs_specddmx t where  order_type='1' and order_mark='1' and cphm='"+qx+"' "+sql+" group by org_code,hyf_no");
    	rs=pstmt.executeQuery();
    	Cls_e_tmp tmp_jg;
		while(rs.next()) {
			 tmp_jg=new Cls_e_tmp();
			  tmp_jg.setNum2(rs.getInt("hyf_no"));
			  tmp_jg.setNum1(rs.getInt("n1"));
			  tmp_jg.setS1(rs.getString("s1"));
              tmp_jg.setD1(rs.getDouble("d1"));
              tmp_jg.setD2(rs.getDouble("d2"));
              tmp_jg.setD3(rs.getDouble("d3"));
		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}

		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_ddtj.slb_byzj() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_ddtj.slb_byzj()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_ddtj.slb_byzj()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_ddtj.slb_byzj()"+e.toString());
					}
			   conn =null;
						}
		}
	return rtnAL;
		}
	public List<Cls_e_tmp> lb_byqx(String sql,String citycode) throws Cls_exception {
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
			java.sql.Connection conn=null;
			java.sql.PreparedStatement pstmt=null;
			java.sql.ResultSet rs=null;
			StringBuffer sqlInsert = new StringBuffer();
		 try{	
			 Cls_connect cn = new Cls_connect();
	     	 conn = cn.connect().getConnection();
	     	sqlInsert.append("select hyf_no,count(*) as n1,sum(sum_price) as d1, substr(org_code,3,2) as s1,sum(price) as d2,sum(yjf) as d3 ");
	     	sqlInsert.append(" from kcs_specddmx t where cphm='"+citycode+"' and  order_type='1' and order_mark='1' ");
	     	sqlInsert.append(sql+" group by substr(org_code,3,2),hyf_no order by substr(org_code,3,2)");
			 pstmt=conn.prepareStatement(sqlInsert.toString());
			 rs=pstmt.executeQuery();

			while(rs.next()) {
			 Cls_e_tmp tmp_jg=new Cls_e_tmp();
			  tmp_jg.setNum2(rs.getInt("hyf_no"));
			  tmp_jg.setNum1(rs.getInt("n1"));
			  tmp_jg.setS1(rs.getString("s1"));
              tmp_jg.setD1(rs.getDouble("d1"));
              tmp_jg.setD2(rs.getDouble("d2"));
              tmp_jg.setD3(rs.getDouble("d3"));
			  rtnAL.add(tmp_jg);
		      tmp_jg=null;
						}
			 }
		  catch(Exception e){
				throw new Cls_exception("Cls_l_ddtj.lb_byqx() "+e.toString());
		 }	
		finally{
			
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.lb_byqx()"+e.toString());
						}
				     rs=null;  
							}
							if (pstmt!=null) {
				try{
								pstmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.lb_byqx()"+e.toString());
						}
				     pstmt=null;
							}
							if (conn!=null){
				try{
								conn.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.lb_byqx()"+e.toString());
						}
				   conn =null;
							}
			}
		return rtnAL;
			}
	public List<Cls_e_tmp> lb_byqx2(String sql,String citycode) throws Cls_exception {
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
			java.sql.Connection conn=null;
			java.sql.PreparedStatement pstmt=null;
			java.sql.ResultSet rs=null;

		 try{	
			 Cls_connect cn = new Cls_connect();
	     	 conn = cn.connect().getConnection();
			 pstmt=conn.prepareStatement("select count(*) as n1,sum(sum_price) as d1, substr(org_code,3,2) as s1,sum(price) as d2,sum(yjf) as d3 from kcs_specddmx t where cphm='"+citycode+"' and  order_type='1' and order_mark='1' "+sql+" group by substr(org_code,3,2)");
			 rs=pstmt.executeQuery();

			while(rs.next()) {
			 Cls_e_tmp tmp_jg=new Cls_e_tmp();
			  tmp_jg.setNum1(rs.getInt("n1"));
			  tmp_jg.setS1(rs.getString("s1"));
              tmp_jg.setD1(rs.getDouble("d1"));
              tmp_jg.setD2(rs.getDouble("d2"));
              tmp_jg.setD3(rs.getDouble("d3"));
			  rtnAL.add(tmp_jg);
		      tmp_jg=null;
						}
			 }
		  catch(Exception e){
				throw new Cls_exception("Cls_l_ddtj.lb_byqx() "+e.toString());
		 }	
		finally{
			
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.lb_byqx()"+e.toString());
						}
				     rs=null;  
							}
							if (pstmt!=null) {
				try{
								pstmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.lb_byqx()"+e.toString());
						}
				     pstmt=null;
							}
							if (conn!=null){
				try{
								conn.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.lb_byqx()"+e.toString());
						}
				   conn =null;
							}
			}
		return rtnAL;
			}
}
