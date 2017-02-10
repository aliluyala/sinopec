/**
 * 匹配大地渠道机构
 */
package pkg_auto.autobj.ccic.serverProcess;

import java.sql.SQLException;
import java.sql.SQLRecoverableException;

import org.apache.log4j.Logger;

import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_exception;

/**
 * @author Administrator
 *
 */
public class Ccic_channelCom {
   private String channelComCode="";
   private  Logger log = Logger.getLogger(Ccic_channelCom.class); 
   public String getCcicComCode(String bmzjgh) {
	   log.error("取大地机构");
	   try {
		getChannelComCode(bmzjgh);
		 if (this.channelComCode.equals(""))
	    getChannelComCodeNoCoun(bmzjgh);
		 if (this.channelComCode.equals(""))
			 this.channelComCode = "";
	} catch (Cls_exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  log.error("ccic_jgh="+this.channelComCode);
	  return this.channelComCode;
   }
private void getChannelComCode(String bmzjgh) throws Cls_exception {
	 if (bmzjgh == null) {
		    log.error("Ccic_channelCom.getChannelComCode() bmzjgh  is null");
	        throw new NullPointerException("Ccic_channelCom.getChannelComCode() bmzjgh is null");
	      }	
	java.sql.Connection conn = null;
	java.sql.PreparedStatement pstmt = null;
	java.sql.ResultSet rs = null;
	StringBuffer sql = new StringBuffer();
	sql.append("select ccic_channelComCode from kcs_ccic_channelCom where city_code||coun_code = ?");
    String citycoun = bmzjgh.substring(0, 4);
    log.error(sql.toString()+"="+citycoun);
    try {
		Cls_connect cn = new Cls_connect();
		conn = cn.connect().getConnection();
		pstmt = conn.prepareStatement(sql.toString());
	    pstmt.setString(1, citycoun);
		rs = pstmt.executeQuery();
		while (rs.next()) {
           this.channelComCode = rs.getString(1);
		}
	} catch(SQLRecoverableException e){
		log.error("getChannelComCode:"+e.toString());
		e.printStackTrace();
	} catch (SQLException e) {
		log.error("getChannelComCode:"+e.toString());
		e.printStackTrace();
	} catch (Exception e) {
		log.error("getChannelComCode:"+e.toString());
		throw new Cls_exception("Ccic_channelCom.getChannelComCode() "
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
			throw new Cls_exception("Ccic_channelCom.getChannelComCode()"
					+ e.toString());
		}

	}
	log.error("channelComCode:"+channelComCode);

}
private void getChannelComCodeNoCoun(String bmzjgh) throws Cls_exception {
	 if (bmzjgh == null) {
		    log.error("Ccic_channelCom.getChannelComCodeNoCoun() bmzjgh  is null");
	        throw new NullPointerException("Ccic_channelCom.getChannelComCode() bmzjgh is null");
	      }	
	java.sql.Connection conn = null;
	java.sql.PreparedStatement pstmt = null;
	java.sql.ResultSet rs = null;
	StringBuffer sql = new StringBuffer();
	sql.append("select ccic_channelComCode from kcs_ccic_channelCom where city_code||coun_code = ?");
   String citycoun = bmzjgh.substring(0, 2)+"00";
   log.error(sql.toString()+"="+citycoun);
   try {
		Cls_connect cn = new Cls_connect();
		conn = cn.connect().getConnection();
		pstmt = conn.prepareStatement(sql.toString());
	    pstmt.setString(1, citycoun);
		rs = pstmt.executeQuery();
		while (rs.next()) {
          this.channelComCode = rs.getString(1);
		}
	} catch(SQLRecoverableException e){
		log.error("getChannelComCode:"+e.toString());
		e.printStackTrace();
	} catch (SQLException e) {
		log.error("getChannelComCode:"+e.toString());
		e.printStackTrace();
	} catch (Exception e) {
		log.error("getChannelComCode:"+e.toString());
		throw new Cls_exception("Ccic_channelCom.getChannelComCode() "
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
			throw new Cls_exception("Ccic_channelCom.getChannelComCode()"
					+ e.toString());
		}

	}
	log.error("channelComCode:"+channelComCode);

}
}
