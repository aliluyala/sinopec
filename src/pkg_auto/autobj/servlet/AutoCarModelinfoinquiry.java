package pkg_auto.autobj.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLRecoverableException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_exception;
import pkg_auto.autobj.ccic.serverProcess.Ccic_CarModelInfoInquiryIn;
import pkg_auto.autobj.ccic.serverProcess.Ccic_CarmodelinfoinquiryOut;
import pkg_auto.autobj.pojo.TmpCarDTO;
import pkg_auto.autobj.pojo.Ccic_endpoint;

import com.ccic.gwservice.car.fgcarmodelinfoinquiry.FGCarModelInfoInquiryProxy;
import com.ccic.gwservice.car.fgcarmodelinfoinquiry.FGCarModelInfoInquiryRequest;
import com.ccic.gwservice.car.fgcarmodelinfoinquiry.FGCarModelInfoInquiryResponse;

/**
 * Servlet implementation class AutoCarModelinfoinquiry
 */
//@WebServlet("/AutoCarModelinfoinquiry")
public class AutoCarModelinfoinquiry extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  Logger log = Logger.getLogger(AutoCarModelinfoinquiry.class);   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutoCarModelinfoinquiry() {
        super();
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
		// TODO Auto-generated method stub
		String cphm=(String)request.getParameter("cphm");	
		String chllx=(String)request.getParameter("chllx");	
		String newcarmark=(String)request.getParameter("newcarmark");
		String fdjhm = (String)request.getParameter("fdjhm");
		String cjhm = (String)request.getParameter("cjhm");
		//String vehicleBrand= (String)request.getParameter("vehicleBrand");
		String vehicleModel = (String)request.getParameter("vehicleModel");
		String vehicleType = (String)request.getParameter("vehicleType");
		String ecdemic = (String)request.getParameter("ecdemic");
		String enrollDate = (String)request.getParameter("enrollDate");
		String chgOwnerFlag = (String)request.getParameter("chgOwnerFlag");
	    String transferDate = (String)request.getParameter("transferDate");
	    String loanVehicleFlag =(String)request.getParameter("loanVehicleFlag");
	    String noLicenseFlag = (String)request.getParameter("noLicenseFlag");
	    String orgcode = (String)request.getParameter("org_code_des");
	    String opercode = (String)request.getParameter("opercode");
		
		//System.out.println("retu="+transferDate);	
		String retu = "{\"flag\":\"false\",\"info\":\"保险公司接口异常\"}";
		
		TmpCarDTO car = new TmpCarDTO();
		car.setCphm(null==cphm?"":cphm);
		car.setChllx(null==chllx?"":chllx);
		car.setNewcarmark(null==newcarmark?"0":newcarmark);
		car.setWdche(null==ecdemic?"0":ecdemic);
		car.setFdjhm(null==fdjhm?"":fdjhm);
		car.setCjhm(null==cjhm?"":cjhm);
		//car.setVehicleBrand(null==vehicleBrand?"":vehicleBrand);
		car.setVehicleModel(null==vehicleModel?"":vehicleModel);
		car.setVehicleType(null==vehicleType?"":vehicleType);
		car.setEnrollDate(null==enrollDate?"":enrollDate);
		car.setChgOwnerFlag(null==chgOwnerFlag?"0":chgOwnerFlag);
		car.setTransferDate(null==transferDate?"":transferDate);
		car.setLoanVehicleFlag(null==loanVehicleFlag?"0":loanVehicleFlag);
		car.setNoLicenseFlag(null==noLicenseFlag?"0":noLicenseFlag);
		car.setOrgcode(orgcode);
		car.setOpercode(opercode);
		
