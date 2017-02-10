package pkg_sinopec;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * @author Administrator
 *
 */
public class Cls_zd {
	//private  Logger log = Logger.getLogger(Cls_zd.class);
	public static void main(String[] args)    {	
		String rq = "2015-12-01";
		System.out.println(rq.indexOf("-", 1));
		System.out.println(rq.substring(0, rq.indexOf("-", 1)));
	//	int[] a = toints("1001");
	//	for(int i=0;i<a.length;i++){ 
	//		System.out.print(a[i] + " "); 
	//	}	
		//System.out.println(readini("62","dzh"));
	}
	public String read(String city_code,String councode,String yetype,int gsxh) throws Cls_exception {
		String a="";
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;

		try{	
			Cls_connect cn = new Cls_connect();
	    	conn = cn.connect().getConnection();
		pstmt=conn.prepareStatement("select "+yetype+" from kcs_specbxcljg where city_code='"+city_code+"' and (coun_code like '%"+councode+"%' or coun_code like '%00%') and gsxh="+gsxh+" order by coun_code");
		
		rs=pstmt.executeQuery();
		
		while(rs.next()) {
			a=rs.getString(1);
		}
	 }
		catch(Exception e){

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
			}
		}
		return a;
	}	
	
	public  int[] toints(String args){
		String arg = args;
		int[] a = new int[arg.length()];
		for(int i=0;i<arg.length();i++){ 
			a[i] = arg.charAt(i) - '0'; } 
		return a;
	}
    public String GetChllx(int lx) throws Cls_exception{
    	String a="";
    	if (lx==0) a="";
    	if (lx==1) a="˽�ҿͳ�";
    	if (lx==2) a="��ҵ�ͳ�";
    	if (lx==3) a="��ҵ����";
    	if (lx==4) a="����2�����·�Ӫ�˻���";
    	if (lx==5) a="����2������Ӫ�˻���";
    	if (lx==6) a="����2�����ϻ���";
    	if (lx==7) a="����";
    	if (lx==8) a="С������";
    	if (lx==9) a="��������";
    	return a;
    }
    public int Chllx() throws Cls_exception{
    	return 8;
    }
	public String GetOrdertype(int ord) throws Cls_exception{
		String a="";
	     if (ord==0) a="δ����";
	     if (ord==1) a="�Ѵ���";
	     if (ord==2) a="�˵�";
	     if (ord==3) a="վ�㳷��";
	     if (ord==7) a="�����쳣";
		return a;		
	}
	public String GetBxtype(int ord) throws Cls_exception{
		String a="";
	     if (ord==0) a="δ����";
	     if (ord==1) a="�ѱ���";
	     if (ord==2) a="�˵�";
	     if (ord==3) a="վ�㳷��";
	     if (ord==5) a="��������";
	     if (ord==6) a="�ѳ���";
	     if (ord==7) a="�����쳣";
		return a;		
	}	
   public String GetBxgs(int gs) throws Cls_exception{
	   String a="";
	     if (gs==1) a="���Ᵽ��";
	     if (gs==2) a="�˱���";
	     if (gs==3) a="�л�����";
	     if (gs==4) a="Ӣ��";	     
	     if (gs==5) a="��������";
	     if (gs==6) a="̩ɽ";
	     if (gs==7) a="���";
	     if (gs==8) a="ƽ������";
	     if (gs==9) a="��ʢ��ƽ";
	     if (gs==10) a="�Ͻ���";
	     if (gs==11) a="��������";
	     if (gs==12) a="���ٲ���";
	     if (gs==13) a="��������";
	     if (gs==14) a="̫ƽ����";
	     if (gs==15) a="�����";
	     if (gs==16) a="̫ƽ����";
	     if (gs==17) a="��̫����"; //�񰲱���
	     if (gs==18) a="���䱣��";
	     if (gs==19) a="�Ŵﱣ��";
	     if (gs==20) a="�ΰ�����";
	     if (gs==21) a="�찲����";
	     if (gs==22) a="�����";
	     if (gs==23) a="��������";
	     if (gs==24) a="ƽ������";
	     if (gs==25) a="̩������";
	     if (gs==26) a="������������";
	     if (gs==27) a="̩������";
	   return a;
   }
   public int Getbx() throws Cls_exception{
	   return 27;
   }
	public String GetYwtype(int ord) throws Cls_exception{
		String a="";
	     if (ord==1) a="����-��̨�ʼ�";
	     if (ord==2) a="����-ǰ̨����";
	     if (ord==3) a="��Ա����";
		return a;		
	}	
	 public String getSysDate() {
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		    String mytime = sdf.format(new Date());
		     return mytime;
		  }
	public String getSysDatenyr() {
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		    String mytime = sdf.format(new Date());
		     return mytime;
		  }
	public String getSysDatetime() {
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��  HH:mm:ss");
		    String mytime = sdf.format(new Date());
		     return mytime;
		  }
	public String GetChpname(int hyfno) throws Cls_exception{
	    String a="";
	    if (hyfno==0)
	    	return a;
	    else {
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
	 try{	
		 Cls_connect cn = new Cls_connect();
		 conn = cn.connect().getConnection();
		 pstmt=conn.prepareStatement("select chpin  from kcs_spec where serial_no=?");
		 pstmt.setInt(1, hyfno);
		 rs=pstmt.executeQuery();

		while(rs.next()) {
			a=rs.getString(1);
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_zd.GetChpname() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetChpname()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetChpname()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetChpname()"+e.toString());
					}
			   conn =null;
						}
		}
	return a;	
	    }
	}
	/**
	 * ��ѯ��������
	 */
	public String GetJgname(String jgh) throws Cls_exception{
	    String a="";
	    if (jgh == null||"".equals(jgh))
	    	return a;
	    else {
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
	 try{	
		 Cls_connect80 cn = new Cls_connect80();
		 conn = cn.connect().getConnection();
		 pstmt=conn.prepareStatement("select orgname  from esseapp.KCS_ORG_INFO where org_code=?");
		 pstmt.setString(1, jgh);
		 rs=pstmt.executeQuery();

		while(rs.next()) {
			a=rs.getString(1);
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_zd.GetJgname() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetJgname()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetJgname()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetJgname()"+e.toString());
					}
			   conn =null;
						}
		}
	return a;	
	    }
	}
	/**
	 * ��ѯ����Ա����
	 * @param czy
	 * @return
	 * @throws Cls_exception
	 */
	public String GetCzyname(String czy,String jgh) throws Cls_exception{
	    String a="";
	    if (czy == null||"".equals(czy)||jgh==null||"".equals(jgh))
	    	return a;
	    else {
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
	 try{	
		 Cls_connect80 cn = new Cls_connect80();
		 conn = cn.connect().getConnection();
		 pstmt=conn.prepareStatement("select opername  from esseapp.kcs_teller_info where oper_code=? and org_code=?");
		 pstmt.setString(1, czy);
		 pstmt.setString(2, jgh);
		 rs=pstmt.executeQuery();

		while(rs.next()) {
			a=rs.getString(1);
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_zd.GetCzyname() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetCzyname()"+e.toString());
					}
			     rs=null;  
						}
		if (pstmt!=null) {
			try{
				pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetCzyname()"+e.toString());
					}
			     pstmt=null;
					}
		if (conn!=null){
			try{
				conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetCzyname()"+e.toString());
					}
			   conn =null;
				}
		}
		 return a; 
	    }
	  
	} 
	public String GetJgtel(String jgh) throws Cls_exception{
	    String a="";
	    if (jgh == null||"".equals(jgh))
	    	return a;
	    else {
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
	 try{	
		 Cls_connect cn = new Cls_connect();
		 conn = cn.connect().getConnection();
		 //pstmt=conn.prepareStatement("select org_tel  from esseapp.KCS_ORG_INFO where org_code=?");
		 pstmt=conn.prepareStatement("select org_tel from (select org_tel from kcs_specbaoxian where  org_code=?  order by id desc) where rownum=1");

		 pstmt.setString(1, jgh);
		 rs=pstmt.executeQuery();

		while(rs.next()) {
			a=rs.getString(1);
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_zd.GetJgtel2() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetJgtel2()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetJgtel2()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetJgtel2()"+e.toString());
					}
			   conn =null;
						}
		}
	return a;	
	    }
	}
	public String GetQxmch(String cityno,String countno) throws Cls_exception{
	    String a="";
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
	 try{	
		 Cls_connect80 cn = new Cls_connect80();
	 	 conn = cn.connect().getConnection();
		 pstmt=conn.prepareStatement("select para_value from esseapp.kcs_para t where city_no=? and coun_no=?");
		 pstmt.setString(1, cityno);
		 pstmt.setString(2, countno);
		 rs=pstmt.executeQuery();

		while(rs.next()) {
			a=rs.getString(1);
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_zd.GetQxmch() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetQxmch()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetQxmch()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetQxmch()"+e.toString());
					}
			   conn =null;
						}
		}
	return a;
		}
	/**
	 * ��ѯĳ���������������ƴ���
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
		 pstmt=conn.prepareStatement("select coun_no,para_value from esseapp.kcs_para t where city_no=? order by coun_no");
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
	public List<Cls_e_tmp> GetDsdm() throws Cls_exception{
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
	 try{	
		 Cls_connect80 cn = new Cls_connect80();
	 	 conn = cn.connect().getConnection();
		 pstmt=conn.prepareStatement("select city_no,para_value from esseapp.kcs_para t where coun_no='00'  order by city_no");
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
			throw new Cls_exception("Cls_zd.GetDsdm() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetDsdm()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetDsdm()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetDsdm()"+e.toString());
					}
			   conn =null;
						}
		}
	return rtnAL;
		}		
	
	public Cls_e_tmp Getdhset(String citycode) throws Cls_exception{
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		Cls_e_tmp v_tmp=new Cls_e_tmp();
	 try{	
		 Cls_connect cn = new Cls_connect();
	 	 conn = cn.connect().getConnection();
		 pstmt=conn.prepareStatement("select * from kcs_specset where city_code='"+citycode+"'");
		 rs=pstmt.executeQuery();
	     
		while(rs.next()) {
			v_tmp.setNum1(rs.getInt("khdh"));
			v_tmp.setNum2(rs.getInt("bmzdh"));
			v_tmp.setS1(rs.getString("city_code"));
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_zd.Getdhset() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.Getdhset()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.Getdhset()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_zd.Getdhset()"+e.toString());
					}
			   conn =null;
						}
		}
	return v_tmp;
		}		
	public int Getset(String citycode) throws Cls_exception{
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		int a=0;
	 try{	
		 Cls_connect cn = new Cls_connect();
	 	 conn = cn.connect().getConnection();
		 pstmt=conn.prepareStatement("select khdh from kcs_specset where city_code='"+citycode+"'");
		 rs=pstmt.executeQuery();
	     
		while(rs.next()) {
              a = rs.getInt(1);
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_zd.Getdhset() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.Getdhset()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.Getdhset()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_zd.Getdhset()"+e.toString());
					}
			   conn =null;
						}
		}
	return a;
		}	
	/**
	 * zyyz���е��������ƥ����С���������
	 * @return
	 * @throws Cls_exception
	 */
	public List<Cls_e_tmp> Gettest() throws Cls_exception{
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
	 try{	
		 Cls_connect cn = new Cls_connect();
	 	 conn = cn.connect().getConnection();
		 pstmt=conn.prepareStatement("select * from kcs_zyyz order by jgh,bj");
		 rs=pstmt.executeQuery();
	     Cls_e_tmp v_tmp;
		while(rs.next()) {
			v_tmp=new Cls_e_tmp();
			v_tmp.setNum1(rs.getInt("serial"));
			v_tmp.setS1(rs.getString("jgh"));
			v_tmp.setS2(rs.getString("bj"));
			rtnAL.add(v_tmp);
			v_tmp=null;
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_zd.Gettest() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.Gettest()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.Gettest()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_zd.Gettest()"+e.toString());
					}
			   conn =null;
						}
		}
	return rtnAL;
		}
	/**
	 * ȡͼƬ·��
	 * @param cityno
	 * @param countno
	 * @return
	 * @throws Cls_exception
	 */
	public String GetTp(String jgh,String zjh,int ddid,int mark) throws Cls_exception{
	    String a="",sql="";
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		Cls_gg gg = new Cls_gg();
		int num=0;
	 try{	
		   if (ddid>0)   
			   num=gg.getrow("  kcs_specphoto where  org_code='"+jgh+"' and mark="+mark+" and dd_id="+ddid);
		   if (num>0)
			   sql="select wjm from kcs_specphoto where org_code='"+jgh+"' and mark="+mark+" and dd_id="+ddid;
		   else 
			   sql="select * from (select wjm from kcs_specphoto where zjh='"+zjh+"' and mark="+mark+" order by serial_no desc) where rownum=1";
		 //  log.error(sql);
		   Cls_connect cn = new Cls_connect();
		 conn = cn.connect().getConnection();
		 pstmt=conn.prepareStatement(sql);
		 rs=pstmt.executeQuery();

		while(rs.next()) {
			a=rs.getString(1);
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_zd.GetTp() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetTp()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetTp()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_zd.GetTp()"+e.toString());
					}
			   conn =null;
						}
		}
	return a;
		}	
	public boolean isTeamOrg(String orgcode) throws Cls_exception {
	    boolean tag = false;
        int a = 0;
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
	 try{	
		 Cls_connect cn = new Cls_connect();
		 conn = cn.connect().getConnection();
		 pstmt=conn.prepareStatement("select count(*)  from kcs_insurance_team where Orgcode=?");
		 pstmt.setString(1, orgcode);
		 rs=pstmt.executeQuery();

		while(rs.next()) {
			a=rs.getInt(1);
			if (a>0) 
				tag = true;
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_zd.isTeamOrg() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.isTeamOrg()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_zd.isTeamOrg()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_zd.isTeamOrg()"+e.toString());
					}
			   conn =null;
						}
		}
	return tag;	
	    }

}
