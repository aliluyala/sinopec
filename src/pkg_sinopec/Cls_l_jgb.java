package pkg_sinopec;

import java.util.ArrayList;
import java.util.List;

/**
 * 此处插入类型说明。
 * 创建日期：(2011-5-20 16:34:23)
 * @author：Administrator
 */
public class Cls_l_jgb {
/**
 * 此处插入方法说明。
 * 创建日期：(2011-5-20 16:37:04)
 * @return boolean
 * @param tj java.lang.String
 * @exception pkg_dpiao.Cls_exception 异常说明。
 */
public List<Cls_e_jgb> select_sjb_bytj(String org_code) throws Cls_exception {
	ArrayList<Cls_e_jgb> rtnAL = new ArrayList<Cls_e_jgb>();
	java.sql.Connection conn=null;
	java.sql.PreparedStatement pstmt=null;
	java.sql.ResultSet rs=null;

 try{	
	Cls_connect80 cn = new Cls_connect80();
    conn = cn.connect().getConnection();
	pstmt=conn.prepareStatement("select orgname as oper_orgname,org_code as oper_orgcode,org_tel,org_addr,city_org as city_code,coun_org as coun_code from esseapp.KCS_ORG_INFO where org_code=? and org_level<>'3' and org_flag='0' ");
	pstmt.setString(1, org_code);
	rs=pstmt.executeQuery();

	Cls_e_jgb tmp_jg;
	while(rs.next()) {
	  tmp_jg=new Cls_e_jgb();
	  tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
	  tmp_jg.setOper_orgname(rs.getString("oper_orgname"));
	  tmp_jg.setOrg_tel(rs.getString("org_tel"));
	  tmp_jg.setOrg_addr(rs.getString("org_addr"));
	  tmp_jg.setCity_code(rs.getString("city_code"));
	  tmp_jg.setCoun_code(rs.getString("coun_code"));

	  rtnAL.add(tmp_jg);
      tmp_jg=null;
				}
       }
  catch(Exception e){
		throw new Cls_exception("Cls_l_jgb.select_sjb_bytj() "+e.toString());
 }	
finally{
	if (rs!=null){
		try{
			rs.close();}
		catch(Exception e){
					 throw new Cls_exception("Cls_l_jgb.select_sjb_bytj()"+e.toString());
				}
		     rs=null;  
					}
					if (pstmt!=null) {
		try{
						pstmt.close();}
		catch(Exception e){
					 throw new Cls_exception("Cls_l_jgb.select_sjb_bytj()"+e.toString());
				}
		     pstmt=null;
					}
					if (conn!=null){
		try{
						conn.close();
		}catch(Exception e){
					 throw new Cls_exception("Cls_l_jgb.select_sjb_bytj()"+e.toString());
				}
		   conn =null;
					}
	}
      return rtnAL;
	}
public List<Cls_e_jgb> select_byorgcode(String org_code) throws Cls_exception {
	    ArrayList<Cls_e_jgb> rtnAL = new ArrayList<Cls_e_jgb>();
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;

	 try{	
		Cls_connect cn = new Cls_connect();
	    conn = cn.connect().getConnection();
		pstmt=conn.prepareStatement("select * from kcs_speccljg where oper_orgcode=?");
		pstmt.setString(1, org_code);
		rs=pstmt.executeQuery();

		Cls_e_jgb tmp_jg;
		while(rs.next()) {
		  tmp_jg=new Cls_e_jgb();
		  tmp_jg.setSerial_no(rs.getInt("serial_no"));
		  tmp_jg.setCity_code(rs.getString("city_code"));
		  tmp_jg.setCoun_code(rs.getString("coun_code"));
		  tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
		  tmp_jg.setOper_orgname(rs.getString("oper_orgname"));
		  tmp_jg.setOrg_tel(rs.getString("org_tel"));
		  tmp_jg.setOrg_addr(rs.getString("org_addr"));
		  tmp_jg.setQq_number(rs.getString("qq_number"));
		  tmp_jg.setWork_time(rs.getString("work_time"));
		  tmp_jg.setPer_fee(rs.getDouble("per_fee"));
		  tmp_jg.setDeli_mode(rs.getString("deli_mode"));
		  
		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_jgb.select_byorgcode() "+e.toString());
	 }	
	finally{
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_jgb.select_byorgcode()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_jgb.select_byorgcode()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_jgb.select_byorgcode()"+e.toString());
					}
			   conn =null;
						}
		}
	return rtnAL;
		}
