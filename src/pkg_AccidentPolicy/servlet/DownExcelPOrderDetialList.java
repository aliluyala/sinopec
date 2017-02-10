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
			WritableSheet ws = wwb.createSheet("ҵ����ϸ��(" + q_rq + "��" + z_rq
					+ ")", 0);
			// ���嵥Ԫ����ʽ
			WritableFont wf_title = new WritableFont(
					WritableFont.createFont("����"), 16, WritableFont.BOLD,
					false, UnderlineStyle.NO_UNDERLINE, jxl.format.Colour.BLACK); 
			// �����ʽ�����塢�»��ߡ�б�塢���塢��ɫ
			WritableFont wf_head = new WritableFont(
					WritableFont.createFont("����"), 12, WritableFont.NO_BOLD,
					false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK);
			WritableFont wf_head_bold = new WritableFont(
					WritableFont.createFont("����"), 12, WritableFont.BOLD,
					false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK);
			WritableFont wf_table = new WritableFont(
					WritableFont.createFont("����"), 12, WritableFont.NO_BOLD,
					false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK);

			WritableCellFormat wcf_title = new WritableCellFormat(wf_title); // ��Ԫ����
			wcf_title.setAlignment(jxl.format.Alignment.CENTRE); // ���ö��뷽ʽ
			wcf_title.setBorder(Border.ALL, BorderLineStyle.THIN); // ���ñ߿�
			wcf_title.setVerticalAlignment(VerticalAlignment.CENTRE);// �Ѵ�ֱ���뷽ʽָ��Ϊ����

			WritableCellFormat wcf_head = new WritableCellFormat(wf_head);// ��Ԫ����
			wcf_head.setAlignment(jxl.format.Alignment.CENTRE); // ���ö��뷽ʽ
			wcf_head.setBorder(Border.ALL, BorderLineStyle.THIN); // ���ñ߿�
			wcf_head.setVerticalAlignment(VerticalAlignment.CENTRE);// �Ѵ�ֱ���뷽ʽָ��Ϊ����
			wcf_head.setWrap(true); // �����Զ�����

			WritableCellFormat wcf_head_bold = new WritableCellFormat(
					wf_head_bold);// ��Ԫ����
			wcf_head_bold.setAlignment(jxl.format.Alignment.CENTRE); // ���ö��뷽ʽ
			wcf_head_bold.setBorder(Border.ALL, BorderLineStyle.THIN); // ���ñ߿�
			wcf_head_bold.setVerticalAlignment(VerticalAlignment.CENTRE);// �Ѵ�ֱ���뷽ʽָ��Ϊ����
			wcf_head_bold.setWrap(true);

			WritableCellFormat wcf_hj = new WritableCellFormat(wf_head);// ��Ԫ����
			wcf_hj.setBackground(jxl.format.Colour.GREY_25_PERCENT); // ���õ�Ԫ��ı�����ɫ
			wcf_hj.setAlignment(jxl.format.Alignment.LEFT); // ���ö��뷽ʽ
			wcf_hj.setBorder(Border.ALL, BorderLineStyle.THIN); // ���ñ߿�
			wcf_hj.setVerticalAlignment(VerticalAlignment.CENTRE);// �Ѵ�ֱ���뷽ʽָ��Ϊ����
			wcf_hj.setWrap(true); // �����Զ�����

			// ���ָ�ʽ0.00
			NumberFormat nf = new NumberFormat("0.00");
			WritableCellFormat wcf_table_num = new WritableCellFormat(wf_table,
					nf);
			wcf_table_num.setBorder(Border.ALL, BorderLineStyle.THIN);
			wcf_table_num.setAlignment(jxl.format.Alignment.CENTRE); // ���ö��뷽ʽ

			ws.setRowView(0, 500);// ���õ�һ�и�
			ws.setColumnView(0, 20); // �����еĿ��
			ws.setColumnView(1, 12); // �����еĿ��
			ws.setColumnView(2, 25); // �����еĿ��
			ws.setColumnView(3, 15); // �����еĿ��
			ws.setColumnView(4, 12); // �����еĿ��
			ws.setColumnView(5, 25); // �����еĿ��
			ws.setColumnView(6, 16); // �����еĿ��
			ws.setColumnView(7, 12); // �����еĿ��

			ws.addCell(new Label(0, 0, yw_type + "��������ҵ����ϸ��", wcf_title));
			ws.mergeCells(0, 0, 7, 0);
			ws.addCell(new Label(0, 1, "��λ", wcf_head_bold));
			ws.addCell(new Label(1, 1, "������", wcf_head_bold));
			ws.addCell(new Label(2, 1, "��������", wcf_head_bold));
			ws.addCell(new Label(3, 1, "�����绰", wcf_head_bold));
			ws.addCell(new Label(4, 1, "���", wcf_head_bold));
			ws.addCell(new Label(5, 1, "��������", wcf_head_bold));
			ws.addCell(new Label(6, 1, "����ʱ��", wcf_head_bold));
			ws.addCell(new Label(7, 1, "������", wcf_head_bold));

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
					ws.addCell(new Label(1, s_line + qxjl, "�ϼƶ���"
							+ map.get("num") + "����" + map.get("price") + "Ԫ",
							wcf_hj));
					ws.mergeCells(1, s_line + qxjl, 7, s_line + qxjl);
					s_line = s_line + qxjl + 1;
				}
			}
			map = pL.getSumPrice(sqlInsert.toString(), citycode, "00");
			ws.addCell(new Label(0, s_line, "ȫ�кϼ�", wcf_head_bold));
			ws.addCell(new Label(1, s_line, "�ϼƶ���"
					+ map.get("num") + "����" + map.get("price") + "Ԫ",
					wcf_head_bold));
			ws.mergeCells(1, s_line , 7, s_line );
			wwb.write();
			wwb.close();
            map = null;
			response.reset(); // �ǳ���Ҫ
			response.setContentType("text/html; charset=gb2312");
			String downloadfile = new String(new String(file.getName()
					.getBytes(), "iso-8859-1"));
			// log.error(downloadfile);
			long filesize = file.length();
			// ���������ʽ
			response.addHeader("content-type", "application/x-msdownload;");
			response.addHeader("Content-Disposition", "attachment; filename="
					+ downloadfile);// ��Ҫ�ڱ��洰������ʾ�ı����ļ���
			response.addHeader("content-length", Long.toString(filesize));
			// ��ͻ���д���ļ�
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
			// if (file.exists()) {//�������ɾ���ļ�
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
	 * Excel�ļ���
	 */
	private String fileName;

	private String getFileName() {
		this.setFileName("��������ҵ����ϸ��" + ".xls");
		return fileName;
	}

	private void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * �ļ��洢·��
	 */
	private String url;

	private String getUrl(HttpServletRequest request) {
		//File f = new File(request.getRealPath("/") + "ExcelData//");
		// String path =
		// "/oracle/middleware/user_projects/domains/base_domain/servers/AdminServer/upload/chj/";
		// File f = new File(path+"ExcelData/");
		// ����ļ��������򴴽��ļ���
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
