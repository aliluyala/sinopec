/**
 * 
 */
package pkg_sinopec;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class Cls_l_khxxtj {
	public List<Cls_e_tmp> khxx_sour(String sql) throws Cls_exception {
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("select count(*) as num,sour,citycode from kcs_specbxkh t where mark=1");
		sqlInsert.append(sql);
		sqlInsert.append("   group by sour,citycode order by citycode");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Cls_e_tmp tmp_jg = new Cls_e_tmp();
				tmp_jg.setS1(rs.getString("citycode"));
				tmp_jg.setNum1(rs.getInt("num"));
				tmp_jg.setNum2(rs.getInt("sour"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_khxxtj.khxx_sour() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_khxxtj.khxx_sour()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_khxxtj.khxx_sour()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_khxxtj.khxx_sour()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}
	public List<Cls_e_tmp> khxx_sour(String sql,String citycode) throws Cls_exception {
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("select count(*) as num,sour,citycode from kcs_specbxkh t where mark=1 and citycode='"+citycode+"'");
		sqlInsert.append(sql);
		sqlInsert.append("   group by sour,citycode order by citycode");

		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Cls_e_tmp tmp_jg = new Cls_e_tmp();
				tmp_jg.setS1(rs.getString("citycode"));
				tmp_jg.setNum1(rs.getInt("num"));
				tmp_jg.setNum2(rs.getInt("sour"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_khxxtj.khxx_sour() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_khxxtj.khxx_sour()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_khxxtj.khxx_sour()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_khxxtj.khxx_sour()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}
	public List<Cls_e_tmp> khxx_qx_pl(String sql,String citycode) throws Cls_exception {
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("select count(*) as num,substr(czjg,3,2) as qx from kcs_specbxkh t where mark=1 and sour=1 and citycode='");
		sqlInsert.append(citycode+"'"+sql);
		sqlInsert.append("   group by substr(czjg,3,2) order by qx");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Cls_e_tmp tmp_jg = new Cls_e_tmp();
				tmp_jg.setS1(rs.getString("qx"));
				tmp_jg.setNum1(rs.getInt("num"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_khxxtj.khxx_qx_pl() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_khxxtj.khxx_qx_pl()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_khxxtj.khxx_qx_pl()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_khxxtj.khxx_qx_pl()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}
	public List<Cls_e_tmp> khxx_qx_cj(String sql,String citycode) throws Cls_exception {
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("select count(*) as num,substr(org_code,3,2) as qx from kcs_specbxkh t where mark=1 and sour=0 and citycode='");
		sqlInsert.append(citycode+"'"+sql);
		sqlInsert.append("   group by substr(org_code,3,2) order by qx");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Cls_e_tmp tmp_jg = new Cls_e_tmp();
				tmp_jg.setS1(rs.getString("qx"));
				tmp_jg.setNum1(rs.getInt("num"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_khxxtj.khxx_qx_cj() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_khxxtj.khxx_qx_cj()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_khxxtj.khxx_qx_cj()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_khxxtj.khxx_qx_cj()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}
	public Cls_e_tmp khxx_tbb(String q_date,String z_date,String citycode) throws Cls_exception {
		Cls_e_tmp rtn = new Cls_e_tmp();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("select sum(case when sour=0 then 1 else 0 end) as sour0,");
		sqlInsert.append("sum(case when sour=1 then 1 else 0 end) as sour1 from kcs_specbxkh t where mark=1");
		sqlInsert.append(" and  time>=TO_DATE('"+q_date+"','yyyy-mm-dd')");
		sqlInsert.append(" and  time<=TO_DATE('"+z_date+"-23-59-59','yyyy-mm-dd-hh24-mi-ss')");
		sqlInsert.append(" and  citycode='"+citycode+"'");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				rtn.setNum1(rs.getInt("sour0"));
				rtn.setNum2(rs.getInt("sour1"));
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_khxxtj.khxx_tbb() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_khxxtj.khxx_tbb()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_khxxtj.khxx_tbb()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_khxxtj.khxx_tbb()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtn;
	}
	public Cls_e_tmp khxx_tbb_mon(String z_date,String citycode) throws Cls_exception {
		Cls_e_tmp rtn = new Cls_e_tmp();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		String mon = z_date.substring(0, z_date.indexOf("-", 5));
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("select sum(case when sour=0 then 1 else 0 end) as sour0,");
		sqlInsert.append("sum(case when sour=1 then 1 else 0 end) as sour1 from kcs_specbxkh t where mark=1");
		sqlInsert.append(" and to_char(time,'yyyy-mm')='"+mon+"' and to_char(time,'yyyy-mm-dd')<='"+z_date+"'");
		sqlInsert.append(" and citycode='"+citycode+"'");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				rtn.setNum1(rs.getInt("sour0"));
				rtn.setNum2(rs.getInt("sour1"));

			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_khxxtj.khxx_tbb_mon() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_khxxtj.khxx_tbb_mon()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_khxxtj.khxx_tbb_mon()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_khxxtj.khxx_tbb_mon()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtn;
	}
	public Cls_e_tmp khxx_tbb_year(String z_date,String citycode) throws Cls_exception {
		Cls_e_tmp rtn = new Cls_e_tmp();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		String year = z_date.substring(0, z_date.indexOf("-", 1));
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("select sum(case when sour=0 then 1 else 0 end) as sour0,");
		sqlInsert.append("sum(case when sour=1 then 1 else 0 end) as sour1 from kcs_specbxkh t where mark=1");
		sqlInsert.append(" and to_char(time,'yyyy')='"+year+"' and to_char(time,'yyyy-mm-dd')<='"+z_date+"'");
		sqlInsert.append(" and citycode='"+citycode+"'");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				rtn.setNum1(rs.getInt("sour0"));
				rtn.setNum2(rs.getInt("sour1"));
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_khxxtj.khxx_tbb_year() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_khxxtj.khxx_tbb_year()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_khxxtj.khxx_tbb_year()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_khxxtj.khxx_tbb_year()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtn;
	}
	public List<Cls_e_tmp> GetDsdm() throws Cls_exception{
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
	 try{	
		 Cls_connect80 cn = new Cls_connect80();
	 	 conn = cn.connect().getConnection();
		 pstmt=conn.prepareStatement("select city_no,para_value from esseapp.kcs_para t where coun_no='00' and city_no<>'00'  order by city_no ");
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
		  //log.error("Cls_l_qstbb_qx:"+e.toString());
			throw new Cls_exception(" DownExcelTb.GetDsdm() "+e.toString());
	 }	
	finally{
		
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception(" DownExcelTb.GetDsdm()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception(" DownExcelTb.GetDsdm()"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception(" DownExcelTb.GetDsdm()"+e.toString());
					}
			   conn =null;
						}
		}
	return rtnAL;
		}	
}
