/**
 * 
 */
package pkg_auto.autobj.ccic.serverProcess;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.time.DurationFormatUtils;

import net.sf.json.JSONObject;
import pkg_auto.autobj.pojo.CarMIIRJson;
import pkg_auto.autobj.pojo.CarMRJson;

/**
 * @author Administrator
 *
 */
public class TestJson {

public static void main(String[] args) throws ParseException{
	/*CarMRJson[] cars = new CarMRJson[2];
	System.out.println(cars.length);
	CarMRJson car = new CarMRJson();
	 car.setDerailleurType("自动");
	 car.setMarketYear("2015");
	 car.setModelCode("24234");
	 car.setModelName("乃木零");
	cars[0] = car;
	 
	CarMRJson car1 = new CarMRJson();
	car1.setDerailleurType("手动");
	car1.setMarketYear("2014");
	car1.setModelCode("2343");
	car1.setModelName("乃木");
	cars[1] = car1;
	   
	 CarMIIRJson carJ = new CarMIIRJson();
	     carJ.setCarMRJ(cars);
	     carJ.setCarOwner("车主");
	     carJ.setEngineNo("发动机");
	     carJ.setEnrollDate("日期");
	     carJ.setFrameNo("车架");
	     carJ.setInfo("");
	     carJ.setNum(2);
	

	JSONObject jb = JSONObject.fromObject(carJ);
	
	System.out.println(jb.toString());  
	String[] bt = {"a","b","c"};
	StringBuffer sb = new StringBuffer();
	if (bt!=null&&bt.length!=0) {
	
	for(String s: bt){
	sb.append(s+",");
	}
	}
	System.out.println(sb.toString());
	String strStartDate="2014-07-25", strEnrollDate="2008-07-27";
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date stardate = sdf.parse(strStartDate);
	Date enddate = sdf.parse(strEnrollDate);
	int smonth =Integer.parseInt(DurationFormatUtils.formatPeriod(enddate.getTime(),
			stardate.getTime(), "M"));
	int syear=0;
	Calendar calendar = Calendar.getInstance(); 
    calendar.setTime(stardate);
    calendar.add(Calendar.DAY_OF_MONTH, +1);
    stardate = calendar.getTime(); 
    smonth =Integer.parseInt(DurationFormatUtils.formatPeriod(enddate.getTime(),
			stardate.getTime(), "M"));
    syear = smonth/12;
    System.out.println(syear+"="+smonth+"/12");
	String taxstartDate = "";//计税日期
	String lastTaxDate = "";//上次缴税日期
	String enrollDate="",strStartDate="";
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Calendar calendar = Calendar.getInstance(); 
	//新车
	enrollDate="2016-01-05";
	Date date = sdf.parse(enrollDate);
	calendar.setTime(date);
	calendar.set(Calendar.DAY_OF_MONTH, 1);
	taxstartDate = sdf.format(calendar.getTime());
	lastTaxDate = sdf.format(calendar.getTime());
	System.out.println("登记日期："+enrollDate);
	System.out.println("计税起始日期:"+taxstartDate);
	System.out.println("上次缴税日期："+lastTaxDate);
    //非新车
	enrollDate="2014-08-05";
	strStartDate="2016-01-30";
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
	System.out.println("登记日期："+enrollDate);
	System.out.println("计税起始日期:"+taxstartDate);
	System.out.println("上次缴税日期："+lastTaxDate);*/
	//String str = "测试字符串oiwyAe-1237";
	//str = str.replaceAll("[\u4e00-\u9fa5]", "");
	//System.out.println(str.toUpperCase());
	String s1 = "62601001";
	System.out.println(s1.substring(2,4));
	}
     
}

