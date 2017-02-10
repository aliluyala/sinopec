package pkg_AccidentPolicy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import pkg_AccidentPolicy.AccidPolicyPre.APolicyKind;
import pkg_sinopec.Cls_exception;

/**
 * Servlet implementation class ModifyAPlicyKind
 */
@WebServlet("/ModifyAPolicyKind.do")
public class ModifyAPolicyKind extends HttpServlet {
	private Logger log = Logger.getLogger(ModifyAPolicyKind.class);
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyAPolicyKind() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String retu = "";
		boolean tag = false;
		String info = "";
		String serial_no = (String) request.getParameter("serial_no");
		if ("".equals(serial_no)||serial_no == null||"0".equals(serial_no)) {
			info = "数据传递异常，未取到卡单产品序号。";
			log.error("SaveAPlicy:数据传递异常，未取到卡单产品序号。");
		} else {
			APolicyKind aplicykind = new APolicyKind();
			aplicykind.setKind(request.getParameter("kind"));
            aplicykind.setPrice(Double.parseDouble(request.getParameter("price")));
            aplicykind.setMaxlimite(Integer.parseInt(request.getParameter("maxlimite")));
            aplicykind.setPicture_id(request.getParameter("picture_id"));
            aplicykind.setSuminsured(Double.parseDouble(request.getParameter("suminsured")));
		  try {
				tag = aplicykind.modify(Integer.parseInt(serial_no));
			} catch (Cls_exception e) {
				log.error("pkg_AccidentPolicy.servlet.ModifyAPolicyKind:"+e.toString());
				info = "保存过程发生错误。";
				e.printStackTrace();
			}

		}
		retu = "{\"tag\":\"" + tag + "\",\"info\":\"" + info + "\"}";
		log.error(retu);
		response.setContentType("text/x-json;charset=UTF-8");// 返回json格式
		response.getWriter().write(retu);
		response.getWriter().flush();
		response.getWriter().close();		
	}

}
