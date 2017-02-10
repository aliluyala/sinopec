package pkg_AccidentPolicy.servlet;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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
import pkg_AccidentPolicy.AccidPolicyPre.POrderList;
import pkg_AccidentPolicy.pojo.PolicyOrder;
import pkg_sinopec.Cls_zd;
/**
 * Servlet implementation class DownExcelPOrderList
 */
@WebServlet("/DownExcelPOrderList.do")
public class DownExcelPOrderList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(DownExcelPOrderList.class);       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownExcelPOrderList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			export_POrderList(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error(e.toString());
			e.printStackTrace();
		}
	}
	/**
	 * 导出财意险订单信息
	 * @param request
	 * @param response 
	 * @return
	 * @throws Exception
	 */
	public void export_POrderList(HttpServletRequest request, HttpServletResponse response )throws Exception{
		String sql = (String) request.getParameter("chxtj");
		String jgtype = (String) request.getParameter("jgtype");
		List<PolicyOrder> rtnAL = new ArrayList<PolicyOrder>();
		File file = null;
		POrderList porderlist = new POrderList();
		Cls_zd zd = new Cls_zd();
		java.io.FileInputStream fin = null;
		try{
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
			//out = response.getWriter();
			file = new File(this.getUrl(request) + this.getFileName());
			WritableWorkbook wwb= Workbook.createWorkbook(file);   

			WritableSheet ws = wwb.createSheet("财意险", 0);
			ws.setRowView(0, 500);//设置第一行高
			ws.setColumnView(0, 10); // 设置列的宽度
			ws.setColumnView(1, 12); // 设置列的宽度
			ws.setColumnView(2, 10); // 设置列的宽度
			ws.setColumnView(3, 15); // 设置列的宽度
			ws.setColumnView(4, 10); // 设置列的宽度
			ws.setColumnView(5, 10); // 设置列的宽度
			ws.setColumnView(6, 12); // 设置列的宽度
			ws.setColumnView(7, 12); // 设置列的宽度
			ws.setColumnView(8, 12); // 设置列的宽度
			ws.setColumnView(9, 20); // 设置列的宽度
			ws.setColumnView(10, 20); // 设置列的宽度
		
			rtnAL = porderlist.getList(sql);	

            String[] columns = {"序号","订单号","保险公司","卡单名称","售价","份数","总价",
					"投保人","订单状态","订单时间","处理时间",};

            String[] columns_add = {"下单机构号","机构名","操作员","站点电话","处理机构",
    					"操作员","退单信息","资金流水","投保人电话","身份证号码","联系地址","被保险人","电话","与投保人关系",
    					"证件类型","证件号码","是否邮寄","邮件号码","被保险人2","证件类型","证件号码",
    					"被保险人3","证件类型","证件号码","被保险人4","证件类型","证件号码","被保险人5","证件类型","证件号码",};

			 WritableFont wf = new WritableFont(WritableFont.createFont("宋体"), 10,
			                                    WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE,
			                                    jxl.format.Colour.BLACK); // 定义格式 字体 下划线 斜体 粗体 颜色
			 WritableCellFormat wcf = new WritableCellFormat(wf); // 单元格定义
			 wcf.setBackground(jxl.format.Colour.GREY_25_PERCENT); // 设置单元格的背景颜色
			 wcf.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式			
			 wcf.setVerticalAlignment(VerticalAlignment.CENTRE);//把垂直对齐方式指定为居中			
			 wcf.setWrap(true); //设置自动换行
			 wcf.setBorder(Border.ALL, BorderLineStyle.THIN);
			 ////内容格式
			 WritableFont fnr = new WritableFont(WritableFont.createFont("宋体"),10,
					                             WritableFont.NO_BOLD,false,UnderlineStyle.NO_UNDERLINE, Colour.BLACK );
			 WritableCellFormat fwcf = new WritableCellFormat(fnr); // 单元格定义
			 fwcf.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式
			 fwcf.setBorder(Border.ALL, BorderLineStyle.THIN);
			 //数字格式0.00
			 NumberFormat nf = new NumberFormat("0.00");
			 WritableCellFormat nwc = new WritableCellFormat(fnr,nf);
			 nwc.setBorder(Border.ALL, BorderLineStyle.THIN);
			 int csize =  columns.length;		 
			for (int i = 0; i < csize; i++) {   
				ws.addCell(new Label(i, 0, columns[i],wcf));  
			}
			if (jgtype.equals("bmz")) {
				for (int i = 0;i<columns_add.length;i++) {
					ws.addCell(new Label(i+csize, 0, columns_add[i],wcf));  
				}
			}
			int size = rtnAL.size();
			for (int i = 0; i < size; i++) {
				PolicyOrder tjb = rtnAL.get(i);
				ws.addCell(new Label(0, i+1, i+1+"",fwcf));  
				ws.addCell(new Label(1, i+1, tjb.getSerial_no()+"",fwcf));
				ws.addCell(new Label(2, i+1, zd.GetBxgs(tjb.getYw_type()),fwcf));
				ws.addCell(new Label(3, i+1, tjb.getPolicy_name(),fwcf));
				ws.addCell(new jxl.write.Number(4, i+1, tjb.getPolicy_price(),nwc)); 
				ws.addCell(new Label(5, i+1, tjb.getPolicy_num()+"",fwcf));
				ws.addCell(new jxl.write.Number(6, i+1, tjb.getSum_price(),nwc)); 
				ws.addCell(new Label(7, i+1, tjb.getTbr_name(),fwcf));
				ws.addCell(new Label(8, i+1, zd.GetBxtype(Integer.parseInt(tjb.getOrder_type())),fwcf));
                ws.addCell(new Label(9, i+1, tjb.getSorder_time(), fwcf));
                ws.addCell(new Label(10, i+1, tjb.getSproce_time(), fwcf));
                if (jgtype.equals("bmz")) {
                	 ws.addCell(new Label(11, i+1, tjb.getOrg_code(), fwcf));
                	 ws.addCell(new Label(12, i+1, tjb.getOrg_code_name(), fwcf));
                     ws.addCell(new Label(13, i+1, zd.GetCzyname(tjb.getOpercode(), tjb.getOrg_code()), fwcf));
               	     ws.addCell(new Label(14, i+1, tjb.getOrg_tel(), fwcf));
                	 ws.addCell(new Label(15, i+1, zd.GetJgname(tjb.getOper_orgcode()), fwcf));
                	 ws.addCell(new Label(16, i+1, zd.GetCzyname(tjb.getOper_opercode(), tjb.getOper_orgcode()), fwcf));
                	 ws.addCell(new Label(17, i+1, tjb.getT_message(), fwcf));
                	 ws.addCell(new Label(18, i+1, tjb.getZjlsh(), fwcf));
                	 ws.addCell(new Label(19, i+1, tjb.getTbr_tel(), fwcf));
                	 ws.addCell(new Label(20, i+1, tjb.getTbr_sfz(), fwcf));
                	 ws.addCell(new Label(21, i+1, tjb.getTbr_addr(), fwcf));
                     ws.addCell(new Label(22, i+1, tjb.getInsured_name(), fwcf));
                	 ws.addCell(new Label(23, i+1, tjb.getInsured_tel(), fwcf));
                	 ws.addCell(new Label(24, i+1, tjb.getRelation(), fwcf));
                	 ws.addCell(new Label(25, i+1, tjb.getInsured_id(), fwcf));
                	 ws.addCell(new Label(26, i+1, tjb.getInsured_idnum(), fwcf));
                	 ws.addCell(new Label(27, i+1, tjb.getPost_mark(), fwcf));               	 
                	 ws.addCell(new Label(28, i+1, tjb.getMail_num(), fwcf));
                	 ws.addCell(new Label(29, i+1, tjb.getInsured_name2(), fwcf));
                	 ws.addCell(new Label(30, i+1, tjb.getInsured_id2(), fwcf));
                	 ws.addCell(new Label(31, i+1, tjb.getInsured_idnum2(), fwcf));
                	 ws.addCell(new Label(32, i+1, tjb.getInsured_name3(), fwcf));
                	 ws.addCell(new Label(33, i+1, tjb.getInsured_id3(), fwcf));
                	 ws.addCell(new Label(34, i+1, tjb.getInsured_idnum3(), fwcf));
                	 ws.addCell(new Label(35, i+1, tjb.getInsured_name4(), fwcf));
                	 ws.addCell(new Label(36, i+1, tjb.getInsured_id4(), fwcf));
                	 ws.addCell(new Label(37, i+1, tjb.getInsured_idnum4(), fwcf));
                	 ws.addCell(new Label(38, i+1, tjb.getInsured_name5(), fwcf));
                	 ws.addCell(new Label(39, i+1, tjb.getInsured_id5(), fwcf));
                	 ws.addCell(new Label(40, i+1, tjb.getInsured_idnum5(), fwcf)); /**/
                }
				
			}
						
			wwb.write();
			wwb.close();
     		response.reset(); // 非常重要
			response.setContentType("text/html; charset=gb2312");
			String downloadfile = new String(new String(file.getName().getBytes(),"iso-8859-1"));
			log.error(downloadfile);
			long filesize = file.length();
			   // 设置输出格式
			response.addHeader("content-type", "application/x-msdownload;");
			response.addHeader("Content-Disposition", "attachment; filename="
			     + downloadfile);//你要在保存窗口中显示的保存文件名
		    response.addHeader("content-length", Long.toString(filesize));
		 // 向客户端写入文件
			   fin = new java.io.FileInputStream(file);
			   byte[] b = new byte[1];
			   int j = 0;
			   while ((j = fin.read(b)) > 0) {
			    response.getOutputStream().write(b);
			   }
			   fin.close();
	           file = null;
	//	}catch(ClientAbortException e) {
	//		e.printStackTrace();
		}catch(Exception ex){
			log.error(ex.toString());
			ex.printStackTrace();
		}finally{
			if (fin!=null)
				try {
					fin.close();
				} catch (IOException e) {
					throw new IOException(e.toString());
				}
				fin = null;
		}	
		
	}
	/*
	 * Excel文件名
	 */
	private String fileName;
	public String getFileName() {
		this.setFileName("财意险订单统计表"+".xls");
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	} 
	
	/*
	 * 文件存储路径
	 */
	private String url;
	@SuppressWarnings("deprecation")
	public String getUrl(HttpServletRequest request) {
	//	File f = new File(request.getRealPath("/")+"ExcelData//");
		//String path = "/oracle/middleware/user_projects/domains/base_domain/servers/AdminServer/upload/chj/";
		//File f = new File(path+"ExcelData/");
		//如果文件不存在则创建文件夹
	//	if (!f.exists()) { 
			//log.error("mkdir");
			//f.mkdir();
		//}
		this.setUrl(request.getRealPath("/")+"ExcelData//");
		//this.setUrl(path+"ExcelData/");
		return url; 
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
