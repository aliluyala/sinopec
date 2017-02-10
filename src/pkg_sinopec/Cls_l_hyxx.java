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
public class Cls_l_hyxx {
	public List<Cls_e_bx> select_bytj(String tsql) throws Cls_exception {
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		ArrayList<Cls_e_bx> rtnAL = new ArrayList<Cls_e_bx>();
		StringBuffer sqlInsert = new StringBuffer();
	 try{	
		Cls_connect cn = new Cls_connect();
	    conn = cn.connect().getConnection();
	    sqlInsert.append("select to_char(proce_time,'yyyy-mm-dd hh24:mi:ss') as sproce_time,to_char(add_months(to_date(bxrq,'yyyy-mm-dd'),12),'yyyy-mm-dd') as dqrq,");
	    sqlInsert.append("name,tele_no,cphm,chllx,cjhm,sfzid");
		sqlInsert.append(" from  kcs_specbaoxian t where  order_type=6 and length(bxrq)=10 "+tsql+" order by id");
	    pstmt=conn.prepareStatement(sqlInsert.toString());
		rs=pstmt.executeQuery();
		Cls_e_bx tmp_jg;
		while(rs.next()) {
		  tmp_jg=new Cls_e_bx();
          tmp_jg.setName(rs.getString("name"));	
          tmp_jg.setTele_no(rs.getString("tele_no"));
          tmp_jg.setCphm(rs.getString("cphm"));
          tmp_jg.setChllx(rs.getInt("chllx"));
          tmp_jg.setSproce_time(rs.getString("sproce_time"));
          tmp_jg.setBxrq(rs.getString("dqrq"));
          tmp_jg.setCjhm(rs.getString("cjhm"));
          tmp_jg.setSfzid(rs.getString("sfzid"));
		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}		 
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_hyxx.select_bytj() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_hyxx.select_bytj()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_hyxx.select_bytj()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_hyxx.select_bytj()"+e.toString());
					}
			   conn =null;
						}
			
		}
	return rtnAL;
		}		
}
