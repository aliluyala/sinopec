/**
 * 
 */
package pkg_auto.autobj.ccic.serverProcess;

import java.sql.SQLException;
import java.sql.SQLRecoverableException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_exception;

import com.ccic.gwservice.car.fgcpiprecisequote.AnnualTaxDTO;
import com.ccic.gwservice.car.fgcpiprecisequote.CarTaxDTO;
import com.ccic.gwservice.car.fgcpiprecisequote.KindDTO;

/**
 * @author Administrator
 *
 */
public class Ccic_OrderConversion {
	private Logger log = Logger.getLogger(Ccic_OrderConversion.class);
	/*
	 * 车船税转写为sql语句
	 */
	private String  cartaxToSqlStr(String jycode) throws Cls_exception {
		CarTaxDTO cartax = getCartaxDTO(jycode);
		StringBuffer sql = new StringBuffer();
		if ("0".equals(cartax.getTaxFlag()))
			sql.append("x_chchsh=1,f_chchsh="+cartax.getSumPayment()+",");
		return sql.toString();
	}
	private CarTaxDTO getCartaxDTO(String jycode) throws Cls_exception{
		CarTaxDTO cartax = new CarTaxDTO();
		AnnualTaxDTO  tax = new AnnualTaxDTO();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select * from kcs_ccic_cartaxdto where MESSAGEID='");
		sql.append(jycode);
		sql.append("'");
		log.error(sql.toString());
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());		
			rs = pstmt.executeQuery();
			while (rs.next()) {
				log.error("taxflag="+rs.getString("taxflag")+"/"+rs.getString("taxStartDate"));
                cartax.setTaxFlag(rs.getString("taxflag"));
                tax.setTaxStartDate(rs.getString("taxStartDate"));
			}
		} catch(SQLRecoverableException e){
			log.error(e.toString());
			e.printStackTrace();
		} catch (SQLException e) {
			log.error(e.toString());
			e.printStackTrace();			
		} catch (Exception e) {
			throw new Cls_exception("Ccic_CarFGPreciseQuoteIn.getCartaxDTO() "
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
				throw new Cls_exception("Ccic_CarFGPreciseQuoteIn.getCartaxDTO()"
						+ e.toString());
			}

		}
		cartax.setCurrentTaxDue(tax);
		return cartax;   			
	}
/*
 * 车险分项转写为sql语句
 */
	private String kindToSqlStr(String jycode) throws Cls_exception {
		KindDTO[] kinds = getKindDTO(jycode);
		StringBuffer sql = new StringBuffer();
		String kindCode="";
		int be=0,bjm_mark=0;
		String[] bjm = new String[6];
		for (KindDTO kind : kinds) {
			kindCode = kind.getKindCode();
			if (kindCode.equals("A")) {//车辆损失保险   1
				sql.append("x_sunshi=1,f_sunshi="+kind.getPremium()+",e_sunshi="+kind.getAmount()+",");
				if ("1".equals(kind.getKindFlag()))
					bjm[0]="1";				
			}
			if (kindCode.equals("G1")) {//全车盗抢险  3
				sql.append("x_daoq=1,f_daoq="+kind.getPremium()+",e_daoq="+kind.getAmount()+",");
				if ("1".equals(kind.getKindFlag()))
					bjm[2]="1";				
			}
			if (kindCode.equals("Z")) {//自燃损失险
				sql.append("x_ziran=1,f_ziran="+kind.getPremium()+",e_ziran="+kind.getAmount()+",");
			}
			if (kindCode.equals("B")) {//第三者责任保险  2
				be = (int) (kind.getAmount()/10000);
				sql.append("x_3zhe="+be+",f_3zhe="+kind.getPremium()+",");
				if ("1".equals(kind.getKindFlag()))
					bjm[1]="1";	
			}
			if (kindCode.equals("D3")) {//驾驶员车上人员责任险 4
				be = (int) (kind.getAmount()/10000);
				sql.append("x_siji="+be+",f_siji="+kind.getPremium()+",");
				if ("1".equals(kind.getKindFlag()))
					bjm[3]="1";	
			}
			if (kindCode.equals("D4")) {//乘客车上人员责任险  5
				be = (int) (kind.getAmount()/10000);
				sql.append("x_chke="+be+",f_chke="+kind.getPremium()+",");
				if ("1".equals(kind.getKindFlag()))
					bjm[4]="1";
			}
			if (kindCode.equals("L")) {//车身划痕损失险 6
				sql.append("x_hhen="+kind.getAmount()+",f_hhen="+kind.getPremium()+",");
				if ("1".equals(kind.getKindFlag()))
					bjm[5]="1";
			}
			if (kindCode.equals("F")) {//玻璃单独破碎险
				if ("1".equals(kind.getModeCode())) sql.append("x_boli=1,");
				if ("2".equals(kind.getModeCode())) sql.append("x_boli=2,");
				sql.append("f_boli="+kind.getPremium()+",");
			}
			if (kindCode.equals("A6")) {//车辆损失保险无法找到第三方特约险
				sql.append("x_3=1,f_3="+kind.getPremium()+",");
			}
			if (kindCode.equals("BZ")) {//交通事故责任强制保险
				sql.append("x_jq=1,f_jq="+kind.getPremium()+",");
			}
			if (kindCode.equals("M")) {//不计免赔特约条款
				bjm_mark=1;
				sql.append("f_bjm="+kind.getPremium()+",");
			}		
		}// end for
		if (bjm_mark==1) {
			StringBuffer sbjm=new StringBuffer();
			for (String s : bjm) {
				 sbjm.append(s);
			}
			sql.append("x_bjm='"+sbjm.toString()+"',");
		}
		return sql.toString();
	}
	
	private KindDTO[] getKindDTO(String jycode) throws Cls_exception{
		ArrayList<KindDTO> rtnAL = new ArrayList<KindDTO>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		KindDTO[] kinds = null;
		int size = 0;
		StringBuffer sql = new StringBuffer();
		sql.append("select * from kcs_ccic_kinddto where MESSAGEID='");
		sql.append(jycode);
		sql.append("'");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());
		
			rs = pstmt.executeQuery();
			KindDTO kind;
			while (rs.next()) {
				kind = new KindDTO();
                kind.setKindCode(rs.getString("kindCode"));
                kind.setAmount(rs.getDouble("amount"));
                kind.setModeCode(rs.getString("modeCode"));
                kind.setKindFlag(rs.getString("kindFlag"));
                kind.setPremium(rs.getDouble("premium"));
				rtnAL.add(kind);
				kind = null;
			}
			if (null!=rtnAL)
			  size = rtnAL.size();
			if (size>0)
				kinds = (KindDTO[]) rtnAL.toArray(new KindDTO[size]);
		} catch(SQLRecoverableException e){
			log.error(e.toString());
			e.printStackTrace();
		} catch (SQLException e) {
			log.error(e.toString());
			e.printStackTrace();			
		} catch (Exception e) {
			throw new Cls_exception("Ccic_OrderConversion.getKindDTO() "
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
				throw new Cls_exception("Ccic_OrderConversion.getKindDTO()"
						+ e.toString());
			}

		}
		return kinds;   				
	}
}
