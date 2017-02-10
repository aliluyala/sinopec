package pkg_auto.autobj.ccic.serverProcess;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_exception;
import pkg_auto.autobj.pojo.Ccic_BusinessCode;

import com.ccic.gwservice.car.fgcpiprecisequote.PrivyDTO;

/**
 * 车辆关系人
 *@author Administrator
 */
public class Ccic_Privy {
	private  Logger log = Logger.getLogger(Ccic_Privy.class);   
	public boolean empty(String jycode) throws Cls_exception{
		log.error("重置关系人信息："+jycode);
		 boolean ret = false;
		 StringBuffer sqlInsert = new StringBuffer();
		 sqlInsert.append("delete from KCS_CCIC_PRIVYDTO where MESSAGEID=?");
		 java.sql.Connection con=null;
			java.sql.PreparedStatement stmt=null;
			java.sql.ResultSet rs=null;
			int a=0;
			try {
				Cls_connect cn = new Cls_connect();
		    	con = cn.connect().getConnection();
				con.setAutoCommit(false);
				stmt=con.prepareStatement(sqlInsert.toString());
		        stmt.setString(1, jycode);    
			  	a=stmt.executeUpdate();
				con.commit();
				con.setAutoCommit(true);// 恢复默认	
				if (a>0)
				 { ret = true;
				 }
			} catch (SQLException se) {
				log.error("ccic_privy.empty():"+se.toString());
				se.printStackTrace();
				try {
				   if (con != null) {
						con.rollback();//出现sql异常，事务回滚
						con.setAutoCommit(true);//设置提交方式为默认方式			
						}
				} catch (SQLException se1) {
					se1.printStackTrace();
				}
			   return false;
			} finally {
				if (rs!=null){
					try{
						rs.close();}
					catch(Exception e){
								 throw new Cls_exception("Ccic_Privy.empty(()"+e.toString());
							}
					     rs=null;  
								}
				if (stmt!=null) {
					try{
						stmt.close();}
					catch(Exception e){
								 throw new Cls_exception("Ccic_Privy.empty(()"+e.toString());
							}
					     stmt=null;
								}
				if (con!=null){
					try{
						con.close();
					}catch(Exception e){
								 throw new Cls_exception("Ccic_Privy.empty(()"+e.toString());
							}
					   con =null;
								}
			}   
   return ret;	      	
	}
    public boolean saveCarOwner(PrivyDTO carOwner,String jycode,String cphm,String orgcode) throws Cls_exception{
    	log.error("保存车主信息："+jycode);
    	 boolean ret = false;
		 if (carOwner == null) {
			    log.error("Ccic_Privy.saveCarOwner() carOwner is null");
		        throw new NullPointerException("Ccic_Privy.saveCarOwner() carOwner is null");
		      }	
		 String mark = Ccic_BusinessCode.getPrivyCarowner();
		 StringBuffer sqlInsert = new StringBuffer();
		 sqlInsert.append("insert into KCS_CCIC_PRIVYDTO values(AUTOQUOTE_MODEID.nextval,'"+jycode+"',");
		 sqlInsert.append("?,?,?,?,?,?,?,sysdate,'',?,?)");
		    java.sql.Connection con=null;
			java.sql.PreparedStatement stmt=null;
			java.sql.ResultSet rs=null;
			int a=0;
			try {
				Cls_connect cn = new Cls_connect();
		    	con = cn.connect().getConnection();
				con.setAutoCommit(false);
				stmt=con.prepareStatement(sqlInsert.toString());
		        stmt.setString(1, mark);
		        stmt.setString(2, carOwner.getInsuredName());
		        stmt.setString(3, carOwner.getInsuredNature());
		        stmt.setString(4, carOwner.getUnitType());
		        stmt.setString(5, carOwner.getIdentifyType());
		        stmt.setString(6, carOwner.getIdentifyNumber());
		        stmt.setString(7, carOwner.getMobile()); 
		        stmt.setString(8, orgcode);
		        stmt.setString(9, cphm);

			  	a=stmt.executeUpdate();
				con.commit();
				con.setAutoCommit(true);// 恢复默认	
				if (a>0)
				 { ret = true;
				 }
			} catch (SQLException se) {
				log.error("Ccic_Privy.saveCarOwner():"+se.toString());
				se.printStackTrace();
				try {
						if (con != null) {
						con.rollback();//出现sql异常，事务回滚
						con.setAutoCommit(true);//设置提交方式为默认方式			
						}
				} catch (SQLException se1) {
					se1.printStackTrace();
				}
			   return false;
			} finally {
				if (rs!=null){
					try{
						rs.close();}
					catch(Exception e){
								 throw new Cls_exception("Ccic_Privy.saveCarOwner()"+e.toString());
							}
					     rs=null;  
								}
								if (stmt!=null) {
					try{
									stmt.close();}
					catch(Exception e){
								 throw new Cls_exception("Ccic_Privy.saveCarOwner()"+e.toString());
							}
					     stmt=null;
								}
								if (con!=null){
					try{
									con.close();
					}catch(Exception e){
								 throw new Cls_exception("Ccic_Privy.saveCarOwner()"+e.toString());
							}
					   con =null;
								}
			}   
      return ret;	      	
    }
    public boolean saveInsured(PrivyDTO insured,String jycode,String carinsureDrelation,String cphm,String orgcode) throws Cls_exception{
   	    log.error("保存投保人信息："+jycode);
    	boolean ret = false;
		 if ( insured == null) {
			    log.error("Ccic_Privy.saveCarOwner() carOwner is null");
		        throw new NullPointerException("Ccic_Privy.saveCarOwner() carOwner is null");
		      }	
		 String mark = Ccic_BusinessCode.getPrivyInsured();
		 StringBuffer sqlInsert = new StringBuffer();
		 sqlInsert.append("insert into KCS_CCIC_PRIVYDTO values(AUTOQUOTE_MODEID.nextval,'"+jycode+"',");
		 sqlInsert.append("?,?,?,?,?,?,?,sysdate,?,?,?)");
		 //log.error(sqlInsert.toString());
		 //log.error("carinsureDrelation="+carinsureDrelation);
		    java.sql.Connection con=null;
			java.sql.PreparedStatement stmt=null;
			java.sql.ResultSet rs=null;
			int a=0;
			try {
				Cls_connect cn = new Cls_connect();
		    	con = cn.connect().getConnection();
				con.setAutoCommit(false);
				stmt=con.prepareStatement(sqlInsert.toString());
		        stmt.setString(1, mark);
		        stmt.setString(2,  insured.getInsuredName());
		        stmt.setString(3,  insured.getInsuredNature());
		        stmt.setString(4,  insured.getUnitType());
		        stmt.setString(5,  insured.getIdentifyType());
		        stmt.setString(6,  insured.getIdentifyNumber());
		        stmt.setString(7,  insured.getMobile());       
                stmt.setString(8,  carinsureDrelation);
                stmt.setString(9, orgcode);
                stmt.setString(10, cphm);
			  	a=stmt.executeUpdate();
				con.commit();
				con.setAutoCommit(true);// 恢复默认	
				if (a>0)
				 { ret = true;
				 }
			} catch (SQLException se) {
				log.error("Ccic_Privy.saveInsured()"+se.toString());
				se.printStackTrace();
				try {
						if (con != null) {
						con.rollback();//出现sql异常，事务回滚
						con.setAutoCommit(true);//设置提交方式为默认方式			
						}
				} catch (SQLException se1) {
					se1.printStackTrace();
				}
			   return false;
			} finally {
				if (rs!=null){
					try{
						rs.close();}
					catch(Exception e){
								 throw new Cls_exception("Ccic_Privy.saveInsured()"+e.toString());
							}
					     rs=null;  
								}
								if (stmt!=null) {
					try{
									stmt.close();}
					catch(Exception e){
								 throw new Cls_exception("Ccic_Privy.saveInsured()"+e.toString());
							}
					     stmt=null;
								}
								if (con!=null){
					try{
									con.close();
					}catch(Exception e){
								 throw new Cls_exception("Ccic_Privy.saveInsured()"+e.toString());
							}
					   con =null;
								}
			}   
     return ret;	      	
   }
    private List<PrivyDTO> getPrivyList(String jycode) throws Cls_exception{
    	ArrayList<PrivyDTO> rtnAL = new ArrayList<PrivyDTO>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select * from KCS_CCIC_PRIVYDTO where MESSAGEID='");
		sql.append(jycode);
		sql.append("'");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());
		
