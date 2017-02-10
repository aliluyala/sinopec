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
	 //��ʼ��
	/**
	 * �ϴ��ļ� 
	 * @param request
	 * @return true �ϴ��ɹ� false�ϴ�ʧ��
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
		//������������Ƿ�Ϊmultipart�����ݡ�
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		//�����ǵĻ�
		if(isMultipart){
			/**Ϊ�����󴴽�һ��DiskFileItemFactory����ͨ��������������ִ�н��������еı���Ŀ��������һ��List�С�**/
			try {
				DiskFileItemFactory factory = new DiskFileItemFactory();
				//factory.setSizeThreshold(sizeThreshold); // ���û�������С��������4kb
				//factory.setRepository(tempPathFile);// ���û�����Ŀ¼
				//factory.setRepository(new File(uploadPath+"/tmp"+org_code));
				//factory.setSizeThreshold(10240); 
				ServletFileUpload upload = new ServletFileUpload(factory);
				upload.setHeaderEncoding("UTF-8");//����ļ���������
				upload.setSizeMax(sizeMax);// ��������ļ��ߴ�
				List<FileItem> items = upload.parseRequest(request);
				// ����Ƿ�����ϴ�������
				if(!checkFileType(items))  {
					flag=false; info="�ļ����Ͳ�����";
				} else {
				Iterator<FileItem> itr = items.iterator();//���еı���
				//�����ļ�
				while (itr.hasNext()){
					 FileItem item = (FileItem) itr.next();//ѭ�����ÿ������
					 if (!item.isFormField()){//������ļ�����
						  if (item.getSize()>10) {
							 String name = item.getName();//����ļ��� ����·����
							 if(name!=null){
								 fullFile=new File(item.getName());
								 ext = fullFile.getName().substring(fullFile.getName().lastIndexOf(".")+1).toLowerCase();
								 savedFile=new File(path,xh+"_"+mark+"."+ext);
								 item.write(savedFile);
								 info=xh+"_"+mark+"."+ext;
								 log.error(path+"/"+info);
								 log.error(info+"�ϴ�");
							 }
						  } else {flag = false;info="�������ļ�";}
					 }
					 item.delete();
				}
				}
			}catch (SizeLimitExceededException e) {
			   flag = false;info="�ļ���С�������Ƶ�1M.";
			   //e.printStackTrace();		
			} catch (FileUploadException e) {
				flag = false;info="�ļ��ϴ�����.";
				e.printStackTrace();
			}catch (Exception e) {
				flag = false;info="�ļ��ϴ�����.";
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
			flag = false;info="�����������";
			System.out.println("the enctype must be multipart/form-data");
		}
		map.put("tag", flag+"");
		map.put("info", info);
		return map;
	}
	/**
	 * �ж��ϴ��ļ�����
	 * @param items
	 * @return
	 */
	private static Boolean checkFileType(List<FileItem> items){
		String allowfiletype="jpg,png"; 
		boolean isType = true;
		Iterator<FileItem> itr = items.iterator();//���еı���
		while (itr.hasNext()){
			 FileItem item = (FileItem) itr.next();//ѭ�����ÿ������
			 if (!item.isFormField()){//������ļ�����
					 String name = item.getName();//����ļ��� ����·����
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
