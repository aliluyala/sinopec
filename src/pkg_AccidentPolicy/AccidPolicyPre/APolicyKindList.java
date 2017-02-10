/**
 * 
 */
package pkg_AccidentPolicy.AccidPolicyPre;

import java.sql.SQLException;
import java.sql.SQLRecoverableException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import pkg_AccidentPolicy.pojo.AccidentPolicyKind;
import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_exception;

/**
 * @author Administrator
 * 
 */
public class APolicyKindList {
	private Logger log = Logger.getLogger(APolicyKindList.class);
	public List<AccidentPolicyKind> belongList(String citycode,int yw_type) throws Cls_exception{
		List<AccidentPolicyKind> lretu = new ArrayList<AccidentPolicyKind>();
    	lretu = getBelongList(citycode,yw_type);
    	APolicyKind apkind = new APolicyKind();
    	for (AccidentPolicyKind kind : lretu) {    		
    		kind.setStocks(apkind.stocks(kind.getSerial_no(), citycode));
    	}
    	return lretu;
	}
	public List<AccidentPolicyKind> getBelongList(String citycode,int yw_type) throws Cls_exception{
		ArrayList<AccidentPolicyKind> rtnAL = new ArrayList<AccidentPolicyKind>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select b.serial_no as id, b.plicy_no as plicy_no,b.yw_type as bxgs,b.name as name,b.kind as kind,");
		sql.append("b.price as price,b.maxlimite as maxlimite,b.suminsured as suminsured from kcs_insurance_accident a,");
		sql.append("kcs_insurance_kind b where (a.salescity like '%" + citycode
				+ "%' or a.salescity like '%00%')  and a.serial_no=b.plicy_no  ");
		sql.append(" and b.mark=1 and a.yw_type ="+yw_type+" order by b.yw_type,b.plicy_no,b.kind");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());

			rs = pstmt.executeQuery();
			AccidentPolicyKind tmp_jg;
			while (rs.next()) {
				tmp_jg = new AccidentPolicyKind();
				tmp_jg.setSerial_no(rs.getInt("id"));
				tmp_jg.setPolicy_no(rs.getInt("plicy_no"));
				tmp_jg.setYw_type(rs.getInt("bxgs"));
				tmp_jg.setName(rs.getString("name"));
				tmp_jg.setKind(rs.getString("kind"));
				tmp_jg.setPrice(rs.getDouble("price"));
				tmp_jg.setMaxlimite(rs.getInt("maxlimite"));
				tmp_jg.setSuminsured(rs.getDouble("suminsured"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (SQLRecoverableException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			throw new Cls_exception("APlicyKindList.getBelongList() "
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
				throw new Cls_exception("APlicyKindList.getBelongList()"
						+ e.toString());
			}

		}

		return rtnAL;
	}

	public List<AccidentPolicyKind> getBelongList_page(String citycode,List<Integer> lbxgs, int p,
			int ev) throws Cls_exception {
		ArrayList<AccidentPolicyKind> rtnAL = new ArrayList<AccidentPolicyKind>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		String tsql = bxgsTosql(lbxgs);
		StringBuffer sql = new StringBuffer();
		sql.append("select * from (select my_table.*,rownum as my_rownum from ( ");
		sql.append("select b.serial_no as id,b.yw_type as bxgs,b.name as name,b.kind as kind,");
		sql.append("b.price as price,b.maxlimite as maxlimite from kcs_insurance_accident a,");
		sql.append("kcs_insurance_kind b where (a.salescity like '%" + citycode
				+ "%' or a.salescity like '%00%') and b.mark=1 ");
		sql.append(" and a.serial_no=b.plicy_no "+tsql+"  order by b.plicy_no");
		sql.append(" ) my_table where rownum<" + ev);
		sql.append(" ) where my_rownum>=" + p);
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());

			rs = pstmt.executeQuery();
			AccidentPolicyKind tmp_jg;
			while (rs.next()) {
				tmp_jg = new AccidentPolicyKind();
				tmp_jg.setSerial_no(rs.getInt("id"));
				tmp_jg.setYw_type(rs.getInt("bxgs"));
				tmp_jg.setName(rs.getString("name"));
				tmp_jg.setKind(rs.getString("kind"));
				tmp_jg.setPrice(rs.getDouble("price"));
				tmp_jg.setMaxlimite(rs.getInt("maxlimite"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch (SQLRecoverableException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			throw new Cls_exception("APlicyKindList.getBelongList_page() "
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
				throw new Cls_exception("APlicyKindList.getBelongList_page()"
						+ e.toString());
			}

		}

		return rtnAL;
	}

	public int getNum(String citycode,List<Integer> lbxgs) throws Cls_exception {
		int a = 0;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
        String tsql = "";
        tsql = bxgsTosql(lbxgs);
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			String sql = "SELECT COUNT(*) from kcs_insurance_accident a, kcs_insurance_kind b where (a.salescity like '%"
					+ citycode
					+ "%' or a.salescity like '%00%') and b.mark=1 and a.serial_no=b.plicy_no "+tsql;
			log.error(sql);
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				a = rs.getInt(1);
			}
		} catch (Exception e) {
			throw new Cls_exception("APlicyKindLis.getNum()   " + e.toString());
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
				throw new Cls_exception("APlicyKindLis.getNum()  finally"
						+ e.toString());
			}
		}
		return a;
	}
	private String bxgsTosql (List<Integer> lbxgs) {
		StringBuffer sql = new StringBuffer();
		int size = 0;
		if (lbxgs != null)
		   size = lbxgs.size();
		if (size > 0) {
			sql.append(" and (a.yw_type = "+lbxgs.get(0));
			for (int i=1;i<size;i++){
				sql.append(" or a.yw_type="+lbxgs.get(i));
			}
			sql.append(")");
		}
		return sql.toString();
		
	}
}
