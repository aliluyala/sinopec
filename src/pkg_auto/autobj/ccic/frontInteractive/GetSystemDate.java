/**
 * 
 */
package pkg_auto.autobj.ccic.frontInteractive;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.time.DurationFormatUtils;



/**
 * @author Administrator
 *
 */
public class GetSystemDate {
	public String getSysDate() {
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    Calendar calendar = Calendar.getInstance(); 
	    Date date = new Date(System.currentTimeMillis()); 
	    calendar.setTime(date);
	    calendar.add(Calendar.DAY_OF_MONTH, +1);
	    date = calendar.getTime();  
	    String mytime = sdf.format(date);
	     return mytime;
	  }
	public String getSysDateAddYear(){
		 Calendar calendar = Calendar.getInstance(); 
		 Date date = new Date(System.currentTimeMillis()); 
		 calendar.setTime(date);
		 calendar.add(Calendar.DAY_OF_MONTH, +1);
		 calendar.add(Calendar.YEAR, +1); 
		 calendar.add(Calendar.DAY_OF_MONTH, -1);
		 date = calendar.getTime();   
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 String mytime = sdf.format(date);		 
		return mytime;	
	}
	 public static void main(String[] args) throws Exception    {
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		 /*Calendar calendar = Calendar.getInstance(); 
		 
		 DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		 Date date = dateFormat1.parse("2015-05-15");
		 //calendar.setTime(date);
		 calendar.set(Calendar.MONTH, 0);
		 calendar.set(Calendar.DAY_OF_MONTH, 1);
		 System.out.println(sdf.format(calendar.getTime()));
		 //Date date = new Date();
		 System.out.println("当前日期："+sdf.format(date));
		 calendar.setTime(date);
		 calendar.add(Calendar.DAY_OF_MONTH, +1);
		 date = calendar.getTime();  
		 System.out.println("明天日期："+sdf.format(date));  
		 calendar.add(Calendar.YEAR, +1); 
		 calendar.add(Calendar.DAY_OF_MONTH, -1);  
		 date = calendar.getTime();  
		 System.out.println("加一年："+sdf.format(date));  */
		 
         int m =0;
         Date stardate = sdf.parse("2008-07-27");
		 Date enddate = sdf.parse("2014-07-26");
         Calendar calendar = Calendar.getInstance(); 
         calendar.setTime(enddate);
         calendar.add(Calendar.DAY_OF_MONTH, +1);
         enddate = calendar.getTime();  		 
         System.out.println("end："+sdf.format(enddate));
		 
		 
		 m = Integer.parseInt(DurationFormatUtils.formatPeriod(stardate.getTime(),
					enddate.getTime(), "M"));
		 int y = m/12;
		 System.out.println(m+"/12="+y);
	 }
}
