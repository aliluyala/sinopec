/**
 * 
 */
package pkg_auto.autobj.ccic.serverProcess;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.time.DurationFormatUtils;
import org.apache.log4j.Logger;

import com.ccic.gwservice.car.fgcpiprecisequote.KindDTO;

import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_exception;
import pkg_sinopec.IniReader;
import pkg_auto.autobj.pojo.PremiumCar;

/**
 * @author Administrator
 * 
 */
public class Ccic_Kind {
	private Logger log = Logger.getLogger(Ccic_Kind.class);

	/*
	 * 保存车损险的信息
	 */
	public int setX_sunshi(int kindmark, String jycode, String serial_no,
			String bjm) {
		int ret = 0;
		KindDTO kind = new KindDTO();
		try {
			String actualAmount = calCarActualValue(jycode, serial_no);
			double dactualAmount = Double.parseDouble(actualAmount);
			if (dactualAmount > 0) {
				kind.setKindCode("A");
				kind.setKindName("车辆损失保险");
				kind.setSerialNo(1);
				kind.setAmount(dactualAmount);
				if (bjm.contains("A"))
					kind.setKindFlag("1");
				else
					kind.setKindFlag("0");
				ret = saveKind(kind, jycode);
				log.error("save x_sunshi=" + ret);
			} else
				ret = 2;

		} catch (Exception e) {
			log.error("x_sunshi save"+e.toString());
			e.printStackTrace();
		}
		return ret;
	}
	/*
	 * 保存盗抢险的信息
	 */
	public int setX_daoq(int kindmark, String jycode, String serial_no,
			String bjm) {
		int ret = 0;
		KindDTO kind = new KindDTO();
		try {
			String actualAmount = calCarActualValue(jycode, serial_no);
			double dactualAmount = Double.parseDouble(actualAmount);
			if (dactualAmount > 0) {
				kind.setKindCode("G1");
				kind.setKindName("全车盗抢险");
				kind.setSerialNo(1);
				kind.setAmount(dactualAmount);
				if (bjm.contains("G1"))
					kind.setKindFlag("1");
				else
					kind.setKindFlag("0");
				ret = saveKind(kind, jycode);
				log.error("save x_daoq=" + ret);
			} else
				ret = 2;

		} catch (Exception e) {
			log.error("x_daoq save"+e.toString());
			e.printStackTrace();
		}
		return ret;
	}
	/*
	 * 保存自燃损失险的信息
	 */
	public int setX_ziran(int kindmark, String jycode, String serial_no,
			String bjm) {
		int ret = 0;
		KindDTO kind = new KindDTO();
		try {
			String actualAmount = calCarActualValue(jycode, serial_no);
			double dactualAmount = Double.parseDouble(actualAmount);
			if (dactualAmount > 0) {
				kind.setKindCode("Z");
				kind.setKindName("自燃损失险");
				kind.setSerialNo(1);
				kind.setAmount(dactualAmount);
				if (bjm.contains("Z"))
					kind.setKindFlag("1");
				else
					kind.setKindFlag("0");
				ret = saveKind(kind, jycode);
				log.error("save x_ziran=" + ret);
			} else
				ret = 2;

		} catch (Exception e) {
			log.error("x_ziran save"+e.toString());
			e.printStackTrace();
		}
		return ret;
	}
	/*
	 * 保存三者险的信息
	 */
	public int setX_3zhe(int kindmark, String jycode, String serial_no,
			String bjm) {
		int ret = 0;
		Double amount = kindmark * 10000.00;
		KindDTO kind = new KindDTO();
		try {
			kind.setKindCode("B");
			kind.setKindName("第三者责任保险");
			kind.setSerialNo(1);
			kind.setAmount(amount);
			if (bjm.contains("B"))
				kind.setKindFlag("1");
			else
				kind.setKindFlag("0");
			ret = saveKind(kind, jycode);
			log.error("save x_3zhe=" + ret);
		} catch (Cls_exception e) {
            log.error("x_3zhe save "+e.toString());
			e.printStackTrace();
		}
		return ret;
	}
	/*
	 * 保存司机责任险的信息
	 */
	public int setX_siji(int kindmark, String jycode, String serial_no,
			String bjm) {
		int ret = 0;
		Double amount = kindmark * 10000.00;
		KindDTO kind = new KindDTO();
		try {
			kind.setKindCode("D3");
			kind.setKindName("驾驶员车上人员责任险");
			kind.setSerialNo(1);
			kind.setAmount(amount);
			kind.setUnitAmount(amount);
			kind.setQuantity(1);
			if (bjm.contains("D3"))
				kind.setKindFlag("1");
			else
				kind.setKindFlag("0");
			ret = saveKind(kind, jycode);
			log.error("save x_siji=" + ret);
		} catch (Cls_exception e) {
            log.error("x_siji save "+e.toString());
			e.printStackTrace();
		}
		return ret;
	}
	/*
	 * 保存乘客责任险的信息
	 */
	public int setX_chke(int kindmark, String jycode, String serial_no,
			String bjm) throws Cls_exception {
		int ret = 0;
		Double amount = kindmark * 10000.00;
		KindDTO kind = new KindDTO();
		int seat = carseat(jycode,serial_no)-1;
		try {
			kind.setKindCode("D4");
			kind.setKindName("乘客车上人员责任险");
			kind.setSerialNo(1);
			kind.setAmount(amount*seat);
			kind.setQuantity(seat);
			kind.setUnitAmount(amount);
			if (bjm.contains("D4"))
				kind.setKindFlag("1");
			else
				kind.setKindFlag("0");
			ret = saveKind(kind, jycode);
			log.error("save x_chke=" + ret);
		} catch (Cls_exception e) {
            log.error("x_chke save "+e.toString());
			e.printStackTrace();
		}
		return ret;
	}
	/*
	 * 保存车身划痕损失险的信息
	 */
	public int setX_hhen(int kindmark, String jycode, String serial_no,
			String bjm) {
		int ret = 0;
		Double amount = kindmark * 1.00;
		KindDTO kind = new KindDTO();
		try {
			kind.setKindCode("L");
			kind.setKindName("车身划痕损失险");
			kind.setSerialNo(1);
			kind.setAmount(amount);
			if (bjm.contains("L"))
				kind.setKindFlag("1");
			else
				kind.setKindFlag("0");
			ret = saveKind(kind, jycode);
			log.error("save x_hhen=" + ret);
		} catch (Cls_exception e) {
            log.error("x_hhen save "+e.toString());
			e.printStackTrace();
		}
		return ret;
	}
	/*
	 * 保存玻璃单独破碎险的信息
	 */
	public int setX_boli(int kindmark, String jycode, String serial_no,
			String bjm) {
		int ret = 0;
		KindDTO kind = new KindDTO();
		try {
			kind.setKindCode("F");
			kind.setKindName("玻璃单独破碎险");
			kind.setSerialNo(1);
			if (bjm.contains("F"))
				kind.setKindFlag("1");
			else
				kind.setKindFlag("0");
			kind.setModeCode(kindmark+"");			
			ret = saveKind(kind, jycode);
			log.error("save x_boli=" + ret);
		} catch (Cls_exception e) {
            log.error("x_boli save "+e.toString());
			e.printStackTrace();
		}
		return ret;
	}
	/*
	 * 保存第三方特约险的信息
	 */
	public int setX_3(int kindmark, String jycode, String serial_no,
			String bjm) {
		int ret = 0;
		KindDTO kind = new KindDTO();
		try {
			kind.setKindCode("A6");
			kind.setKindName("车辆损失保险无法找到第三方特约险");
			kind.setSerialNo(1);
			if (bjm.contains("A6"))
				kind.setKindFlag("1");
			else
				kind.setKindFlag("0");	
			ret = saveKind(kind, jycode);
			log.error("save x_3=" + ret);
		} catch (Cls_exception e) {
            log.error("x_3 save "+e.toString());
			e.printStackTrace();
		}
		return ret;
	}
	/*
	 * 保存不计免赔特约条款的信息
	 */
	public int setX_bjm(int kindmark, String jycode, String serial_no,
			String bjm) {
		int ret = 0;
		KindDTO kind = new KindDTO();
		try {
			kind.setKindCode("M");
			kind.setKindName("不计免赔特约条款");
			kind.setSerialNo(1);
			kind.setKindFlag("0");	
			ret = saveKind(kind, jycode);
			log.error("save x_bjm=" + ret);
		} catch (Cls_exception e) {
            log.error("x_bjm save "+e.toString());
			e.printStackTrace();
		}
		return ret;
	}
	/*
	 * 保存交通事故责任强制保险的信息
	 */
	public int setX_jq(int kindmark, String jycode, String serial_no,
			String bjm) {
		int ret = 0;
		KindDTO kind = new KindDTO();
		try {
			kind.setKindCode("BZ");
			kind.setKindName("交通事故责任强制保险");
			kind.setSerialNo(1);
			kind.setKindFlag("0");	
			kind.setAmount(122000.0);
			ret = saveKind(kind, jycode);
			log.error("save x_jq=" + ret);
		} catch (Cls_exception e) {
            log.error("x_jq save "+e.toString());
			e.printStackTrace();
		}
		return ret;
	}
	/*
	 * 保存车船税的信息
	 */
	public int setTax(int kindmark, String jycode, String serial_no) {
			int ret = 0;
			try {
				Map<String,String> datemap = new HashMap<String,String>();
				datemap = calTaxStartDate(jycode, serial_no);
				String startdate = datemap.get("taxstartDate").toString();
				String lastdate =  datemap.get("lastTaxDate").toString();
				if (!"".equals(startdate)) {
					ret = saveCarTax(startdate,lastdate,jycode);
					log.error("save cartax=" + ret);
				} else
					ret = 2;

			} catch (Exception e) {
				log.error("cartax save"+e.toString());
				e.printStackTrace();
			}
		return ret;
	}
	/*
	 * 计税起始日期
	 */
	private Map<String,String> calTaxStartDate(String jycode,String serial_no) throws Exception {
		Map<String,String> retMap = new HashMap<String,String>();
		String taxstartDate = "";//计税日期
		String lastTaxDate = "";//上次缴税日期
		String enrollDate="",strStartDate="";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance(); 
		PremiumCar premium = new PremiumCar();
		premium.getPremiumCar(jycode, serial_no);
		int newmark = Integer.parseInt(premium.getNewVehicle());
		if (newmark ==1) {//新车，登记日期当月起
			enrollDate = premium.getEnrollDate();
			Date date = sdf.parse(enrollDate);
			calendar.setTime(date);
			calendar.set(Calendar.DAY_OF_MONTH, 1);
			taxstartDate = sdf.format(calendar.getTime());
			lastTaxDate = sdf.format(calendar.getTime());
		} else { //起保当年1月1日起
			strStartDate = premium.getStartdate();// 起保日期
			enrollDate = premium.getEnrollDate();//登记日期
			Date startDate = sdf.parse(strStartDate);
			calendar.setTime(startDate);
			calendar.set(Calendar.MONTH, 0);
			calendar.set(Calendar.DAY_OF_MONTH, 1);
			taxstartDate = sdf.format(calendar.getTime());
			Date enrDate = sdf.parse(enrollDate);
			Calendar  enrcalendar = Calendar.getInstance(); 
			enrcalendar.setTime(enrDate);
			int enryear = enrcalendar.get(Calendar.YEAR);//车辆登记的年
			Calendar  nowcalendar = Calendar.getInstance(); 
			nowcalendar.setTime(new Date());
			nowcalendar.add(Calendar.YEAR, -1);//年份减1--上一年
			int lastyear = nowcalendar.get(Calendar.YEAR);//
			if (enryear==lastyear) {
				//去年的车--购车日期当月1号
				enrcalendar.set(Calendar.DAY_OF_MONTH, 1);
				lastTaxDate = sdf.format(enrcalendar.getTime());
			   } else {
				 //前年或更早的车 -- 去年1月1号  
				   nowcalendar.set(Calendar.MONTH, 0);
				   nowcalendar.set(Calendar.DAY_OF_MONTH, 1);
				   lastTaxDate = sdf.format(nowcalendar.getTime());
			   } 				  
		}
		retMap.put("taxstartDate", taxstartDate);
		retMap.put("lastTaxDate", lastTaxDate);
		log.error("计税起始日期:"+taxstartDate);
		log.error("上次缴税日期："+lastTaxDate);
		return retMap;
	}
	private int carseat(String jycode,String serial_no) throws Cls_exception {
		PremiumCar premium = new PremiumCar();
		premium.getPremiumCar(jycode, serial_no);
		int seat = 0;
		String seat_str = premium.getSeat();
		if (null!=seat_str) 
			seat = Integer.parseInt(seat_str);
		return seat;
	}
	/*
	 * 计算车辆实际价值
	 */
	private String calCarActualValue(String jycode, String serial_no)
			throws Exception {
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		PremiumCar premium = new PremiumCar();
		premium.getPremiumCar(jycode, serial_no);

		double dblSumDepreciationRate = 0;// 总折旧率
		double baseAmount = 0; // 基础保险金额
		double actualAmount = 0; // 车辆实际价值
		double dblDepreciationRate = 0; // 折旧率
		String seat = premium.getSeat();// 座位数
		String vehicleType = premium.getVehicleType();// 交管车辆种类
		String useNature = premium.getUseNature();// 车辆使用性质
		String strStartDate = premium.getStartdate();// 起保日期
		String strEnrollDate = premium.getEnrollDate();// 车辆登记日期
		baseAmount = premium.getReplacementValue();// 新车价格
        log.error("新车价格--"+baseAmount);
		dblDepreciationRate = getPerMonthRate(seat, vehicleType, useNature); // 月折旧率
		dblDepreciationRate = dblDepreciationRate /100 ;
		log.error("月折旧率--"+dblDepreciationRate);
		int iDepreciateMonths = getMonthMinus(strEnrollDate, strStartDate);
		log.error("登记日期"+strEnrollDate+"起保日期"+strStartDate);
		log.error("月--"+iDepreciateMonths);
		dblSumDepreciationRate = iDepreciateMonths * dblDepreciationRate;// 总折旧率
		log.error("总折旧率--"+dblSumDepreciationRate);
		// 总折旧率不能超过80%
		if (dblSumDepreciationRate > 0.8) {
			dblSumDepreciationRate = 0.8;
		}
		log.error("总折旧率--"+dblSumDepreciationRate);
		actualAmount = baseAmount * (1 - dblSumDepreciationRate);
		log.error("车辆实际价值--"+actualAmount);
		return decimalFormat.format(actualAmount);
	}

