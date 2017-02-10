/**
 * 
 */
package pkg_AccidentPolicy.AccidPolicyPre;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import pkg_AccidentPolicy.pojo.PolicyOrder;
import pkg_AccidentPolicy.pojo.TempObj;
import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_exception;

/**
 * @author Administrator
 *
 */
public class POrderList {
	private Logger log = Logger.getLogger(POrderList.class);
	public  List<PolicyOrder>  getList_page(String tsql, int p, int ev) throws Cls_exception {
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		ArrayList<PolicyOrder> rtnAL = new ArrayList<PolicyOrder>();
		StringBuffer sqlInsert = new StringBuffer();
	 try{	
		 Cls_connect cn = new Cls_connect();
	 	conn = cn.connect().getConnection();
	 	sqlInsert.append("SELECT to_char(order_time,'yyyy-mm-dd hh24:mi:ss') as sorder_time,to_char(proce_time,'yyyy-mm-dd hh24:mi:ss') as sproce_time,");
	 	sqlInsert.append("sum_price,policy_name,policy_price,order_mark,order_type,yw_type,lock_mark,policy_num,org_code_name,");
	 	sqlInsert.append(" tbr_name,serial_no,org_code,tbr_tel,city_code,oper_orgcode,kind_id,insured_name,insured_tel  FROM kcs_insurance_accident_ddmx t");
	 	sqlInsert.append(" WHERE ROWID IN (");
	 	sqlInsert.append(" SELECT rid FROM (");
	 	sqlInsert.append(" SELECT rid, ROWNUM AS rn FROM (");
	 	sqlInsert.append(" SELECT ROWID rid FROM kcs_insurance_accident_ddmx");
	 	sqlInsert.append(" where "+tsql);
	 	sqlInsert.append(" ORDER BY serial_no desc");
	 	sqlInsert.append(" ) t1 WHERE  ROWNUM<"+ev);
	 	sqlInsert.append(" ) t2 WHERE  rn>="+p);
	 	sqlInsert.append(" ) ORDER BY serial_no desc");
	 	pstmt=conn.prepareStatement(sqlInsert.toString());
		rs=pstmt.executeQuery();
		PolicyOrder tmp_jg;
		while(rs.next()) {
			  tmp_jg=new PolicyOrder();
			  tmp_jg.setSerial_no(rs.getInt("serial_no"));
			  tmp_jg.setSorder_time(rs.getString("sorder_time"));
			  tmp_jg.setOrder_mark(rs.getString("order_mark"));
			  tmp_jg.setSproce_time(rs.getString("sproce_time"));
			  tmp_jg.setSum_price(rs.getDouble("sum_price")); 
			  tmp_jg.setPolicy_name(rs.getString("policy_name"));
			  tmp_jg.setPolicy_price(rs.getDouble("policy_price"));
			  tmp_jg.setOrder_type(rs.getString("order_type"));
			  tmp_jg.setYw_type(rs.getInt("yw_type"));
			  tmp_jg.setLock_mark(rs.getInt("lock_mark"));
			  tmp_jg.setPolicy_num(rs.getInt("policy_num"));
			  if (rs.getString("tbr_name") != null)
				  tmp_jg.setTbr_name(rs.getString("tbr_name"));
			  if (rs.getString("tbr_tel") != null)
			      tmp_jg.setTbr_tel(rs.getString("tbr_tel"));
			  tmp_jg.setOrg_code(rs.getString("org_code"));
			  /*tmp_jg.setOpercode(rs.getString("opercode")); */
			  tmp_jg.setCity_code(rs.getString("city_code"));
			  tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
			  tmp_jg.setOrg_code_name(rs.getString("org_code_name"));
			  tmp_jg.setKind_id(rs.getInt("kind_id"));
			  if (rs.getString("insured_name") != null)
			       tmp_jg.setInsured_name(rs.getString("insured_name"));
			  if (rs.getString("insured_tel") != null)
			       tmp_jg.setInsured_tel(rs.getString("insured_tel"));
			  rtnAL.add(tmp_jg);
		      tmp_jg=null;
					}
		 }
	  catch(Exception e){
		   log.error(e.toString());
			throw new Cls_exception("POrderList.getList_page() "+e.toString());
	 }	
	finally{
			
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("POrderList.getList_page()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("POrderList.getList_page()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("POrderList.getList_page()"+e.toString());
					}
			   conn =null;
						}
			
		}
	return rtnAL;

		}
	 public List<TempObj> getKind(String sql) throws Cls_exception {
		 List<TempObj> tempObjs = new ArrayList<TempObj>();
		 java.sql.Connection conn = null;
		 java.sql.PreparedStatement pstmt = null;
		 java.sql.ResultSet rs = null;
			try {
				Cls_connect cn = new Cls_connect();
				conn = cn.connect().getConnection();
				String tsql = "SELECT kind_id,policy_name FROM kcs_insurance_accident_ddmx where order_type<>'4' "
				  +sql +"  group by kind_id,policy_name";
				pstmt = conn.prepareStatement(tsql);

				rs = pstmt.executeQuery();
				TempObj tempObj;
				while (rs.next()) {
					tempObj = new TempObj();
					tempObj.setInt1(rs.getInt("kind_id"));
					tempObj.setS1(rs.getString("policy_name"));
					tempObjs.add(tempObj);
					tempObj = null;
				}
			} catch (Exception e) {
				log.error(e.toString());
				throw new Cls_exception("POrderList.getKind()   " + e.toString());
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
					throw new Cls_exception("POrderList.getKind()  finally"
							+ e.toString());
				}
			}
			return tempObjs;
	 }
	 public int getNum(String sql) throws Cls_exception {
			int a = 0;
			java.sql.Connection conn = null;
			java.sql.PreparedStatement pstmt = null;
			java.sql.ResultSet rs = null;

			try {
				Cls_connect cn = new Cls_connect();
				conn = cn.connect().getConnection();
				String tsql = "SELECT COUNT(*) FROM kcs_insurance_accident_ddmx where order_type<>'4' "+sql;
				pstmt = conn.prepareStatement(tsql);

				rs = pstmt.executeQuery();

				while (rs.next()) {
					a = rs.getInt(1);
				}
			} catch (Exception e) {
				log.error(e.toString());
				throw new Cls_exception("POrderList.getNum()   " + e.toString());
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
					throw new Cls_exception("POrderList.getNum()  finally"
							+ e.toString());
				}
			}
			return a;
		}	 
	 public  List<PolicyOrder>  getList(String tsql) throws Cls_exception {
			java.sql.Connection conn=null;
			java.sql.PreparedStatement pstmt=null;
			java.sql.ResultSet rs=null;
			ArrayList<PolicyOrder> rtnAL = new ArrayList<PolicyOrder>();
			StringBuffer sqlInsert = new StringBuffer();
		 try{	
			 Cls_connect cn = new Cls_connect();
		 	conn = cn.connect().getConnection();
		 	sqlInsert.append("SELECT to_char(order_time,'yyyy-mm-dd hh24:mi:ss') as sorder_time,to_char(proce_time,'yyyy-mm-dd hh24:mi:ss') as sproce_time,");
		 	sqlInsert.append("t.*  FROM kcs_insurance_accident_ddmx t");
		 	sqlInsert.append(" where order_type<>'4' "+tsql);
		 	sqlInsert.append(" ORDER BY serial_no desc");

		 	pstmt=conn.prepareStatement(sqlInsert.toString());
			rs=pstmt.executeQuery();
			PolicyOrder tmp_jg;
			while(rs.next()) {
				  tmp_jg=new PolicyOrder();
				  tmp_jg.setSerial_no(rs.getInt("serial_no"));
				  tmp_jg.setSorder_time(rs.getString("sorder_time"));
					if ( rs.getString("sproce_time") != null)
						 tmp_jg.setSproce_time(rs.getString("sproce_time"));
					 tmp_jg.setOrg_code(rs.getString("org_code"));
					 tmp_jg.setOpercode(rs.getString("opercode"));
					 tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
					 tmp_jg.setOper_opercode(rs.getString("oper_opercode"));
					 tmp_jg.setKind_id(rs.getInt("kind_id"));
					 tmp_jg.setPolicy_no(rs.getInt("policy_no"));
					 tmp_jg.setYw_type(rs.getInt("yw_type"));
					 tmp_jg.setPolicy_name(rs.getString("policy_name"));
					 tmp_jg.setPolicy_price(rs.getDouble("policy_price"));
					 tmp_jg.setPolicy_num(rs.getInt("policy_num"));
					 tmp_jg.setSum_price(rs.getDouble("sum_price"));
					 tmp_jg.setOrder_mark(rs.getString("order_mark"));
					 tmp_jg.setOrder_type(rs.getString("order_type"));
					 tmp_jg.setOrder_result(rs.getString("order_result"));
					 tmp_jg.setCity_code(rs.getString("city_code"));
					 tmp_jg.setLock_mark(rs.getInt("lock_mark"));
					 tmp_jg.setT_message(rs.getString("t_message"));
					if (rs.getString("org_tel") != null)
						 tmp_jg.setOrg_tel(rs.getString("org_tel"));
					 tmp_jg.setZjlsh(rs.getString("zjlsh"));
					 tmp_jg.setTbr_name(rs.getString("tbr_name"));
					 tmp_jg.setTbr_tel(rs.getString("tbr_tel"));
					 tmp_jg.setTbr_sfz(rs.getString("tbr_sfz"));
					 tmp_jg.setTbr_addr(rs.getString("tbr_addr"));
					 tmp_jg.setInsured_name(rs.getString("insured_name"));
					 tmp_jg.setInsured_tel(rs.getString("insured_tel"));
					 tmp_jg.setRelation(rs.getString("relation"));
					 tmp_jg.setInsured_id(rs.getString("insured_id"));
					if (rs.getString("insured_idnum") != null)
						 tmp_jg.setInsured_idnum(rs.getString("insured_idnum"));
					 tmp_jg.setInsured_name2(rs.getString("insured_name2"));
					 tmp_jg.setInsured_id2(rs.getString("insured_id2"));
					 tmp_jg.setInsured_idnum2(rs.getString("insured_idnum2"));
					 tmp_jg.setInsured_name3(rs.getString("insured_name3"));
					 tmp_jg.setInsured_id3(rs.getString("insured_id3"));
					 tmp_jg.setInsured_idnum3(rs.getString("insured_idnum3"));
					 tmp_jg.setInsured_name4(rs.getString("insured_name4"));
					 tmp_jg.setInsured_id4(rs.getString("insured_id4"));
					 tmp_jg.setInsured_idnum4(rs.getString("insured_idnum4"));
					 tmp_jg.setInsured_name5(rs.getString("insured_name5"));
					 tmp_jg.setInsured_id5(rs.getString("insured_id5"));
					 tmp_jg.setInsured_idnum5(rs.getString("insured_idnum5"));
					if (rs.getString("post_mark") != null)
						 tmp_jg.setPost_mark(rs.getString("post_mark"));
					 tmp_jg.setOrg_code_name(rs.getString("org_code_name"));
					 tmp_jg.setMail_num(rs.getString("mail_num"));
					 tmp_jg.setInsured_job(rs.getString("insured_job"));
					 tmp_jg.setInsured_school(rs.getString("insured_school"));
					 tmp_jg.setVin(rs.getString("vin"));
					  rtnAL.add(tmp_jg);
			      tmp_jg=null;
						}
			 }
		  catch(Exception e){
			    log.error(e.toString());
				throw new Cls_exception("POrderList.getList() "+e.toString());
		 }	
		finally{
				
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception("POrderList.getList()"+e.toString());
						}
				     rs=null;  
							}
							if (pstmt!=null) {
				try{
								pstmt.close();}
				catch(Exception e){
							 throw new Cls_exception("POrderList.getList()"+e.toString());
						}
				     pstmt=null;
							}
							if (conn!=null){
				try{
								conn.close();
				}catch(Exception e){
							 throw new Cls_exception("POrderList.getList()"+e.toString());
						}
				   conn =null;
							}
				
			}
		return rtnAL;

			}
	
}
