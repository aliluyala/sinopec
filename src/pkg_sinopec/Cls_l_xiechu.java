/**
 * 
 */
package pkg_sinopec;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class Cls_l_xiechu {
	public List<Cls_e_xiechu> select_byorgcode(String orgcode) throws Cls_exception {
	    ArrayList<Cls_e_xiechu> rtnAL = new ArrayList<Cls_e_xiechu>();
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;

	 try{	
		Cls_connect cn = new Cls_connect();
	    conn = cn.connect().getConnection();
		pstmt=conn.prepareStatement("select to_char(time,'yyyy-mm-dd hh24:mi:ss') as stime,t.* from kcs_specxiechu t where org_code=? and mark=1 order by serial_no");
		pstmt.setString(1, orgcode);
		rs=pstmt.executeQuery();

		Cls_e_xiechu tmp_jg;
		while(rs.next()) {
		  tmp_jg=new Cls_e_xiechu();
		  tmp_jg.setSerial_no(rs.getInt("serial_no"));
		  tmp_jg.setOpercode(rs.getString("opercode"));
		  tmp_jg.setKhrq(rs.getString("khrq"));
		  tmp_jg.setName(rs.getString("name"));
		  tmp_jg.setJe(rs.getDouble("je"));
		  tmp_jg.setCode(rs.getString("code"));
		  tmp_jg.setQixian(rs.getString("qixian"));
		  tmp_jg.setKhzhj(rs.getString("khzhj"));
		  tmp_jg.setStime(rs.getString("stime"));
		  
		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_xiechu.select_byorgcode() "+e.toString());
	 }	
	finally{
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_xiechu.select_byorgcode() "+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_xiechu.select_byorgcode() "+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_xiechu.select_byorgcode() "+e.toString());
					}
			   conn =null;
						}
		}
	return rtnAL;
		}
	public List<Cls_e_xiechu> select_byid(int id) throws Cls_exception {
	    ArrayList<Cls_e_xiechu> rtnAL = new ArrayList<Cls_e_xiechu>();
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;

	 try{	
		Cls_connect cn = new Cls_connect();
	    conn = cn.connect().getConnection();
		pstmt=conn.prepareStatement("select to_char(time,'yyyy-mm-dd hh24:mi:ss') as stime,t.* from kcs_specxiechu t  where serial_no=?");
		pstmt.setInt(1, id);
		rs=pstmt.executeQuery();

		Cls_e_xiechu tmp_jg;
		while(rs.next()) {
		  tmp_jg=new Cls_e_xiechu();
		  tmp_jg.setOrg_code(rs.getString("org_code"));
		  tmp_jg.setOpercode(rs.getString("opercode"));
		  tmp_jg.setKhrq(rs.getString("khrq"));
		  tmp_jg.setName(rs.getString("name"));
		  tmp_jg.setJe(rs.getDouble("je"));
		  tmp_jg.setCode(rs.getString("code"));
		  tmp_jg.setQixian(rs.getString("qixian"));
		  tmp_jg.setKhzhj(rs.getString("khzhj"));
		  tmp_jg.setStime(rs.getString("stime"));
		  tmp_jg.setMark(rs.getInt("mark"));
		  
		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_xiechu.select_byserial_no() "+e.toString());
	 }	
	finally{
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_xiechu.select_byserial_no()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_xiechu.select_byserial_no()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_xiechu.select_byserial_no()"+e.toString());
					}
			   conn =null;
						}
		}
	return rtnAL;
		}
	public List<Cls_e_xiechu> select_bypage(String tsql, int p, int ev) throws Cls_exception {
	    
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		ArrayList<Cls_e_xiechu> rtnAL = new ArrayList<Cls_e_xiechu>();
	 try{	
			Cls_connect cn = new Cls_connect();
	    	conn = cn.connect().getConnection();
		pstmt=conn.prepareStatement("select * from (select my_table.*,rownum as my_rownum from ("+tsql+ ") my_table where rownum<"+ev+") where my_rownum>="+p);
		rs=pstmt.executeQuery();

		Cls_e_xiechu tmp_jg;
		
		while(rs.next()) {
		  tmp_jg=new Cls_e_xiechu();
		  tmp_jg.setSerial_no(rs.getInt("serial_no"));
		  tmp_jg.setOrg_code(rs.getString("org_code"));
		  tmp_jg.setOpercode(rs.getString("opercode"));
		  tmp_jg.setKhrq(rs.getString("khrq"));
		  tmp_jg.setName(rs.getString("name"));
		  tmp_jg.setJe(rs.getDouble("je"));
		  tmp_jg.setCode(rs.getString("code"));
		  tmp_jg.setQixian(rs.getString("qixian"));
		  tmp_jg.setKhzhj(rs.getString("khzhj"));
		  tmp_jg.setStime(rs.getString("stime"));
		  tmp_jg.setMark(rs.getInt("mark"));
		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}		 
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_xiechu.select_bypage() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_xiechu.select_bypage()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_xiechu.select_bypage()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_xiechu.select_bypage()"+e.toString());
					}
			   conn =null;
						}
			
		}
	return rtnAL;
		}
	public List<Cls_e_xiechu> select_bytj(String sql) throws Cls_exception {
	    ArrayList<Cls_e_xiechu> rtnAL = new ArrayList<Cls_e_xiechu>();
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;

	 try{	
		Cls_connect cn = new Cls_connect();
	    conn = cn.connect().getConnection();
		pstmt=conn.prepareStatement(sql);
		rs=pstmt.executeQuery();

		Cls_e_xiechu tmp_jg;
		while(rs.next()) {
		  tmp_jg=new Cls_e_xiechu();
		  tmp_jg.setOrg_code(rs.getString("org_code"));
		  tmp_jg.setOpercode(rs.getString("opercode"));
		  tmp_jg.setKhrq(rs.getString("khrq"));
		  tmp_jg.setName(rs.getString("name"));
		  tmp_jg.setJe(rs.getDouble("je"));
		  tmp_jg.setCode(rs.getString("code"));
		  tmp_jg.setQixian(rs.getString("qixian"));
		  tmp_jg.setKhzhj(rs.getString("khzhj"));
		  tmp_jg.setStime(rs.getString("stime"));
		  tmp_jg.setMark(rs.getInt("mark"));
		  
		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_xiechu.select_bytj() "+e.toString());
	 }	
	finally{
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_xiechu.select_bytj()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_xiechu.select_bytj()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_xiechu.select_bytj()"+e.toString());
					}
			   conn =null;
						}
		}
	return rtnAL;
		}
	public List<Cls_e_xiechu> hsbc_byorgcode(String orgcode,String sql) throws Cls_exception {
	    ArrayList<Cls_e_xiechu> rtnAL = new ArrayList<Cls_e_xiechu>();
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;

	 try{	
		Cls_connect cn = new Cls_connect();
	    conn = cn.connect().getConnection();
		pstmt=conn.prepareStatement("select to_char(time,'yyyy-mm-dd hh24:mi:ss') as stime,t.* from kcs_spechsbc t where org_code=? and mark>0 "+sql+"order by serial_no");
		pstmt.setString(1, orgcode);
		rs=pstmt.executeQuery();

		Cls_e_xiechu tmp_jg;
		while(rs.next()) {
		  tmp_jg=new Cls_e_xiechu();
		  tmp_jg.setSerial_no(rs.getInt("serial_no"));
		  tmp_jg.setOpercode(rs.getString("opercode"));
		  tmp_jg.setKhrq(rs.getString("sqrq"));
		  tmp_jg.setName(rs.getString("name"));
		  tmp_jg.setCode(rs.getString("sfzid"));
		  tmp_jg.setKhzhj(rs.getString("tel"));
		  tmp_jg.setStime(rs.getString("stime"));
		  tmp_jg.setMark(rs.getInt("mark"));
		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_xiechu.hsbc_byorgcode() "+e.toString());
	 }	
	finally{
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_xiechu.hsbc_byorgcode() "+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_xiechu.hsbc_byorgcode() "+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_xiechu.hsbc_byorgcode() "+e.toString());
					}
			   conn =null;
						}
		}
	return rtnAL;
		}
	public List<Cls_e_xiechu> hsbc_bytj(String sql) throws Cls_exception {
	    ArrayList<Cls_e_xiechu> rtnAL = new ArrayList<Cls_e_xiechu>();
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;

	 try{	
		Cls_connect cn = new Cls_connect();
	    conn = cn.connect().getConnection();
		pstmt=conn.prepareStatement(sql);
		rs=pstmt.executeQuery();

		Cls_e_xiechu tmp_jg;
		while(rs.next()) {
		  tmp_jg=new Cls_e_xiechu();
		  tmp_jg.setSerial_no(rs.getInt("serial_no"));
		  tmp_jg.setOrg_code(rs.getString("org_code"));
		  tmp_jg.setOpercode(rs.getString("opercode"));
		  tmp_jg.setKhrq(rs.getString("sqrq"));
		  tmp_jg.setName(rs.getString("name"));
		  tmp_jg.setCode(rs.getString("sfzid"));
		  tmp_jg.setKhzhj(rs.getString("tel"));
		  tmp_jg.setStime(rs.getString("stime"));
		  tmp_jg.setMark(rs.getInt("mark"));
		  tmp_jg.setQixian(rs.getString("citycode"));
		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_xiechu.hsbc_bytj() "+e.toString());
	 }	
	finally{
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_xiechu.hsbc_bytj() "+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_xiechu.hsbc_bytj() "+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_xiechu.hsbc_bytj() "+e.toString());
					}
			   conn =null;
						}
		}
	return rtnAL;
		}
	public List<Cls_e_xiechu> hsbc_bypage(String tsql, int p, int ev) throws Cls_exception {
	    
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		ArrayList<Cls_e_xiechu> rtnAL = new ArrayList<Cls_e_xiechu>();
	 try{	
			Cls_connect cn = new Cls_connect();
	    	conn = cn.connect().getConnection();
		pstmt=conn.prepareStatement("select * from (select my_table.*,rownum as my_rownum from ("+tsql+ ") my_table where rownum<"+ev+") where my_rownum>="+p);
		rs=pstmt.executeQuery();

		Cls_e_xiechu tmp_jg;
		
		while(rs.next()) {
		  tmp_jg=new Cls_e_xiechu();
		  tmp_jg.setSerial_no(rs.getInt("serial_no"));
		  tmp_jg.setOpercode(rs.getString("opercode"));
		  tmp_jg.setKhrq(rs.getString("sqrq"));
		  tmp_jg.setName(rs.getString("name"));
		  tmp_jg.setCode(rs.getString("sfzid"));
		  tmp_jg.setKhzhj(rs.getString("tel"));
		  tmp_jg.setStime(rs.getString("stime"));
		  tmp_jg.setOrg_code(rs.getString("org_code"));
		  tmp_jg.setQixian(rs.getString("citycode"));
		  tmp_jg.setMark(rs.getInt("mark"));
		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}		 
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_xiechu.hsbc_bypage() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_xiechu.hsbc_bypage()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_xiechu.hsbc_bypage()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_xiechu.hsbc_bypage()"+e.toString());
					}
			   conn =null;
						}
			
		}
	return rtnAL;
		}	
	public List<Cls_e_tmp> hsbc_byds(String sql) throws Cls_exception {
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
			java.sql.Connection conn=null;
			java.sql.PreparedStatement pstmt=null;
			java.sql.ResultSet rs=null;
		 try{	
			 Cls_connect cn = new Cls_connect();
	     	 conn = cn.connect().getConnection();
			 pstmt=conn.prepareStatement("select count(*) as n1, citycode as s1,sum(case when mark=2 then 1 else 0 end) as n2 from kcs_spechsbc t where  mark>0  "+sql+" group by citycode");
			 rs=pstmt.executeQuery();

			while(rs.next()) {
			 Cls_e_tmp tmp_jg=new Cls_e_tmp();
			  tmp_jg.setNum1(rs.getInt("n1"));
			  tmp_jg.setS1(rs.getString("s1"));
			  tmp_jg.setNum2(rs.getInt("n2"));
			  rtnAL.add(tmp_jg);
		      tmp_jg=null;
						}
			 }
		  catch(Exception e){
				throw new Cls_exception("Cls_l_ddtj.hsbc_byds() "+e.toString());
		 }	
		finally{
			
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.hsbc_byds()"+e.toString());
						}
				     rs=null;  
							}
							if (pstmt!=null) {
				try{
								pstmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.hsbc_byds()"+e.toString());
						}
				     pstmt=null;
							}
							if (conn!=null){
				try{
								conn.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.hsbc_byds()"+e.toString());
						}
				   conn =null;
							}
			}
		return rtnAL;
			}	
}