	/*
	 * 车辆折旧使用的月份
	 */
	private int getMonthMinus(String starDate, String endDate) {
		int int_mon = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date stardate = sdf.parse(starDate);
			Date enddate = sdf.parse(endDate);
			String smon = DurationFormatUtils.formatPeriod(stardate.getTime(),
					enddate.getTime(), "M");
			int_mon = Integer.parseInt(smon);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return int_mon;
	}

	/*
	 * 读配置文件，得到月折旧率
	 */
	private Double getPerMonthRate(String seat, String vehicleType,
			String useNature) {
		Double rate = 0.0;
		String prefix = getClass().getProtectionDomain().getCodeSource()
				.getLocation().getPath();
		if (prefix.indexOf("WEB-INF") > 0)
			prefix = prefix.substring(0, prefix.indexOf("WEB-INF/classes"));
		String configwj = "/BLPrpDdeprecateRate.ini";
		//log.error(prefix + configwj);
		IniReader rd = new IniReader();
		String carKind = "", yt = "";
		int i_seat = Integer.parseInt(seat);
		if (vehicleType.contains("K")) {
			if (i_seat < 10)
				carKind = "9kcar";
			else
				carKind = "10kcar";
		} else if ("H41,H42,H43,H44,H45,H46,".contains(vehicleType))
			carKind = "whcar";
		else if ("H51,H52,H53,H54,H55,".contains(vehicleType))
			carKind = "dhor3car";
		else if (vehicleType.contains("G") || vehicleType.contains("B"))
			carKind = "ghcar";
		else
			carKind = "othercar";

		if ("85".equals(useNature))
			yt = "family";
		else if ("84".equals(useNature))
			yt = "nobusiness";
		else if ("82".endsWith(useNature))
			yt = "lease";
		else
			yt = "business";

		String str = rd.getHashValue(carKind, yt, prefix + configwj);
		if (str != null && !str.equals(""))
			rate = Double.parseDouble(str);
		return rate;
	}

