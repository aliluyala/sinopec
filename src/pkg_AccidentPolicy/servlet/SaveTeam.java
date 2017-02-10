package pkg_AccidentPolicy.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import pkg_AccidentPolicy.AccidPolicyPre.CTeam;
import pkg_AccidentPolicy.AccidPolicyPre.County;
import pkg_sinopec.Cls_exception;

/**
 * Servlet implementation class SaveTeam
 */
public class SaveTeam extends HttpServlet {
	private Logger log = Logger.getLogger(SaveTeam.class);
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveTeam() {
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
		String teamname = (String) request.getParameter("teamname");
		String jgh=(String)request.getParameter("jgh");
		String bfjh = (String)request.getParameter("premium_plan");
		String org=(String)request.getParameter("orgcodedes");
		CTeam team = new CTeam();
		 team.setName(teamname);
		 team.setPremium_plan(Double.parseDouble(bfjh));
		 team.setOrgcode(jgh);
		 team.setCounty_code(org.substring(0,4));
		County county = new County();
		try {
			if (county.isDuplicateName(teamname,org.substring(0,4))) {
				info = "团队名称重复。";
			} else {
				Map<String, Object> map = team.saveTeam();
				tag = new Boolean(map.get("tag").toString());
				info = map.get("info").toString();
				map = null;
			}
		} catch (Cls_exception e) {
			log.error("pkg_AccidentPolicy.servlet.SaveTeam:"+e.toString());
			info = "保存过程发生错误。";
			e.printStackTrace();
		}
		retu = "{\"tag\":\"" + tag + "\",\"info\":\"" + info + "\"}";
		log.info("添加新团队："+teamname+"/"+tag+"/"+info);
		response.setContentType("text/x-json;charset=UTF-8");// 返回json格式
		response.getWriter().write(retu);
		response.getWriter().flush();
		response.getWriter().close();

	}
	
}
