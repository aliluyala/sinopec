/**
 * 
 */
package pkg_sinopec;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @author Administrator
 *
 */
public class Cls_hsbc {
	public static void main(String[] args) throws Cls_exception    {	
	    String name="C:/jboss6/server/default/deploy/sinopec.war/xyk/test.txt";
	    List<String> list =  new ArrayList<String>();
	    String info="";
	    int size=0,xh=0;
	    String xm="",hm1="",hm2="";
	    boolean  tag=false;
	    try {
			list=readTxt(name);
			size=list.size();
			for (int i=0;i<size;i++) {
				xm = list.get(i).split("/")[0].substring(0,1);
				hm1 =  list.get(i).split("/")[1].substring(0,4);
				hm2 =  list.get(i).split("/")[1].substring(8,12);
			    System.out.println("select count(*) from kcs_spechsbc where substr(name,1,1)='"+xm+"' and substr(sfzid,1,4)='"+hm1+"' and substr(sfzid,15,18)='"+hm2+"'");

				int count = getrow(xm,hm1,hm2);
				System.out.println(xm+" "+hm1+" "+hm2+" "+count);
				if (count==1) {
				       xh=getint(xm,hm1,hm2);
				      if (xh>0) {
				    	  tag=set_suc(xh);
				    	  info=info+list.get(i).split("/")[0]+"匹配成功";
				      }
				      else info=info+"未找到"+ list.get(i).split("/")[0]+";";
				      }
				if (count==0) info=info+"未找到"+ list.get(i).split("/")[0]+";";
				if (count>1) info=info+list.get(i).split("/")[0]+"匹配数目大于1；";
			}
			System.out.println(info);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
   public Map shj_input(String wjm) throws Cls_exception{
	   Map map = new HashMap(); 
	    List<String> list =  new ArrayList<String>();
	    String info="";
	    int size=0,xh=0,num=0;
	    String xm="",hm1="",hm2="";
	    boolean  tag=false;
	    try {
			list=readTxt(wjm);
			size=list.size();
			for (int i=0;i<size;i++) {
				xm = list.get(i).split("/")[0].substring(0,1);
				hm1 =  list.get(i).split("/")[1].substring(0,4);
				hm2 =  list.get(i).split("/")[1].substring(8,12);
				int count = getrow(xm,hm1,hm2);
				if (count==1) {
				       xh=getint(xm,hm1,hm2);
				      if (xh>0) {
				    	  tag=set_suc(xh);
				    	  if (tag) num=num+1;
				    	  info=info+list.get(i)+"- 匹配成功;<br>";
				      }
				      else info=info+"未找到  - "+ list.get(i)+";<br>";
				      }
				if (count==0) info=info+"未找到 - "+ list.get(i)+";<br>";
				if (count>1) info=info+list.get(i)+"- 匹配数目大于1；<br>";
			}
			map.put("num", num);
			map.put("info", info);
			map.put("size", size);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	   
	   
	   return map;
   }
	/**
	 * @param xh
	 * @return 
	 * @throws Cls_exception 
	 * @throws pkg_sinopec.Cls_exception 
	 */
	private static boolean set_suc(int xh) throws Cls_exception {
		boolean tag=false;
		java.sql.Connection con=null;
		java.sql.PreparedStatement stmt=null;
		java.sql.ResultSet rs=null;
		int a=0;
		try {
			Cls_connect cn = new Cls_connect();
	    	con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("update kcs_spechsbc set mark=2 where serial_no="+xh);
		  	a=stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认	
			if (a>0)
			 {
				 tag=true;
			 }
		} catch (SQLException se) {
			se.printStackTrace();
			//log.error("gg.update.sqlexcepiton["+tsql+"]", se);
			try {
					if (con != null) {
					con.rollback();//出现sql异常，事务回滚
					con.setAutoCommit(true);//设置提交方式为默认方式			
					}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
				if (con != null) {
					con.close();
					con = null;
				}
			} catch (SQLException se) {
				se.printStackTrace();
				//log.error("gg.update.sqlexcepiton["+tsql+"]", se);
			}
		}
		return tag;	
	}

	private static List<String> readTxt(String wjm) throws IOException {
		//FileReader fr=new FileReader(wjm);
		//BufferedReader br=new BufferedReader(fr);
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(wjm),"GB2312"));

		List<String> list = new ArrayList<String>();
		String Line=br.readLine();
		String tmp_str="";
		while(Line!=null){
			  if (!"".equals(Line.trim()))
				   if (Line.contains(" 证件号码：")) {
					   tmp_str=Line.trim().replaceAll("\\s{1,}", " ");//多个空格替换成1个
                        list.add(tmp_str.replaceAll("证件号码：", "/"));
			            //list.add(tmp_str);
                        }
			  Line=br.readLine();//从文件中继续读取一行数据
			 }
		br.close();//关闭BufferedReader对象
		//fr.close();//关闭文件
		return list;
	}
	 public static int getint(String xm,String hm1,String hm2) throws Cls_exception {
			int a=0;
			java.sql.Connection conn=null;
			java.sql.PreparedStatement pstmt=null;
			java.sql.ResultSet rs=null;

			try{	
				Cls_connect cn = new Cls_connect();
		    	conn = cn.connect().getConnection();
			    pstmt=conn.prepareStatement("select serial_no from kcs_spechsbc where substr(name,1,1)='"+xm+"' and substr(sfzid,1,4)='"+hm1+"' and substr(sfzid,15,18)='"+hm2+"'");
			
			    rs=pstmt.executeQuery();
			
			while(rs.next()) {
				a=rs.getInt(1);
			}
		 }
			catch(Exception e){
				//throw new Cls_exception("Cls_gg.maxid(string)   "+e.toString());
		 }	
		finally{
				try{
					if (rs!=null){
						rs.close();
					}
					if (pstmt!=null) {
						pstmt.close();
					}
					if (conn!=null){
						conn.close();
					}
				   }
				catch(Exception e){
					// throw new Cls_exception("Cls_gg.maxid(string) finally"+e.toString());
				}
			}

			return a;
		}
	 public static int getrow(String xm,String hm1,String hm2) throws Cls_exception {
			int a=0;
			java.sql.Connection conn=null;
			java.sql.PreparedStatement pstmt=null;
			java.sql.ResultSet rs=null;
            String sql="select count(*) from kcs_spechsbc where mark<>'0' and substr(name,1,1)='"+xm+"' and substr(sfzid,1,4)='"+hm1+"' and substr(sfzid,15,18)='"+hm2+"'";
            
			try{	
				Cls_connect cn = new Cls_connect();
		    	conn = cn.connect().getConnection();
			    pstmt=conn.prepareStatement(sql);
			    rs=pstmt.executeQuery();
			
			while(rs.next()) {
				a=rs.getInt(1);
			}
		 }
			catch(Exception e){
				//throw new Cls_exception("Cls_gg.maxid(string)   "+e.toString());
		 }	
		finally{
				try{
					if (rs!=null){
						rs.close();
					}
					if (pstmt!=null) {
						pstmt.close();
					}
					if (conn!=null){
						conn.close();
					}
				   }
				catch(Exception e){
					// throw new Cls_exception("Cls_gg.maxid(string) finally"+e.toString());
				}
			}

			return a;
		}	 
}
