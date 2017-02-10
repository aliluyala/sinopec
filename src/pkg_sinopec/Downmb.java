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
		   // 要下载的文件名
		   String downloadfile = new String((request.getParameter("downFile"))
		     .getBytes("iso8859-1"), "gb2312");

		  // ServletContext context = getServletContext();
		  // ServletConfig config = getServletConfig();

		   // 获取要下载文件所在的目录，这里是对应于服务器上的物理路径
		   // 目录的格式是这样的:
		   // 根目录（WEB主目录所对应的实际物理目录）
		   // +虚拟目录（下载文件存放的子目录）
		   //String downloadpath = "/opt/weblogic/user_projects/domains/base_domain/servers/bmzww/sinopec/common/";
		   String downloadpath = "/oracle/middleware/user_projects/domains/base_domain/servers/AdminServer/upload/sinopec/common/";
		  // System.out.println(downloadpath);
		   // 构建下载文件的对象
		   java.io.File file = new java.io.File(downloadpath + downloadfile);
		   // 获得文件的长度
		   long filesize = file.length();
		   // 设置输出格式
		   response.addHeader("content-type", "application/x-msdownload;");
		   response.addHeader("Content-Disposition", "attachment; filename="
		     + response.encodeURL(downloadfile));//你要在保存窗口中显示的保存文件名
		   response.addHeader("content-length", Long.toString(filesize));
		   // 向客户端写入文件
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
