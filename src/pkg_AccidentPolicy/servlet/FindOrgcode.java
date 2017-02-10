package pkg_AccidentPolicy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import pkg_sinopec.Cls_connect80;
import pkg_sinopec.Cls_exception;
/**
 * Servlet implementation class FindOrgcode
 */
@WebServlet("/FindOrgcode")
public class FindOrgcode extends HttpServlet {
	private  Logger log = Logger.getLogger(FindOrgcode.class);
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindOrgcode() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String retu = "";
		boolean tag = false;
		String info = "";
		String jgh=(String)request.getParameter("jgh");
		String org=(String)request.getParameter("org");
		log.error("find org:"+jgh+"/"+org);
		String citycode = org.substring(0,2);
		if (citycode.equals(jgh.subSequence(0,2))) {
			try {
				info = GetJg(jgh);
				if (!"".equals(info))
					tag = true;
				else info = "\"errinfo\":\"δ���ָû�����Ϣ���������롣\"";
			} catch (Cls_exception e) {
				// TODO Auto-generated catch block
				log.error("pkg_AccidentPolicy.servlet.FindOrgcode:"+e.toString());
				e.printStackTrace();
			}
		} else {
			info = "\"errinfo\":\"�����������л�����\" ";
		}
		retu = "{\"tag\":\"" + tag + "\"," + info + "}";
		log.error("���һ�����"+jgh+"/"+tag+"/"+info);
		response.setContentType("text/x-json;charset=UTF-8");// ����json��ʽ
		response.getWriter().write(retu);
		response.getWriter().flush();
		response.getWriter().close();
	}
	private String GetJg(String jgh) throws Cls_exception{
	    String a="";
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
	 try{	
		 Cls_connect80 cn = new Cls_connect80();
		 conn = cn.connect().getConnection();
		 pstmt=conn.prepareStatement("select orgname,org_conntr,org_tel from esseapp.KCS_ORG_INFO where org_code=?");
		 pstmt.setString(1, jgh);
		 rs=pstmt.executeQuery();

		while(rs.next()) {
			a="\"orgname\":\""+rs.getString(1)+"\",\"lxr\":\""+rs.getString(2)+"\",\"tel\":\""+rs.getString(3)+"\"";
					}
		 }
	  catch(Exception e){
		    log.error(e.toString());
			throw new Cls_exception("FindOrgcode.GetJg() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("FindOrgcode.GetJg()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("FindOrgcode.GetJg()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("FindOrgcode.GetJg()"+e.toString());
					}
			   conn =null;
						}
		}
	return a;	
	   
	}
}
