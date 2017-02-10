package pkg_sinopec.servlet;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
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

import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_connect80;
import pkg_sinopec.Cls_e_tmp;
import pkg_sinopec.Cls_exception;

/**
 * Servlet implementation class DownExcelQxTb
 */
public class DownExcelQxTb extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(DownExcelQxTb.class);       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownExcelQxTb() {
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
	public void export_ChjTjB(HttpServletRequest request, HttpServletResponse response )throws Exception{
		String qrq =  (String) request.getParameter("qrq");
		String zrq =  (String) request.getParameter("zrq");
		List<Cls_e_tmp> dslist = new ArrayList<Cls_e_tmp>();
		List<Cls_e_tmp> qxlist = new ArrayList<Cls_e_tmp>();
		Cls_e_tmp tmp_sj = new Cls_e_tmp();
		File file = null;
		java.io.FileInputStream fin = null;
		try{
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
			//out = response.getWriter();
			file = new File(this.getUrl(request) + this.getFileName());
			WritableWorkbook wwb = Workbook.createWorkbook(file);
			WritableSheet ws = wwb.createSheet("车险业务县局业务发展情况通报("+qrq+"至"+zrq+")", 0);
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
			ws.setColumnView(0, 20); // 设置列的宽度
			ws.setColumnView(1, 15); // 设置列的宽度
			ws.setColumnView(2, 20); // 设置列的宽度
			ws.setColumnView(3, 15); // 设置列的宽度
			ws.setColumnView(4, 20); // 设置列的宽度
			
			ws.addCell(new Label(0, 0, "\"福至新春 赢在首季\"车险业务县局业务发展情况通报  ",wcf_title));  
			ws.mergeCells(0, 0, 4, 0); 
			dslist = GetDsdm();
			int size = dslist.size();
			int s_line = 1;
			int i=0,j=0,qx_size=0;
			String citycode="";
			for (i=0;i<size;i++) {
				log.error(dslist.get(i).getS2());
				log.error("line="+s_line);
				ws.addCell(new Label(0, s_line, dslist.get(i).getS2(),wcf_title));
				ws.addCell(new Label(1, s_line, "当期销售情况",wcf_head));
				ws.mergeCells(1, s_line, 2, s_line); 
				ws.addCell(new Label(3, s_line, "全年累计销售情况",wcf_head));
				ws.mergeCells(3, s_line, 4, s_line);
				
				ws.addCell(new Label(0, s_line+1, dslist.get(i).getS2(),wcf_title));
				ws.mergeCells(0, s_line, 0, s_line+1);
				ws.addCell(new Label(1, s_line+1, "投保车辆(辆)",wcf_head));
				ws.addCell(new Label(2, s_line+1, "保费(万元)",wcf_head));
				ws.addCell(new Label(3, s_line+1, "投保车辆(辆)",wcf_head));
				ws.addCell(new Label(4, s_line+1, "保费(万元)",wcf_head));
				
				citycode = dslist.get(i).getS1();
				qxlist=GetQxdm(citycode);	
				qx_size = qxlist.size();
				log.error("qx_size="+qx_size);
				for (j=0;j<qx_size;j++) {
					log.error(qxlist.get(j).getS2());					
					ws.addCell(new Label(0, s_line+2+j, qxlist.get(j).getS2(),wcf_head ));
					tmp_sj = getDayTj(citycode+qxlist.get(j).getS1(),qrq,zrq);
					ws.addCell(new jxl.write.Number(1, s_line+2+j, tmp_sj.getNum1(),wcf_table_num2));
					ws.addCell(new jxl.write.Number(2, s_line+2+j, tmp_sj.getD1(),wcf_table_num));
					tmp_sj = getYearTj(citycode+qxlist.get(j).getS1(),zrq);
					ws.addCell(new jxl.write.Number(3, s_line+2+j, tmp_sj.getNum1(),wcf_table_num2));
					ws.addCell(new jxl.write.Number(4, s_line+2+j, tmp_sj.getD1(),wcf_table_num));				
				}
				 s_line = s_line +2+ qx_size;
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
			   int k = 0;
			   while ((k = fin.read(b)) > 0) {
			    response.getOutputStream().write(b);
			   }
			   fin.close();
	           file = null;

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
	private  Cls_e_tmp getDayTj(String qxcode,String qrq,String zrq) throws Cls_exception{
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		Cls_e_tmp rtn = new Cls_e_tmp();
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("select count(*) as n1,sum(f_sunshi+f_3zhe+f_daoq+f_siji+f_chke+f_ziran+f_hhen+f_boli+f_bjm+f_jq+f_3)/10000 as d1 ");
		sqlInsert.append("  from kcs_specbaoxian t where to_char(proce_time,'yyyy-mm-dd')>='"+qrq);
		sqlInsert.append("' and to_char(proce_time,'yyyy-mm-dd')<='"+zrq+"' and order_type='6' ");
		sqlInsert.append(" and substr(org_code,0,4)='"+qxcode+"'");
		//System.out.println(sqlInsert.toString());
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
	private  Cls_e_tmp getYearTj(String qxcode,String rq) throws Cls_exception{
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		Cls_e_tmp rtn = new Cls_e_tmp();
		String year = rq.substring(0, rq.indexOf("-", 1));
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("select count(*) as n1,sum(f_sunshi+f_3zhe+f_daoq+f_siji+f_chke+f_ziran+f_hhen+f_boli+f_bjm+f_jq+f_3)/10000 as d1 ");
		sqlInsert.append("  from kcs_specbaoxian t where to_char(proce_time,'yyyy')='"+year);
		sqlInsert.append("' and order_type='6' and to_char(proce_time,'yyyy-mm-dd')<='"+rq+"'");
		sqlInsert.append("  and substr(org_code,0,4)='"+qxcode+"'");
		//System.out.println(sqlInsert.toString());
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
	private List<Cls_e_tmp> GetDsdm() throws Cls_exception{
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
	 try{	
		 Cls_connect80 cn = new Cls_connect80();
	 	 conn = cn.connect().getConnection();
		 pstmt=conn.prepareStatement("select city_no,para_value from esseapp.kcs_para t where coun_no='00' and city_no<>'00'  order by city_no ");
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
	/**
	 * 查询某地市所有区县名称代码
	 * @return
	 */
	public List<Cls_e_tmp> GetQxdm(String cityno) throws Cls_exception{
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
	 try{	
		 Cls_connect80 cn = new Cls_connect80();
	 	 conn = cn.connect().getConnection();
		 pstmt=conn.prepareStatement("select coun_no,para_value from esseapp.kcs_para t where city_no=? and coun_no<>'00'  order by coun_no");
		 pstmt.setString(1, cityno);
		 rs=pstmt.executeQuery();
	     Cls_e_tmp v_tmp;
		while(rs.next()) {
			v_tmp=new Cls_e_tmp();
			v_tmp.setS1(rs.getString("coun_no"));
			v_tmp.setS2(rs.getString("para_value"));
			rtnAL.add(v_tmp);
			v_tmp=null;
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_zd.GetQxdm() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetQxdm()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetQxdm()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetQxdm()"+e.toString());
					}
			   conn =null;
						}
		}
	return rtnAL;
		}	
	/**
	 * Excel文件名
	 */
	private String fileName;
	public String getFileName() {
		this.setFileName("车险业务县局业务发展情况通报"+".xls");
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	} 
	
	/**
	 * 文件存储路径
	 */
	private String url;
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
}
