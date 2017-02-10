package pkg_sinopec;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;

public class Cls_l_bxtj {
	private  Logger log = Logger.getLogger(Cls_l_bxtj.class);
	/**
	 * 全省出单，按地市分组
	 * 
	 * @param sql
	 * @return 订单数量，保费，车船税，合计
	 * @throws Cls_exception
	 */
	public List<Cls_e_tmp> qs_tjb(String sql) throws Cls_exception {
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		// sqlInsert.append("select city_code,count(*) as ddnum,sum(sum_price) as sumj  from kcs_specbaoxian t  where  order_type='6' ");
		sqlInsert
				.append("select city_code,count(*) as ddnum,sum(f_sunshi+f_3zhe+f_daoq+f_siji+f_chke+f_ziran+f_hhen+f_boli+f_bjm+f_jq+f_3) as ssyx,");
		sqlInsert
				.append("sum(f_chchsh) as schchsh,sum(sum_price) as sumj from kcs_specbaoxian t  where  order_type='6' ");
		sqlInsert.append(sql);
		sqlInsert.append("   group by city_code order by city_code");
		log.error(sqlInsert.toString());
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Cls_e_tmp tmp_jg = new Cls_e_tmp();
				tmp_jg.setS1(rs.getString("city_code"));
				tmp_jg.setNum1(rs.getInt("ddnum"));
				// tmp_jg.setNum2(rs.getInt("yw_type"));
				tmp_jg.setD1(rs.getDouble("sumj"));
				tmp_jg.setD2(rs.getDouble("ssyx"));
				tmp_jg.setD3(rs.getDouble("schchsh"));

				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_bxtj.qs_tjb() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_bxtj.qs_tjb()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_bxtj.qs_tjb()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_bxtj.qs_tjb()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}

