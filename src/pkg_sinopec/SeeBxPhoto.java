package pkg_sinopec;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.zip.GZIPInputStream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * @author Administrator
 *
 */
public class SeeBxPhoto extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String CONTENT_TYPE = "image/jpeg"; 
	   public SeeBxPhoto() {
	       super();
	       // TODO Auto-generated constructor stub
	   }
	   private  Logger log = Logger.getLogger(SeeBxPhoto.class);
	  public void init(ServletConfig config) throws ServletException { 
	    } 
	    public void doGet(HttpServletRequest request, HttpServletResponse response) throws   ServletException, IOException {
	                 response.setContentType(CONTENT_TYPE); 
	                 Connection   con =null;
	                 InputStream in = null;
	                 ResultSet rs = null;
	                 int num=0;
	                 String sql="";
	                 OutputStream out = response.getOutputStream();   
	                 int mark=Integer.parseInt(request.getParameter("lb")); 
	                 int dd_id=Integer.parseInt(request.getParameter("dd_id"));
	                 String org_code=request.getParameter("orgcode");
	                 //String zjh=request.getParameter("zjh");
	                 String zjh=java.net.URLDecoder.decode(request.getParameter("zjh"),"utf-8");
	                 DES des;
					try {
						des = new DES();
						org_code=des.decrypt(org_code);
					} catch (Exception e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
	                Cls_gg gg = new Cls_gg();
	                
	                 PreparedStatement stmt = null;
	                 GZIPInputStream bos = null;
	   try{
		   if (dd_id>0)   
			   num=gg.getrow("  kcs_specphoto where  org_code='"+org_code+"' and mark="+mark+" and dd_id="+dd_id);
		   if (num>0)
			   sql="select PHOTO from kcs_specphoto where org_code='"+org_code+"' and mark="+mark+" and dd_id="+dd_id;
		   else 
			   sql="select * from (select PHOTO from kcs_specphoto where zjh='"+zjh+"' and mark="+mark+" order by serial_no desc) where rownum=1";
		   log.error(sql);
	        if (org_code != null) {   
	        	Cls_connect cn = new Cls_connect();
	        	con = cn.connect().getConnection();
	        	stmt = con.prepareStatement(sql);
	        	rs = stmt.executeQuery();
	        	while(rs.next()) {
	        		in = rs.getBinaryStream("PHOTO");
	        		if(in==null){
	        			continue;
	        		}
	        		bos = new GZIPInputStream(in);
	         		int len = 0;
	        		byte[] img = new byte[1024];
	        		while ((len = bos.read(img)) != -1) {
		        			out.write(img,0,len);
		        	}
	                bos.close();  	
	        		in.close();
	        	}
	        	
	        }
	    }catch(Exception ex){
		          ex.printStackTrace();
	    }finally{
	        	if (bos != null) {
					try {
						bos.close();
					}catch (Exception e){
						throw new IOException(""+e.toString());
					}
				}
	        	if (out != null) {
					try {
						out.close();
					}catch (Exception e){
						throw new IOException(""+e.toString());
					}
				}
	        	if (in != null) {
					try {
						in.close();
					}catch (Exception e){
						throw new IOException(""+e.toString());
					}
				}
	        	if (rs != null) {
					try {
						rs.close();
					} catch (Exception e) {
						throw new IOException(""+e.toString());
					}
					rs = null;
				}
				if (stmt != null) {
					try {
						stmt.close();
					} catch (Exception e) {
						throw new IOException(""+e.toString());
					}
					stmt = null;
				}
				if (con != null) {
					try {
						con.close();
					} catch (Exception e) {
						throw new IOException(""+e.toString());
					}
					con = null;
				}
	          }	
	    }
}
