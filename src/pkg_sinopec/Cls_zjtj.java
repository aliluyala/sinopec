package pkg_sinopec;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class Cls_zjtj {
	/**
	 * 卡单资金统计
	 * @param sql
	 * @param city_code
	 * @return
	 * @throws Cls_exception
	 */
	public List<Cls_e_tmp> select_skdzjtj(String sql,String city_code) throws Cls_exception {
		StringBuffer sqlsele = new StringBuffer();
		sqlsele.append("select sum(sum_price) as je,count(*) as num from kcs_insurance_accident_ddmx ");
		sqlsele.append("where  order_mark=1 and  substr(oper_orgcode,1,2)=?");
		sqlsele.append(sql);
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		try{	
			Cls_connect cn = new Cls_connect();
			 conn = cn.connect().getConnection();
			pstmt=conn.prepareStatement(sqlsele.toString());
            pstmt.setString(1, city_code);
			rs=pstmt.executeQuery();

			Cls_e_tmp tmp_jg;
			while(rs.next()) {
			  tmp_jg=new Cls_e_tmp();
			  tmp_jg.setD1(rs.getDouble("je"));
			  tmp_jg.setNum1(rs.getInt("num"));
			  rtnAL.add(tmp_jg);
		      tmp_jg=null;
						}
			 }
		  catch(Exception e){
				throw new Cls_exception("Cls_l_ddtj.select_skdzjtj() "+e.toString());
		 }	
		finally{
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.select_skdzjtj()"+e.toString());
						}
				     rs=null;  
							}
							if (pstmt!=null) {
				try{
								pstmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.select_skdzjtj()"+e.toString());
						}
				     pstmt=null;
							}
							if (conn!=null){
				try{
								conn.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.select_skdzjtj()"+e.toString());
						}
				   conn =null;
							}			
			}
		return rtnAL;				
	}
	/**
	 * 保险资金统计
	 * @param sql
	 * @param city_code
	 * @return
	 * @throws Cls_exception
	 */
	public List<Cls_e_tmp> select_sbxzjtj(String sql,String city_code) throws Cls_exception {
		StringBuffer sqlsele = new StringBuffer();
		sqlsele.append("select sum(sum_price) as je,count(*) as num from kcs_specbaoxian ");
		sqlsele.append("where  order_mark=1 and  substr(oper_orgcode,1,2)=?");
		sqlsele.append(sql);
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		try{	
			Cls_connect cn = new Cls_connect();
			 conn = cn.connect().getConnection();
			pstmt=conn.prepareStatement(sqlsele.toString());
            pstmt.setString(1, city_code);
			rs=pstmt.executeQuery();

			Cls_e_tmp tmp_jg;
			while(rs.next()) {
			  tmp_jg=new Cls_e_tmp();
			  tmp_jg.setD1(rs.getDouble("je"));
			  tmp_jg.setNum1(rs.getInt("num"));
			  rtnAL.add(tmp_jg);
		      tmp_jg=null;
						}
			 }
		  catch(Exception e){
				throw new Cls_exception("Cls_l_ddtj.select_sbxzjtj() "+e.toString());
		 }	
		finally{
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.select_sbxzjtj()"+e.toString());
						}
				     rs=null;  
							}
							if (pstmt!=null) {
				try{
								pstmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.select_sbxzjtj()"+e.toString());
						}
				     pstmt=null;
							}
							if (conn!=null){
				try{
								conn.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.select_sbxzjtj()"+e.toString());
						}
				   conn =null;
							}			
			}
		return rtnAL;				
	}
	/**
	 * 违章代办资金统计
	 * @param sql
	 * @param city_code
	 * @return
	 * @throws Cls_exception
	 */
	public List<Cls_e_tmp> select_swzzjtj(String sql,String city_code) throws Cls_exception {
		StringBuffer sqlsele = new StringBuffer();
		sqlsele.append("select sum(sum_price) as je,count(*) as num from kcs_fkddmx ");
		sqlsele.append("where  order_mark=1 and  substr(oper_orgcode,1,2)=?");
		sqlsele.append(sql);
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		try{	
			Cls_connect cn = new Cls_connect();
			 conn = cn.connect().getConnection();
			pstmt=conn.prepareStatement(sqlsele.toString());
            pstmt.setString(1, city_code);
			rs=pstmt.executeQuery();

			Cls_e_tmp tmp_jg;
			while(rs.next()) {
			  tmp_jg=new Cls_e_tmp();
			  tmp_jg.setD1(rs.getDouble("je"));
			  tmp_jg.setNum1(rs.getInt("num"));
			  rtnAL.add(tmp_jg);
		      tmp_jg=null;
						}
			 }
		  catch(Exception e){
				throw new Cls_exception("Cls_l_ddtj.select_swzzjtj() "+e.toString());
		 }	
		finally{
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.select_swzzjtj()"+e.toString());
						}
				     rs=null;  
							}
							if (pstmt!=null) {
				try{
								pstmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.select_swzzjtj()"+e.toString());
						}
				     pstmt=null;
							}
							if (conn!=null){
				try{
								conn.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_ddtj.select_swzzjtj()"+e.toString());
						}
				   conn =null;
							}			
			}
		return rtnAL;				
	}
	/**
	 * 查询所有城市名称代码
	 * @return
	 */
	public List<Cls_e_tmp> GetCitydm() throws Cls_exception{
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
	 try{	
		 Cls_connect80 cn = new Cls_connect80();
		 conn = cn.connect().getConnection();
		 pstmt=conn.prepareStatement("select city_no,para_value from esseapp.kcs_para t where coun_no=00  order by city_no");
		 rs=pstmt.executeQuery();
	     Cls_e_tmp v_tmp;
		while(rs.next()) {
			v_tmp=new Cls_e_tmp();
			v_tmp.setS1(rs.getString("city_no"));
			v_tmp.setS2(rs.getString("para_value"));
			rtnAL.add(v_tmp);
			v_tmp=null;
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_zd.GetCitydm() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetCitydm()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetCitydm()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetCitydm()"+e.toString());
					}
			   conn =null;
						}
		}
	return rtnAL;
	}	

}
