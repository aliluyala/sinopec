package pkg_sinopec;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * @author Administrator
 *
 */
public class AjaxCphm extends HttpServlet {
	private  Logger log = Logger.getLogger(AjaxCphm.class);
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 doPost(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String retu="";
		int num=0;
		String cphm=(String)request.getParameter("cphm");	
		log.error("cphm="+cphm);
        //System.out.println("cphm="+cphm);
        BxOrder dd = new BxOrder();
        Cls_e_bx tmpdd = new Cls_e_bx();
        try {
        	num= dd.ByCphm(cphm);
		    tmpdd = dd.ByCphm(cphm,num);
		    //System.out.println("cphm="+tmpdd.getCphm());
			if (cphm.equals(tmpdd.getCphm()))
			  retu = dd.Xx_cphm(tmpdd,num);
			else if (dd.intByKhxx(cphm)>0) {
				tmpdd = dd.byKhxx(cphm);
				retu = dd.Xx_khxx(tmpdd);
			} else
				retu="{\"flog\":\"no\"}";
		} catch (Cls_exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.error("retu="+retu);
		 //System.out.println("retu="+retu);
		//response.setContentType("text/plain;charset=utf-8"); //
		response.setContentType("text/x-json;charset=UTF-8");//∑µªÿjson∏Ò Ω
		response.getWriter().write(retu); 
		response.getWriter().flush();
		response.getWriter().close(); 
	}
}
