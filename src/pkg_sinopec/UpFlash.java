/**
 * ����flash�ϴ�ͼƬ�����棬��ˮӡ��
 */
package pkg_sinopec;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
public class UpFlash extends HttpServlet {
	private static Logger log = Logger.getLogger(UpFlash.class);
	private static final long serialVersionUID = 1L;
	private static int sizeMax = 1048576;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String org_code = "",  lx= "", filePath = "",mark="",lb="",filename="",info="";
		filePath="/opt/weblogic/user_projects/domains/base_domain/servers/bmzww/sinopec/bximg";
		//filePath="/oracle/middleware/user_projects/domains/base_domain/servers/AdminServer/upload/sinopec/bximg";
		int xh = 0;
		boolean tag = false,tmptag = false;
		Cls_gg gg = new Cls_gg();
		BxPhoto pho = new BxPhoto();
		BufferedInputStream inputStream = null;
		FileOutputStream outputStream = null;
		org_code = request.getParameter("org_code");
		mark = URLDecoder.decode(request.getParameter("mark"),"utf-8");
		lb = request.getParameter("lb");
		lx = request.getParameter("lx");
		log.error(org_code+"/"+mark+"/"+lb+"/"+lx+"/");
		if (org_code == null && "".equals(org_code)) {
			log.error("UpFlash.doGet().org_code is null");
			throw new NullPointerException("UpFlash.doGet().org_code");
		} else {
			try {			
				xh=gg.getint("select TFEE_ID.nextval from dual");
				//filePath = request.getRealPath("/bximg");
			    filename = xh+"_"+lb+".jpg";
			    log.error(filePath+"/"+filename);
			    Map<String, String> map = new HashMap<String, String>();
				map = upload(request,filename,filePath);
				tag = new Boolean(map.get("tag").toString());
				info = map.get("info").toString();
				log.error(filename+"�ϴ������"+tag);
				map = null;
				if (tag) {
					//System.out.println(filePath+filename);
			           if ("car".equals(lx)) {
					         pressText_car(org_code, filePath+"/"+filename, "����", 36,  55, 0, 60);
			              }
			            if ("ka".equals(lx)) {
			            	 pressText_ka(org_code, filePath+"/"+filename, "����", 36,  55, 0, 60);
		                  }					
					gg.update("delete from kcs_specphoto where dd_id=0 and mark="+lb+" and zjh='"+mark+"' and org_code='"+org_code+"'");
					tmptag = pho.insert_lj(xh,mark,org_code,filename,0,lb);
					if (!tmptag) {
						tag = false;
						info = info + ";���ݿ����ʧ��";
						log.error("���ݿ����ʧ��");
					}
				}	else log.error(info);		    

			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				throw new ServletException("UpFlash.doGet()"
						+ e1.toString());
			} finally {
				org_code = null;
				filePath = null;filename=null;
				if (inputStream != null) {
					try {
						inputStream.close();
					} catch (Exception e) {
						throw new ServletException("UpFlash.doGet()"
								+ e.toString());
					}
				}
				if (outputStream != null) {
					try {
						outputStream.close();
					} catch (Exception e) {
						throw new ServletException("UpFlash.doGet()"
								+ e.toString());
					}
				}
			}
		}
		response.setContentType("text/html;charset=UTF-8");//�����ı���ʽ
		response.getWriter().write("tag="+tag+"&info="+info); 
		//response.getWriter().write("tag=false&info=���Է��ش���");
		response.getWriter().flush();
		response.getWriter().close(); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public Map<String, String> upload(HttpServletRequest request,String filename,String uploadPath )
			throws Cls_exception {
		Map<String, String> map = new HashMap<String, String>();
		//String uploadPath = request.getRealPath("/wzhimg");
		String info = "";
		File fullFile = null;
		File savedFile = null;
		boolean flag = true;
		// ������������Ƿ�Ϊmultipart�������ݡ�
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		// �����ǵĻ�
		if (isMultipart) {
			/** Ϊ�����󴴽�һ��DiskFileItemFactory����ͨ��������������ִ�н��������еı�����Ŀ��������һ��List�С� **/
			try {
				DiskFileItemFactory factory = new DiskFileItemFactory();
				// factory.setSizeThreshold(sizeThreshold); // ���û�������С��������4kb
				// factory.setRepository(tempPathFile);// ���û�����Ŀ¼
				// factory.setRepository(new File(uploadPath+"/tmp"+org_code));
				// factory.setSizeThreshold(10240);
				ServletFileUpload upload = new ServletFileUpload(factory);
				upload.setHeaderEncoding("UTF-8");// ����ļ���������
				upload.setSizeMax(sizeMax);// ��������ļ��ߴ�
				@SuppressWarnings("unchecked")
				List<FileItem> items = upload.parseRequest(request);
				// ����Ƿ�����ϴ�������
				if (!checkFileType(items)) {
					flag = false;
					info = "�ļ����Ͳ�����";
				} else {
					Iterator<FileItem> itr = items.iterator();// ���еı�����
					// �����ļ�
					while (itr.hasNext()) {
						FileItem item = itr.next();// ѭ�����ÿ��������
						if (!item.isFormField()) {// ������ļ�����
							if (item.getSize() > 10) {
								String name = item.getName();// ����ļ��� ����·����
								if (name != null) {
									fullFile = new File(item.getName());
									// ext =
									// fullFile.getName().substring(fullFile.getName().lastIndexOf(".")+1).toLowerCase();
									savedFile = new File(uploadPath, filename);
									item.write(savedFile);
									info = filename;
								}
								name = null;
							} else {
								flag = false;
								info = "�������ļ�";
							}
						}
						item.delete();
					}
				}
			} catch (SizeLimitExceededException e) {
				flag = false;
				info = "�ļ���С�������Ƶ�1M.";
				// e.printStackTrace();
			} catch (FileUploadException e) {
				flag = false;
				info = "�ļ��ϴ�����.";
				e.printStackTrace();
			} catch (Exception e) {
				flag = false;
				info = "�ļ��ϴ�����.";
				e.printStackTrace();
			} finally {
				uploadPath = null;
				if (fullFile != null) {
					try {
						fullFile = null;
					} catch (Exception e) {
						throw new Cls_exception(
								"FileUpload.upload.fullFile.isnull()"
										+ e.toString());
					}
				}
				if (savedFile != null) {
					try {
						savedFile = null;
					} catch (Exception e) {
						throw new Cls_exception(
								"FileUpload.upload.fullFile.isnull()"
										+ e.toString());
					}
				}
			}
		} else {
			flag = false;
			info = "�����������";
			System.out.println("the enctype must be multipart/form-data");
		}
		map.put("tag", flag + "");
		map.put("info", info);
		info = null;
		return map;
	}