			rs = pstmt.executeQuery();
			PrivyDTO tmp_jg;
			while (rs.next()) {
				tmp_jg = new PrivyDTO();
                tmp_jg.setInsuredFlag(rs.getString("insuredFlag"));
                tmp_jg.setInsuredName(rs.getString("insuredName"));
                tmp_jg.setInsuredNature(rs.getString("insuredNature"));
                tmp_jg.setUnitType(rs.getString("unitType"));
                tmp_jg.setIdentifyType(rs.getString("identifyType"));
                tmp_jg.setIdentifyNumber(rs.getString("identifyNumber"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (SQLException e) {
			log.error("Ccic_Privy.getPrivyList()"+e.toString());
			throw new Cls_exception("Ccic_Privy.getPrivyList() "
					+ e.toString());
		} catch (Exception e) {
			log.error("Ccic_Privy.getPrivyList()"+e.toString());
			throw new Cls_exception("Ccic_Privy.getPrivyList() "
					+ e.toString());
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
				throw new Cls_exception("Ccic_Privy.getPrivyList()"
						+ e.toString());
			}

		}

		return rtnAL;   	
    }
    /**
     * 查询得到关系人数组
     * @param jycode
     * @return
     * @throws Cls_exception
     */
    public PrivyDTO[] getPrivy(String jycode) throws Cls_exception {
    	List<PrivyDTO>  privyL =getPrivyList(jycode);
    	PrivyDTO[] privyD;
    	if (privyL==null||privyL.isEmpty()) 
    		privyD = null;
    	else {
    		int size = privyL.size();
    		privyD = (PrivyDTO[])privyL.toArray(new PrivyDTO[size]);
    	}
		
		return privyD;    	
    }
}