	/**
	 * 某地市 出单 按 保险公司分组
	 * 
	 * @param sql
	 * @param citycode
	 * @return 订单数量，保费，车船税，合计
	 * @throws Cls_exception
	 */
	public List<Cls_e_tmp> qs_tjb(String sql, String citycode)
			throws Cls_exception {
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("select count(*) as ddnum,sum(sum_price) as sumj,sum(f_chchsh) as schchsh,");
		sqlInsert
				.append("sum(f_sunshi+f_3zhe+f_daoq+f_siji+f_chke+f_ziran+f_hhen+f_boli+f_bjm+f_jq+f_3) as ssyx,");
		sqlInsert
				.append("yw_type from kcs_specbaoxian t  where  order_type='6' and city_code='");
		sqlInsert.append(citycode);
		sqlInsert.append("' ");
		sqlInsert.append(sql);
		sqlInsert.append("   group by yw_type  order by yw_type");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Cls_e_tmp tmp_jg = new Cls_e_tmp();
				// tmp_jg.setNum3(rs.getInt("order_type"));
				tmp_jg.setNum1(rs.getInt("ddnum"));
				tmp_jg.setNum2(rs.getInt("yw_type"));
				tmp_jg.setD1(rs.getDouble("sumj"));
				tmp_jg.setD2(rs.getDouble("ssyx"));
				tmp_jg.setD3(rs.getDouble("schchsh"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_bxtj.qs_tjb() " + e.toString());
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_bxtj.qs_tjb()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_bxtjx.qs_tjb()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_bxtj.qs_tjb()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}

	/**
	 * 某地市出单 按 区县分组
	 * 
	 * @param sql
	 * @return 订单数量，保费，车船税，合计
	 * @throws Cls_exception
	 */
	public List<Cls_e_tmp> qx_tjb(String sql) throws Cls_exception {
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("select substr(org_code,3,2) as city_code,count(*) as ddnum,sum(sum_price) as sumj,sum(f_chchsh) as schchsh,");
		sqlInsert
				.append("sum(f_sunshi+f_3zhe+f_daoq+f_siji+f_chke+f_ziran+f_hhen+f_boli+f_bjm+f_jq+f_3) as ssyx  from kcs_specbaoxian t  where  order_type='6' ");
		sqlInsert.append(sql);
		sqlInsert
				.append("   group by substr(org_code,3,2) order by substr(org_code,3,2)");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Cls_e_tmp tmp_jg = new Cls_e_tmp();
				tmp_jg.setS1(rs.getString("city_code"));
				tmp_jg.setNum1(rs.getInt("ddnum"));
				tmp_jg.setD1(rs.getDouble("sumj"));
				tmp_jg.setD2(rs.getDouble("ssyx"));
				tmp_jg.setD3(rs.getDouble("schchsh"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_bxtj.qx_tjb() " + e.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_bxtj.qx_tjb()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_bxtj.qx_tjb()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_bxtj.qx_tjb()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}

	/**
	 * 某区县 出单 按保险公司分组
	 * 
	 * @param sql
	 * @param citycode
	 * @return 订单数量，保费，车船税，合计
	 * @throws Cls_exception
	 */
	public List<Cls_e_tmp> qx_tjb(String sql, String citycode)
			throws Cls_exception {
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("select count(*) as ddnum,sum(sum_price) as sumj,sum(f_chchsh) as schchsh,yw_type,");
		sqlInsert
				.append("sum(f_sunshi+f_3zhe+f_daoq+f_siji+f_chke+f_ziran+f_hhen+f_boli+f_bjm+f_jq+f_3) as ssyx ");
		sqlInsert
				.append(" from kcs_specbaoxian t  where  order_type='6' and substr(org_code,0,4)='");
		sqlInsert.append(citycode);
		sqlInsert.append("' ");
		sqlInsert.append(sql);
		sqlInsert.append("   group by yw_type  order by yw_type");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Cls_e_tmp tmp_jg = new Cls_e_tmp();

				tmp_jg.setNum1(rs.getInt("ddnum"));
				tmp_jg.setNum2(rs.getInt("yw_type"));
				tmp_jg.setD1(rs.getDouble("sumj"));
				tmp_jg.setD2(rs.getDouble("ssyx"));
				tmp_jg.setD3(rs.getDouble("schchsh"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_bxtj.qs_tjb() " + e.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_bxtj.qs_tjb()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_bxtjx.qs_tjb()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_bxtj.qs_tjb()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}

	public List<Cls_e_tmp> zj_tjb(String sql, String qxcode)
			throws Cls_exception {
		ArrayList<Cls_e_tmp> rtnAL = new ArrayList<Cls_e_tmp>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("select count(*) as ddnum,sum(sum_price) as sumj,yw_type,org_code,chzh from kcs_specbaoxian t  where  order_type='6' and substr(org_code,0,4)='");
		sqlInsert.append(qxcode);
		sqlInsert.append("' ");
		sqlInsert.append(sql);
	//	sqlInsert.append("   group by yw_type,org_code  order by org_code");
		sqlInsert.append("   group by yw_type,org_code,chzh  order by org_code,chzh");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Cls_e_tmp tmp_jg = new Cls_e_tmp();

				tmp_jg.setS1(rs.getString("org_code"));
				tmp_jg.setS2(rs.getString("chzh"));
				tmp_jg.setNum1(rs.getInt("ddnum"));
				tmp_jg.setNum2(rs.getInt("yw_type"));
				tmp_jg.setD1(rs.getDouble("sumj"));

				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_bxtj.zj_tjb() " + e.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_bxtj.zj_tjb()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_bxtjx.zj_tjb()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_bxtj.zj_tjb()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}

	/**
	 * 某地市 出单
	 * 
	 * @param tsql
	 * @param citycode
	 * @return 商业险 交强险 车船税 合计 ......
	 * @throws Cls_exception
	 */
	public List<Cls_e_bx> select_by_stj(String tsql, String citycode)
			throws Cls_exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Cls_e_bx> rtnAL = new ArrayList<Cls_e_bx>();
		StringBuffer sqlInsert = new StringBuffer();
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			sqlInsert
					.append("select to_char(order_time,'yyyy-mm-dd hh24:mi:ss') as sorder_time,to_char(proce_time,'yyyy-mm-dd hh24:mi:ss') as sproce_time,");
			sqlInsert
					.append("id,org_code,substr(org_code,3,2) as qx,opercode,city_code,oper_orgcode,oper_opercode,yw_type,name,tele_no,cphm,ppxh,d_message,price_detail,");
			sqlInsert
					.append("order_mark,order_type,sum_price,f_sunshi+f_3zhe+f_daoq+f_siji+f_chke+f_ziran+f_hhen+f_boli+f_bjm+f_3 as syx,f_jq,f_chchsh,relashi,chzh");
			sqlInsert
					.append(" from  kcs_specbaoxian t where  order_type='6' and city_code='"
							+ citycode + "' " + tsql + " order by org_code");
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Cls_e_bx tmp_jg = new Cls_e_bx();
				tmp_jg.setId(rs.getInt("id"));
				tmp_jg.setOrg_code(rs.getString("org_code"));
				tmp_jg.setOpercode(rs.getString("opercode"));
				tmp_jg.setCity_code(rs.getString("city_code"));
				tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
				tmp_jg.setOper_opercode(rs.getString("oper_opercode"));
				tmp_jg.setYw_type(rs.getInt("yw_type"));
				tmp_jg.setName(rs.getString("name"));
				tmp_jg.setTele_no(rs.getString("tele_no"));
				tmp_jg.setCphm(rs.getString("cphm"));
				tmp_jg.setPpxh(rs.getString("ppxh"));
				tmp_jg.setD_message(rs.getString("d_message"));
				tmp_jg.setPrice_detail(rs.getString("price_detail"));
				tmp_jg.setOrder_mark(rs.getString("order_mark"));
				tmp_jg.setOrder_type(rs.getString("order_type"));
				tmp_jg.setSum_price(rs.getDouble("sum_price"));
				tmp_jg.setSorder_time(rs.getString("sorder_time"));
				tmp_jg.setSproce_time(rs.getString("sproce_time"));
				tmp_jg.setF_sunshi(rs.getDouble("syx"));
				tmp_jg.setF_jq(rs.getDouble("f_jq"));
				tmp_jg.setF_chchsh(rs.getDouble("f_chchsh"));
				tmp_jg.setAdd_message(rs.getString("qx"));
                tmp_jg.setRelashi(rs.getString("relashi"));
                tmp_jg.setChzh(rs.getString("chzh"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_bx.select_by_stj() " + e.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_bx.select_by_stj()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_bx.select_by_stj()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_bx.select_by_stj()"
							+ e.toString());
				}
				conn = null;
			}
		}

		return rtnAL;
	}

	/**
	 * 某区县 出单
	 * 
	 * @param tsql
	 * @param citycode
	 * @return 商业险 交强险 车船税 合计 ......
	 * @throws Cls_exception
	 */
	public List<Cls_e_bx> select_by_qtj(String tsql, String councode)
			throws Cls_exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Cls_e_bx> rtnAL = new ArrayList<Cls_e_bx>();
		StringBuffer sqlInsert = new StringBuffer();
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			sqlInsert
					.append("select to_char(order_time,'yyyy-mm-dd hh24:mi:ss') as sorder_time,to_char(proce_time,'yyyy-mm-dd hh24:mi:ss') as sproce_time,");
			sqlInsert
					.append("id,org_code,opercode,city_code,oper_orgcode,oper_opercode,yw_type,name,tele_no,cphm,ppxh,d_message,price_detail,chzh,");
			sqlInsert
					.append("order_mark,order_type,sum_price,f_sunshi+f_3zhe+f_daoq+f_siji+f_chke+f_ziran+f_hhen+f_boli+f_bjm+f_3 as syx,f_jq,f_chchsh,relashi");
			sqlInsert
					.append(" from  kcs_specbaoxian t where  order_type='6' and substr(org_code,3,2)='"
							+ councode + "' " + tsql + " order by org_code");
			pstmt = conn.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Cls_e_bx tmp_jg = new Cls_e_bx();
				tmp_jg.setId(rs.getInt("id"));
				tmp_jg.setOrg_code(rs.getString("org_code"));
				tmp_jg.setOpercode(rs.getString("opercode"));
				tmp_jg.setCity_code(rs.getString("city_code"));
				tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
				tmp_jg.setOper_opercode(rs.getString("oper_opercode"));
				tmp_jg.setYw_type(rs.getInt("yw_type"));
				tmp_jg.setName(rs.getString("name"));
				tmp_jg.setTele_no(rs.getString("tele_no"));
				tmp_jg.setCphm(rs.getString("cphm"));
				tmp_jg.setPpxh(rs.getString("ppxh"));
				tmp_jg.setD_message(rs.getString("d_message"));
				tmp_jg.setPrice_detail(rs.getString("price_detail"));
				tmp_jg.setOrder_mark(rs.getString("order_mark"));
				tmp_jg.setOrder_type(rs.getString("order_type"));
				tmp_jg.setSum_price(rs.getDouble("sum_price"));
				tmp_jg.setSorder_time(rs.getString("sorder_time"));
				tmp_jg.setSproce_time(rs.getString("sproce_time"));
				tmp_jg.setF_sunshi(rs.getDouble("syx"));
				tmp_jg.setF_jq(rs.getDouble("f_jq"));
				tmp_jg.setF_chchsh(rs.getDouble("f_chchsh"));
                tmp_jg.setRelashi(rs.getString("relashi"));
                tmp_jg.setChzh(rs.getString("chzh"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_bx.select_by_stj() " + e.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_bx.select_by_stj()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_bx.select_by_stj()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_bx.select_by_stj()"
							+ e.toString());
				}
				conn = null;
			}
		}

		return rtnAL;
	}
}