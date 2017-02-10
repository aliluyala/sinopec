package pkg_AccidentPolicy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import pkg_AccidentPolicy.AccidPolicyPre.APolicy;
import pkg_sinopec.Cls_exception;

/**
 * Servlet implementation class SaveAPlicy
 */
@WebServlet("/SaveAPolicy.do")
public class SaveAPolicy extends HttpServlet {
	private Logger log = Logger.getLogger(SaveAPolicy.class);
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SaveAPolicy() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String retu = "";
		boolean tag = false;
		String info = "";
		String bxgs = (String) request.getParameter("bxgs");
		if ("".equals(bxgs) || bxgs == null) {
			info = "数据传递异常，未取到所属保险公司值。";
			log.error("SaveAPlicy:数据传递异常，未取到所属保险公司值。");
		} else {
			APolicy aplicy = new APolicy();
			aplicy.setYw_type(Integer.parseInt(bxgs));
			aplicy.setName(request.getParameter("policyname"));
			aplicy.setBrief(request.getParameter("brief"));
			aplicy.setPicture_sfz(Integer.parseInt(request
					.getParameter("picture_sfz")));
			aplicy.setPicture_jshz(Integer.parseInt(request
					.getParameter("picture_jshz")));
			aplicy.setTb_mode(request.getParameter("tb_mode"));
			aplicy.setRule_exp(request.getParameter("rule_exp"));
			aplicy.setTb_exp(request.getParameter("tb_exp"));
			aplicy.setSalescity(request.getParameter("salescity"));

		  try {
				tag = aplicy.save();
			} catch (Cls_exception e) {
				log.error("pkg_AccidentPolicy.servlet.SaveAPolicy:"+e.toString());
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
