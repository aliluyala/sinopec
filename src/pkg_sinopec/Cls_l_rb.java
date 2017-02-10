package pkg_sinopec;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * @author Administrator
 * 
 */
public class Cls_l_rb {
	private  Logger log = Logger.getLogger(Cls_l_rb.class);
	public List<Integer> get_bxgs(String citycode) throws Cls_exception {
		ArrayList<Integer> rtnAL = new ArrayList<Integer>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("select distinct gsxh from kcs_specbxcljg t where city_code="
						+ citycode + " order by gsxh ");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				rtnAL.add(rs.getInt(1));
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_rb.get_bxgs() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.get_bxgs()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.get_bxgs()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.get_bxgs()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}
	public int gsdd_day(String citycode,String rq,int gs) throws Cls_exception {
		int num=0;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("select count(*) from (select distinct cphm from kcs_specbaoxian t where to_char(order_time,'yyyy-mm-dd')='");
		sqlInsert.append(rq);
		sqlInsert.append("' and order_type<>'3'  and city_code='"+citycode+"' and yw_type="+gs+")");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				num=rs.getInt(1);
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_rb.gsdd_day() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.gsdd_day()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.gsdd_day()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.gsdd_day()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return num;
	}
	public int gsdd_week(String citycode,String rq,int gs) throws Cls_exception {
		int num=0;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("select count(*) from (select distinct cphm from kcs_specbaoxian t where trunc(order_time, 'd')=");
		sqlInsert.append("trunc(to_date('"+rq+"','yyyy-mm-dd'),'d') and to_char(order_time,'yyyy-mm-dd')<='"+rq+"' and trunc(order_time, 'yyyy')=trunc(sysdate, 'yyyy')");
		sqlInsert.append(" and order_type<>'3'  and city_code='"+citycode+"' and yw_type="+gs+")");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				num=rs.getInt(1);
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_rb.gsdd_week() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.gsdd_week()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.gsdd_week()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.gsdd_week()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return num;
	}
	public int gsdd_mon(String citycode,String rq,int gs) throws Cls_exception {
		int num=0;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("select count(*) from (select distinct cphm from kcs_specbaoxian t where trunc(order_time, 'mm')=");
		sqlInsert.append("trunc(to_date('"+rq+"','yyyy-mm-dd'),'mm') and to_char(order_time,'yyyy-mm-dd')<='"+rq+"' and trunc(order_time, 'yyyy')=trunc(sysdate, 'yyyy')");
		sqlInsert.append(" and order_type<>'3'  and city_code='"+citycode+"' and yw_type="+gs+")");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				num=rs.getInt(1);
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_rb.gsdd_mon() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.gsdd_mon()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.gsdd_mon()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.gsdd_mon()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return num;
	}
    public int gsdd_lj(String citycode,String rq,int gs) throws Cls_exception {
	int num=0;
	java.sql.Connection conn = null;
	java.sql.PreparedStatement pstmt = null;
	java.sql.ResultSet rs = null;
	StringBuffer sqlInsert = new StringBuffer();
	sqlInsert.append("select count(*) from (select distinct cphm from kcs_specbaoxian t where to_char(order_time,'yyyy-mm-dd')<='"+rq+"' and trunc(order_time, 'yyyy')=trunc(sysdate, 'yyyy')");
    sqlInsert.append(" and  order_type<>'3'  and city_code='"+citycode+"' and yw_type="+gs+")");
	try {
		Cls_connect cn = new Cls_connect();
		conn = cn.connect().getConnection();
		pstmt = conn.prepareStatement(sqlInsert.toString());
		rs = pstmt.executeQuery();

		while (rs.next()) {
			num=rs.getInt(1);
		}
	} catch (Exception e) {
		throw new Cls_exception("Cls_l_rb.gsdd_lj() " + e.toString());
	} finally {

		if (rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				throw new Cls_exception("Cls_l_rb.gsdd_lj()"
						+ e.toString());
			}
			rs = null;
		}
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (Exception e) {
				throw new Cls_exception("Cls_l_rb.gsdd_lj()"
						+ e.toString());
			}
			pstmt = null;
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				throw new Cls_exception("Cls_l_rb.gsdd_lj()"
						+ e.toString());
			}
			conn = null;
		}
	}
	return num;
}
	public Cls_e_tmp gsdd_s_day(String citycode,String rq,int gs) throws Cls_exception {
		Cls_e_tmp tmp_jg=null;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("select count(*) as n1,sum(Sum_price) as d1 from kcs_specbaoxian t where to_char(proce_time,'yyyy-mm-dd')='");
		sqlInsert.append(rq);
		sqlInsert.append("' and order_type='6'  and city_code='"+citycode+"' and yw_type="+gs+"");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				tmp_jg=new Cls_e_tmp();
				tmp_jg.setD1(rs.getDouble("d1"));
	            tmp_jg.setNum1(rs.getInt("n1"));
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_rb.gsdd_s_day() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.gsdd_s_day()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.gsdd_s_day()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.gsdd_s_day()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return tmp_jg;
	}
	public Cls_e_tmp gsdd_s_week(String citycode,String rq,int gs) throws Cls_exception {
		Cls_e_tmp tmp_jg=null;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("select count(*) as n1,sum(Sum_price) as d1 from kcs_specbaoxian t where trunc(proce_time, 'd')=");
		sqlInsert.append("trunc(to_date('"+rq+"','yyyy-mm-dd'),'d')  and to_char(proce_time,'yyyy-mm-dd')<='"+rq+"' and trunc(proce_time, 'yyyy')=trunc(sysdate, 'yyyy')");
		sqlInsert.append(" and order_type='6'  and city_code='"+citycode+"' and yw_type="+gs+"");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				tmp_jg=new Cls_e_tmp();
				tmp_jg.setD1(rs.getDouble("d1"));
	            tmp_jg.setNum1(rs.getInt("n1"));
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_rb.gsdd_s_week() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.gsdd_s_week()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.gsdd_s_week()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.gsdd_s_week()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return tmp_jg;
	}
	public Cls_e_tmp gsdd_s_mon(String citycode,String rq,int gs) throws Cls_exception {
		Cls_e_tmp tmp_jg=null;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("select count(*) as n1,sum(Sum_price) as d1 from kcs_specbaoxian t where trunc(proce_time, 'mm')=");
		sqlInsert.append("trunc(to_date('"+rq+"','yyyy-mm-dd'),'mm') and to_char(proce_time,'yyyy-mm-dd')<='"+rq+"' and trunc(proce_time, 'yyyy')=trunc(sysdate, 'yyyy')");
		sqlInsert.append(" and order_type='6'  and city_code='"+citycode+"' and yw_type="+gs+"");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				tmp_jg=new Cls_e_tmp();
				tmp_jg.setD1(rs.getDouble("d1"));
	            tmp_jg.setNum1(rs.getInt("n1"));
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_rb.gsdd_s_mon() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.gsdd_s_mon()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.gsdd_s_mon()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.gsdd_s_mon()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return tmp_jg;
	}
	public Cls_e_tmp gsdd_s_lj(String citycode,String rq,int gs) throws Cls_exception {
		Cls_e_tmp tmp_jg=null;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert.append("select count(*) as n1,sum(Sum_price) as d1 from kcs_specbaoxian t where  to_char(proce_time,'yyyy-mm-dd')<='"+rq+"' and trunc(proce_time, 'yyyy')=trunc(sysdate, 'yyyy')");
		sqlInsert.append("  and order_type='6'  and city_code='"+citycode+"' and yw_type="+gs+"");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				tmp_jg=new Cls_e_tmp();
				tmp_jg.setD1(rs.getDouble("d1"));
	            tmp_jg.setNum1(rs.getInt("n1"));
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_rb.gsdd_s_lj() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.gsdd_s_lj()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.gsdd_s_lj()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.gsdd_s_lj()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return tmp_jg;
	}
    public String dayForWeek(String rq) throws Cls_exception{
    	String wk="";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");          
	    try {
			Date  date = format.parse(rq);
			SimpleDateFormat dateFm = new SimpleDateFormat("EEEE");
			wk=dateFm.format(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return wk;   
    }
	/**
	 * 查询某地市所有区县名称代码
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
		 pstmt=conn.prepareStatement("select coun_no,para_value from esseapp.kcs_para t where city_no=? and coun_no<>'00' order by coun_no ");
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
/*
	 * 日报--车险超市询价订单统计，
	 * 剔除 英大 保险的订单yw_type=4（补录，线下支付的订单）
 */
	public int qxdd(String citycode,String rq,String counno,String lx) throws Cls_exception {
		int num=0;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		String sql="";
		if ("day".equals(lx))
			sql=" and to_char(order_time,'yyyy-mm-dd')='"+rq+"'";
		if ("week".equals(lx))
			sql=" and trunc(order_time, 'd')=trunc(to_date('"+rq+"','yyyy-mm-dd'),'d') and to_char(order_time,'yyyy-mm-dd')<='"+rq+"'";
		if ("mon".equals(lx))
			sql=" and trunc(order_time, 'mm')=trunc(to_date('"+rq+"','yyyy-mm-dd'),'mm') and to_char(order_time,'yyyy-mm-dd')<='"+rq+"'";		
		if ("lj".equals(lx))
			sql="  and to_char(order_time,'yyyy-mm-dd')<='"+rq+"'";		
		sqlInsert.append("select count(*) from (select distinct cphm from kcs_specbaoxian t where ");
		sqlInsert.append("  order_type<>'3'  and city_code='"+citycode+"' and trunc(order_time, 'yyyy')=trunc(sysdate, 'yyyy')");
		sqlInsert.append(" and yw_type<>'4'");
		sqlInsert.append(sql);		
		if (!"00".equals(counno))
			sqlInsert.append("  and substr(org_code,3,2)='"+counno+"'");
		sqlInsert.append(")");
		log.error(sqlInsert.toString());
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				num=rs.getInt(1);
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_rb.qxdd" + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.qxdd()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.qxdd()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.qxdd()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return num;
	}
	/*
	 * 日报--车险超市出单统计，
	 * 剔除 英大 保险的订单yw_type=4（补录，线下支付的订单）
	 */
	public int qxdd_s(String citycode,String rq,String counno,String lx) throws Cls_exception {
		int num=0;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		String sql="";
		if ("day".equals(lx))
			sql=" and to_char(proce_time,'yyyy-mm-dd')='"+rq+"'";
		if ("week".equals(lx))
			sql=" and trunc(proce_time, 'd')=trunc(to_date('"+rq+"','yyyy-mm-dd'),'d') and to_char(proce_time,'yyyy-mm-dd')<='"+rq+"'";
		if ("mon".equals(lx))
			sql=" and trunc(proce_time, 'mm')=trunc(to_date('"+rq+"','yyyy-mm-dd'),'mm') and to_char(proce_time,'yyyy-mm-dd')<='"+rq+"'";		
		if ("lj".equals(lx))
			sql="  and to_char(proce_time,'yyyy-mm-dd')<='"+rq+"'";		
		
		sqlInsert.append("select count(*) from  kcs_specbaoxian t where ");
		sqlInsert.append("  order_type='6'  and city_code='"+citycode+"' and trunc(proce_time, 'yyyy')=trunc(sysdate, 'yyyy')");
		sqlInsert.append(" and yw_type<>'4'");
		sqlInsert.append(sql);		
		if (!"00".equals(counno))
			sqlInsert.append("  and substr(org_code,3,2)='"+counno+"'");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				num=rs.getInt(1);
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_rb.qxdd_s" + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.qxdd_s()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.qxdd_s()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.qxdd_s()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return num;
	}
	public int wzdd(String citycode,String rq,String counno,String lx) throws Cls_exception {
		int num=0;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		String sql="";
		if ("day".equals(lx))
			sql=" and to_char(proce_time,'yyyy-mm-dd')='"+rq+"'";
		if ("week".equals(lx))
			sql=" and trunc(proce_time, 'd')=trunc(to_date('"+rq+"','yyyy-mm-dd'),'d') and to_char(proce_time,'yyyy-mm-dd')<='"+rq+"'";
		if ("mon".equals(lx))
			sql=" and trunc(proce_time, 'mm')=trunc(to_date('"+rq+"','yyyy-mm-dd'),'mm') and to_char(proce_time,'yyyy-mm-dd')<='"+rq+"'";		
		if ("lj".equals(lx))
			sql="  and to_char(proce_time,'yyyy-mm-dd')<='"+rq+"'";		
		
		sqlInsert.append("select count(*) from  kcs_fkddmx t where ");
		sqlInsert.append(" yw_type<>'便民站代办违章缴费' and (order_type='6' or order_type='1')  and proc_orgcode='"+citycode+"' and trunc(proce_time, 'yyyy')=trunc(sysdate, 'yyyy')");
		sqlInsert.append(sql);		
		if (!"00".equals(counno))
			sqlInsert.append("  and substr(org_code,3,2)='"+counno+"'");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				num=rs.getInt(1);
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_rb.qxdd_s" + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.qxdd_s()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.qxdd_s()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.qxdd_s()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return num;
	}
	public String getSysDate_f1() {
    	Calendar calendar = Calendar.getInstance();	
    	calendar.add(Calendar.DATE, -1);    //得到前一天
    	Date date = calendar.getTime();
    	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    	String mytime = df.format(date);
    	return mytime;
	}
	public Cls_e_tmp shx(String citycode,String rq,int bxgs,String lx) throws Cls_exception {
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		String sql="";
		if ("day".equals(lx))
			sql=" and to_char(order_time,'yyyy-mm-dd')='"+rq+"'";
		if ("week".equals(lx))
			sql=" and trunc(order_time, 'd')=trunc(to_date('"+rq+"','yyyy-mm-dd'),'d') and to_char(order_time,'yyyy-mm-dd')<='"+rq+"'";
		if ("mon".equals(lx))
			sql=" and trunc(order_time, 'mm')=trunc(to_date('"+rq+"','yyyy-mm-dd'),'mm') and to_char(order_time,'yyyy-mm-dd')<='"+rq+"'";		

		
		sqlInsert.append("select count(*) as n1,count(case when bj_time<=order_time + interval '10' MINUTE  then 1 else NULL END) as s1,");
		sqlInsert.append("count(case when bj_time>order_time + interval '10' minute and bj_time <=order_time + interval '15' MINUTE then 1 else NULL END) as s2,");
		sqlInsert.append(" count(case when bj_time > order_time + interval '15' minute then 1 else null end) as s3");
		sqlInsert.append(" from kcs_specbaoxian t where city_code='"+citycode+"' and bj_time is not null");
		sqlInsert.append(sql);	
		if (bxgs>0) 
			sqlInsert.append(" and yw_type="+bxgs);
		Cls_e_tmp tmp_jg=new Cls_e_tmp();
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				tmp_jg.setNum1(rs.getInt("n1"));
				tmp_jg.setS1(rs.getString("s1"));
				tmp_jg.setS2(rs.getString("s2"));
				tmp_jg.setS3(rs.getString("s3"));
				
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_rb.shx" + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.shx()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.shx()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_rb.shx()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return tmp_jg;
	}
	public  List<Cls_e_tmp>  shx_mx(String citycode, int p, int ev,int bxgs) throws Cls_exception {
		java.sql.Connection conn=null;
		java.sql.PreparedStatement pstmt=null;
		java.sql.ResultSet rs=null;
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		StringBuffer sqlInsert = new StringBuffer();
	 try{	
		 Cls_connect cn = new Cls_connect();
	 	conn = cn.connect().getConnection();
	 	sqlInsert.append("SELECT id,to_char(order_time,'yyyy-mm-dd hh24:mi:ss') as sorder_time,to_char(bj_time,'yyyy-mm-dd hh24:mi:ss') as sbj_time,");
	 	sqlInsert.append("case when bj_time<=order_time + interval '10' MINUTE  then 1 else 0 END as n1,");
	 	sqlInsert.append("case when bj_time>order_time + interval '10' minute and bj_time <=order_time + interval '15' MINUTE then 1 else 0 END as n2,");
	 	sqlInsert.append("case when bj_time > order_time + interval '15' minute then 1 else 0 end as n3");
	 	sqlInsert.append(" FROM kcs_specbaoxian t");
	 	sqlInsert.append(" WHERE ROWID IN (");
	 	sqlInsert.append(" SELECT rid FROM (");
	 	sqlInsert.append(" SELECT rid, ROWNUM AS rn FROM (");
	 	sqlInsert.append(" SELECT ROWID rid FROM kcs_specbaoxian");
	 	sqlInsert.append(" where city_code='"+citycode+"' and bj_time is not null  and yw_type="+bxgs);
	 	sqlInsert.append(" ORDER BY id desc");
	 	sqlInsert.append(" ) t1 WHERE  ROWNUM<"+ev);
	 	sqlInsert.append(" ) t2 WHERE  rn>="+p);
	 	sqlInsert.append(" ) ORDER BY id desc");
	 	pstmt=conn.prepareStatement(sqlInsert.toString());
		rs=pstmt.executeQuery();
		Cls_e_tmp tmp_jg;
		while(rs.next()) {
			  tmp_jg=new Cls_e_tmp();
			  tmp_jg.setS1(rs.getString("id"));
			  tmp_jg.setS2(rs.getString("sorder_time"));
			  tmp_jg.setS3(rs.getString("sbj_time"));
              tmp_jg.setNum1(rs.getInt("n1"));
              tmp_jg.setNum2(rs.getInt("n2"));
              tmp_jg.setNum3(rs.getInt("n3"));
			  rtnAL.add(tmp_jg);
		      tmp_jg=null;
					}
		 }
	  catch(Exception e){
			throw new Cls_exception("Cls_l_rb.shx_mx() "+e.toString());
	 }	
	finally{
			
		if (rs!=null){
			try{
				rs.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_rb.shx_mx()"+e.toString());
					}
			     rs=null;  
						}
						if (pstmt!=null) {
			try{
							pstmt.close();}
			catch(Exception e){
						 throw new Cls_exception("Cls_l_rb.shx_mx())"+e.toString());
					}
			     pstmt=null;
						}
						if (conn!=null){
			try{
							conn.close();
			}catch(Exception e){
						 throw new Cls_exception("Cls_l_rb.shx_mx()"+e.toString());
					}
			   conn =null;
						}
			
		}
	return rtnAL;

		}
}
