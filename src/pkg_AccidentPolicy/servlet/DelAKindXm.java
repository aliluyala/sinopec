package pkg_AccidentPolicy.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import pkg_AccidentPolicy.AccidPolicyPre.APolicyKind;
import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_exception;

/**
 * Servlet implementation class DelAKindXm
 */
@WebServlet("/DelAKindXm")
public class DelAKindXm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Logger log = Logger.getLogger(DelAKindXm.class);   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelAKindXm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String retu = "";
		boolean tag = false;
		String info = "";
		String kind_id = (String) request.getParameter("kind_id");
		String xm_id = (String) request.getParameter("xm_id");
		if ("".equals(kind_id) || kind_id == null) {
			info = "数据传递异常，未取到卡单kind序号。";
			log.error("DelAKindXm:数据传递异常，未取到卡单序号。");
		} else {
			int kindid = Integer.parseInt(kind_id);
			int xmid = Integer.parseInt(xm_id);

		  try {
				tag = drop(xmid);
				if (tag)
					info = xmList(kindid);
			} catch (Cls_exception e) {
				log.error("pkg_AccidentPolicy.servlet.DelAKindXm:"+e.toString());
				info = "删除过程发生错误。";
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
	private String xmList(int kind_no) throws Cls_exception {
		String  sql = "";
		APolicyKind apKind = new APolicyKind();
		apKind.initialize(kind_no);
		sql = apKind.getStrBxzr();
		return sql;
		
	}
	 private boolean drop(int xmid) throws Cls_exception {
	    	log.error("删除卡单kind的保障内容：" + xmid + "/");
			boolean ret = false;
			if (xmid == 0) {
				log.error("DelAKindXm.drop() serial_no is null");
				throw new NullPointerException("DelAKindXm.drop() serial_no is null");
			}
			StringBuffer sqlInsert = new StringBuffer();
			sqlInsert
					.append("delete from  kcs_insurance_kind_xm  where serial_no=");
			sqlInsert
					.append(xmid);
			java.sql.Connection con = null;
			java.sql.PreparedStatement stmt = null;
			java.sql.ResultSet rs = null;
			int a = 0;
			try {
				Cls_connect cn = new Cls_connect();
				con = cn.connect().getConnection();
				con.setAutoCommit(false);
				stmt = con.prepareStatement(sqlInsert.toString());
				a = stmt.executeUpdate();
				con.commit();
				con.setAutoCommit(true);// 恢复默认
				if (a > 0) {
					ret = true;
				}
			} catch (SQLException se) {
				log.error("DelAKindXm.drop():" + se.toString());
				se.printStackTrace();
				try {
					if (con != null) {
						con.rollback();// 出现sql异常，事务回滚
						con.setAutoCommit(true);// 设置提交方式为默认方式
					}
				} catch (SQLException se1) {
					se1.printStackTrace();
				}
			} finally {
				if (rs != null) {
					try {
						rs.close();
					} catch (Exception e) {
						throw new Cls_exception("DelAKindXm.drop()" + e.toString());
					}
					rs = null;
				}
				if (stmt != null) {
					try {
						stmt.close();
					} catch (Exception e) {
						throw new Cls_exception("DelAKindXm.drop()" + e.toString());
					}
					stmt = null;
				}
				if (con != null) {
					try {
						con.close();
					} catch (Exception e) {
						throw new Cls_exception("DelAKindXm.drop()" + e.toString());
					}
					con = null;
				}
			}
			return ret;
	    }

}
