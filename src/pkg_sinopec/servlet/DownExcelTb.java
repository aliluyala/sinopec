package pkg_sinopec.servlet;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_connect80;
import pkg_sinopec.Cls_e_tmp;
import pkg_sinopec.Cls_exception;

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

/**
 * Servlet implementation class DownExcelChjTj
 */
public class DownExcelTb extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(DownExcelTb.class);      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownExcelTb() {
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
		try {
			
			 export_ChjTjB(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 导出车险业务发展情况通报
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public void export_ChjTjB(HttpServletRequest request, HttpServletResponse response )throws Exception{
		String qrq =  (String) request.getParameter("qrq");
		String zrq =  (String) request.getParameter("zrq");
		List<Cls_e_tmp> dslist = new ArrayList<Cls_e_tmp>();
		File file = null;
		java.io.FileInputStream fin = null;
		try{
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
			//out = response.getWriter();
			file = new File(this.getUrl(request) + this.getFileName());
			WritableWorkbook wwb = Workbook.createWorkbook(file);
			WritableSheet ws = wwb.createSheet("车险业务发展情况通报("+qrq+"至"+zrq+")", 0);
			//定义单元格样式
			WritableFont wf_title = new WritableFont(WritableFont.createFont("宋体"), 16,  
					 WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE,  
                    jxl.format.Colour.BLACK); // 定义格式 字体 下划线 斜体 粗体 颜色  		
			
			WritableFont wf_head = new WritableFont(WritableFont.createFont("宋体"),13,
                    WritableFont.NO_BOLD,false,UnderlineStyle.NO_UNDERLINE, Colour.BLACK );
			WritableFont wf_head_bold = new WritableFont(WritableFont.createFont("宋体"),13,
                    WritableFont.BOLD,false,UnderlineStyle.NO_UNDERLINE, Colour.BLACK );
			WritableFont wf_table = new WritableFont(WritableFont.createFont("宋体"),12,
                    WritableFont.NO_BOLD,false,UnderlineStyle.NO_UNDERLINE, Colour.BLACK );
			
			
			WritableCellFormat wcf_title = new WritableCellFormat(wf_title); // 单元格定义 
			wcf_title.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式 
			wcf_title.setBorder(Border.ALL, BorderLineStyle.THIN); //设置边框 
			wcf_title.setVerticalAlignment(VerticalAlignment.CENTRE);//把垂直对齐方式指定为居中
			
			WritableCellFormat wcf_head = new WritableCellFormat(wf_head);// 单元格定义   
			wcf_head.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式 
			wcf_head.setBorder(Border.ALL, BorderLineStyle.THIN); //设置边框 
			wcf_head.setVerticalAlignment(VerticalAlignment.CENTRE);//把垂直对齐方式指定为居中
			wcf_head.setWrap(true); //设置自动换行
			
			WritableCellFormat wcf_head_bold = new WritableCellFormat(wf_head_bold);// 单元格定义   
			wcf_head_bold.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式 
			wcf_head_bold.setBorder(Border.ALL, BorderLineStyle.THIN); //设置边框 
			wcf_head_bold.setVerticalAlignment(VerticalAlignment.CENTRE);//把垂直对齐方式指定为居中
			wcf_head_bold.setWrap(true);
			
			//数字格式0.00
			 NumberFormat nf = new NumberFormat("0.00");
			 WritableCellFormat wcf_table_num = new WritableCellFormat(wf_table,nf);
			 wcf_table_num.setBorder(Border.ALL, BorderLineStyle.THIN);	
			 wcf_table_num.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式 
			 //数字格式0
			 NumberFormat znf = new NumberFormat("0");
			 WritableCellFormat wcf_table_num2 = new WritableCellFormat(wf_table,znf);
			 wcf_table_num2.setBorder(Border.ALL, BorderLineStyle.THIN);
			 wcf_table_num2.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式 
			
			ws.setRowView(0, 500);//设置第一行高
			ws.setColumnView(0, 12); // 设置列的宽度
			ws.setColumnView(1, 15); // 设置列的宽度
			ws.setColumnView(2, 15); // 设置列的宽度
			ws.setColumnView(3, 15); // 设置列的宽度
			ws.setColumnView(4, 15); // 设置列的宽度
			ws.setColumnView(5, 15); // 设置列的宽度
			ws.setColumnView(6, 15); // 设置列的宽度
			ws.setColumnView(7, 15); // 设置列的宽度
			ws.setColumnView(8, 15); // 设置列的宽度
			ws.setColumnView(9, 15); // 设置列的宽度
			
			ws.addCell(new Label(0, 0, "车险业务发展情况通报  ("+qrq+"至"+zrq+")",wcf_title));  
			ws.mergeCells(0, 0, 9, 0);  
			ws.addCell(new Label(0, 1, "单位",wcf_title));
			ws.addCell(new Label(1, 1, "当期销售情况",wcf_head));
			ws.mergeCells(1, 1, 3, 1); 
			ws.addCell(new Label(4, 1, "当月累计销售情况",wcf_head));
			ws.mergeCells(4, 1, 5, 1);
			ws.addCell(new Label(6, 1, "全年累计销售情况",wcf_head));
			ws.mergeCells(6, 1, 9, 1);
			
			
			ws.addCell(new Label(0, 2, "单位",wcf_title));
			ws.mergeCells(0, 1, 0, 2);
			ws.addCell(new Label(1, 2, "投保车辆(辆)",wcf_head));
			ws.addCell(new Label(2, 2, "保费(万元)",wcf_head));
			ws.addCell(new Label(3, 2, "辆均保费(元)",wcf_head));
			ws.addCell(new Label(4, 2, "投保车辆(辆)",wcf_head));
			ws.addCell(new Label(5, 2, "保费(万元)",wcf_head));
			ws.addCell(new Label(6, 2, "投保车辆(辆)",wcf_head));
			ws.addCell(new Label(7, 2, "保费(万元)",wcf_head));
			ws.addCell(new Label(8, 2, "保费计划（万元）",wcf_head));
			ws.addCell(new Label(9, 2, "完成进度",wcf_head));
			
			dslist = GetDsdm();
			int size = dslist.size();
			int i=0;
			int bfjh=0;
			Double wchjd = 0.0;
			Cls_e_tmp tmp_sj = new Cls_e_tmp();
			DecimalFormat df = (DecimalFormat) DecimalFormat.getInstance();
			df.applyPattern("##.##%");
			for (i=0;i<size;i++) {
				ws.addCell(new Label(0, i+3, dslist.get(i).getS2(),wcf_head_bold));
				tmp_sj = getDayTj(dslist.get(i).getS1(),qrq,zrq);
				ws.addCell(new jxl.write.Number(1, i+3, tmp_sj.getNum1(),wcf_table_num2));
				ws.addCell(new jxl.write.Number(2, i+3, tmp_sj.getD1(),wcf_table_num));
				ws.addCell(new jxl.write.Number(3, i+3, tmp_sj.getD2(),wcf_table_num));
				tmp_sj = getMonTj(dslist.get(i).getS1(),zrq);
				ws.addCell(new jxl.write.Number(4, i+3, tmp_sj.getNum1(),wcf_table_num2));
				ws.addCell(new jxl.write.Number(5, i+3, tmp_sj.getD1(),wcf_table_num));
				tmp_sj = getYearTj(dslist.get(i).getS1(),zrq);
				ws.addCell(new jxl.write.Number(6, i+3, tmp_sj.getNum1(),wcf_table_num2));
				ws.addCell(new jxl.write.Number(7, i+3, tmp_sj.getD1(),wcf_table_num));
				bfjh = getBfPlane(dslist.get(i).getS1());
				ws.addCell(new jxl.write.Number(8, i+3, bfjh ,wcf_table_num2));
				wchjd = tmp_sj.getD1()/bfjh;
				ws.addCell(new Label(9, i+3, df.format(wchjd),wcf_head));
				
			}
		
			wwb.write();
			wwb.close();

			
			response.reset(); // 非常重要
			response.setContentType("text/html; charset=gb2312");
			String downloadfile = new String(new String(file.getName().getBytes(),"iso-8859-1"));
			//log.error(downloadfile);
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
		}catch(Exception ex){
			log.error(ex.toString());
			ex.printStackTrace();
		}finally{
			file = null;
			fin = null;
			//if (file.exists()) {//下载完毕删除文件
			//	file.delete();
			//}
		}	
		
	}
	/*
	 * Excel文件名
	 */
	private String fileName;
	public String getFileName() {
		this.setFileName("车险业务发展情况通报"+".xls");
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
		File f = new File(request.getRealPath("/")+"ExcelData//");
		//String path = "/oracle/middleware/user_projects/domains/base_domain/servers/AdminServer/upload/chj/";
		//File f = new File(path+"ExcelData/");
		//如果文件不存在则创建文件夹
		if (!f.exists()) { 
			log.error("mkdir");
			f.mkdir();
		}
		this.setUrl(request.getRealPath("/")+"ExcelData//");
		//this.setUrl(path+"ExcelData/");
		return url; 
	}
	public void setUrl(String url) {
		this.url = url;
	}
	private List<Cls_e_tmp> GetDsdm() throws Cls_exception{
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
	 try{	
		 Cls_connect80 cn = new Cls_connect80();
	 	 conn = cn.connect().getConnection();
		 pstmt=conn.prepareStatement("select city_no,para_value from esseapp.kcs_para t where coun_no='00'  order by city_no ");
		 rs=pstmt.executeQuery();
	     Cls_e_tmp v_tmp;
		while(rs.next()) {
			v_tmp=new Cls_e_tmp();
			v_tmp.setS1(rs.getString("city_no"));
			v_tmp.setS2(rs.getString("para_value"));
			rtnAL.add(v_tmp);
			v_tmp=null;
					}
		 }
	  catch(Exception e){
			throw new Cls_exception(" DownExcelTb.GetDsdm() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception(" DownExcelTb.GetDsdm()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception(" DownExcelTb.GetDsdm()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception(" DownExcelTb.GetDsdm()"+e.toString());
					}
			   conn =null;
						}
		}
	return rtnAL;
		}		
	private  Cls_e_tmp getDayTj(String citycode,String qrq,String zrq) throws Cls_exception{
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		Cls_e_tmp rtn = new Cls_e_tmp();
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("select count(*) as n1,sum(f_sunshi+f_3zhe+f_daoq+f_siji+f_chke+f_ziran+f_hhen+f_boli+f_bjm+f_jq+f_3)/10000 as d1, ");
		sqlInsert.append(" sum(f_sunshi+f_3zhe+f_daoq+f_siji+f_chke+f_ziran+f_hhen+f_boli+f_bjm+f_jq+f_3)/count(*) as d2");
		sqlInsert.append("  from kcs_specbaoxian t where to_char(proce_time,'yyyy-mm-dd')>='"+qrq);
		sqlInsert.append("' and to_char(proce_time,'yyyy-mm-dd')<='"+zrq+"' and order_type='6' ");
		if (!"00".equals(citycode))
			sqlInsert.append(" and city_code='"+citycode+"'");
		 try{	
			 Cls_connect cn = new Cls_connect();
		 	 conn = cn.connect().getConnection();
			 pstmt=conn.prepareStatement(sqlInsert.toString());
			 rs=pstmt.executeQuery();
			while(rs.next()) {
				rtn.setNum1(rs.getInt("n1"));
				rtn.setD1(rs.getDouble("d1"));
				rtn.setD2(rs.getDouble("d2"));
						}
			 }
		  catch(Exception e){
				throw new Cls_exception(" DownExcelTb.getDayTj() "+e.toString());
		 }	
		finally{
			
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception(" DownExcelTb.getDayTj()"+e.toString());
						}
				     rs=null;  
							}
							if (pstmt!=null) {
				try{
								pstmt.close();}
				catch(Exception e){
							 throw new Cls_exception(" DownExcelTb.getDayTj()"+e.toString());
						}
				     pstmt=null;
							}
							if (conn!=null){
				try{
								conn.close();
				}catch(Exception e){
							 throw new Cls_exception(" DownExcelTb.getDayTj()"+e.toString());
						}
				   conn =null;
							}
			}
		return rtn;
		
	}
	private  Cls_e_tmp getMonTj(String citycode,String rq) throws Cls_exception{
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		Cls_e_tmp rtn = new Cls_e_tmp();
		String mon = rq.substring(0, rq.indexOf("-", 5));
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("select count(*) as n1,sum(f_sunshi+f_3zhe+f_daoq+f_siji+f_chke+f_ziran+f_hhen+f_boli+f_bjm+f_jq+f_3)/10000 as d1 ");
		sqlInsert.append("  from kcs_specbaoxian t where to_char(proce_time,'yyyy-mm')='"+mon);
		sqlInsert.append("' and order_type='6' and to_char(proce_time,'yyyy-mm-dd')<='"+rq+"'");
		if (!"00".equals(citycode))
			sqlInsert.append(" and city_code='"+citycode+"'");
		 try{	
			 Cls_connect cn = new Cls_connect();
		 	 conn = cn.connect().getConnection();
			 pstmt=conn.prepareStatement(sqlInsert.toString());
			 rs=pstmt.executeQuery();
			while(rs.next()) {
				rtn.setNum1(rs.getInt("n1"));
				rtn.setD1(rs.getDouble("d1"));
						}
			 }
		  catch(Exception e){
				throw new Cls_exception(" DownExcelTb.getMonTj() "+e.toString());
		 }	
		finally{
			
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception(" DownExcelTb.getMonTj() "+e.toString());
						}
				     rs=null;  
							}
							if (pstmt!=null) {
				try{
								pstmt.close();}
				catch(Exception e){
							 throw new Cls_exception(" DownExcelTb.getMonTj() "+e.toString());
						}
				     pstmt=null;
							}
							if (conn!=null){
				try{
								conn.close();
				}catch(Exception e){
							 throw new Cls_exception(" DownExcelTb.getMonTj() "+e.toString());
						}
				   conn =null;
							}
			}
		return rtn;		
	}
	private  Cls_e_tmp getYearTj(String citycode,String rq) throws Cls_exception{
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		Cls_e_tmp rtn = new Cls_e_tmp();
		String year = rq.substring(0, rq.indexOf("-", 1));
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("select count(*) as n1,sum(f_sunshi+f_3zhe+f_daoq+f_siji+f_chke+f_ziran+f_hhen+f_boli+f_bjm+f_jq+f_3)/10000 as d1 ");
		sqlInsert.append("  from kcs_specbaoxian t where to_char(proce_time,'yyyy')='"+year);
		sqlInsert.append("' and order_type='6' and to_char(proce_time,'yyyy-mm-dd')<='"+rq+"'");
		if (!"00".equals(citycode))
			sqlInsert.append(" and city_code='"+citycode+"'");
		 try{	
			 Cls_connect cn = new Cls_connect();
		 	 conn = cn.connect().getConnection();
			 pstmt=conn.prepareStatement(sqlInsert.toString());
			 rs=pstmt.executeQuery();
			while(rs.next()) {
				rtn.setNum1(rs.getInt("n1"));
				rtn.setD1(rs.getDouble("d1"));
						}
			 }
		  catch(Exception e){
				throw new Cls_exception(" DownExcelTb.getYearTj() "+e.toString());
		 }	
		finally{
			
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception(" DownExcelTb.getYearTj() "+e.toString());
						}
				     rs=null;  
							}
							if (pstmt!=null) {
				try{
								pstmt.close();}
				catch(Exception e){
							 throw new Cls_exception(" DownExcelTb.getYearTj) "+e.toString());
						}
				     pstmt=null;
							}
							if (conn!=null){
				try{
								conn.close();
				}catch(Exception e){
							 throw new Cls_exception(" DownExcelTb.getYearTj() "+e.toString());
						}
				   conn =null;
							}
			}
		return rtn;		
	}
	private int getBfPlane(String citycode) {
		int bfjh = 0;
		if ("60".equals(citycode)) bfjh = 300;//济南
		if ("61".equals(citycode)) bfjh = 650;//青岛
		if ("62".equals(citycode)) bfjh = 300;//淄博
		if ("63".equals(citycode)) bfjh = 130;//枣庄
		if ("65".equals(citycode)) bfjh = 270;//东营
		if ("66".equals(citycode)) bfjh = 400;//烟台
		if ("67".equals(citycode)) bfjh = 850;//潍坊
		if ("68".equals(citycode)) bfjh = 600;//济宁
		if ("69".equals(citycode)) bfjh = 300;//泰安
		if ("80".equals(citycode)) bfjh = 200;//威海
		if ("81".equals(citycode)) bfjh = 130;//日照
		if ("82".equals(citycode)) bfjh = 70;//莱芜
		if ("83".equals(citycode)) bfjh = 170;//滨州
		if ("85".equals(citycode)) bfjh = 850;//德州
		if ("86".equals(citycode)) bfjh = 460;//聊城
		if ("87".equals(citycode)) bfjh = 500;//临沂
		if ("88".equals(citycode)) bfjh = 420;//菏泽
		if ("00".equals(citycode)) bfjh = 6600;//山东省
				
	    return bfjh;	
	}
}
