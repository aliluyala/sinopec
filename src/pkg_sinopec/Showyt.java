/**
 * 
 */
package pkg_sinopec;

import javax.servlet.*; 
import javax.servlet.http.*; 
import java.io.*; 
import java.util.zip.GZIPInputStream;
import java.sql.*; 

/**
 * @author Administrator
 *
 */
public class Showyt extends HttpServlet {
	 private static final long serialVersionUID = 1L;
	   private static final String CONTENT_TYPE = "image/jpeg"; 
	   public Showyt() {
	       super();
	       // TODO Auto-generated constructor stub
	   }
	   public void init(ServletConfig config) throws ServletException { 
	    } 
	    public void doGet(HttpServletRequest request, HttpServletResponse response) throws   ServletException, IOException {
	                 response.setContentType(CONTENT_TYPE); 
	                 Connection   con =null;
	                 InputStream in = null;
	                 ResultSet rs = null;
	                 OutputStream out = response.getOutputStream();   
	                 int mark=Integer.parseInt(request.getParameter("lb")); 
	                 int dd_id=Integer.parseInt(request.getParameter("dd_id"));
	                 String org_code=request.getParameter("orgcode");
	                 DES des;
					try {
						des = new DES();
						org_code=des.decrypt(org_code);
					} catch (Exception e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
	                 
	                 PreparedStatement stmt = null;
	                 GZIPInputStream bos = null;
	   try{
	        if (org_code != null) {   
	        	Cls_connect cn = new Cls_connect();
	        	con = cn.connect().getConnection();
	        	stmt = con.prepareStatement("select PHOTO from kcs_specphotoyt where org_code=? and mark=? and dd_id=?");
	        	stmt.setInt(2, mark);
	    		stmt.setString(1,org_code);
	    		stmt.setInt(3,dd_id);
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
	        	out.close();
	        if(in==null)
	        	 in.close();
		    if(rs!=null)
		      try {
		     	rs.close();
			    rs = null;
		       } catch (SQLException e) {
			     // TODO Auto-generated catch block
			    e.printStackTrace();
		        }
	        if(stmt!=null)
		         try {
		           	stmt.close();
			        stmt = null;
		           } catch (SQLException e1) {
			          // TODO Auto-generated catch block
			          e1.printStackTrace();
		           }
		   if(con!=null)
		        try {
			       con.close();
			       con = null;
		          } catch (SQLException e) {
			          // TODO Auto-generated catch block
			         e.printStackTrace();
		          }
	        }
	}
}