	private int saveKind(KindDTO kind, String jycode) throws Cls_exception {
		if (kind == null) {
			log.error("Ccic_Kind.saveKind() kind is null");
			throw new NullPointerException("Ccic_Kind.saveKind() kind is null");
		}
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("insert into kcs_ccic_kinddto values(AUTOQUOTE_MODEID.nextval,'"
						+ jycode + "',");
		sqlInsert.append("?,?,?,?,?,?,?,?,0.0,0.0)");
		log.error(sqlInsert.toString());
		log.error("/"+kind.getKindCode()+"/"+kind.getKindName()+"/"+kind.getSerialNo()+"/"+(null==kind.getQuantity()?0:kind.getQuantity()));
		log.error("/"+(null==kind.getUnitAmount()?0.0:kind.getUnitAmount())+"/"+(null==kind.getModeCode()?"":kind.getModeCode()));
		log.error("/"+kind.getKindFlag()+"/"+(null==kind.getAmount()?0.0:kind.getAmount())+"/");
		java.sql.Connection con = null;
		java.sql.PreparedStatement stmt = null;
		java.sql.ResultSet rs = null;
		int a = 0;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt = con.prepareStatement(sqlInsert.toString());
			stmt.setString(1, kind.getKindCode());
			stmt.setString(2, kind.getKindName());
			stmt.setInt(3, kind.getSerialNo());
			stmt.setInt(4, null==kind.getQuantity()?0:kind.getQuantity());
			stmt.setDouble(5, null==kind.getUnitAmount()?0.0:kind.getUnitAmount());
			stmt.setString(6, null==kind.getModeCode()?"":kind.getModeCode());
			stmt.setString(7, kind.getKindFlag());
			stmt.setDouble(8, null==kind.getAmount()?0.0:kind.getAmount());
			a = stmt.executeUpdate();
			log.error("a="+a);
			con.commit();
			con.setAutoCommit(true);// 恢复默认
		} catch (SQLException se) {
			log.error("saveKind:"+se.toString());
			se.printStackTrace();
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Ccic_Kind.saveKind()"
							+ e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Ccic_Kind.saveKind()"
							+ e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("Ccic_Kind.saveKind()"
							+ e.toString());
				}
				con = null;
			}
		}
		return a;
	}
	private int saveCarTax(String startDate, String lastdate,String jycode) throws Cls_exception {
		if (startDate == null||"".equals(startDate)) {
			log.error("Ccic_Kind.saveCarTax() startdate is null");
			throw new NullPointerException("Ccic_Kind.saveCarTax() startdate is null");
		}
		StringBuffer sqlInsert = new StringBuffer();
		sqlInsert
				.append("insert into kcs_ccic_cartaxdto values(AUTOQUOTE_MODEID.nextval,?,");
		sqlInsert.append("'0',?,0.0,0.0,0.0,0.0,0.0,?)");
		log.error("insert into kcs_ccic_cartaxdto values(AUTOQUOTE_MODEID.nextval,'"+jycode+"','0','"+startDate+"',0.0,0.0,0.0,0.0,0.0,'"+lastdate+"')");
		java.sql.Connection con = null;
		java.sql.PreparedStatement stmt = null;
		java.sql.ResultSet rs = null;
		int a = 0;
		try {
			Cls_connect cn = new Cls_connect();
			con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt = con.prepareStatement(sqlInsert.toString());
			stmt.setString(1, jycode);
			stmt.setString(2, startDate);
			stmt.setString(3, lastdate);
			a = stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认
		} catch (SQLException se) {
			log.error("saveCarTax:"+se.toString());
			se.printStackTrace();
			try {
				if (con != null) {
					con.rollback();// 出现sql异常，事务回滚
					con.setAutoCommit(true);// 设置提交方式为默认方式
				}
			} catch (SQLException se1) {
				se1.printStackTrace();
			}
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					throw new Cls_exception("Ccic_Kind.saveCarTax()"
							+ e.toString());
				}
				rs = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
					throw new Cls_exception("Ccic_Kind.saveCarTax()"
							+ e.toString());
				}
				stmt = null;
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					throw new Cls_exception("Ccic_Kind.saveCarTax()"
							+ e.toString());
				}
				con = null;
			}
		}
		return a;
	}
	public boolean empty(String jycode) throws Cls_exception{
		log.error("重置kind,tax信息："+jycode);
		 boolean ret = true;
		 java.sql.Connection con=null;
			java.sql.PreparedStatement stmt=null;
			java.sql.ResultSet rs=null;
			int a=0;
			try {
				Cls_connect cn = new Cls_connect();
		    	con = cn.connect().getConnection();
				con.setAutoCommit(false);
				stmt=con.prepareStatement("delete from kcs_ccic_kinddto  where MESSAGEID='"+jycode+"'"); 
			  	a=stmt.executeUpdate();
			  	stmt=con.prepareStatement("delete from kcs_ccic_cartaxdto where MESSAGEID='"+jycode+"'"); 
			  	a=stmt.executeUpdate();
				con.commit();
				con.setAutoCommit(true);// 恢复默认	
				//log.error("kind.empty()="+a);
			} catch (SQLException se) {
				log.error("ccic_kind.empty():"+se.toString());
				se.printStackTrace();
				try {
				   if (con != null) {
						con.rollback();//出现sql异常，事务回滚
						con.setAutoCommit(true);//设置提交方式为默认方式			
						}
				} catch (SQLException se1) {
					se1.printStackTrace();
				}
			   ret=false;
			} finally {
				if (rs!=null){
					try{
						rs.close();}
					catch(Exception e){
								 throw new Cls_exception("Ccic_Kind.empty(()"+e.toString());
							}
					     rs=null;  
								}
				if (stmt!=null) {
					try{
						stmt.close();}
					catch(Exception e){
								 throw new Cls_exception("Ccic_Kind.empty(()"+e.toString());
							}
					     stmt=null;
								}
				if (con!=null){
					try{
						con.close();
					}catch(Exception e){
								 throw new Cls_exception("Ccic_Kind.empty(()"+e.toString());
							}
					   con =null;
								}
			}   
  return ret;	      	
	}
}
