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
 * Servlet implementation class SaveAKindXm
 */
@WebServlet("/SaveAKindXm")
public class SaveAKindXm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Logger log = Logger.getLogger(SaveAKindXm.class);   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveAKindXm() {
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
		String serial_no = (String) request.getParameter("serial_no");
		if ("".equals(serial_no) || serial_no == null) {
			info = "数据传递异常，未取到卡单kind序号。";
			log.error("SaveAKindXm:数据传递异常，未取到卡单序号。");
		} else {
			int kind_no = Integer.parseInt(serial_no);
			String policy_name = (String)request.getParameter("policy_name");
			String kind = (String)request.getParameter("kind");
			String bx_zr = (String)request.getParameter("bx_zr");
			String suminsured = (String)request.getParameter("bx_e");

		  try {
				tag = save(policy_name,kind,bx_zr,suminsured,kind_no);
				if (tag)
					info = xmList(kind_no);
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
	private String xmList(int kind_no) throws Cls_exception {
		String  sql = "";
		APolicyKind apKind = new APolicyKind();
		apKind.initialize(kind_no);
		sql = apKind.getStrBxzr();
		return sql;
		
	}
	private boolean save(String policy_name,String kind,String bxzr,String suminsured,int kind_no) throws Cls_exception {
		log.error("保存卡单产品保险责任信息：" + bxzr + "/"+suminsured);
		boolean ret = false;
		if (bxzr == null) {
			log.error("save() kind is null");
			throw new NullPointerException("save() kind is null");
		}
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("insert into kcs_insurance_kind_xm(serial_no,name,");
		sqlInsert.append("kind,kind_no,bx_zr,suminsured)");
		sqlInsert.append(" values(AUTOQUOTE_ID.nextval,");
		sqlInsert.append("?,?,?,?,?)");
		java.sql.Connection con = null;
		java.sql.PreparedStatement stmt = null;
		java.sql.ResultSet rs = null;
		int a = 0;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt = con.prepareStatement(sqlInsert.toString());
			stmt.setString(1, policy_name);
			stmt.setString(2, kind);
			stmt.setInt(3, kind_no);
			stmt.setString(4, bxzr);
			stmt.setString(5, suminsured);
            a = stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认
			if (a > 0) {
				ret = true;
			}
		} catch (SQLException se) {
			log.error("SaveAKindXm.save():" + se.toString());
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
					throw new Cls_exception("SaveAKindXm.save()" + e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("SaveAKindXm.save()" + e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("SaveAKindXm.save()" + e.toString());
				}
				con = null;
			}
		}
		return ret;
	}

}
