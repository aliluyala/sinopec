package pkg_sinopec;

import java.sql.SQLException;
/**
 * �˴���������˵����
 * �������ڣ�(2004-8-31 13:42:48)
 * @author��Administrator
 */
public class Cls_gg {
	/**
 * Cls_gg ������ע�⡣
 */
public Cls_gg() {
	super();
}
/**
 * �õ���¼������
 * �������ڣ�(2004-8-31 13:43:33)
 * @return int
 * @param tsql java.lang.String
 * @exception pkg_yzh.Cls_exception �쳣˵����
 */
public int getrow(String tsql) throws Cls_exception {
	int a=0;
	java.sql.Connection conn=null;
	java.sql.PreparedStatement pstmt=null;
	java.sql.ResultSet rs=null;

	try{	
		Cls_connect cn = new Cls_connect();
    	conn = cn.connect().getConnection();
	tsql="SELECT COUNT(*) FROM "+tsql;
	pstmt=conn.prepareStatement(tsql);
	
	rs=pstmt.executeQuery();
	while(rs.next()) {
		a=rs.getInt(1);
	}
 }
	catch(Exception e){
		throw new Cls_exception("Cls_gg.getrow(string)   "+e.toString());
 }	
finally{
		try{
			if (rs!=null){
				rs.close();
			}
			if (pstmt!=null) {
				pstmt.close();
			}
			if (conn!=null){
				conn.close();
			}
		   }
		catch(Exception e){
			 throw new Cls_exception("Cls_gg.getrow(string) finally"+e.toString());
		}
	}

	
	return a;
}
/**
 * ִ�и��¡�ɾ�������������
 * �������ڣ�(2004-8-31 13:50:53)
 * @return boolean
 * @param tsql java.lang.String
 * @exception pkg_dpiao.Cls_exception �쳣˵����
 */
public  boolean update(String tsql) throws Exception {
	boolean tag=false;
	java.sql.Connection con=null;
	java.sql.PreparedStatement stmt=null;
	java.sql.ResultSet rs=null;
	int a=0;
	try {
		Cls_connect cn = new Cls_connect();
    	con = cn.connect().getConnection();
		con.setAutoCommit(false);
		stmt=con.prepareStatement(tsql);
	  	a=stmt.executeUpdate();
		con.commit();
		con.setAutoCommit(true);// �ָ�Ĭ��	
		if (a>0)
		 {
			 tag=true;
		 }
	} catch (SQLException se) {
		se.printStackTrace();
		//log.error("gg.update.sqlexcepiton["+tsql+"]", se);
		try {
				if (con != null) {
				con.rollback();//����sql�쳣������ع�
				con.setAutoCommit(true);//�����ύ��ʽΪĬ�Ϸ�ʽ			
				}
		} catch (SQLException se1) {
			se1.printStackTrace();
		}
	} finally {
		try {
			if (rs != null) {
				rs.close();
				rs = null;
			}
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
			if (con != null) {
				con.close();
				con = null;
			}
		} catch (SQLException se) {
			se.printStackTrace();
			//log.error("gg.update.sqlexcepiton["+tsql+"]", se);
		}
	}
	return tag;
}
/**
 * �˴����뷽��˵����
 * �������ڣ�(2004-9-7 14:32:54)
 * @return int
 * @param tsql java.lang.String
 * @exception pkg_dpiao.Cls_exception �쳣˵����
 */      
public int maxid(String tsql) throws Cls_exception {
	int a=0;
	java.sql.Connection conn=null;
	java.sql.PreparedStatement pstmt=null;
	java.sql.ResultSet rs=null;

	try{	
		Cls_connect cn = new Cls_connect();
    	conn = cn.connect().getConnection();
	tsql="SELECT MAX(serial_no) FROM "+tsql;
	pstmt=conn.prepareStatement(tsql);
	
	rs=pstmt.executeQuery();
	
	while(rs.next()) {
		a=rs.getInt(1);
	}
 }
	catch(Exception e){
		//throw new Cls_exception("Cls_gg.maxid(string)   "+e.toString());
 }	
finally{
		try{
			if (rs!=null){
				rs.close();
			}
			if (pstmt!=null) {
				pstmt.close();
			}
			if (conn!=null){
				conn.close();
			}
		   }
		catch(Exception e){
			// throw new Cls_exception("Cls_gg.maxid(string) finally"+e.toString());
		}
	}

	
	return a;
}/**
 * �˴����뷽��˵����
 * �������ڣ�(2004-7-14 15:54:49)
 * @return java.lang.String
 * @param source java.lang.String
 * @param oldString java.lang.String
 * @param newString java.lang.String
 */      
public  String replace(String source, String oldString, String newString) {
StringBuffer output = new StringBuffer(); 

	   int lengthOfSource = source.length();   // Դ�ַ������� 
	   int lengthOfOld = oldString.length();   // ���ַ������� 
	   int posStart = 0;   // ��ʼ����λ�� 
	   int pos;            // ���������ַ�����λ�� 

	   while ((pos = source.indexOf(oldString, posStart)) >= 0) { 
		   output.append(source.substring(posStart, pos)); 
		   output.append(newString); 
		   posStart = pos + lengthOfOld; 
	   } 
	   if (posStart < lengthOfSource) { 
		   output.append(source.substring(posStart)); 
	   } 
	   return output.toString(); 
   }      /**
 * �˴����뷽��˵����
 * �������ڣ�(2004-7-14 15:33:41)
 * @return java.lang.String
 * @param iso java.lang.String
 * @exception pkg_gg.Cls_exception �쳣˵����
 */   
public String toGB(String iso) throws Cls_exception {
	String gb=iso;
	   
 /* if (iso != null) { 
   try { 
		 gb=new String(iso.getBytes("ISO-8859-1"),"GB2312"); 
 } catch(Exception e){
		throw new Cls_exception("Cls_gg.toGB"+e.toString());
		    
		  } 
 }*/
  
return gb; 
}              
public String toIso(String iso) throws Cls_exception {
	String gb=null;
	   
  if (iso != null) { 
   try { 
		 gb=new String(iso.getBytes("GB2312"),"ISO-8859-1"); 
 } catch(Exception e){
		throw new Cls_exception("Cls_gg.toIso"+e.toString());
		    
		  } 
 }
  
return gb; 
}
 /** * �˴����뷽��˵����
 * �������ڣ�(2011-6-2 14:43:53)
 * @return java.lang.Double
 * @param sql java.lang.String
 * @exception pkg_dpiao.Cls_exception �쳣˵����
 */
public double getdouble(String sql) throws Cls_exception {
	double a=0.0;
	java.sql.Connection conn=null;
	java.sql.PreparedStatement pstmt=null;
	java.sql.ResultSet rs=null;

	try{	
		Cls_connect cn = new Cls_connect();
    	conn = cn.connect().getConnection();
	//tsql="select count(*) from "+tsql;
	pstmt=conn.prepareStatement(sql);
	
	rs=pstmt.executeQuery();
	
	while(rs.next()) {
		a=rs.getDouble(1);
	}
 }
	catch(Exception e){
		throw new Cls_exception("Cls_gg.getdouble(string)   "+e.toString());
 }	
finally{
		try{
			if (rs!=null){
				rs.close();
			}
			if (pstmt!=null) {
				pstmt.close();
			}
			if (conn!=null){
				conn.close();
			}
		   }
		catch(Exception e){
			 throw new Cls_exception("Cls_gg.getdouble(string) finally"+e.toString());
		}
	}

	
	return a;
}/**
 * �˴����뷽��˵����
 * �������ڣ�(2010-5-27 9:37:29)
 * @return java.lang.String
 * @param sql java.lang.String
 */
public String getstring(String sql) throws Cls_exception {
	String a="";
	java.sql.Connection conn=null;
	java.sql.PreparedStatement pstmt=null;
	java.sql.ResultSet rs=null;

	try{	
		Cls_connect cn = new Cls_connect();
    	conn = cn.connect().getConnection();
	pstmt=conn.prepareStatement(sql);
	
	rs=pstmt.executeQuery();
	
	while(rs.next()) {
		a=rs.getString(1);
	}
 }
	catch(Exception e){

 }	
finally{
		try{
			if (rs!=null){
				rs.close();
			}
			if (pstmt!=null) {
				pstmt.close();
			}
			if (conn!=null){
				conn.close();
			}
		   }
		catch(Exception e){

		}
	}

	
	return a;
}
 public  int getint(String tsql) throws Cls_exception {
		int a=0;
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;

		try{	
			Cls_connect cn = new Cls_connect();
	    	conn = cn.connect().getConnection();
		pstmt=conn.prepareStatement(tsql);
		
		rs=pstmt.executeQuery();
		
		while(rs.next()) {
			a=rs.getInt(1);
		}
	 }
		catch(Exception e){
			//throw new Cls_exception("Cls_gg.maxid(string)   "+e.toString());
	 }	
	finally{
			try{
				if (rs!=null){
					rs.close();
				}
				if (pstmt!=null) {
					pstmt.close();
				}
				if (conn!=null){
					conn.close();
				}
			   }
			catch(Exception e){
				// throw new Cls_exception("Cls_gg.maxid(string) finally"+e.toString());
			}
		}

		
		return a;
	}


 
 }