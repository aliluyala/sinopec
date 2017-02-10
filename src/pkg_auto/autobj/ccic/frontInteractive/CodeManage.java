/**
 * 代码查询
 */
package pkg_auto.autobj.ccic.frontInteractive;

import java.sql.SQLException;
import java.sql.SQLRecoverableException;
import java.util.ArrayList;
import java.util.List;

import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_exception;
import pkg_auto.autobj.pojo.BusinessCode;
import pkg_auto.autobj.pojo.CarLicense;

/**
 * @author Administrator
 *  车牌类型列表
 */
public class CodeManage {
    public List<CarLicense> getLicenseType() throws Cls_exception{
    	ArrayList<CarLicense> rtnAL = new ArrayList<CarLicense>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select code,name from kcs_ccic_code where mark=1 and yw_type='licenseType' order by serial_no");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());
		
			rs = pstmt.executeQuery();
			CarLicense tmp_jg;
			while (rs.next()) {
				tmp_jg = new CarLicense();
                tmp_jg.setLicenseTypeCode(rs.getString("code"));
                tmp_jg.setLicenseTypeName(rs.getString("name"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch(SQLRecoverableException e){
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			throw new Cls_exception("CodeManage.getLicenseType() "
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
				throw new Cls_exception("CodeManage.getLicenseType()"
						+ e.toString());
			}

		}

		return rtnAL;   	
    }
    public List<BusinessCode> getUnitType() throws Cls_exception{
    	ArrayList<BusinessCode> rtnAL = new ArrayList<BusinessCode>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select code,name from kcs_ccic_code where mark=1 and yw_type='unitType' order by serial_no");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());
		
			rs = pstmt.executeQuery();
			BusinessCode tmp_jg;
			while (rs.next()) {
				tmp_jg = new BusinessCode();
                tmp_jg.setCode(rs.getString("code"));
                tmp_jg.setCodename(rs.getString("name"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch(SQLRecoverableException e){
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			throw new Cls_exception("CodeManage.getUnitType() "
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
				throw new Cls_exception("CodeManage.getUnitType()"
						+ e.toString());
			}

		}

		return rtnAL;   	
    }
    public List<BusinessCode> getIdentifyType() throws Cls_exception{
    	ArrayList<BusinessCode> rtnAL = new ArrayList<BusinessCode>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select code,name from kcs_ccic_code where mark=1 and yw_type='identifyType' order by serial_no");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());
		
			rs = pstmt.executeQuery();
			BusinessCode tmp_jg;
			while (rs.next()) {
				tmp_jg = new BusinessCode();
                tmp_jg.setCode(rs.getString("code"));
                tmp_jg.setCodename(rs.getString("name"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch(SQLRecoverableException e){
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			throw new Cls_exception("CodeManage.getIdentifyType() "
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
				throw new Cls_exception("CodeManage.getIdentifyType()"
						+ e.toString());
			}

		}

		return rtnAL;   	
    }
    public List<BusinessCode> getVehicleType() throws Cls_exception{
    	ArrayList<BusinessCode> rtnAL = new ArrayList<BusinessCode>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select code,name from kcs_ccic_code where mark=1 and yw_type='vehicleType' order by serial_no");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());
		
			rs = pstmt.executeQuery();
			BusinessCode tmp_jg;
			while (rs.next()) {
				tmp_jg = new BusinessCode();
                tmp_jg.setCode(rs.getString("code"));
                tmp_jg.setCodename(rs.getString("name"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch(SQLRecoverableException e){
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			throw new Cls_exception("CodeManage.getVehicleType() "
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
				throw new Cls_exception("CodeManage.getVehicleType()"
						+ e.toString());
			}

		}

		return rtnAL;   	
    }
    public List<BusinessCode> getcarKindCode() throws Cls_exception{
    	ArrayList<BusinessCode> rtnAL = new ArrayList<BusinessCode>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select code,name from kcs_ccic_code where mark=1 and yw_type='carKindCode' order by serial_no");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());
		
			rs = pstmt.executeQuery();
			BusinessCode tmp_jg;
			while (rs.next()) {
				tmp_jg = new BusinessCode();
                tmp_jg.setCode(rs.getString("code"));
                tmp_jg.setCodename(rs.getString("name"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch(SQLRecoverableException e){
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			throw new Cls_exception("CodeManage.getcarKindCode() "
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
				throw new Cls_exception("CodeManage.getcarKindCode()"
						+ e.toString());
			}

		}

		return rtnAL;   	
    }
    /*
     * 车辆使用性质
     */
    public List<BusinessCode> getuseNatureCode() throws Cls_exception{
    	ArrayList<BusinessCode> rtnAL = new ArrayList<BusinessCode>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select code,name from kcs_ccic_code where mark=1 and yw_type='useNatureCode' order by serial_no");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());
		
			rs = pstmt.executeQuery();
			BusinessCode tmp_jg;
			while (rs.next()) {
				tmp_jg = new BusinessCode();
                tmp_jg.setCode(rs.getString("code"));
                tmp_jg.setCodename(rs.getString("name"));
				rtnAL.add(tmp_jg);
				tmp_jg = null;
			}
		} catch(SQLRecoverableException e){
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			throw new Cls_exception("CodeManage.getcarKindCode() "
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
				throw new Cls_exception("CodeManage.getcarKindCode()"
						+ e.toString());
			}

		}

		return rtnAL;   	
    }
}
