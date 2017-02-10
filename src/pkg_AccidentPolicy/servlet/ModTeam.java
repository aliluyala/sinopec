package pkg_AccidentPolicy.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import pkg_AccidentPolicy.AccidPolicyPre.CTeam;
import pkg_AccidentPolicy.AccidPolicyPre.County;
import pkg_sinopec.Cls_exception;

/**
 * Servlet implementation class ModTeam
 */
@WebServlet("/modTeam.do")
public class ModTeam extends HttpServlet {
	private Logger log = Logger.getLogger(ModTeam.class);
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModTeam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String retu = "";
		boolean tag = false;
		String info = "";
		Map<String, Object> map = null;
		String teamname = (String) request.getParameter("teamname");
		int teamcode = Integer.parseInt((String)request.getParameter("teamcode"));		
		CTeam team = new CTeam();
		 team.setTeam_code(teamcode);
		 team.setName(teamname);
		 
		String act = (String)request.getParameter("act");
		log.error("act="+act);
			try {
				if ("mod".equals(act)) {
					String yjgh=(String)request.getParameter("yjgh");
					String yteamname = (String) request.getParameter("yteamname");
					String jgh=(String)request.getParameter("jgh");		
		            String bfjh = (String)request.getParameter("premium_plan");
		            String org=(String)request.getParameter("orgcodedes");
					team.setPremium_plan(Double.parseDouble(bfjh));
		            team.setOrgcode(jgh);
		            team.setCounty_code(org.substring(0,4));
					map = modfiyTeam(team,yjgh,yteamname);
					tag = new Boolean(map.get("tag").toString());
					info = map.get("info").toString();
				} else if ("del".equals(act)) {
				       map = team.delTeam();
				       tag = new Boolean(map.get("tag").toString());
					   info = map.get("info").toString();
				} else if ("delorg".equals(act)) {
					   String id = (String) request.getParameter("id");
					   map = team.delOrg(Integer.parseInt(id));
					   tag = new Boolean(map.get("tag").toString());
					   info = map.get("info").toString();
				} else if ("addorg".equals(act)) {
					   String orgcode = (String)request.getParameter("jgh");
					   String countycode = (String)request.getParameter("countycode");
					   team.setCounty_code(countycode);
					   map = team.addOrg(orgcode);
					   tag = new Boolean(map.get("tag").toString());
					   info = map.get("info").toString();
				} else {
					info = "act未取到正确的参数";
				}
			} catch (Cls_exception e) {
				log.error("pkg_AccidentPolicy.servlet.modTeam:"+e.toString());
				info = "保存过程发生错误。";
				e.printStackTrace();
			} finally {
				map = null;
			}
			
			retu = "{\"tag\":\"" + tag + "\",\"info\":\"" + info + "\"}";
			log.info("修改团队："+teamname+"/"+tag+"/"+info);
			response.setContentType("text/x-json;charset=UTF-8");// 返回json格式
			response.getWriter().write(retu);
			response.getWriter().flush();
			response.getWriter().close();
		
	}
	   private Map<String, Object> modfiyTeam(CTeam team,String yjgh,String yteamname) throws Cls_exception {
	    	Map<String, Object> map = new HashMap<String, Object>();
	    	String info = "";
	    	County county = new County();
	    	boolean memberOrg = false;
	    	
	    	if (!yteamname.equals(team.getName())&&county.isDuplicateName(team.getName(),team.getCounty_code())) {
	    	  //团队名称修改且重名
	    		info = "团队名称重复。";
	    		map.put("tag", false);
	    		map.put("info", info);
	    	} else {  //名称未修改 或 不重名
		    	if (!yjgh.equals(team.getOrgcode())) { //管理机构修改，要判断新机构是否已在该团队
		    		memberOrg = team.isMemberOrg(team.getOrgcode());
		    		if (memberOrg) { //已是成员机构，
		    			// 直接更新
		    			map = team.modTeam("mod");		    			
		    		} else if (team.isOtherMemberOrg(team.getOrgcode())) {
		    			info = "该机构号已存在团队，不能重复划归。";
		    			map.put("tag", false);
			    		map.put("info", info);
		    		} else {
		    			//更新并加入机构表
		    			map = team.modTeam("mod_add");		    			
		    		}		    		
		    	} else { //管理机构不修改
		    		//直接更新		    		
		    		map = team.modTeam("mod");
		    	}	    		
	    	}
			return map;   	
	    }
}
