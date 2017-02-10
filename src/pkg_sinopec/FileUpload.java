package pkg_sinopec;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadBase.SizeLimitExceededException;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
/*
 * ��ͨ�������ÿ��һ��ļ��ϴ�
 */
public class FileUpload {
	private static String uploadPath = "/opt/weblogic/user_projects/domains/base_domain/servers/bmzww/sinopec/xyk";// �ϴ��ļ���Ŀ¼
	//private static String uploadPath = "C:/jboss6/server/default/deploy/sinopec.war/xyk";// �ϴ��ļ���Ŀ¼
	//private static String uploadPath = "/oracle/middleware/user_projects/domains/base_domain/servers/AdminServer/upload/sinopec/xyk";
	private static int sizeMax = 1048576;
	 //��ʼ��
	/**
	 * �ϴ��ļ� 
	 * @param request
	 * @return true �ϴ��ɹ� false�ϴ�ʧ��
	 * @throws Cls_exception 
	 */
	@SuppressWarnings("unchecked")
	public Map<String, String> upload(HttpServletRequest request) throws Cls_exception{
		Map<String, String> map = new HashMap<String, String>(); 
		//uploadPath=request.getRealPath("/pcwj");
		
		String wjm="";
		String info="";
		File fullFile = null;
		File savedFile = null;
    	String org_code=(String)request.getParameter("org_code");
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
				if(!checkFileType2(items))  {
					flag=false; info="�ļ����Ͳ�����";
				} else {
				Iterator<FileItem> itr = items.iterator();//���еı���
				//�����ļ�
				while (itr.hasNext()){
					 FileItem item = itr.next();//ѭ�����ÿ������
					 if (!item.isFormField()){//������ļ�����
						  if (item.getSize()>10) {
							 String name = item.getName();//����ļ��� ����·����
							 if(name!=null){
								 fullFile=new File(item.getName());
								 wjm=fullFile.getName();
								 wjm=fmch(wjm);
								// log.error(wjm+"/length="+wjm.length());
								// log.error(shbh+"-"+rq);
								 savedFile=new File(uploadPath,org_code+getSysDatetime()+".xls");
								 item.write(savedFile);
								 info=org_code+getSysDatetime()+".xls";

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
	public Map<String, String> uploads(HttpServletRequest request) throws Cls_exception{
		Map<String, String> map = new HashMap<String, String>(); 
		//uploadPath=request.getRealPath("/pcwj");
		String shbh="",rq="",wjm="";
		String info="";
		File fullFile = null;
		File savedFile = null;
    	String org_code=(String)request.getParameter("org_code");
    	//log.error("ʡ----"+org_code);
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
				@SuppressWarnings("unchecked")
				List<FileItem> items = upload.parseRequest(request);
				// ����Ƿ�����ϴ�������
				if(!checkFileType2(items))  {
					flag=false; info="�ļ����Ͳ�����";
				} else {
				Iterator<FileItem> itr = items.iterator();//���еı���
				//�����ļ�
				while (itr.hasNext()){
					 FileItem item = itr.next();//ѭ�����ÿ������
					 if (!item.isFormField()){//������ļ�����
						  if (item.getSize()>10) {
							 String name = item.getName();//����ļ��� ����·����
							 if(name!=null){
								 fullFile=new File(item.getName());
								 wjm=fullFile.getName();
								 wjm=getmch(wjm);
                               //  log.error(wjm+"/length="+wjm.length());
								// shbh=fullFile.getName().substring(0,15);
								// rq=fullFile.getName().substring(38,46);
								// log.error(shbh+"-"+rq);
								 savedFile=new File(uploadPath,org_code+getSysDatetime());
								 item.write(savedFile);
								 info=org_code+getSysDatetime();
							 }
						  } else {flag = false;info="�������ļ�";}
					 }
					 item.delete();
				}
				}
			}catch (SizeLimitExceededException e) {
			   flag = false;info="�ļ���С�������Ƶ�600k.";
			   //e.printStackTrace();		
			} catch (FileUploadException e) {
				flag = false;info="�ļ��ϴ�����.";
				e.printStackTrace();
			}catch (Exception e) {
				flag = false;info="�ļ��ϴ�����.";
				e.printStackTrace();
	        }finally{
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
		map.put("shbh",shbh);
		map.put("rq", rq);
		//log.error(shbh+"/"+rq);
		return map;
	}
	private static String getmch(String mch) {
		 int index = mch.lastIndexOf("\\");
		 //if (index<size) return mch.substring(size);
		 return mch.substring(index + 1);
	}
	private static String fmch(String name){
		String temp[] = name.replaceAll("\\\\","/").split("/"); 
		if (temp.length > 1) { 
		    name = temp[temp.length - 1]; 
		}
       return name;
	}
	/**
	 * �ж��ϴ��ļ�����
	 * @param items
	 * @return
	 */
/*	private  Boolean checkFileType(List<FileItem> items){
		String allowfiletype="xls"; 
		boolean isType = true;
		Iterator<FileItem> itr = items.iterator();//���еı���
		while (itr.hasNext()){
			 FileItem item = (FileItem) itr.next();//ѭ�����ÿ������
			 if (!item.isFormField()){//������ļ�����
					 String name = item.getName();//����ļ��� ����·����
					 if(name!=null){
						 File fullFile=new File(item.getName());
						 String ext = fullFile.getName().substring(fullFile.getName().lastIndexOf(".")+1).toLowerCase(); 
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
	}*/
	private  Boolean checkFileType2(List<FileItem> items){
		boolean isType = true;
		Iterator<FileItem> itr = items.iterator();//���еı���
		while (itr.hasNext()){
			 FileItem item = itr.next();//ѭ�����ÿ������
			 if (!item.isFormField()){//������ļ�����
					 String name = item.getName();//����ļ��� ����·����
					 if(name!=null){
						 File fullFile=new File(item.getName());
						 if (fullFile.getName().contains("."))
							 isType= true;
						 else 
							 isType =false;
						 fullFile = null;
						 if(!isType) return false;
						 break;
					 }
			 }
		}
		
		return true;
	}
	public String getSysDatetime() {
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
	    String mytime = sdf.format(new Date());
	     return mytime;
	  }
}