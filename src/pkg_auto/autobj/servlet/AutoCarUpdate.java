package pkg_auto.autobj.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_exception;
import pkg_auto.autobj.pojo.TmpCarDTO;

/**
 * Servlet implementation class AutoCarUpdate
 */
//@WebServlet("/AutoCarUpdate")
public class AutoCarUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  Logger log = Logger.getLogger(AutoCarUpdate.class);     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutoCarUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String retu = "{\"flag\":\"false\",\"info\":\"车辆信息存储失败\"}";		
		String jycode  = (String)request.getParameter("jycode");
		String sserial_no  = (String)request.getParameter("serial_no");
		int serial_no = Integer.parseInt(sserial_no);
        String chex=(String)request.getParameter("chex");
        log.error("选择的车型："+chex);
		String specialCarFlag=(String)request.getParameter("specialCarFlag");	
		String carKindCode=(String)request.getParameter("carKindCode");	
		String useNatureCode=(String)request.getParameter("useNatureCode");
		String tonnage=(String)request.getParameter("tonnage");
		String startDate=(String)request.getParameter("startDate");
		String endDate=(String)request.getParameter("endDate");
		String fuelType=(String)request.getParameter("fuelType");
		String fleetFlag=(String)request.getParameter("fleetFlag");
		
		TmpCarDTO car = new TmpCarDTO();
		car.setModelCode(null==chex?"":chex);
		car.setSpecialCarFlag(null==specialCarFlag?"0":specialCarFlag);
		car.setCarKindCode(null==carKindCode?"":carKindCode);
		car.setUseNatureCode(null==useNatureCode?"":useNatureCode);
        car.setTonnage((null==tonnage||"".equals(tonnage))?"0":tonnage);
        log.error("tonnage:"+tonnage+"/"+car.getTonnage());
        car.setStartDate(null==startDate?"":startDate);
        car.setEndDate(null==endDate?"":endDate);
        car.setFleetFlag(null==fleetFlag?"0":fleetFlag);
        car.setFuelType(null==fuelType?"0":fuelType);
        try {
			boolean tag =updateCar(car,jycode,serial_no);
			if(tag) {
	    		retu = "{\"flag\":\"true\",\"info\":\"车辆信息存储成功\"}";	
	    	}
		} catch (Cls_exception e) {
			retu = "{\"flag\":\"false\",\"info\":\"存储过程发生异常\"}";	
			log.error("关系人存储异常："+e.toString());
			e.printStackTrace();
		}
		response.setContentType("text/x-json;charset=UTF-8");//返回json格式
		response.getWriter().write(retu); 
		response.getWriter().flush();
		response.getWriter().close(); 		
		
	}
   private boolean updateCar(TmpCarDTO car,String jycode,int serial_no) throws Cls_exception{
      	 boolean ret = false;
   		 if ( jycode == null) {
   			    log.error("AutoCarUpdate.updateCar() jycode is null");
   		        throw new NullPointerException("AutoCarUpdate.updateCar() jycode is null");
   		      }	
   		 StringBuffer sqlInsert = new StringBuffer();
   		 sqlInsert.append("update KCS_CCIC_CARDTO set modelCode=?,specialCarFlag=?,carKindCode=?,useNatureCode=?,");
   		 sqlInsert.append("tonnage=?,startDate=to_date(?,'yyyy-mm-dd'),endDate=to_date(?,'yyyy-mm-dd'),fuelType=?,");
   		 sqlInsert.append("fleetFlag=?  where serial_no=? and MESSAGEID=?");
   		 log.error(sqlInsert.toString());
   		 log.error("/"+car.getModelCode()+"/"+car.getSpecialCarFlag()+"/"+car.getCarKindCode()+"/"+car.getUseNatureCode());
   		 log.error("/"+car.getTonnage()+"/"+car.getStartDate()+"/"+car.getEndDate()+"/"+car.getFuelType());
   		 log.error("/"+car.getFleetFlag()+"/"+serial_no+"/"+jycode);
   		 
   		    java.sql.Connection con=null;
   			java.sql.PreparedStatement stmt=null;
   			java.sql.ResultSet rs=null;
   			int a=0;
   			try {
   				Cls_connect cn = new Cls_connect();
   		    	con = cn.connect().getConnection();
   				con.setAutoCommit(false);
   				stmt=con.prepareStatement(sqlInsert.toString());
   		        stmt.setString(1, car.getModelCode());
   		        stmt.setString(2, car.getSpecialCarFlag());
   		        stmt.setString(3, car.getCarKindCode());
   		        stmt.setString(4, car.getUseNatureCode());
   		        stmt.setDouble(5, Double.parseDouble(car.getTonnage()));
   		        stmt.setString(6, car.getStartDate());
   		        stmt.setString(7, car.getEndDate());   
   		        stmt.setString(8, car.getFuelType());
   		        stmt.setString(9, car.getFleetFlag());
                stmt.setInt(10, serial_no);
                stmt.setString(11, jycode);
   			  	a=stmt.executeUpdate();
   				con.commit();
   				con.setAutoCommit(true);// 恢复默认	
   				if (a>0)
   				 { ret = true;
   				 }
   			} catch (SQLException se) {
   				log.error("AutoCarUpdate.updateCar()"+se.toString());
   				se.printStackTrace();
   				try {
   						if (con != null) {
   						con.rollback();//出现sql异常，事务回滚
   						con.setAutoCommit(true);//设置提交方式为默认方式			
   						}
   				} catch (SQLException se1) {
   					se1.printStackTrace();
   				}
   			   return false;
   			} finally {
   				if (rs!=null){
   					try{
   						rs.close();}
   					catch(Exception e){
   								 throw new Cls_exception("AutoCarUpdate.updateCar()"+e.toString());
   							}
   					     rs=null;  
   								}
   								if (stmt!=null) {
   					try{
   									stmt.close();}
   					catch(Exception e){
   								 throw new Cls_exception("AutoCarUpdate.updateCar()"+e.toString());
   							}
   					     stmt=null;
   								}
   								if (con!=null){
   					try{
   									con.close();
   					}catch(Exception e){
   								 throw new Cls_exception("AutoCarUpdate.updateCar()"+e.toString());
   							}
   					   con =null;
   								}
   			}   
        return ret;	      	
      }
}
