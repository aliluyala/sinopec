/**
 * 
 */
package pkg_AccidentPolicy.pojo;

import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_connect80;
import pkg_sinopec.Cls_exception;

/**
 * @author Administrator
 *
 */
public class CountyTeam {
	private int serial_no = 0;
	private int team_code = 0;
	private String name = "";
	private String orgcode = "";
	private String orgname = "";
	private Double premium_plan = 0.0;
	private String county_code = "";
	private String phone = "";
	private String contacts = ""; //联系人
	private String zj_mark = "";//支局标志
	public int getSerial_no() {
		return serial_no;
	}
	public void setSerial_no(int serial_no) {
		this.serial_no = serial_no;
	}
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public int getTeam_code() {
		return team_code;
	}
	public String getName() {
		return name;
	}
	public String getOrgcode() {
		return orgcode;
	}
	public Double getPremium_plan() {
		return premium_plan;
	}
	public String getCounty_code() {
		return county_code;
	}
	public String getPhone() {
		return phone;
	}
	public String getContacts() {
		return contacts;
	}
	public String getZj_mark() {
		return zj_mark;
	}
	public void setTeam_code(int team_code) {
		this.team_code = team_code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}
	public void setPremium_plan(Double premium_plan) {
		this.premium_plan = premium_plan;
	}
	public void setCounty_code(String county_code) {
		this.county_code = county_code;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	public void setZj_mark(String zj_mark) {
		this.zj_mark = zj_mark;
	}
	public void GetJgBmzXx()throws Cls_exception {
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		String jgname = "";
	 try{	
		 Cls_connect80 cn = new Cls_connect80();
		 conn = cn.connect().getConnection();
		 pstmt=conn.prepareStatement("select orgname,org_conntr,org_tel from esseapp.KCS_ORG_INFO where org_code=?");
		 pstmt.setString(1, this.getOrgcode());
		 rs=pstmt.executeQuery();

		while(rs.next()) {
			jgname = rs.getString(1);
			this.setOrgname(jgname);
			this.setContacts(rs.getString(2));
			this.setPhone(rs.getString(3));
			if (jgname.contains("自有网点")) 
				this.setZj_mark("支局");
			else this.setZj_mark("非支局");
					}
		 }
	  catch(Exception e){
		    //log.error(e.toString());
			throw new Cls_exception("CTeam.GetJgBmzXx() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("CTeam.GetJgBmzXx()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("CTeam.GetJgBmzXx()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("CTeam.GetJgBmzXx()"+e.toString());
					}
			   conn =null;
						}
		}
	}
	/**
	 * 判断机构是否不属于任何团队
	 * @param orgcode
	 * @return
	 * @throws Cls_exception
	 */

	protected boolean isFreeOrg(String orgcode) throws Cls_exception {
			boolean ret = true;
			int a =0;
			java.sql.Connection conn = null;
			java.sql.PreparedStatement pstmt = null;
			java.sql.ResultSet rs = null;
			StringBuffer sqlInsert = new StringBuffer();
			sqlInsert.append("SELECT count(*) FROM kcs_insurance_team_org where orgcode=?");
			try {
				Cls_connect cn = new Cls_connect();
				conn = cn.connect().getConnection();
				pstmt = conn.prepareStatement(sqlInsert.toString());
				pstmt.setString(1, orgcode);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					a = rs.getInt(1);
					if (a>0)
					   ret = false;
				}
				//log.error(orgcode+" isFreeOrg="+ret);
			} catch (Exception e) {
				throw new Cls_exception("CTeam.isFreeOrg()   " + e.toString());
			} finally {
				try {
					if (rs != null) {
						rs.close();
					}
					if (pstmt != null) {
						pstmt.close();
					}
					if (conn != null) {
						conn.close();
					}
				} catch (Exception e) {
					throw new Cls_exception("CTeam.isFreeOrg()  finally"
							+ e.toString());
				}
			}
			return ret;	
		}
}