	/**
	 * �ж��ϴ��ļ�����
	 * 
	 * @param items
	 * @return
	 */
	private Boolean checkFileType(List<FileItem> items) {
		String allowfiletype = "jpg";
		boolean isType = true;
		Iterator<FileItem> itr = items.iterator();// ���еı�����
		while (itr.hasNext()) {
			FileItem item = itr.next();// ѭ�����ÿ��������
			if (!item.isFormField()) {// ������ļ�����
				String name = item.getName();// ����ļ��� ����·����
				if (name != null) {
					File fullFile = new File(item.getName());
					String ext = fullFile.getName()
							.substring(fullFile.getName().lastIndexOf(".") + 1)
							.toLowerCase();
					fullFile = null;
					if ("".equals(ext) || ext == null)
						isType = false;
					else
						isType = allowfiletype.contains(ext);
					if (!isType)
						return false;
					break;
				}
			}
		}

		return true;
	}

	/**
	 * ����ˮӡ
	 * 
	 * @param pressText
	 *            ˮӡ����
	 * @param targetImg
	 *            Ŀ��ͼƬ
	 * @param fontName
	 *            ��������
	 * @param fontStyle
	 *            ������ʽ
	 * @param color
	 *            ������ɫ
	 * @param fontSize
	 *            �����С
	 * @param x
	 *            ����ֵ
	 * @param y
	 *            ����ֵ
	 * @param alpha
	 *            ͸����
	 * @throws Cls_exception 
	 */
	public void pressText_car(String pressText, String targetImg,
			String fontName, int fontStyle, int fontSize, int x, int y) throws Cls_exception,IOException {
		pressText = "�����й��������쳵������";
		File img = null;
		Image src = null;
		BufferedImage image = null;
		Graphics2D g = null;
		try {
			img = new File(targetImg);
			if (img.exists() && img.isFile()) {
				if (img.length() > 0) {
					src = ImageIO.read(img);
					int width = src.getWidth(null);
					int height = src.getHeight(null);
					image = new BufferedImage(width, height,
							BufferedImage.TYPE_INT_RGB);
					g = image.createGraphics();
					g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
							RenderingHints.VALUE_INTERPOLATION_BILINEAR);
					g.drawImage(src, 0, 0, width, height, null);
					g.rotate(Math.toRadians(-35),
							(double) image.getWidth() / 2,
							(double) image.getHeight() / 2);
					g.setColor(Color.red);
					g.setFont(new Font(fontName, fontStyle, fontSize));
					g.setComposite(AlphaComposite.getInstance(
							AlphaComposite.SRC_ATOP, 0.1f));
					g.drawString(
							pressText,
							(width - (getLength(pressText) * fontSize)) / 2 + x,
							(height - fontSize) / 2 + y);
					// g.drawString(pressText, 5, (height - fontSize) / 2 + y);
					// g.drawString(pressText, -20, 120);
					g.dispose();
					ImageIO.write((BufferedImage) image, "jpg", img);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally{
			if (img != null) {
				try {
					img = null;
				}catch (Exception e){
					throw new Cls_exception("ImageUtils.pressText()" + e.toString());
				}
			}
			if (src != null) {
				try {
					src = null;
				}catch (Exception e){
					throw new Cls_exception("ImageUtils.pressText()" + e.toString());
				}
			}			
			if (image != null) {
				try {
					image = null;
				}catch (Exception e){
					throw new Cls_exception("ImageUtils.pressText()" + e.toString());
				}
			}
			if (g != null) {
				try {
					g = null;
				}catch (Exception e){
					throw new Cls_exception("ImageUtils.pressText()" + e.toString());
				}
			}	
		}
	}
	public void pressText_ka(String pressText, String targetImg,
			String fontName, int fontStyle, int fontSize, int x, int y) throws Cls_exception,IOException {
		pressText = "�����й���������ʯ�����Ϳ�";
		File img = null;
		Image src = null;
		BufferedImage image = null;
		Graphics2D g = null;
		try {
			img = new File(targetImg);
			if (img.exists() && img.isFile()) {
				if (img.length() > 0) {
					src = ImageIO.read(img);
					int width = src.getWidth(null);
					int height = src.getHeight(null);
					image = new BufferedImage(width, height,
							BufferedImage.TYPE_INT_RGB);
					g = image.createGraphics();
					g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
							RenderingHints.VALUE_INTERPOLATION_BILINEAR);
					g.drawImage(src, 0, 0, width, height, null);
					g.rotate(Math.toRadians(-35),
							(double) image.getWidth() / 2,
							(double) image.getHeight() / 2);
					g.setColor(Color.red);
					g.setFont(new Font(fontName, fontStyle, fontSize));
					g.setComposite(AlphaComposite.getInstance(
							AlphaComposite.SRC_ATOP, 0.3f));
					g.drawString(
							pressText,
							(width - (getLength(pressText) * fontSize)) / 2 + x,
							(height - fontSize) / 2 + y);
					// g.drawString(pressText, 5, (height - fontSize) / 2 + y);
					// g.drawString(pressText, -20, 120);
					g.dispose();
					ImageIO.write((BufferedImage) image, "jpg", img);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally{
			if (img != null) {
				try {
					img = null;
				}catch (Exception e){
					throw new Cls_exception("ImageUtils.pressText()" + e.toString());
				}
			}
			if (src != null) {
				try {
					src = null;
				}catch (Exception e){
					throw new Cls_exception("ImageUtils.pressText()" + e.toString());
				}
			}			
			if (image != null) {
				try {
					image = null;
				}catch (Exception e){
					throw new Cls_exception("ImageUtils.pressText()" + e.toString());
				}
			}
			if (g != null) {
				try {
					g = null;
				}catch (Exception e){
					throw new Cls_exception("ImageUtils.pressText()" + e.toString());
				}
			}	
		}
	}
	public int getLength(String text) {
		int length = 0;
		for (int i = 0; i < text.length(); i++) {
			if (new String(text.charAt(i) + "").getBytes().length > 1) {
				length += 2;
			} else {
				length += 1;
			}
		}
		return length / 2;
	}
}