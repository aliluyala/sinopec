package pkg_AccidentPolicy.servlet;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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
import pkg_sinopec.Cls_e_tmp;
import pkg_sinopec.Cls_zd;

/**
 * Servlet implementation class DownExcelPOrderDetialList
 */
@WebServlet("/DownExcelPOrderDetialList.do")
public class DownExcelPOrderDetialList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger
			.getLogger(DownExcelPOrderDetialList.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DownExcelPOrderDetialList() {
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
		try {
			export_POrderList(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error(e.toString());
			e.printStackTrace();
		}
	}

	public void export_POrderList(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String citycode = (String) request.getParameter("citycode");
		String q_rq = (String) request.getParameter("q_date");
		String z_rq = (String) request.getParameter("z_date");
		String bxgs = (String) request.getParameter("bxgs");
		Cls_zd zd = new Cls_zd();
		POrderDetialList pL = new POrderDetialList();
		File file = null;
		int qxjl = 0, j = 0;
		String qxname = "", qxcode = "", tempVal = "";
		String yw_type = "";
		StringBuffer sqlInsert = new StringBuffer();
		List<PolicyOrder> plist = new ArrayList<PolicyOrder>();
		Map<String, String> map = null;
		java.io.FileInputStream fin = null;
		try {
			sqlInsert.append(" and  proce_time>=TO_DATE('" + q_rq
					+ "','yyyy-mm-dd') ");
			sqlInsert.append(" and  proce_time<=TO_DATE('" + z_rq
					+ "-23-59-59','yyyy-mm-dd-hh24-mi-ss')");
			if (bxgs != null&& !"".equals(bxgs)) {
			       sqlInsert.append(" and yw_type=" + bxgs);
			       yw_type = zd.GetBxgs(Integer.parseInt(bxgs));
			   } 
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
			// out = response.getWriter();
			file = new File(this.getUrl(request) + this.getFileName());
			WritableWorkbook wwb = Workbook.createWorkbook(file);
			WritableSheet ws = wwb.createSheet("业绩明细表(" + q_rq + "至" + z_rq
					+ ")", 0);
			// 定义单元格样式
			WritableFont wf_title = new WritableFont(
					WritableFont.createFont("宋体"), 16, WritableFont.BOLD,
					false, UnderlineStyle.NO_UNDERLINE, jxl.format.Colour.BLACK); 
			// 定义格式、字体、下划线、斜体、粗体、颜色
			WritableFont wf_head = new WritableFont(
					WritableFont.createFont("宋体"), 12, WritableFont.NO_BOLD,
					false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK);
			WritableFont wf_head_bold = new WritableFont(
					WritableFont.createFont("宋体"), 12, WritableFont.BOLD,
					false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK);
			WritableFont wf_table = new WritableFont(
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

			WritableCellFormat wcf_head_bold = new WritableCellFormat(
					wf_head_bold);// 单元格定义
			wcf_head_bold.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式
			wcf_head_bold.setBorder(Border.ALL, BorderLineStyle.THIN); // 设置边框
			wcf_head_bold.setVerticalAlignment(VerticalAlignment.CENTRE);// 把垂直对齐方式指定为居中
			wcf_head_bold.setWrap(true);

			WritableCellFormat wcf_hj = new WritableCellFormat(wf_head);// 单元格定义
			wcf_hj.setBackground(jxl.format.Colour.GREY_25_PERCENT); // 设置单元格的背景颜色
			wcf_hj.setAlignment(jxl.format.Alignment.LEFT); // 设置对齐方式
			wcf_hj.setBorder(Border.ALL, BorderLineStyle.THIN); // 设置边框
			wcf_hj.setVerticalAlignment(VerticalAlignment.CENTRE);// 把垂直对齐方式指定为居中
			wcf_hj.setWrap(true); // 设置自动换行

			// 数字格式0.00
			NumberFormat nf = new NumberFormat("0.00");
			WritableCellFormat wcf_table_num = new WritableCellFormat(wf_table,
					nf);
			wcf_table_num.setBorder(Border.ALL, BorderLineStyle.THIN);
			wcf_table_num.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式

			ws.setRowView(0, 500);// 设置第一行高
			ws.setColumnView(0, 20); // 设置列的宽度
			ws.setColumnView(1, 12); // 设置列的宽度
			ws.setColumnView(2, 25); // 设置列的宽度
			ws.setColumnView(3, 15); // 设置列的宽度
			ws.setColumnView(4, 12); // 设置列的宽度
			ws.setColumnView(5, 25); // 设置列的宽度
			ws.setColumnView(6, 16); // 设置列的宽度
			ws.setColumnView(7, 12); // 设置列的宽度

			ws.addCell(new Label(0, 0, yw_type + "卡单销售业绩明细表", wcf_title));
			ws.mergeCells(0, 0, 7, 0);
			ws.addCell(new Label(0, 1, "单位", wcf_head_bold));
			ws.addCell(new Label(1, 1, "机构号", wcf_head_bold));
			ws.addCell(new Label(2, 1, "机构名称", wcf_head_bold));
			ws.addCell(new Label(3, 1, "机构电话", wcf_head_bold));
			ws.addCell(new Label(4, 1, "金额", wcf_head_bold));
			ws.addCell(new Label(5, 1, "卡单名称", wcf_head_bold));
			ws.addCell(new Label(6, 1, "销售时间", wcf_head_bold));
			ws.addCell(new Label(7, 1, "销售人", wcf_head_bold));

			int s_line = 2;
			List<Cls_e_tmp> qxcodelist = pL.GetQxdm(citycode);
			int qxsize = qxcodelist.size();
			for (int i = 0; i < qxsize; i++) {
				qxcode = qxcodelist.get(i).getS1();
				qxname = qxcodelist.get(i).getS2();
				plist = pL.getQxSuccessList(sqlInsert.toString(), citycode, qxcode);
				qxjl = plist.size();
				//log.error("=" + qxcode + "/" + qxjl);
				if (qxjl > 0) {
					ws.addCell(new Label(0, s_line, qxname, wcf_head));
					ws.mergeCells(0, s_line, 0, s_line + qxjl);

					for (j = 0; j < qxjl; j++) {
						ws.addCell(new Label(1, s_line + j, plist.get(j)
								.getOrg_code(), wcf_head));
						ws.addCell(new Label(2, s_line + j, plist.get(j)
								.getOrg_code_name(), wcf_head));
						ws.addCell(new Label(3, s_line + j, plist.get(j)
								.getOrg_tel(), wcf_head));
						ws.addCell(new jxl.write.Number(4, s_line + j, plist
								.get(j).getSum_price(), wcf_table_num));
						ws.addCell(new Label(5, s_line + j, plist.get(j)
								.getPolicy_name(), wcf_head));
						ws.addCell(new Label(6, s_line + j, plist.get(j)
								.getSproce_time(), wcf_head));
						tempVal = zd.GetCzyname(plist.get(j).getOpercode(),
								plist.get(j).getOrg_code());
						ws.addCell(new Label(7, s_line + j, tempVal, wcf_head));
					}
					map = pL.getSumPrice(sqlInsert.toString(), citycode, qxcode);
					ws.addCell(new Label(1, s_line + qxjl, "合计订单"
							+ map.get("num") + "单，" + map.get("price") + "元",
							wcf_hj));
					ws.mergeCells(1, s_line + qxjl, 7, s_line + qxjl);
					s_line = s_line + qxjl + 1;
				}
			}
			map = pL.getSumPrice(sqlInsert.toString(), citycode, "00");
			ws.addCell(new Label(0, s_line, "全市合计", wcf_head_bold));
			ws.addCell(new Label(1, s_line, "合计订单"
					+ map.get("num") + "单，" + map.get("price") + "元",
					wcf_head_bold));
			ws.mergeCells(1, s_line , 7, s_line );
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
			// if (file.exists()) {//下载完毕删除文件
			// file.delete();
			// }
			if (fin!=null)
				try {
					fin.close();
				} catch (IOException e) {
					throw new IOException(e.toString());
				}
				fin = null;
		}

	}


	/**
	 * Excel文件名
	 */
	private String fileName;

	private String getFileName() {
		this.setFileName("卡单销售业绩明细表" + ".xls");
		return fileName;
	}

	private void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * 文件存储路径
	 */
	private String url;

	private String getUrl(HttpServletRequest request) {
		//File f = new File(request.getRealPath("/") + "ExcelData//");
		// String path =
		// "/oracle/middleware/user_projects/domains/base_domain/servers/AdminServer/upload/chj/";
		// File f = new File(path+"ExcelData/");
		// 如果文件不存在则创建文件夹
	//	if (!f.exists()) {
		//	log.error("mkdir");
		//	f.mkdir();
		//}
		this.setUrl(request.getRealPath("/") + "ExcelData//");
		// this.setUrl(path+"ExcelData/");
		return url;
	}

	private void setUrl(String url) {
		this.url = url;
	}
}
