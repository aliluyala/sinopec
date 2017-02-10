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
 * Servlet implementation class SaveAPlicyKind
 */
@WebServlet("/SaveAPolicyKind.do")
public class SaveAPolicyKind extends HttpServlet {
	private Logger log = Logger.getLogger(SaveAPolicyKind.class);
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveAPolicyKind() {
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
		String kdxh = (String) request.getParameter("kdxh");
		if ("".equals(kdxh) || kdxh == null) {
			info = "数据传递异常，未取到卡单序号。";
			log.error("SaveAPlicyKind:数据传递异常，未取到卡单序号。");
		} else {
			APolicyKind aplicykind = new APolicyKind();
			aplicykind.setKind(request.getParameter("kind"));
			aplicykind.setPolicy_no(Integer.parseInt(kdxh));
			aplicykind.setYw_type(Integer.parseInt(request.getParameter("bxgs")));
			aplicykind.setName(request.getParameter("kdname"));
            aplicykind.setPrice(Double.parseDouble(request.getParameter("price")));
            aplicykind.setMaxlimite(Integer.parseInt(request.getParameter("maxlimite")));
            aplicykind.setPicture_id(request.getParameter("picture_id"));
            aplicykind.setSuminsured(Double.parseDouble(request.getParameter("suminsured")));

		  try {
				tag = aplicykind.save();
			} catch (Cls_exception e) {
				log.error("pkg_AccidentPolicy.servlet.SaveAPolicyKind:"+e.toString());
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
