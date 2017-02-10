package pkg_sinopec;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Administrator
 *
 */
public class Bxkh {
	public  List<BxKhxx>  select_bypage(String tsql, int p, int ev) throws Cls_exception {
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		ArrayList<BxKhxx> rtnAL = new ArrayList<BxKhxx>();
		StringBuffer sqlInsert = new StringBuffer();
	 try{	
		 Cls_connect cn = new Cls_connect();
		 conn = cn.connect().getConnection();
	 	sqlInsert.append("SELECT to_char(bxrq,'yyyy-mm-dd') as sbxrq,serial_no,name,tel,tbgs,cphm,org_code,citycode");
	 	sqlInsert.append("   FROM kcs_specbxkh t");
	 	sqlInsert.append(" WHERE ROWID IN (");
	 	sqlInsert.append(" SELECT rid FROM (");
	 	sqlInsert.append(" SELECT rid, ROWNUM AS rn FROM (");
	 	sqlInsert.append(" SELECT ROWID rid FROM kcs_specbxkh");
	 	sqlInsert.append(" where mark=1 "+tsql);
	 	sqlInsert.append(" ORDER BY serial_no desc");
	 	sqlInsert.append(" ) t1 WHERE  ROWNUM<"+ev);
	 	sqlInsert.append(" ) t2 WHERE  rn>="+p);
	 	sqlInsert.append(" ) ORDER BY serial_no desc");
	 	pstmt=conn.prepareStatement(sqlInsert.toString());
		rs=pstmt.executeQuery();
		BxKhxx tmp_jg;
		while(rs.next()) {
		  tmp_jg=new BxKhxx();
		  tmp_jg.setSerial_no(rs.getInt("serial_no"));
		  tmp_jg.setOrg_code(rs.getString("org_code"));
		  tmp_jg.setTel(rs.getString("tel"));
		  tmp_jg.setName(rs.getString("name"));
		  tmp_jg.setSbxrq(rs.getString("sbxrq"));
		  tmp_jg.setTbgs(rs.getString("tbgs"));
		  tmp_jg.setCphm(rs.getString("cphm"));
		  tmp_jg.setCitycode(rs.getString("citycode"));

	      rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("BxKh.select_bypage() "+e.toString());
	 }	
	finally{
			
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("BxKh.select_bypage()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("BxKh.select_bypage()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("BxKh.select_bypage()"+e.toString());
					}
			   conn =null;
						}		
		}
	return rtnAL;
	}
	public  List<BxKhxx>  select_bytj(String sql) throws Cls_exception {
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		ArrayList<BxKhxx> rtnAL = new ArrayList<BxKhxx>();
		StringBuffer sqlInsert = new StringBuffer();
	 try{	
		 Cls_connect cn = new Cls_connect();
		 conn = cn.connect().getConnection();
	 	sqlInsert.append("SELECT to_char(bxrq,'yyyy-mm-dd') as sbxrq,t.* ");
	 	sqlInsert.append("   FROM kcs_specbxkh t");
	 	sqlInsert.append(" where mark=1 "+sql);
	 	sqlInsert.append(" ORDER BY serial_no ");
	 	pstmt=conn.prepareStatement(sqlInsert.toString());
		rs=pstmt.executeQuery();
		BxKhxx tmp_jg;
		while(rs.next()) {
		  tmp_jg=new BxKhxx();
		  tmp_jg.setSerial_no(rs.getInt("serial_no"));
		  tmp_jg.setOrg_code(rs.getString("org_code"));
		  tmp_jg.setTel(rs.getString("tel"));
		  tmp_jg.setName(rs.getString("name"));
		  tmp_jg.setSbxrq(rs.getString("sbxrq"));
		  tmp_jg.setTbgs(rs.getString("tbgs"));
		  tmp_jg.setCphm(rs.getString("cphm"));
		  tmp_jg.setCitycode(rs.getString("citycode"));
		  tmp_jg.setC_dw(rs.getString("c_dw"));
		  tmp_jg.setC_xm(rs.getString("c_xm"));
		  tmp_jg.setC_tel(rs.getString("c_tel"));
		  tmp_jg.setSour(rs.getInt("sour"));
	      rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("BxKh.select_bytj() "+e.toString());
	 }	
	finally{
			
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("BxKh.select_bytj()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("BxKh.select_bytj()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("BxKh.select_bytj()"+e.toString());
					}
			   conn =null;
						}		
		}
	return rtnAL;
	}
}
