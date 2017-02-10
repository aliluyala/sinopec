/**
 * 得到车的基本信息 计算车辆实际价值
 */
package pkg_auto.autobj.pojo;

import java.sql.SQLException;
import java.sql.SQLRecoverableException;

import org.apache.log4j.Logger;

import pkg_auto.autobj.ccic.serverProcess.Ccic_CarKind;
import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_exception;

/**
 * @author Administrator
 *
 */
public class PremiumCar {
	private Logger log = Logger.getLogger(Ccic_CarKind.class);
    private String vehicleType="";
    private String useNature="";
    private String seat="0";
    private Double replacementValue=0.0;
    private String enrollDate="";
    private String startdate="";
    private String endDate="";
    private String newVehicle="";
    private String importFlag="";
    
	public String getEndDate() {
		return endDate;
	}
	public String getImportFlag() {
		return importFlag;
	}
	public String getNewVehicle() {
		return newVehicle;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public String getStartdate() {
		return startdate;
	}
	public Double getReplacementValue() {
		return replacementValue;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public String getUseNature() {
		return useNature;
	}
	public String getSeat() {
		return seat;
	}
    public void getPremiumCar(String jycode,String serial_no) throws Cls_exception {
    	java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		log.error("得到车的基本信息:");
		sql.append("select a.vehicleType,a.useNatureCode,b.seat,b.replacementValue,a.enrollDate,to_char(a.startdate,'yyyy-mm-dd') as startdate,");
		sql.append("a.newVehicle,b.importFlag,to_char(a.endDate,'yyyy-mm-dd') as endDate  from KCS_CCIC_CARDTO a,KCS_CCIC_CARMODELDTO b where ");
		sql.append(" a.MESSAGEID='"+jycode+"' and a.messageid=b.messageid and a.serial_no="+serial_no+" and a.modelCode=b.modelCode");
		log.error(sql.toString());
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());
		
			rs = pstmt.executeQuery();
			while (rs.next()) {
               this.useNature = rs.getString("useNatureCode");
               this.vehicleType = rs.getString("vehicleType");
               this.seat = rs.getString("seat");
               this.replacementValue = rs.getDouble("replacementValue");
               this.enrollDate = rs.getString("enrollDate");
               this.startdate = rs.getString("startdate");
               this.newVehicle = rs.getString("newVehicle");
               this.importFlag = rs.getString("importFlag");
               this.endDate = rs.getString("endDate");
			}
		} catch(SQLRecoverableException e){
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			throw new Cls_exception("PremiumCar.getPremiumCar() "
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
				throw new Cls_exception("PremiumCar.getPremiumCar()"
						+ e.toString());
			}

		}
    }
    
}