		try {
			int serial_no =  saveCarDto(car);
			log.error("保存车型查询请求数据，serial_no="+serial_no);
			if (serial_no>0) {
			Ccic_CarModelInfoInquiryIn ccic_carMIII= new Ccic_CarModelInfoInquiryIn();
		    FGCarModelInfoInquiryRequest fgCarMIIRequest = ccic_carMIII.getCarModelInfoInquiryRequest(orgcode,car);
		    if (null != fgCarMIIRequest) {
		   // AxisProperties.setProperty("axis.socketSecureFactory","pkg_sinopec.autobj.mySsl.MyCustomSSLSocketFactory");
		    FGCarModelInfoInquiryProxy proxy = new FGCarModelInfoInquiryProxy(Ccic_endpoint.getUrlCcicCarmodelinfoinquiry());
			FGCarModelInfoInquiryResponse fgCarMIIResponse= proxy.FGCarModelInfoInquiry(fgCarMIIRequest);
			
			  if (fgCarMIIResponse!=null) {
				  log.error("车险查询：have response");
				  Ccic_CarmodelinfoinquiryOut ccic_carMIIIO = new Ccic_CarmodelinfoinquiryOut();
				  retu = ccic_carMIIIO.fgCarMIIResponseToFront(fgCarMIIResponse,serial_no);
				  
			   } 	else retu = "{\"flag\":\"false\",\"info\":\"查询请求返回空。\"}";		
		      } else 
		    	retu = "{\"flag\":\"false\",\"info\":\"查询请求组装失败。\"}";
			} else retu = "{\"flag\":\"false\",\"info\":\"输入数据存储异常\"}";
		} catch (Cls_exception e) {
			// TODO Auto-generated catch block
			log.error("AutoCarModelinfoinquiry:"+e.toString());
			e.printStackTrace();
		}
        log.error("车型查询返回："+retu);
		response.setContentType("text/x-json;charset=UTF-8");//返回json格式
		response.getWriter().write(retu); 
		response.getWriter().flush();
		response.getWriter().close(); 
	}
	
    private int saveCarDto(TmpCarDTO car) throws Cls_exception{
	  int ret = 0;
	  if (null ==car.getCphm()) {
		    log.error("AutoCarModelinfoinquiry.SaveCarDto() cphm is null");
	        throw new NullPointerException("AutoCarModelinfoinquiry.SaveCarDto() cphm is null"); 
	  } 
	  int serial_no = getNewId();
	  if (serial_no>0) {
		  StringBuffer sqlInsert = new StringBuffer();
			 sqlInsert.append("insert into KCS_CCIC_CARDTO(serial_no,licenseNo,licenseType,frameNo,vinNo,engineNo,enrollDate,");
			 sqlInsert.append("brandCN,brandEN,vehicleType,newVehicle,chgOwnerFlag,ecdemicVehicle,transferDate,rq,");
			 sqlInsert.append("loanVehicleFlag,noLicenseFlag,orgcode,opercode) values(");
			 sqlInsert.append("?,?,?,?,?,?,?,?,?,?,?,?,?,?,sysdate,?,?,?,?)");
			    java.sql.Connection con=null;
				java.sql.PreparedStatement stmt=null;
				java.sql.ResultSet rs=null;
				int a=0;
				try {
					Cls_connect cn = new Cls_connect();
			    	con = cn.connect().getConnection();
					con.setAutoCommit(false);
					stmt=con.prepareStatement(sqlInsert.toString());
			        stmt.setInt(1, serial_no);
			        stmt.setString(2, car.getCphm());
			        stmt.setString(3, car.getChllx());
			        stmt.setString(4, car.getCjhm());
			        stmt.setString(5, car.getCjhm());
			        stmt.setString(6, car.getFdjhm());
			        stmt.setString(7, car.getEnrollDate());
			        stmt.setString(8, car.getVehicleBrand());
			        stmt.setString(9, car.getVehicleModel());
			        stmt.setString(10, car.getVehicleType());
			        stmt.setString(11, car.getNewcarmark());
			        stmt.setString(12, car.getChgOwnerFlag());
			        stmt.setString(13, car.getWdche());
			        stmt.setString(14, car.getTransferDate());
			        stmt.setString(15, car.getLoanVehicleFlag());
			        stmt.setString(16, car.getNoLicenseFlag());
			        stmt.setString(17, car.getOrgcode());
			        stmt.setString(18, car.getOpercode());
				  	a=stmt.executeUpdate();
					con.commit();
					con.setAutoCommit(true);// 恢复默认	
					if (a>0)
					 { 
						ret = serial_no;
					 }
				} catch (SQLException se) {
					log.error("AutoCarModelinfoinquiry.saveCarDto():"+se.toString());
					se.printStackTrace();
					try {
							if (con != null) {
							con.rollback();//出现sql异常，事务回滚
							con.setAutoCommit(true);//设置提交方式为默认方式			
							}
					} catch (SQLException se1) {
						se1.printStackTrace();
					}
				
				} finally {
					if (rs!=null){
						try{
							rs.close();}
						catch(Exception e){
									 throw new Cls_exception("Ccic_CarmodelinfoinquiryOut .SaveCarDto()"+e.toString());
								}
						     rs=null;  
									}
									if (stmt!=null) {
						try{
										stmt.close();}
						catch(Exception e){
									 throw new Cls_exception("Ccic_CarmodelinfoinquiryOut .SaveCarDto()"+e.toString());
								}
						     stmt=null;
									}
									if (con!=null){
						try{
										con.close();
						}catch(Exception e){
									 throw new Cls_exception("Ccic_CarmodelinfoinquiryOut .SaveCarDto()"+e.toString());
								}
						   con =null;
									}		  
				}  
	  }
	return ret;
	  
  }
  private int getNewId() throws Cls_exception{
	    int id=0;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select AUTOQUOTE_ID.nextval from dual");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());
		
			rs = pstmt.executeQuery();
			while (rs.next()) {
                  id=rs.getInt(1);
			}
		} catch(SQLRecoverableException e){
			log.error("AutoCarModelinfoinquiry.getNewId()"+e.toString());
			e.printStackTrace();
		} catch (SQLException e) {
			log.error("AutoCarModelinfoinquiry.getNewId()"+e.toString());
			throw new Cls_exception("AutoCarModelinfoinquiry.getNewId() "
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
				throw new Cls_exception("AutoCarModelinfoinquiry.getNewId()"
						+ e.toString());
			}

		}

		return id; 
  }
}
