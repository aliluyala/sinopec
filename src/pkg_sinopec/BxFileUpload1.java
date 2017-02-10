package pkg_sinopec;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.FileUploadBase.SizeLimitExceededException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.log4j.Logger;
/**
 * @author Administrator
 *
 */
public class BxFileUpload1 {
	 private  Logger log = Logger.getLogger(BxFileUpload1.class);
	 private static int sizeMax = 1048576;
	 //初始化
	/**
	 * 上传文件 
	 * @param request
	 * @return true 上传成功 false上传失败
	 * @throws Cls_exception 
	 */
	@SuppressWarnings("unchecked")
	public Map<String, String> upload(HttpServletRequest request,int xh) throws Cls_exception{
		String path = "/opt/weblogic/user_projects/domains/base_domain/servers/bmzww/sinopec/bximg";
		//String path = "/oracle/middleware/user_projects/domains/base_domain/servers/AdminServer/upload/sinopec/bximg";
		Map<String, String> map = new HashMap<String, String>(); 
		//uploadPath=request.getRealPath("/bximg");
		String ext="";
		String info="";
		File fullFile = null;
		File savedFile = null;
    	//String org_code=(String)request.getParameter("org_code");
    	String mark=request.getParameter("tpbj");
    	//StringBuffer url_buffer = request.getRequestURL(); 
    	//String queryString = request.getQueryString();  
     //   log.error(url_buffer.toString()+"?"+queryString);
    //	log.error(mark+"-"+org_code);
    	
		boolean flag = true;
		//检查输入请求是否为multipart表单数据。
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		//若果是的话
		if(isMultipart){
			/**为该请求创建一个DiskFileItemFactory对象，通过它来解析请求。执行解析后，所有的表单项目都保存在一个List中。**/
			try {
				DiskFileItemFactory factory = new DiskFileItemFactory();
				//factory.setSizeThreshold(sizeThreshold); // 设置缓冲区大小，这里是4kb
				//factory.setRepository(tempPathFile);// 设置缓冲区目录
				//factory.setRepository(new File(uploadPath+"/tmp"+org_code));
				//factory.setSizeThreshold(10240); 
				ServletFileUpload upload = new ServletFileUpload(factory);
				upload.setHeaderEncoding("UTF-8");//解决文件乱码问题
				upload.setSizeMax(sizeMax);// 设置最大文件尺寸
				List<FileItem> items = upload.parseRequest(request);
				// 检查是否符合上传的类型
				if(!checkFileType(items))  {
					flag=false; info="文件类型不符。";
				} else {
				Iterator<FileItem> itr = items.iterator();//所有的表单项
				//保存文件
				while (itr.hasNext()){
					 FileItem item = (FileItem) itr.next();//循环获得每个表单项
					 if (!item.isFormField()){//如果是文件类型
						  if (item.getSize()>10) {
							 String name = item.getName();//获得文件名 包括路径啊
							 if(name!=null){
								 fullFile=new File(item.getName());
								 ext = fullFile.getName().substring(fullFile.getName().lastIndexOf(".")+1).toLowerCase();
								 savedFile=new File(path,xh+"_"+mark+"."+ext);
								 item.write(savedFile);
								 info=xh+"_"+mark+"."+ext;
								 log.error(path+"/"+info);
								 log.error(info+"上传");
							 }
						  } else {flag = false;info="非正常文件";}
					 }
					 item.delete();
				}
				}
			}catch (SizeLimitExceededException e) {
			   flag = false;info="文件大小超过限制的1M.";
			   //e.printStackTrace();		
			} catch (FileUploadException e) {
				flag = false;info="文件上传错误.";
				e.printStackTrace();
			}catch (Exception e) {
				flag = false;info="文件上传错误.";
				e.printStackTrace();
	        }finally{
	        	ext=null;
	        	if (fullFile != null) {
					try {
						fullFile = null;
					}catch (Exception e){
						throw new Cls_exception("BxFileUpload1.upload.fullFile.isnull()" + e.toString());
					}
				}
	        	if (savedFile != null) {
					try {
						savedFile = null;
					}catch (Exception e){
						throw new Cls_exception(" BxFileUpload1.upload.fullFile.isnull()" + e.toString());
					}
				}	        	        	
	        }
		}else{
			flag = false;info="输入请求错误";
			System.out.println("the enctype must be multipart/form-data");
		}
		map.put("tag", flag+"");
		map.put("info", info);
		return map;
	}
	/**
	 * 判断上传文件类型
	 * @param items
	 * @return
	 */
	private static Boolean checkFileType(List<FileItem> items){
		String allowfiletype="jpg,png"; 
		boolean isType = true;
		Iterator<FileItem> itr = items.iterator();//所有的表单项
		while (itr.hasNext()){
			 FileItem item = (FileItem) itr.next();//循环获得每个表单项
			 if (!item.isFormField()){//如果是文件类型
					 String name = item.getName();//获得文件名 包括路径啊
					 if(name!=null){
						 File fullFile=new File(item.getName());
						 String ext = fullFile.getName().substring(fullFile.getName().lastIndexOf(".")+1).toLowerCase(); 
						 fullFile = null;
						 if ("".equals(ext) || ext==null) 
							 isType= false; 
						 else 
						    isType =allowfiletype.contains(ext); 
						 if(!isType) return false;
						 break;
					 }
			 }
		}
		
		return true;
	}
	
}
