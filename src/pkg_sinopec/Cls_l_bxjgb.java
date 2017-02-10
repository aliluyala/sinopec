package pkg_sinopec;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * 
 */
public class Cls_l_bxjgb {
	public List<Cls_e_jgb> select_sjb_bytj(String org_code)
			throws Cls_exception {
		ArrayList<Cls_e_jgb> rtnAL = new ArrayList<Cls_e_jgb>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;

		try {
			Cls_connect80 cn = new Cls_connect80();
			conn = cn.connect().getConnection();
			pstmt = conn
					.prepareStatement("select orgname as oper_orgname,org_code as oper_orgcode,org_tel,org_addr,city_org as city_code,coun_org as coun_code from esseapp.KCS_ORG_INFO where org_code=? and org_level<>'3' and org_flag='0' ");
			pstmt.setString(1, org_code);
			rs = pstmt.executeQuery();

			Cls_e_jgb tmp_jg;
			while (rs.next()) {
				tmp_jg = new Cls_e_jgb();
				tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
				tmp_jg.setOper_orgname(rs.getString("oper_orgname"));
				tmp_jg.setOrg_tel(rs.getString("org_tel"));
				tmp_jg.setOrg_addr(rs.getString("org_addr"));
				tmp_jg.setCity_code(rs.getString("city_code"));
				tmp_jg.setCoun_code(rs.getString("coun_code"));

				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_jgb.select_sjb_bytj() "
					+ e.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.select_sjb_bytj()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.select_sjb_bytj()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.select_sjb_bytj()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}

	public List<Cls_e_jgb> select_byno(int serial_no) throws Cls_exception {
		ArrayList<Cls_e_jgb> rtnAL = new ArrayList<Cls_e_jgb>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;

		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn
					.prepareStatement("select * from kcs_specbxcljg where serial_no=?");
			pstmt.setInt(1, serial_no);
			rs = pstmt.executeQuery();

			Cls_e_jgb tmp_jg;
			while (rs.next()) {
				tmp_jg = new Cls_e_jgb();
				tmp_jg.setSerial_no(rs.getInt("serial_no"));
				tmp_jg.setCity_code(rs.getString("city_code"));
				tmp_jg.setCoun_code(rs.getString("coun_code"));
				tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
				tmp_jg.setOper_orgname(rs.getString("oper_orgname"));
				tmp_jg.setOrg_tel(rs.getString("org_tel"));
				tmp_jg.setOrg_addr(rs.getString("org_addr"));
				tmp_jg.setQq_number(rs.getString("qq_number"));
				tmp_jg.setWork_time(rs.getString("work_time"));
				tmp_jg.setPer_fee(rs.getDouble("per_fee"));
				tmp_jg.setDeli_mode(rs.getString("deli_mode"));
				tmp_jg.setHm(rs.getString("hm"));
				tmp_jg.setGsm(rs.getString("gsm"));
				tmp_jg.setGsxh(rs.getInt("gsxh"));
				tmp_jg.setYw_mark(rs.getInt("yw_mark"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_jgb.select_byorgcode() "
					+ e.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.select_byorgcode()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.select_byorgcode()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.select_byorgcode()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}
    public List<Integer> getBxgs(String org_code) throws Cls_exception {
    	int a = 0;
    	java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
        List<Integer> lbxgs =  new ArrayList<Integer>();
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn
					.prepareStatement("select gsxh from kcs_specbxcljg where oper_orgcode=?");
			pstmt.setString(1, org_code);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				a = rs.getInt("gsxh");
				lbxgs.add(a);
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_jgb.getBxgs() "
					+ e.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.getBxgs()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.getBxgs()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.getBxgs()"
							+ e.toString());
				}
				conn = null;
			}
		}
		
		return lbxgs;
    }
	public List<Cls_e_jgb> select_byorgcode(String org_code)
			throws Cls_exception {
		ArrayList<Cls_e_jgb> rtnAL = new ArrayList<Cls_e_jgb>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;

		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn
					.prepareStatement("select * from kcs_specbxcljg where oper_orgcode=?");
			pstmt.setString(1, org_code);
			rs = pstmt.executeQuery();

			Cls_e_jgb tmp_jg;
			while (rs.next()) {
				tmp_jg = new Cls_e_jgb();
				tmp_jg.setSerial_no(rs.getInt("serial_no"));
				tmp_jg.setCity_code(rs.getString("city_code"));
				tmp_jg.setCoun_code(rs.getString("coun_code"));
				tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
				tmp_jg.setOper_orgname(rs.getString("oper_orgname"));
				tmp_jg.setOrg_tel(rs.getString("org_tel"));
				tmp_jg.setOrg_addr(rs.getString("org_addr"));
				tmp_jg.setQq_number(rs.getString("qq_number"));
				tmp_jg.setWork_time(rs.getString("work_time"));
				tmp_jg.setPer_fee(rs.getDouble("per_fee"));
				tmp_jg.setDeli_mode(rs.getString("deli_mode"));
				tmp_jg.setHm(rs.getString("hm"));
				tmp_jg.setGsm(rs.getString("gsm"));
				tmp_jg.setGsxh(rs.getInt("gsxh"));
				tmp_jg.setYw_mark(rs.getInt("yw_mark"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_jgb.select_byorgcode() "
					+ e.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.select_byorgcode()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.select_byorgcode()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.select_byorgcode()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}
	public int getNumByCity(String sql) throws Cls_exception{
		int a = 0;
    	java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn
					.prepareStatement("select count(*) from kcs_specbxcljg where 1=1 "+sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				a = rs.getInt(1);
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_jgb.getNumByCity() "
					+ e.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.getNumByCity()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.getNumByCity()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.getNumByCity()"
							+ e.toString());
				}
				conn = null;
			}
		}
		
		return a;
	}
	public List<Cls_e_jgb> select_bypage_citycode(String tsql, int p, int ev)
			throws Cls_exception {
		ArrayList<Cls_e_jgb> rtnAL = new ArrayList<Cls_e_jgb>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
         int ywmark = 0;
         StringBuffer sqlInsert = new StringBuffer();
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			sqlInsert.append("SELECT *  FROM kcs_specbxcljg t");
		 	sqlInsert.append(" WHERE ROWID IN (");
		 	sqlInsert.append(" SELECT rid FROM (");
		 	sqlInsert.append(" SELECT rid, ROWNUM AS rn FROM (");
		 	sqlInsert.append(" SELECT ROWID rid FROM kcs_specbxcljg");
		 	sqlInsert.append(" where 1=1 "+tsql);
		 	sqlInsert.append(" ORDER BY coun_code");
		 	sqlInsert.append(" ) t1 WHERE  ROWNUM<"+ev);
		 	sqlInsert.append(" ) t2 WHERE  rn>="+p);
		 	sqlInsert.append(" ) ORDER BY coun_code");
			pstmt = conn
					.prepareStatement(sqlInsert.toString());
			rs = pstmt.executeQuery();

			Cls_e_jgb tmp_jg;
			while (rs.next()) {
				tmp_jg = new Cls_e_jgb();
				tmp_jg.setSerial_no(rs.getInt("serial_no"));
				tmp_jg.setCity_code(rs.getString("city_code"));
				tmp_jg.setCoun_code(rs.getString("coun_code"));
				tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
				tmp_jg.setOper_orgname(rs.getString("oper_orgname"));
				tmp_jg.setOrg_tel(rs.getString("org_tel"));
				tmp_jg.setOrg_addr(rs.getString("org_addr"));
				tmp_jg.setQq_number(rs.getString("qq_number"));
				tmp_jg.setWork_time(rs.getString("work_time"));
				tmp_jg.setPer_fee(rs.getDouble("per_fee"));
				tmp_jg.setDeli_mode(rs.getString("deli_mode"));
				tmp_jg.setHm(rs.getString("hm"));
				tmp_jg.setGsm(rs.getString("gsm"));
				tmp_jg.setGsxh(rs.getInt("gsxh"));
				ywmark = rs.getInt("yw_mark");
				 if (ywmark==3)
				      tmp_jg.setSyw_type("车险/简易险");
				 if (ywmark==2)
				      tmp_jg.setSyw_type("简易险");
				 if (ywmark==1)
				      tmp_jg.setSyw_type("车险");
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_jgb.select_bypage_citycode() "
					+ e.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.select_bypage_citycode()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.select_bypage_citycode()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.select_bypage_citycode()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}
	public List<Cls_e_jgb> select_bycitycode(String citycode)
			throws Cls_exception {
		ArrayList<Cls_e_jgb> rtnAL = new ArrayList<Cls_e_jgb>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
         int ywmark = 0;
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn
					.prepareStatement("select * from kcs_specbxcljg where city_code=?  order by coun_code");
			pstmt.setString(1, citycode);
			rs = pstmt.executeQuery();

			Cls_e_jgb tmp_jg;
			while (rs.next()) {
				tmp_jg = new Cls_e_jgb();
				tmp_jg.setSerial_no(rs.getInt("serial_no"));
				tmp_jg.setCity_code(rs.getString("city_code"));
				tmp_jg.setCoun_code(rs.getString("coun_code"));
				tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
				tmp_jg.setOper_orgname(rs.getString("oper_orgname"));
				tmp_jg.setOrg_tel(rs.getString("org_tel"));
				tmp_jg.setOrg_addr(rs.getString("org_addr"));
				tmp_jg.setQq_number(rs.getString("qq_number"));
				tmp_jg.setWork_time(rs.getString("work_time"));
				tmp_jg.setPer_fee(rs.getDouble("per_fee"));
				tmp_jg.setDeli_mode(rs.getString("deli_mode"));
				tmp_jg.setHm(rs.getString("hm"));
				tmp_jg.setGsm(rs.getString("gsm"));
				tmp_jg.setGsxh(rs.getInt("gsxh"));
				ywmark = rs.getInt("yw_mark");
				 if (ywmark==3)
				      tmp_jg.setSyw_type("车险/简易险");
				 if (ywmark==2)
				      tmp_jg.setSyw_type("简易险");
				 if (ywmark==1)
				      tmp_jg.setSyw_type("车险");
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_jgb.select_bycitycode() "
					+ e.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.select_bycitycode()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.select_bycitycode()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.select_bycitycode()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}

	public List<Cls_e_jgb> GetCityGs(String citycode) throws Cls_exception {
		ArrayList<Cls_e_jgb> rtnAL = new ArrayList<Cls_e_jgb>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;

		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn
					.prepareStatement("select gsxh,gsm from kcs_specbxcljg where city_code=? and yw_mark<>2 group by gsxh,gsm");
			pstmt.setString(1, citycode);
			rs = pstmt.executeQuery();

			Cls_e_jgb tmp_jg;
			while (rs.next()) {
				tmp_jg = new Cls_e_jgb();
				tmp_jg.setGsm(rs.getString("gsm"));
				tmp_jg.setGsxh(rs.getInt("gsxh"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_jgb.GetCityGs() " + e.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.GetCityGs()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.GetCityGs()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.GetCityGs()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}

	public List<Cls_e_jgb> select_bycitycode(String citycode, String countcode)
			throws Cls_exception {
		ArrayList<Cls_e_jgb> rtnAL = new ArrayList<Cls_e_jgb>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;

		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn
					.prepareStatement("select gsxh,gsm from kcs_specbxcljg where city_code=? and (coun_code like '%"
							+ countcode
							+ "%' or coun_code like '%00%') and yw_mark<>2  group by  gsxh,gsm");
			pstmt.setString(1, citycode);
			rs = pstmt.executeQuery();

			Cls_e_jgb tmp_jg;
			while (rs.next()) {
				tmp_jg = new Cls_e_jgb();
				tmp_jg.setGsm(rs.getString("gsm"));
				tmp_jg.setGsxh(rs.getInt("gsxh"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_jgb.select_bycitycode() "
					+ e.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.select_bycitycode()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.select_bycitycode()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.select_bycitycode()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}

	public List<Cls_e_jgb> qq_bycitycode(String citycode, String countcode)
			throws Cls_exception {
		ArrayList<Cls_e_jgb> rtnAL = new ArrayList<Cls_e_jgb>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;

		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn
					.prepareStatement("select gsxh,gsm,qq_number from kcs_specbxcljg where city_code=? and (coun_code like '%"
							+ countcode
							+ "%' or coun_code like '%00%') and qq_number is not null and yw_mark<>2 group by  gsxh,gsm,qq_number");
			pstmt.setString(1, citycode);
			rs = pstmt.executeQuery();

			Cls_e_jgb tmp_jg;
			while (rs.next()) {
				tmp_jg = new Cls_e_jgb();
				tmp_jg.setGsm(rs.getString("gsm"));
				tmp_jg.setGsxh(rs.getInt("gsxh"));
				tmp_jg.setQq_number(rs.getString("qq_number"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_jgb.qq_bycitycode() " + e.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.qq_bycitycode()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.qq_bycitycode()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.qq_bycitycode()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}

	public List<Cls_e_jgb> get_cljg(String orgcode, int gsxh)
			throws Cls_exception {
		ArrayList<Cls_e_jgb> rtnAL = new ArrayList<Cls_e_jgb>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		String citycode = "", councode = "";
		try {
			if (orgcode.length() == 8) {
				citycode = orgcode.substring(0, 2);
				councode = orgcode.substring(2, 4);
			}
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn
					.prepareStatement("select * from kcs_specbxcljg where city_code='"
							+ citycode
							+ "' and gsxh="
							+ gsxh
							+ " and (coun_code like '%"
							+ councode
							+ "%' or coun_code like '%00%') and yw_mark<>2");
			rs = pstmt.executeQuery();

			Cls_e_jgb tmp_jg;
			while (rs.next()) {
				tmp_jg = new Cls_e_jgb();
				tmp_jg.setSerial_no(rs.getInt("serial_no"));
				tmp_jg.setCity_code(rs.getString("city_code"));
				tmp_jg.setCoun_code(rs.getString("coun_code"));
				tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
				tmp_jg.setOper_orgname(rs.getString("oper_orgname"));
				tmp_jg.setOrg_tel(rs.getString("org_tel"));
				tmp_jg.setOrg_addr(rs.getString("org_addr"));
				tmp_jg.setQq_number(rs.getString("qq_number"));
				tmp_jg.setWork_time(rs.getString("work_time"));
				tmp_jg.setPer_fee(rs.getDouble("per_fee"));
				tmp_jg.setDeli_mode(rs.getString("deli_mode"));
				tmp_jg.setHm(rs.getString("hm"));
				tmp_jg.setGsm(rs.getString("gsm"));
				tmp_jg.setGsxh(rs.getInt("gsxh"));
				tmp_jg.setYw_mark(rs.getInt("yw_mark"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_jgb.get_cljg() " + e.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.get_cljg()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.get_cljg()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.get_cljg()"
							+ e.toString());
				}
				conn = null;
			}
		}
		return rtnAL;
	}

	public int getint(String citycode, String councode, int gsxh)
			throws Cls_exception {
		int a = 0;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;

		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn
					.prepareStatement("select count(*) from kcs_specbxcljg where city_code='"
							+ citycode
							+ "' and gsxh="
							+ gsxh
							+ " and (coun_code like '%"
							+ councode
							+ "%' or coun_code like '%00%') and yw_mark<>2");

			rs = pstmt.executeQuery();

			while (rs.next()) {
				a = rs.getInt(1);
			}
		} catch (Exception e) {
			// throw new Cls_exception("Cls_gg.maxid(string)   "+e.toString());
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
				// throw new
				// Cls_exception("Cls_gg.maxid(string) finally"+e.toString());
			}
		}

		return a;
	}

	public List<Cls_e_jgb> select_bytj(String tj) throws Cls_exception {
		ArrayList<Cls_e_jgb> rtnAL = new ArrayList<Cls_e_jgb>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;

		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(tj);
			rs = pstmt.executeQuery();

			Cls_e_jgb tmp_jg;
			while (rs.next()) {
				tmp_jg = new Cls_e_jgb();
				tmp_jg.setSerial_no(rs.getInt("serial_no"));
				tmp_jg.setCity_code(rs.getString("city_code"));
				tmp_jg.setCoun_code(rs.getString("coun_code"));
				tmp_jg.setOper_orgcode(rs.getString("oper_orgcode"));
				tmp_jg.setOper_orgname(rs.getString("oper_orgname"));
				tmp_jg.setOrg_tel(rs.getString("org_tel"));
				tmp_jg.setOrg_addr(rs.getString("org_addr"));
				tmp_jg.setQq_number(rs.getString("qq_number"));
				tmp_jg.setWork_time(rs.getString("work_time"));
				tmp_jg.setPer_fee(rs.getDouble("per_fee"));
				tmp_jg.setDeli_mode(rs.getString("deli_mode"));
				tmp_jg.setHm(rs.getString("hm"));
				tmp_jg.setGsm(rs.getString("gsm"));
				tmp_jg.setGsxh(rs.getInt("gsxh"));
				tmp_jg.setYw_mark(rs.getInt("yw_mark"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (Exception e) {
			throw new Cls_exception("Cls_l_jgb.select_bytj() " + e.toString());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.select_bytj()"
							+ e.toString());
				}
				rs = null;
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.select_bytj()"
							+ e.toString());
				}
				pstmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					throw new Cls_exception("Cls_l_jgb.select_bytj()"
							+ e.toString());
				}
				conn = null;
			}

		}
		return rtnAL;
	}
	public boolean delJg(String xh) throws Cls_exception {
		boolean tag=false;
		java.sql.Connection con=null;
		java.sql.PreparedStatement stmt=null;
		java.sql.ResultSet rs=null;
		int a=0;
		try {
			Cls_connect cn = new Cls_connect();
	    	con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("delete from kcs_specbxcljg where serial_no="+xh);
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
}
