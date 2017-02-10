package pkg_sinopec;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class Cls_l_hyf {
	public List<Cls_e_hyf> select_bycitycode(String citycode) throws Cls_exception {
	    ArrayList<Cls_e_hyf> rtnAL = new ArrayList<Cls_e_hyf>();
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;

	 try{	
		Cls_connect cn = new Cls_connect();
	    conn = cn.connect().getConnection();
		pstmt=conn.prepareStatement("select * from kcs_spec where city_code=? and mark=1  order by serial_no");
		pstmt.setString(1, citycode);
		rs=pstmt.executeQuery();

		Cls_e_hyf tmp_jg;
		while(rs.next()) {
		  tmp_jg=new Cls_e_hyf();
		  tmp_jg.setSerial_no(rs.getInt("serial_no"));
		  tmp_jg.setCity_code(rs.getString("city_code"));
		  tmp_jg.setCoun_code(rs.getString("coun_code"));
		  tmp_jg.setChpin(rs.getString("chpin"));
		  tmp_jg.setHyf(rs.getDouble("hyf"));
		  tmp_jg.setMsh(rs.getString("msh"));
		  tmp_jg.setMark(rs.getInt("mark"));
		  tmp_jg.setYw_type(rs.getInt("yw_type"));
		  
		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_hyf.select_bycitycode() "+e.toString());
	 }	
	finally{
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_hyf.select_bycitycode()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_hyf.select_bycitycode()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_hyf.select_bycitycode()"+e.toString());
					}
			   conn =null;
						}
		}
	return rtnAL;
		}
	public List<Cls_e_hyf> select_bysno(int serial_no) throws Cls_exception {
	    ArrayList<Cls_e_hyf> rtnAL = new ArrayList<Cls_e_hyf>();
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;

	 try{	
		Cls_connect cn = new Cls_connect();
	    conn = cn.connect().getConnection();
		pstmt=conn.prepareStatement("select * from kcs_spec where serial_no=?");
		pstmt.setInt(1, serial_no);
		rs=pstmt.executeQuery();

		Cls_e_hyf tmp_jg;
		while(rs.next()) {
		  tmp_jg=new Cls_e_hyf();
		  tmp_jg.setSerial_no(rs.getInt("serial_no"));
		  tmp_jg.setCity_code(rs.getString("city_code"));
		  tmp_jg.setCoun_code(rs.getString("coun_code"));
		  tmp_jg.setChpin(rs.getString("chpin"));
		  tmp_jg.setHyf(rs.getDouble("hyf"));
		  tmp_jg.setMsh(rs.getString("msh"));
		  tmp_jg.setMark(rs.getInt("mark"));
		  tmp_jg.setYw_type(rs.getInt("yw_type"));
		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_hyf.select_bysno() "+e.toString());
	 }	
	finally{
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_hyf.select_bysno()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_hyf.select_bysno()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_hyf.select_bysno()"+e.toString());
					}
			   conn =null;
						}
		}
	return rtnAL;
		}



}
