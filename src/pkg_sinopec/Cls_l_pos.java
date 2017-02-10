package pkg_sinopec;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class Cls_l_pos {
	/*
	public int insertByObj(Cls_e_pos obj,int id) throws Exception {
	    if (obj == null) {
	        throw new NullPointerException("kcs_spec obj");
	      }	
	    StringBuffer sqlInsert = new StringBuffer();
	    sqlInsert.append("insert into kcs_specpos(serial_no,org_code,opercode,oper_orgcode," );
	    sqlInsert.append("yw_type,name,tele_no,zhcmch,zhcaddr,fren,sfzid,card,cardfw,codem,code,lx,flv," );	   
	    sqlInsert.append("price,ywf,sum_price,order_time,city_code,org_tel,id) values (");
	    sqlInsert.append("?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,sysdate,?,?,"+id+")");
	    java.sql.Connection con=null;
		java.sql.PreparedStatement stmt=null;
		java.sql.ResultSet rs=null;
		int a=0,b=0;
		try {
			Cls_connect cn = new Cls_connect();
	    	con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement(sqlInsert.toString());
	        stmt.setInt(1, obj.getSerial_no());
	        stmt.setString(2, obj.getOrg_code());
	        stmt.setString(3, obj.getOpercode());
	        stmt.setString(4, obj.getOper_orgcode());
	        stmt.setInt(5, obj.getYw_type());
	        stmt.setString(6, obj.getName());
	        stmt.setString(7, obj.getTele_no());
	        stmt.setString(8, obj.getZhcmch());
	        stmt.setString(9, obj.getZhcaddr());
	        stmt.setString(10, obj.getFren());
	        stmt.setString(11, obj.getSfzid());
	        stmt.setString(12, obj.getCard());
	        stmt.setString(13, obj.getCardfw());
	        stmt.setString(14, obj.getCodem());
	        stmt.setString(15, obj.getCode());
	        stmt.setString(16, obj.getLx());
	        stmt.setString(17, obj.getFlv());
	        stmt.setDouble(18, obj.getPrice());
	        stmt.setDouble(19, obj.getYwf());
	        stmt.setDouble(20, obj.getSum_price());
	        stmt.setString(21, obj.getCity_code());
	        stmt.setString(22, obj.getOrg_tel());

		  	a=stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认	
			if (a>0)
			 {
				 b=id;
			 }
		} catch (SQLException se) {
			se.printStackTrace();
			try {
					if (con != null) {
					con.rollback();//出现sql异常，事务回滚
					con.setAutoCommit(true);//设置提交方式为默认方式			
					}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} finally {
			if (rs!=null){
				try{
					rs.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_pos.insertByObj()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Cls_l_pos.insertByObj()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Cls_l_pos.insertByObj()"+e.toString());
						}
				   con =null;
							}
		}
		return b;	
	}
	public String readini(String mark,String yetype) {
		String path="C:/jboss6/server/default/deploy/sinopec.war/pos.ini";
		//String path="/opt/weblogic/user_projects/domains/base_domain/servers/Server-0/upload/sinopec/pos.ini";
		//String path="/oracle/weblogic/user_projects/domains/base_domain/servers/AdminServer/uploads/sinopec/pos.ini";
		String  tmp="";
		IniReader InRed = new IniReader();
		tmp=InRed.getHashValue(mark, yetype, path);
		return tmp;
	}
	public List<Cls_e_pos> select_byid(int id) throws Cls_exception{
		ArrayList<Cls_e_pos> rtnAL = new ArrayList<Cls_e_pos>();
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;

	 try{	
		Cls_connect cn = new Cls_connect();
	    conn = cn.connect().getConnection();
		pstmt=conn.prepareStatement("select to_char(order_time,'yyyy-mm-dd hh24:mi:ss') as sorder_time,to_char(proce_time,'yyyy-mm-dd hh24:mi:ss') as sproce_time,t.* from kcs_specpos t where id=?");
		pstmt.setInt(1, id);
		rs=pstmt.executeQuery();
		Cls_e_pos tmp_jg;
		
		while(rs.next()) {
		  tmp_jg=new Cls_e_pos();
		  tmp_jg.setSerial_no(rs.getInt("serial_no"));
		  tmp_jg.setOrg_code(rs.getString("org_code"));
		  tmp_jg.setOpercode(rs.getString("opercode")); 
		  tmp_jg.setCity_code(rs.getString("city_code"));
		  tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
		  tmp_jg.setOper_opercode(rs.getString("oper_opercode"));
		  tmp_jg.setSum_price(rs.getInt("sum_price")); 
		  tmp_jg.setTele_no(rs.getString("tele_no"));
		  tmp_jg.setName(rs.getString("name"));
		  tmp_jg.setPrice(rs.getDouble("price"));
		  tmp_jg.setAdd_message(rs.getString("add_message"));
		  tmp_jg.setSorder_time(rs.getString("sorder_time"));
		  tmp_jg.setOrder_mark(rs.getString("order_mark"));
		  tmp_jg.setSproce_time(rs.getString("sproce_time"));
		  tmp_jg.setOrder_type(rs.getString("order_type"));
		  tmp_jg.setOrder_result(rs.getString("order_result"));
		  tmp_jg.setT_message(rs.getString("t_message"));
		  tmp_jg.setD_message(rs.getString("d_message"));
		  tmp_jg.setOrg_tel(rs.getString("org_tel")); 
		  tmp_jg.setZjlsh(rs.getString("zjlsh"));
		  //tmp_jg.setPost_address(rs.getString("post_address"));
		  tmp_jg.setSfzid(rs.getString("sfzid"));
		  tmp_jg.setYw_type(rs.getInt("yw_type"));
		  tmp_jg.setLock_mark(rs.getInt("lock_mark"));
		  tmp_jg.setId(rs.getInt("id"));
		  tmp_jg.setZhcmch(rs.getString("zhcmch"));
		  tmp_jg.setZhcaddr(rs.getString("zhcaddr"));
		  tmp_jg.setFren(rs.getString("fren"));
		  tmp_jg.setCard(rs.getString("card"));
		  tmp_jg.setCardfw(rs.getString("cardfw"));
		  tmp_jg.setCodem(rs.getString("codem"));
		  tmp_jg.setCode(rs.getString("code"));
		  tmp_jg.setLx(rs.getString("lx"));
		  tmp_jg.setFlv(rs.getString("flv"));

		  rtnAL.add(tmp_jg);
	      tmp_jg=null;
					}

		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_pos.select_byid() "+e.toString());
	 }	
	finally{
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_pos.select_byid()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_pos.select_byid()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_pos.select_byid()"+e.toString());
					}
			   conn =null;
						}
			
		}
	return rtnAL;
	}	
	*/
}
