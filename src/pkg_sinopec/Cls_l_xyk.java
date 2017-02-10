package pkg_sinopec;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author Administrator
 *
 */
public class Cls_l_xyk {
	private static String wj="/opt/weblogic/user_projects/domains/base_domain/servers/bmzww/sinopec/xyk.ini";
	//private static String wj="C:/jboss6/server/default/deploy/sinopec.war/xyk.ini";
	 public static void main(String[] args)throws Exception{ 
		//String str = RedWj();
		//System.out.println(str);
		//WriteWj("https://creditcardapp.bankcomm.com/applynew/front/apply/new/index.html?recomNumber=13793337389&recomType=01");
	 }
	 public  String RedWj() throws Exception{ 
		    InputStreamReader inputReader = null;
	        BufferedReader bufferReader = null;
	      //  OutputStream outputStream = null;
	        StringBuffer strBuffer = new StringBuffer();
	        try
	        {
	            InputStream inputStream = new FileInputStream(wj);
	            inputReader = new InputStreamReader(inputStream);
	            bufferReader = new BufferedReader(inputReader);
	            
	            // 读取一行
	            String line = null;
	            
	                
	            while ((line = bufferReader.readLine()) != null)
	            {
	                strBuffer.append(line);
	            } 
	        }
	        catch (IOException e)
	        {
	            //LOG.error(e.getMessage());
	        }
	        finally
	        {
	        	//outputStream.close();
	        	bufferReader.close();
	        	inputReader.close();
	        }
			return strBuffer.toString(); 
	 }
	public  void WriteWj(String nr) {
		File file = new File(wj);
		try {
		FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(nr.toCharArray());
		bw.newLine();
		bw.flush();
		//System.out.println("数据已经写入File.txt文件中");
		} catch (IOException e) {
		e.printStackTrace();
		}

	}
}
