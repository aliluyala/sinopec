package pkg_AccidentPolicy.servlet;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jxl.Workbook;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.format.UnderlineStyle;
import jxl.format.VerticalAlignment;
import jxl.write.Label;
import jxl.write.NumberFormat;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.apache.log4j.Logger;

import pkg_AccidentPolicy.AccidPolicyPre.POrderDetialList;
import pkg_AccidentPolicy.pojo.PolicyOrder;
import pkg_sinopec.Cls_zd;

/**
 * Servlet implementation class DownExcelCountyPOrderDetialList
 */
@WebServlet("/DownExcelCountyPOrderDetialList.do")
public class DownExcelCountyPOrderDetialList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger
	.getLogger(DownExcelCountyPOrderDetialList.class);   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownExcelCountyPOrderDetialList() {
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
		try {
			export_POrderList(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error("DownExcelCountyPOrderDetialList.do:"+e.toString());
			e.printStackTrace();
		}	
	}

	/**
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	private void export_POrderList(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		String countycode = (String) request.getParameter("countycode");
		String qrq = (String) request.getParameter("q_date");
		String zrq = (String) request.getParameter("z_date");
		POrderDetialList pL = new POrderDetialList();
		File file = null;
		String sql = "";
		Cls_zd zd = new Cls_zd();
		int bxgs = 0;
		java.io.FileInputStream fin = null;
		try {
			sql=sql+"  and  proce_time>=TO_DATE('"+qrq+"','yyyy-mm-dd')";
			sql=sql+"  and  proce_time<=TO_DATE('"+zrq+"-23-59-59','yyyy-mm-dd-hh24-mi-ss')";  
		    String qxname = zd.GetQxmch(countycode.substring(0, 2), countycode.substring(2,4));		
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
			// out = response.getWriter();
			file = new File(this.getUrl(request) + this.getFileName());
			WritableWorkbook wwb = Workbook.createWorkbook(file);
			WritableSheet ws = wwb.createSheet("简易险出单明细(" + qrq+ "至"+zrq+")", 0);
			// 定义单元格样式
			WritableFont wf_title = new WritableFont(
					WritableFont.createFont("宋体"), 16, WritableFont.BOLD,
					false, UnderlineStyle.NO_UNDERLINE, jxl.format.Colour.BLACK); 
			// 定义格式、字体、下划线、斜体、粗体、颜色
			WritableFont wf_head = new WritableFont(
					WritableFont.createFont("宋体"), 12, WritableFont.NO_BOLD,
					false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK);

			WritableCellFormat wcf_title = new WritableCellFormat(wf_title); // 单元格定义
			wcf_title.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式
			wcf_title.setBorder(Border.ALL, BorderLineStyle.THIN); // 设置边框
			wcf_title.setVerticalAlignment(VerticalAlignment.CENTRE);// 把垂直对齐方式指定为居中

			WritableCellFormat wcf_head = new WritableCellFormat(wf_head);// 单元格定义
			wcf_head.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式
			wcf_head.setBorder(Border.ALL, BorderLineStyle.THIN); // 设置边框
			wcf_head.setVerticalAlignment(VerticalAlignment.CENTRE);// 把垂直对齐方式指定为居中
			wcf_head.setWrap(true); // 设置自动换行
			// 数字格式0.00
			NumberFormat nf = new NumberFormat("0.00");
			WritableCellFormat wcf_table_num = new WritableCellFormat(wf_head,
					nf);
			wcf_table_num.setBorder(Border.ALL, BorderLineStyle.THIN);
			wcf_table_num.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式
			// 数字格式0
			NumberFormat nfz = new NumberFormat("0");
			WritableCellFormat wcf_table_numz = new WritableCellFormat(wf_head,
					nfz);
			wcf_table_numz.setBorder(Border.ALL, BorderLineStyle.THIN);
			wcf_table_numz.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式

			ws.setRowView(0, 500);// 设置第一行高
			ws.setColumnView(0, 10); // 设置列的宽度
			ws.setColumnView(1, 20); // 设置列的宽度
			ws.setColumnView(2, 20); // 设置列的宽度
			ws.setColumnView(3, 15); // 设置列的宽度
			ws.setColumnView(4, 15); // 设置列的宽度
			ws.setColumnView(5, 15); // 设置列的宽度
			ws.setColumnView(6, 15); // 设置列的宽度
			ws.setColumnView(7, 25); // 设置列的宽度
			ws.setColumnView(8, 15); // 设置列的宽度
			ws.setColumnView(9, 15); // 设置列的宽度
		
			ws.addCell(new Label(0, 0,  qxname+"简易险出单明细表", wcf_title));
			ws.mergeCells(0, 0, 9, 0);
			ws.addCell(new Label(0, 1,  "日期："+qrq+"至"+zrq,wcf_head));
			ws.mergeCells(0, 1, 9, 1);
			ws.addCell(new Label(0, 2, "序号", wcf_head));
			ws.addCell(new Label(1, 2, "团队名称", wcf_head));
			ws.addCell(new Label(2, 2, "简易险产品", wcf_head));
			ws.addCell(new Label(3, 2, "保险公司", wcf_head));
			ws.addCell(new Label(4, 2, "份数", wcf_head));
			ws.addCell(new Label(5, 2, "金额(元)", wcf_head));
			ws.addCell(new Label(6, 2, "出单机构", wcf_head));
			ws.addCell(new Label(7, 2, "机构名", wcf_head));
			ws.addCell(new Label(8, 2, "出单时间", wcf_head));
			ws.addCell(new Label(9, 2, "发展人", wcf_head));
			List<PolicyOrder> plist = pL.getQxTeamSList(sql,countycode);
			Map<String, String> map = null;
			int s_line = 3;
			int size=plist.size();
			for(int r=0;r<size;r++) {
				 bxgs = plist.get(r).getYw_type();
				ws.addCell(new Label(0, s_line + r,r+1+"", wcf_head));
				ws.addCell(new Label(1, s_line + r,plist.get(r).getVin(), wcf_head));
				ws.addCell(new Label(2, s_line + r,plist.get(r).getPolicy_name(), wcf_head));
				ws.addCell(new Label(3, s_line + r,zd.GetBxgs(bxgs), wcf_head));
				ws.addCell(new jxl.write.Number(4, s_line + r,plist.get(r).getPolicy_num(), wcf_table_numz));
				ws.addCell(new jxl.write.Number(5, s_line + r,plist.get(r).getSum_price(), wcf_table_num));
				ws.addCell(new Label(6, s_line + r,plist.get(r).getOrg_code(), wcf_head));
				ws.addCell(new Label(7, s_line + r,plist.get(r).getOrg_code_name(), wcf_head));
				ws.addCell(new Label(8, s_line + r,plist.get(r).getSproce_time(), wcf_head));
				ws.addCell(new Label(9, s_line + r,zd.GetCzyname(plist.get(r).getOpercode(),
						plist.get(r).getOrg_code()), wcf_head));
			}
			 map = pL.getQxSumPrice(sql, countycode);
			    ws.addCell(new Label(0, s_line + size,size+1+"", wcf_head));
				ws.addCell(new Label(1, s_line + size,"合计：", wcf_head));
				ws.addCell(new Label(2, s_line + size,"", wcf_head));
				ws.addCell(new Label(3, s_line + size,"", wcf_head));
				ws.addCell(new Label(4, s_line + size,map.get("num"), wcf_head));
				ws.addCell(new Label(5, s_line + size,map.get("price"), wcf_head));
				ws.addCell(new Label(6, s_line + size,"", wcf_head));
				ws.addCell(new Label(7, s_line + size,"", wcf_head));
				ws.addCell(new Label(8, s_line + size,"", wcf_head));
				ws.addCell(new Label(9, s_line + size,"", wcf_head));
			 
			wwb.write();
			wwb.close();
            map = null;
			response.reset(); // 非常重要
			response.setContentType("text/html; charset=gb2312");
			String downloadfile = new String(new String(file.getName()
					.getBytes(), "iso-8859-1"));
			// log.error(downloadfile);
			long filesize = file.length();
			// 设置输出格式
			response.addHeader("content-type", "application/x-msdownload;");
			response.addHeader("Content-Disposition", "attachment; filename="
					+ downloadfile);// 你要在保存窗口中显示的保存文件名
			response.addHeader("content-length", Long.toString(filesize));
			// 向客户端写入文件
			fin = new java.io.FileInputStream(file);
			byte[] b = new byte[1];
			int k = 0;
			while ((k = fin.read(b)) > 0) {
				response.getOutputStream().write(b);
			}
			fin.close();
			file = null;
		} catch (Exception ex) {
			log.error(ex.toString());
			ex.printStackTrace();
		} finally {
			if (fin!=null)
				try {
					fin.close();
				} catch (IOException e) {
					throw new IOException(e.toString());
				}
				fin = null;
			// if (file.exists()) {//下载完毕删除文件
			// file.delete();
			// }
		}
		
	}
	/**
	 * Excel文件名
	 */
	private String fileName;

	private String getFileName() {
		this.setFileName("区县团队简易险出单明细表" + ".xls");
		return fileName;
	}

	private void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * 文件存储路径
	 */
	private String url;

	@SuppressWarnings("deprecation")
	private String getUrl(HttpServletRequest request) {
		//File f = new File(request.getRealPath("/") + "ExcelData//");
		// String path =
		// "/oracle/middleware/user_projects/domains/base_domain/servers/AdminServer/upload/chj/";
		// File f = new File(path+"ExcelData/");
		// 如果文件不存在则创建文件夹
		//if (!f.exists()) {
		//	log.error("mkdir");
			//f.mkdir();
		//}
		this.setUrl(request.getRealPath("/") + "ExcelData//");
		// this.setUrl(path+"ExcelData/");
		return url;
	}

	private void setUrl(String url) {
		this.url = url;
	}
}
