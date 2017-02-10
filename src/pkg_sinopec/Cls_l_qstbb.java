/**
 * 
 */
package pkg_sinopec;

import org.apache.log4j.Logger;

/**
 * @author Administrator
 *
 */
public class Cls_l_qstbb {
	private static Logger log = Logger.getLogger(Cls_l_qstbb.class);
	public  Cls_e_tmp getDayTj(String citycode,String qrq,String zrq) throws Cls_exception{
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		Cls_e_tmp rtn = new Cls_e_tmp();
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("select count(*) as n1,sum(f_sunshi+f_3zhe+f_daoq+f_siji+f_chke+f_ziran+f_hhen+f_boli+f_bjm+f_jq+f_3)/10000 as d1, ");
		sqlInsert.append(" sum(f_sunshi+f_3zhe+f_daoq+f_siji+f_chke+f_ziran+f_hhen+f_boli+f_bjm+f_jq+f_3)/count(*) as d2");
		sqlInsert.append("  from kcs_specbaoxian t where to_char(proce_time,'yyyy-mm-dd')>='"+qrq);
		sqlInsert.append("' and to_char(proce_time,'yyyy-mm-dd')<='"+zrq+"' and order_type='6' ");
		if (!"00".equals(citycode))
			sqlInsert.append(" and city_code='"+citycode+"'");
		 try{	
			 Cls_connect cn = new Cls_connect();
		 	 conn = cn.connect().getConnection();
			 pstmt=conn.prepareStatement(sqlInsert.toString());
			 rs=pstmt.executeQuery();
			while(rs.next()) {
				rtn.setNum1(rs.getInt("n1"));
				rtn.setD1(rs.getDouble("d1"));
				rtn.setD2(rs.getDouble("d2"));
						}
			 }
		  catch(Exception e){
			  log.error("Cls_l_qstbb:"+e.toString());
				throw new Cls_exception(" DownExcelTb.getDayTj() "+e.toString());
		 }	
		finally{
			
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception(" DownExcelTb.getDayTj()"+e.toString());
						}
				     rs=null;  
							}
							if (pstmt!=null) {
				try{
								pstmt.close();}
				catch(Exception e){
							 throw new Cls_exception(" DownExcelTb.getDayTj()"+e.toString());
						}
				     pstmt=null;
							}
							if (conn!=null){
				try{
								conn.close();
				}catch(Exception e){
							 throw new Cls_exception(" DownExcelTb.getDayTj()"+e.toString());
						}
				   conn =null;
							}
			}
		return rtn;
		
	}
	public  Cls_e_tmp getMonTj(String citycode,String rq) throws Cls_exception{
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		Cls_e_tmp rtn = new Cls_e_tmp();
		String mon = rq.substring(0, rq.indexOf("-", 5));
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("select count(*) as n1,sum(f_sunshi+f_3zhe+f_daoq+f_siji+f_chke+f_ziran+f_hhen+f_boli+f_bjm+f_jq+f_3)/10000 as d1 ");
		sqlInsert.append("  from kcs_specbaoxian t where to_char(proce_time,'yyyy-mm')='"+mon);
		sqlInsert.append("' and order_type='6' and to_char(proce_time,'yyyy-mm-dd')<='"+rq+"'");
		if (!"00".equals(citycode))
			sqlInsert.append(" and city_code='"+citycode+"'");
		 try{	
			 Cls_connect cn = new Cls_connect();
		 	 conn = cn.connect().getConnection();
			 pstmt=conn.prepareStatement(sqlInsert.toString());
			 rs=pstmt.executeQuery();
			while(rs.next()) {
				rtn.setNum1(rs.getInt("n1"));
				rtn.setD1(rs.getDouble("d1"));
						}
			 }
		  catch(Exception e){
			  log.error("Cls_l_qstbb:"+e.toString());
				throw new Cls_exception(" DownExcelTb.getMonTj() "+e.toString());
		 }	
		finally{
			
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception(" DownExcelTb.getMonTj() "+e.toString());
						}
				     rs=null;  
							}
							if (pstmt!=null) {
				try{
								pstmt.close();}
				catch(Exception e){
							 throw new Cls_exception(" DownExcelTb.getMonTj() "+e.toString());
						}
				     pstmt=null;
							}
							if (conn!=null){
				try{
								conn.close();
				}catch(Exception e){
							 throw new Cls_exception(" DownExcelTb.getMonTj() "+e.toString());
						}
				   conn =null;
							}
			}
		return rtn;		
	}
	public  Cls_e_tmp getYearTj(String citycode,String rq) throws Cls_exception{
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		Cls_e_tmp rtn = new Cls_e_tmp();
		String year = rq.substring(0, rq.indexOf("-", 1));
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("select count(*) as n1,sum(f_sunshi+f_3zhe+f_daoq+f_siji+f_chke+f_ziran+f_hhen+f_boli+f_bjm+f_jq+f_3)/10000 as d1 ");
		sqlInsert.append("  from kcs_specbaoxian t where to_char(proce_time,'yyyy')='"+year);
		sqlInsert.append("' and order_type='6' and to_char(proce_time,'yyyy-mm-dd')<='"+rq+"'");
		if (!"00".equals(citycode))
			sqlInsert.append(" and city_code='"+citycode+"'");
		 try{	
			 Cls_connect cn = new Cls_connect();
		 	 conn = cn.connect().getConnection();
			 pstmt=conn.prepareStatement(sqlInsert.toString());
			 rs=pstmt.executeQuery();
			while(rs.next()) {
				rtn.setNum1(rs.getInt("n1"));
				rtn.setD1(rs.getDouble("d1"));
						}
			 }
		  catch(Exception e){
			  log.error("Cls_l_qstbb:"+e.toString());
				throw new Cls_exception(" DownExcelTb.getYearTj() "+e.toString());
		 }	
		finally{
			
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception(" DownExcelTb.getYearTj() "+e.toString());
						}
				     rs=null;  
							}
							if (pstmt!=null) {
				try{
								pstmt.close();}
				catch(Exception e){
							 throw new Cls_exception(" DownExcelTb.getYearTj) "+e.toString());
						}
				     pstmt=null;
							}
							if (conn!=null){
				try{
								conn.close();
				}catch(Exception e){
							 throw new Cls_exception(" DownExcelTb.getYearTj() "+e.toString());
						}
				   conn =null;
							}
			}
		return rtn;		
	}
	public int getBfPlane(String citycode) {
		int bfjh = 0;
		if ("60".equals(citycode)) bfjh = 300;//����
		if ("61".equals(citycode)) bfjh = 650;//�ൺ
		if ("62".equals(citycode)) bfjh = 300;//�Ͳ�
		if ("63".equals(citycode)) bfjh = 130;//��ׯ
		if ("65".equals(citycode)) bfjh = 270;//��Ӫ
		if ("66".equals(citycode)) bfjh = 400;//��̨
		if ("67".equals(citycode)) bfjh = 850;//Ϋ��
		if ("68".equals(citycode)) bfjh = 600;//����
		if ("69".equals(citycode)) bfjh = 300;//̩��
		if ("80".equals(citycode)) bfjh = 200;//����
		if ("81".equals(citycode)) bfjh = 130;//����
		if ("82".equals(citycode)) bfjh = 70;//����
		if ("83".equals(citycode)) bfjh = 170;//����
		if ("85".equals(citycode)) bfjh = 850;//����
		if ("86".equals(citycode)) bfjh = 460;//�ĳ�
		if ("87".equals(citycode)) bfjh = 500;//����
		if ("88".equals(citycode)) bfjh = 420;//����
		if ("00".equals(citycode)) bfjh = 6600;//ɽ��ʡ
				
	    return bfjh;	
	}
}
