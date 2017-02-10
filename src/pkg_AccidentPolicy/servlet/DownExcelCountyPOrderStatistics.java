package pkg_AccidentPolicy.servlet;

import java.io.File;
import java.io.IOException;
import java.util.List;

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

import pkg_AccidentPolicy.AccidPolicyPre.POrderStatisticslList;
import pkg_sinopec.Cls_e_tmp;
import pkg_sinopec.Cls_zd;

/**
 * Servlet implementation class DownExcelCountyPOrderStatistics
 */
@WebServlet("/DownExcelCountyPOrderStatistics.do")
public class DownExcelCountyPOrderStatistics extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger
	.getLogger(DownExcelCountyPOrderStatistics.class);    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownExcelCountyPOrderStatistics() {
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
			log.error(e.toString());
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
		String countycode = (String) request.getParameter("countycode");
		String qrq = (String) request.getParameter("q_date");
		String zrq = (String) request.getParameter("z_date");
		POrderStatisticslList pL = new POrderStatisticslList();
		File file = null;
		Cls_zd zd = new Cls_zd();
		Double sum_jh=0.0,sum_bf=0.0;
		int sum_dd =0;
		java.io.FileInputStream fin = null;
		try {
		    String qxname = zd.GetQxmch(countycode.substring(0, 2), countycode.substring(2,4));		
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
			// out = response.getWriter();
			file = new File(this.getUrl(request) + this.getFileName());
			WritableWorkbook wwb = Workbook.createWorkbook(file);
			WritableSheet ws = wwb.createSheet("�����ճ���ͨ��(" + qrq+ "��"+zrq+")", 0);
			// ���嵥Ԫ����ʽ
			WritableFont wf_title = new WritableFont(
					WritableFont.createFont("����"), 16, WritableFont.BOLD,
					false, UnderlineStyle.NO_UNDERLINE, jxl.format.Colour.BLACK); 
			// �����ʽ�����塢�»��ߡ�б�塢���塢��ɫ
			WritableFont wf_head = new WritableFont(
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
			// ���ָ�ʽ0.00
			NumberFormat nf = new NumberFormat("0.00");
			WritableCellFormat wcf_table_num = new WritableCellFormat(wf_head,
					nf);
			wcf_table_num.setBorder(Border.ALL, BorderLineStyle.THIN);
			wcf_table_num.setAlignment(jxl.format.Alignment.CENTRE); // ���ö��뷽ʽ
			// ���ָ�ʽ0
			NumberFormat nfz = new NumberFormat("0");
			WritableCellFormat wcf_table_numz = new WritableCellFormat(wf_head,
					nfz);
			wcf_table_numz.setBorder(Border.ALL, BorderLineStyle.THIN);
			wcf_table_numz.setAlignment(jxl.format.Alignment.CENTRE); // ���ö��뷽ʽ

			ws.setRowView(0, 500);// ���õ�һ�и�
			ws.setColumnView(0, 10); // �����еĿ��
			ws.setColumnView(1, 20); // �����еĿ��
			ws.setColumnView(2, 20); // �����еĿ��
			ws.setColumnView(3, 15); // �����еĿ��
			ws.setColumnView(4, 15); // �����еĿ��
			ws.setColumnView(5, 20); // �����еĿ��
		
			ws.addCell(new Label(0, 0,  qxname+"�����ճ���ͨ����", wcf_title));
			ws.mergeCells(0, 0, 5, 0);
			ws.addCell(new Label(0, 1,  "���ڣ�"+qrq+"��"+zrq,wcf_head));
			ws.mergeCells(0, 1, 5, 1);
			ws.addCell(new Label(0, 2, "���", wcf_head));
			ws.addCell(new Label(1, 2, "�Ŷ�����", wcf_head));
			ws.addCell(new Label(2, 2, "���Ѽƻ�(Ԫ)", wcf_head));
			ws.addCell(new Label(3, 2, "����", wcf_head));
			ws.addCell(new Label(4, 2, "���(Ԫ)", wcf_head));
			ws.addCell(new Label(5, 2, "������ɽ���", wcf_head));
			
			int s_line = 3;
			List<Cls_e_tmp> list=pL.getCountyTj(countycode,qrq,zrq);
			int size=list.size();
			for(int r=0;r<size;r++) {
				ws.addCell(new Label(0, s_line + r,r+1+"", wcf_head));
				ws.addCell(new Label(1, s_line + r,list.get(r).getS1(), wcf_head));
				ws.addCell(new jxl.write.Number(2, s_line + r,list.get(r).getD2(), wcf_table_num));
				ws.addCell(new jxl.write.Number(3, s_line + r,list.get(r).getNum1(), wcf_table_numz));
				ws.addCell(new jxl.write.Number(4, s_line + r,list.get(r).getD1(), wcf_table_num));
				ws.addCell(new Label(5, s_line + r,list.get(r).getS2(), wcf_head));
				sum_jh=sum_jh+list.get(r).getD2();
				sum_bf=sum_bf+list.get(r).getD1();
				sum_dd =sum_dd+list.get(r).getNum1();
			}
			    ws.addCell(new Label(0, s_line + size,size+1+"", wcf_head));
			    ws.addCell(new Label(1, s_line + size,"�ϼƣ�", wcf_head));
			    ws.addCell(new jxl.write.Number(2, s_line + size,sum_jh, wcf_table_num));
				ws.addCell(new jxl.write.Number(3, s_line + size,sum_dd, wcf_table_numz));
				ws.addCell(new jxl.write.Number(4, s_line + size,sum_bf, wcf_table_num));
				ws.addCell(new Label(5, s_line + size,"", wcf_head));
			wwb.write();
			wwb.close();

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
			if (fin!=null)
				try {
					fin.close();
				} catch (IOException e) {
					throw new IOException(e.toString());
				}
				fin = null;
			// if (file.exists()) {//�������ɾ���ļ�
			// file.delete();
			// }
		}
	}
	/**
	 * Excel�ļ���
	 */
	private String fileName;

	private String getFileName() {
		this.setFileName("�����ŶӼ����ճ���ͨ����" + ".xls");
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
		//if (!f.exists()) {
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