public List<Cls_e_jgb> select_bycitycode(String citycode) throws Cls_exception {
    ArrayList<Cls_e_jgb> rtnAL = new ArrayList<Cls_e_jgb>();
	java.sql.Connection conn=null;
	java.sql.PreparedStatement pstmt=null;
	java.sql.ResultSet rs=null;

 try{	
	Cls_connect cn = new Cls_connect();
    conn = cn.connect().getConnection();
	pstmt=conn.prepareStatement("select * from kcs_speccljg where city_code=? order by coun_code");
	pstmt.setString(1, citycode);
	rs=pstmt.executeQuery();

	Cls_e_jgb tmp_jg;
	while(rs.next()) {
	  tmp_jg=new Cls_e_jgb();
	  tmp_jg.setSerial_no(rs.getInt("serial_no"));
	  tmp_jg.setCity_code(rs.getString("city_code"));
	  tmp_jg.setCoun_code(rs.getString("coun_code"));
	  tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
	  tmp_jg.setOper_orgname(rs.getString("oper_orgname"));
	  tmp_jg.setOrg_tel(rs.getString("org_tel"));
	  tmp_jg.setOrg_addr(rs.getString("org_addr"));
	  tmp_jg.setQq_number(rs.getString("qq_number"));
	  tmp_jg.setWork_time(rs.getString("work_time"));
	  tmp_jg.setPer_fee(rs.getDouble("per_fee"));
	  tmp_jg.setDeli_mode(rs.getString("deli_mode"));
	  
	  rtnAL.add(tmp_jg);
      tmp_jg=null;
				}
	 }
  catch(Exception e){
		throw new Cls_exception("Cls_l_jgb.select_bycitycode() "+e.toString());
 }	
finally{
	if (rs!=null){
		try{
			rs.close();}
		catch(Exception e){
					 throw new Cls_exception("Cls_l_jgb.select_bycitycode()"+e.toString());
				}
		     rs=null;  
					}
					if (pstmt!=null) {
		try{
						pstmt.close();}
		catch(Exception e){
					 throw new Cls_exception("Cls_l_jgb.select_bycitycode()"+e.toString());
				}
		     pstmt=null;
					}
					if (conn!=null){
		try{
						conn.close();
		}catch(Exception e){
					 throw new Cls_exception("Cls_l_jgb.select_bycitycode()"+e.toString());
				}
		   conn =null;
					}
	}
return rtnAL;
	}
	/**
	 * 此处插入方法说明。
	 * 创建日期：(2011-5-20 16:37:04)
	 * @return boolean
	 * @param tj java.lang.String
	 * @exception pkg_dpiao.Cls_exception 异常说明。
	 */
public List<Cls_e_jgb> select_bytj(String tj) throws Cls_exception {
		ArrayList<Cls_e_jgb> rtnAL = new ArrayList<Cls_e_jgb>();
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;

	 try{	
		Cls_connect cn = new Cls_connect();
	    conn = cn.connect().getConnection();
		pstmt=conn.prepareStatement(tj);
		rs=pstmt.executeQuery();

		Cls_e_jgb tmp_jg;
		while(rs.next()) {
		  tmp_jg=new Cls_e_jgb();
		  tmp_jg.setSerial_no(rs.getInt("serial_no"));
		  tmp_jg.setCity_code(rs.getString("city_code"));
		  tmp_jg.setCoun_code(rs.getString("coun_code"));
		  tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
		  tmp_jg.setOper_orgname(rs.getString("oper_orgname"));
		  tmp_jg.setOrg_tel(rs.getString("org_tel"));
		  tmp_jg.setOrg_addr(rs.getString("org_addr"));
		  tmp_jg.setQq_number(rs.getString("qq_number"));
		  tmp_jg.setWork_time(rs.getString("work_time"));
		  tmp_jg.setPer_fee(rs.getDouble("per_fee"));
		  tmp_jg.setDeli_mode(rs.getString("deli_mode"));

		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
	    	}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_jgb.select_bytj() "+e.toString());
	 }	
	finally{
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_jgb.select_bytj()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_jgb.select_bytj()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_jgb.select_bytj()"+e.toString());
					}
			   conn =null;
						}
			
		}
	return rtnAL;
		}
}
