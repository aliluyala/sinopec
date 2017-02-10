package pkg_auto.autobj.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import pkg_sinopec.Cls_exception;
import pkg_auto.autobj.ccic.serverProcess.Ccic_Privy;

import com.ccic.gwservice.car.fgcpiprecisequote.PrivyDTO;

/**
 * Servlet implementation class AutoPrivySave
 */
//@WebServlet("/AutoPrivySave")
public class AutoPrivySave extends HttpServlet {
	private  Logger log = Logger.getLogger(AutoPrivySave.class);   
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutoPrivySave() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String retu = "{\"flag\":\"false\",\"info\":\"存储失败\"}";		
		String jycode  = (String)request.getParameter("jycode");
        String carOwner=(String)request.getParameter("carOwner");
		String carOwnerisNutr=(String)request.getParameter("carOwnerisNutr");	
		String unitType=(String)request.getParameter("unitType");	
		String carOwnerIdType=(String)request.getParameter("carOwnerIdType");
		String carOwnerIdNum=(String)request.getParameter("carOwnerIdNum");
		String isinsured=(String)request.getParameter("isinsured");
		String mobile=(String)request.getParameter("mobile");		
		String carinsureDrelation=(String)request.getParameter("carinsureDrelation");
		String cphm=(String)request.getParameter("cphm");	
		String orgcode = (String)request.getParameter("org_code_des");
		//log.error("carinsureDrelation="+carinsureDrelation);
		
		
		PrivyDTO privyD = new PrivyDTO();
		privyD.setInsuredName(carOwner);
		privyD.setInsuredNature(carOwnerisNutr);
		privyD.setUnitType(unitType);
		privyD.setIdentifyType(carOwnerIdType);
		privyD.setIdentifyNumber(carOwnerIdNum);
		privyD.setMobile(mobile);
		
		Ccic_Privy privy = new Ccic_Privy();
		try {
			privy.empty(jycode);
			boolean tag = privy.saveCarOwner(privyD, jycode,cphm,orgcode);
			if (tag) {
				if (null==isinsured) {
	 	            String insured=(String)request.getParameter("insured");
		            String insuredisNutr=(String)request.getParameter("insuredisNutr");
		            String insuredunitType=(String)request.getParameter("insuredunitType");
		            String insuredIdType=(String)request.getParameter("insuredIdType");
		            String insuredIdNum=(String)request.getParameter("insuredIdNum");
		           		            
		            privyD.setInsuredName(insured);
		    		privyD.setInsuredNature(insuredisNutr);
		    		privyD.setUnitType(insuredunitType);
		    		privyD.setIdentifyType(insuredIdType);
		    		privyD.setIdentifyNumber(insuredIdNum);
		    		 }
		    	tag = privy.saveInsured(privyD, jycode,carinsureDrelation,cphm,orgcode);	
		    	if(tag) {
		    		retu = "{\"flag\":\"true\",\"info\":\"存储成功\"}";	
		    	}
			}	
			
		} catch (Cls_exception e) {
			retu = "{\"flag\":\"true\",\"info\":\"存储过程发生异常\"}";	
			log.error("关系人存储异常："+e.toString());
			e.printStackTrace();
		}
		response.setContentType("text/x-json;charset=UTF-8");//返回json格式
		response.getWriter().write(retu); 
		response.getWriter().flush();
		response.getWriter().close(); 		
	}

}
