package pkg_sinopec;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class down
 */
public class Downmb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Downmb() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   response.setContentType("text/html; charset=gb2312");
		   //HttpSession session = request.getSession();
		   // Ҫ���ص��ļ���
		   String downloadfile = new String((request.getParameter("downFile"))
		     .getBytes("iso8859-1"), "gb2312");

		  // ServletContext context = getServletContext();
		  // ServletConfig config = getServletConfig();

		   // ��ȡҪ�����ļ����ڵ�Ŀ¼�������Ƕ�Ӧ�ڷ������ϵ�����·��
		   // Ŀ¼�ĸ�ʽ��������:
		   // ��Ŀ¼��WEB��Ŀ¼����Ӧ��ʵ������Ŀ¼��
		   // +����Ŀ¼�������ļ���ŵ���Ŀ¼��
		   //String downloadpath = "/opt/weblogic/user_projects/domains/base_domain/servers/bmzww/sinopec/common/";
		   String downloadpath = "/oracle/middleware/user_projects/domains/base_domain/servers/AdminServer/upload/sinopec/common/";
		  // System.out.println(downloadpath);
		   // ���������ļ��Ķ���
		   java.io.File file = new java.io.File(downloadpath + downloadfile);
		   // ����ļ��ĳ���
		   long filesize = file.length();
		   // ���������ʽ
		   response.addHeader("content-type", "application/x-msdownload;");
		   response.addHeader("Content-Disposition", "attachment; filename="
		     + response.encodeURL(downloadfile));//��Ҫ�ڱ��洰������ʾ�ı����ļ���
		   response.addHeader("content-length", Long.toString(filesize));
		   // ��ͻ���д���ļ�
		   java.io.FileInputStream fin = new java.io.FileInputStream(file);
		   byte[] b = new byte[1];
		   int j = 0;
		   while ((j = fin.read(b)) > 0) {
		    response.getOutputStream().write(b);
		   }
		   fin.close();
           file = null;

	}

}
