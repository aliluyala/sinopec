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
 * Servlet implementation class DownExcelPOrderStatisticslList
 */
@WebServlet("/DownExcelPOrderStatisticslList.do")
public class DownExcelPOrderStatisticslList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger
	.getLogger(DownExcelPOrderStatisticslList.class);  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownExcelPOrderStatisticslList() {
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
		String rq = (String) request.getParameter("q_date");
		Cls_zd zd = new Cls_zd();
		POrderStatisticslList pL = new POrderStatisticslList();
		File file = null;
		int bxgs = 0, j = 0,bxgsjl = 0;
		String qxname = "", qxcode = "";
		Cls_e_tmp tmp_day = null;
		Cls_e_tmp tmp_mon = null;
		Cls_e_tmp tmp_year = null;
		java.io.FileInputStream fin = null;
		try {
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
			// out = response.getWriter();
			file = new File(this.getUrl(request) + this.getFileName());
			WritableWorkbook wwb = Workbook.createWorkbook(file);
			WritableSheet ws = wwb.createSheet("���ؿ���ҵ��ͳ�Ʊ�(" + rq+ ")", 0);
			// ���嵥Ԫ����ʽ
			WritableFont wf_title = new WritableFont(
					WritableFont.createFont("����"), 16, WritableFont.BOLD,
					false, UnderlineStyle.NO_UNDERLINE, jxl.format.Colour.BLACK); 
			// �����ʽ�����塢�»��ߡ�б�塢���塢��ɫ
			WritableFont wf_head = new WritableFont(
					WritableFont.createFont("����"), 12, WritableFont.NO_BOLD,
					false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK);
			//WritableFont wf_table = new WritableFont(
					//WritableFont.createFont("����"), 12, WritableFont.NO_BOLD,
					//false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK);

			WritableCellFormat wcf_title = new WritableCellFormat(wf_title); // ��Ԫ����
			wcf_title.setAlignment(jxl.format.Alignment.CENTRE); // ���ö��뷽ʽ
			wcf_title.setBorder(Border.ALL, BorderLineStyle.THIN); // ���ñ߿�
			wcf_title.setVerticalAlignment(VerticalAlignment.CENTRE);// �Ѵ�ֱ���뷽ʽָ��Ϊ����

			WritableCellFormat wcf_head = new WritableCellFormat(wf_head);// ��Ԫ����
			wcf_head.setAlignment(jxl.format.Alignment.CENTRE); // ���ö��뷽ʽ
			wcf_head.setBorder(Border.ALL, BorderLineStyle.THIN); // ���ñ߿�
			wcf_head.setVerticalAlignment(VerticalAlignment.CENTRE);// �Ѵ�ֱ���뷽ʽָ��Ϊ����
			wcf_head.setWrap(true); // �����Զ�����

			WritableCellFormat wcf_hj = new WritableCellFormat(wf_head);// ��Ԫ����
			wcf_hj.setBackground(jxl.format.Colour.GREY_25_PERCENT); // ���õ�Ԫ��ı�����ɫ
			wcf_hj.setAlignment(jxl.format.Alignment.LEFT); // ���ö��뷽ʽ
			wcf_hj.setBorder(Border.ALL, BorderLineStyle.THIN); // ���ñ߿�
			wcf_hj.setVerticalAlignment(VerticalAlignment.CENTRE);// �Ѵ�ֱ���뷽ʽָ��Ϊ����
			wcf_hj.setWrap(true); // �����Զ�����

			// ���ָ�ʽ0.00
			NumberFormat nf = new NumberFormat("0.00");
			WritableCellFormat wcf_table_num = new WritableCellFormat(wf_head,
					nf);
			wcf_table_num.setBorder(Border.ALL, BorderLineStyle.THIN);
			wcf_table_num.setAlignment(jxl.format.Alignment.CENTRE); // ���ö��뷽ʽ
			WritableCellFormat wcf_table_num_hj = new WritableCellFormat(wf_head,
					nf);
			wcf_table_num_hj.setBorder(Border.ALL, BorderLineStyle.THIN);
			wcf_table_num_hj.setAlignment(jxl.format.Alignment.CENTRE); // ���ö��뷽ʽ
			wcf_table_num_hj.setBackground(jxl.format.Colour.GREY_25_PERCENT); // ���õ�Ԫ��ı�����ɫ
			// ���ָ�ʽ0
			NumberFormat nfz = new NumberFormat("0");
			WritableCellFormat wcf_table_numz = new WritableCellFormat(wf_head,
					nfz);
			wcf_table_numz.setBorder(Border.ALL, BorderLineStyle.THIN);
			wcf_table_numz.setAlignment(jxl.format.Alignment.CENTRE); // ���ö��뷽ʽ
			WritableCellFormat wcf_table_numz_hj = new WritableCellFormat(wf_head,
					nfz);
			wcf_table_numz_hj.setBorder(Border.ALL, BorderLineStyle.THIN);
			wcf_table_numz_hj.setAlignment(jxl.format.Alignment.CENTRE); // ���ö��뷽ʽ
			wcf_table_numz_hj.setBackground(jxl.format.Colour.GREY_25_PERCENT); // ���õ�Ԫ��ı�����ɫ
			ws.setRowView(0, 500);// ���õ�һ�и�
			ws.setColumnView(0, 20); // �����еĿ��
			ws.setColumnView(1, 15); // �����еĿ��
			ws.setColumnView(2, 15); // �����еĿ��
			ws.setColumnView(3, 15); // �����еĿ��
			ws.setColumnView(4, 15); // �����еĿ��
			ws.setColumnView(5, 15); // �����еĿ��
			ws.setColumnView(6, 15); // �����еĿ��
			ws.setColumnView(7, 15); // �����еĿ��

			ws.addCell(new Label(0, 0,  "���������ز����տ���ҵ��ͳ�Ʊ�", wcf_title));
			ws.mergeCells(0, 0, 7, 0);
			ws.addCell(new Label(0, 1, "��λ", wcf_head));
			ws.mergeCells(0, 1, 0, 2);
			ws.addCell(new Label(1, 1, "���չ�˾", wcf_head));
			ws.mergeCells(1, 1, 1, 2);
			ws.addCell(new Label(2, 1, "�������(Ԫ)", wcf_head));
			ws.mergeCells(2, 1, 4,1);
			ws.addCell(new Label(2, 2, "��������", wcf_head));
			ws.addCell(new Label(3, 2, "��������", wcf_head));
			ws.addCell(new Label(4, 2, "��������", wcf_head));
			ws.addCell(new Label(5, 1, "��������", wcf_head));
			ws.mergeCells(5, 1, 7,1);
			ws.addCell(new Label(5, 2, "��������", wcf_head));
			ws.addCell(new Label(6, 2, "��������", wcf_head));
			ws.addCell(new Label(7, 2, "��������", wcf_head));
			
			
			int s_line = 3;
			List<Integer> bxgslist = pL.getBelongBxgsList(citycode);
			bxgsjl = bxgslist.size();
			if (bxgsjl>0) {
			   List<Cls_e_tmp> qxcodelist = pL.GetQxdm(citycode);
			   int qxsize = qxcodelist.size();
			   for (int i = 0; i < qxsize; i++) {
				    qxcode = qxcodelist.get(i).getS1();
				    qxname = qxcodelist.get(i).getS2();
				    ws.addCell(new Label(0, s_line, qxname, wcf_head));
					ws.mergeCells(0, s_line, 0, s_line + bxgsjl );
					for (j = 0; j < bxgsjl ; j++) {
						bxgs = bxgslist.get(j);
						tmp_day = pL.getDayList(citycode, qxcode, rq,bxgs);
						tmp_mon = pL.getMonList(citycode, qxcode, rq,bxgs);
						tmp_year = pL.getYearList(citycode, qxcode, rq,bxgs);
						ws.addCell(new Label(1, s_line + j, zd.GetBxgs(bxgs), wcf_head));
						ws.addCell(new jxl.write.Number(2, s_line + j,tmp_day.getD1() , wcf_table_num));
						ws.addCell(new jxl.write.Number(3, s_line + j,tmp_mon.getD1() , wcf_table_num));
						ws.addCell(new jxl.write.Number(4, s_line + j,tmp_year.getD1() , wcf_table_num));
						ws.addCell(new jxl.write.Number(5, s_line + j,tmp_day.getNum1() , wcf_table_numz));
						ws.addCell(new jxl.write.Number(6, s_line + j,tmp_mon.getNum1() , wcf_table_numz));
						ws.addCell(new jxl.write.Number(7, s_line + j,tmp_year.getNum1() , wcf_table_numz));
						
					}
					ws.addCell(new Label(1, s_line + bxgsjl, "С�ƣ�",wcf_hj));
					tmp_day = pL.getDayList(citycode,qxcode, rq,0);
					tmp_mon = pL.getMonList(citycode,qxcode, rq,0);
					tmp_year = pL.getYearList(citycode,qxcode, rq,0);
					ws.addCell(new jxl.write.Number(2, s_line + bxgsjl,tmp_day.getD1() , wcf_table_num_hj));
					ws.addCell(new jxl.write.Number(3, s_line + bxgsjl, tmp_mon.getD1(), wcf_table_num_hj));
					ws.addCell(new jxl.write.Number(4, s_line + bxgsjl, tmp_year.getD1(), wcf_table_num_hj));
					ws.addCell(new jxl.write.Number(5, s_line + bxgsjl,tmp_day.getNum1() , wcf_table_numz_hj));
					ws.addCell(new jxl.write.Number(6, s_line + bxgsjl,tmp_mon.getNum1() , wcf_table_numz_hj));
					ws.addCell(new jxl.write.Number(7, s_line + bxgsjl,tmp_year.getNum1() , wcf_table_numz_hj));
					s_line = s_line + bxgsjl + 1;
					
			   }
			   ws.addCell(new Label(0, s_line, "ȫ�кϼ�", wcf_head));
			   ws.mergeCells(0, s_line, 0, s_line + bxgsjl );
			   for (j = 0; j < bxgsjl ; j++) {
					bxgs = bxgslist.get(j);
					tmp_day =pL.getDayList(citycode,"00", rq,bxgs);
					tmp_mon =pL.getMonList(citycode,"00", rq,bxgs);
					tmp_year = pL.getYearList(citycode,"00", rq,bxgs);
					ws.addCell(new Label(1, s_line + j, zd.GetBxgs(bxgs), wcf_head));
					ws.addCell(new jxl.write.Number(2, s_line + j,tmp_day.getD1() , wcf_table_num));
					ws.addCell(new jxl.write.Number(3, s_line + j,tmp_mon.getD1() , wcf_table_num));
					ws.addCell(new jxl.write.Number(4, s_line + j,tmp_year.getD1() , wcf_table_num));
					ws.addCell(new jxl.write.Number(5, s_line + j,tmp_day.getNum1() , wcf_table_numz));
					ws.addCell(new jxl.write.Number(6, s_line + j,tmp_mon.getNum1() , wcf_table_numz));
					ws.addCell(new jxl.write.Number(7, s_line + j,tmp_year.getNum1() , wcf_table_numz));
				}
			    ws.addCell(new Label(1, s_line + bxgsjl, "С�ƣ�",wcf_hj));
			    tmp_day = pL.getDayList(citycode,"00", rq,0);
			    tmp_mon = pL.getMonList(citycode,"00", rq,0);
			    tmp_year = pL.getYearList(citycode,"00", rq,0);
				ws.addCell(new jxl.write.Number(2, s_line + bxgsjl,tmp_day.getD1() ,  wcf_table_num_hj));
				ws.addCell(new jxl.write.Number(3, s_line + bxgsjl,tmp_mon.getD1() , wcf_table_num_hj));
				ws.addCell(new jxl.write.Number(4, s_line + bxgsjl,tmp_year.getD1() , wcf_table_num_hj));
				ws.addCell(new jxl.write.Number(5, s_line + bxgsjl,tmp_day.getNum1() , wcf_table_numz_hj));
				ws.addCell(new jxl.write.Number(6, s_line + bxgsjl,tmp_mon.getNum1() , wcf_table_numz_hj));
				ws.addCell(new jxl.write.Number(7, s_line + bxgsjl,tmp_year.getNum1() , wcf_table_numz_hj));
			}
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
			tmp_day = null;
			tmp_mon = null;
			tmp_year = null;
		}
		
		
	}
	
	/**
	 * Excel�ļ���
	 */
	private String fileName;

	private String getFileName() {
		this.setFileName("���������ؼ����տ���ҵ��ͳ�Ʊ�" + ".xls");
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
