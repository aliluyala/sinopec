/**
 * 车型查询返回数据的存取
 */
package pkg_auto.autobj.ccic.serverProcess;

import java.sql.SQLException;
import java.text.DecimalFormat;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;

import com.ccic.gwservice.car.fgcarmodelinfoinquiry.CarModelDTO;
import com.ccic.gwservice.car.fgcarmodelinfoinquiry.CarModelInfoInquiryResponseDTO;
import com.ccic.gwservice.car.fgcarmodelinfoinquiry.FGCarModelInfoInquiryResponse;

import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_exception;
import pkg_auto.autobj.pojo.CarMIIRJson;
import pkg_auto.autobj.pojo.CarMRJson;

/**
 * @author Administrator
 *
 */
public class Ccic_CarmodelinfoinquiryOut {
	private  Logger log = Logger.getLogger(Ccic_CarmodelinfoinquiryOut.class);   
    public String fgCarMIIResponseToFront(FGCarModelInfoInquiryResponse fgResponse,int serial_no){
    	String retu = "";
    	if (fgResponse == null) {
 		/*retu="{\"carMRJ\":[{\"derailleurType\":\"自动\",\"marketYear\":\"2015\",\"modelCode\":\"24234\",\"modelName\":\"乃木零\"}," +
				"{\"derailleurType\":\"手动\",\"marketYear\":\"2014\",\"modelCode\":\"2343\",\"modelName\":\"乃木\"}]," +
				"\"carOwner\":\"车主\",\"engineNo\":\"发动机\",\"enrollDate\":\"日期\",\"flag\":true,\"frameNo\":\"车架\"," +
				"\"info\":\"\",\"jycode\":\"12345-12345-34364\",\"num\":2}";  */ 
 		log.error("返回为空");
    	} else {
    	 com.ccic.gwservice.car.fgcarmodelinfoinquiry.ResponseHeadDTO responseHead = fgResponse.getResponseHead();
		 int mark = responseHead.getStatus();	
		  if (mark==0){//查询成功
			String jycode = responseHead.getMessageId();
			retu = fgCarMIIR_succ(serial_no,jycode,fgResponse.getResponseBody());			
		   } else {//查询失败
			retu = fgCarMIIR_faile(fgResponse);
		  }  
    	}

	return retu;	   
   }
   /**查询成功返回的Json数据
	 * @param jycode 交易流水号
	 * @param responseBody 
	 * @return
	 */
	private String fgCarMIIR_succ(Integer serial_no,String jycode,
			CarModelInfoInquiryResponseDTO responseBody) {
		JSONObject jb = null;
		log.error("车型查询成功："+jycode);
		try {
			boolean savecar_tag = updateCarDto(serial_no,jycode,responseBody);
			boolean savecarM_tag = SaveCarModelDTO(jycode,responseBody);
			if (savecar_tag&&savecarM_tag) {
				CarMIIRJson carJ = CarMIIResponseDTOtoJson(responseBody);
				carJ.setJycode(jycode);
				carJ.setFlag(true);
				carJ.setSerial_no(serial_no);
				jb = JSONObject.fromObject(carJ);
			} else {
				CarMIIRJson carJ = new CarMIIRJson();
				carJ.setFlag(false);
				carJ.setInfo("数据库写入异常，未能返回数据。请联系管理员。");
				jb = JSONObject.fromObject(carJ);
			}
			
		} catch (Cls_exception e) {
			log.error("fgCarMIIR_succ:"+e.toString());
			e.printStackTrace();
			log.error("{\"flag\":\"false\",\"info\":\"数据库写入异常\"}");
			return "{\"flag\":\"false\",\"info\":\"数据库写入异常\"}";
		}
        //log.error(jb.toString());
		return jb.toString();
	}
/**
 * @param serial_no
 * @param jycode
 * @param responseBody
 * @return
 * @throws Cls_exception 
 */
   private boolean updateCarDto(Integer serial_no, String jycode,
		CarModelInfoInquiryResponseDTO carXx) throws Cls_exception {
	   log.error("更新carDTO数据："+jycode);
	 boolean ret = false;
	 if (carXx == null) {
		    log.error("Ccic_CarmodelinfoinquiryOut.SaveCarDto() carXx is null");
	        throw new NullPointerException("Ccic_CarmodelinfoinquiryOut.SaveCarDto() carXx is null");
	      }		 
	 StringBuffer sqlInsert = new StringBuffer();
	 sqlInsert.append("update KCS_CCIC_CARDTO set MESSAGEID='");
	 sqlInsert.append(jycode+"',");
	 if (null!=carXx.getSearchSequenceNo())
		 sqlInsert.append("searchSequenceNo='"+carXx.getSearchSequenceNo()+"',");
	 if (null!=carXx.getVehicleId())
		 sqlInsert.append("vehicleId='"+carXx.getVehicleId()+"',");
	 if (null!= carXx.getLicenseNo())
		 sqlInsert.append("licenseNo='"+carXx.getLicenseNo()+"',");
	 if (null!=carXx.getLicenseType())
	     sqlInsert.append("licenseType='"+carXx.getLicenseType()+"',");
	 if (null!=carXx.getFrameNo())
		 sqlInsert.append("frameNo='"+carXx.getFrameNo()+"',");
	 if (null!=carXx.getVinNo())
		 sqlInsert.append("vinNo='"+carXx.getVinNo()+"',");
	 if (null!=carXx.getCarOwner())
		 sqlInsert.append("carOwner='"+carXx.getCarOwner()+"',");
	 if (null!=carXx.getEnrollDate())
		 sqlInsert.append("enrollDate='"+carXx.getEnrollDate()+"',");
	 if (null!=carXx.getEngineNo())
		 sqlInsert.append("engineNo='"+carXx.getEngineNo()+"',");
	 if (null!=carXx.getUseNatureCode())
		 sqlInsert.append("useNatureCode='"+carXx.getUseNatureCode()+"',");
	 if (null!=carXx.getVehicleType())
		 sqlInsert.append("vehicleType='"+carXx.getVehicleType()+"',");
	 if (null!=carXx.getIneffectualDate())
		 sqlInsert.append("ineffectualDate='"+carXx.getIneffectualDate()+"',");
	 if (null!=carXx.getRejectDate())
		 sqlInsert.append("RejectDate='"+carXx.getRejectDate()+"',");
	 if (null!=carXx.getLastCheckDate())
		 sqlInsert.append("lastCheckDate='"+carXx.getLastCheckDate()+"',");
	 if (null!=carXx.getTransferDate())
		 sqlInsert.append("transferDate='"+carXx.getTransferDate()+"',");
	 if (null!=carXx.getWholeWeight())
		 sqlInsert.append("wholeWeight="+carXx.getWholeWeight()+",");
	 if (null!=carXx.getRatedPassengerCapacity())
		 sqlInsert.append("ratedPassengerCapacity="+carXx.getRatedPassengerCapacity()+",");
	 if (null!=carXx.getTonnage())
		 sqlInsert.append("tonnage="+carXx.getTonnage()+",");
	 if (null!=carXx.getMadeFactory())
		 sqlInsert.append("madeFactory='"+carXx.getMadeFactory()+"',");
	 if (null!=carXx.getModel())
		 sqlInsert.append("model='"+carXx.getModel()+"',");
	 if (null!=carXx.getBrandCN())
		 sqlInsert.append("brandCN='"+carXx.getBrandCN()+"',");
	 if (null!=carXx.getBrandEN())
		 sqlInsert.append("brandEN='"+carXx.getBrandEN()+"',");
	 if (null!=carXx.getHaulage())
		 sqlInsert.append("haulage="+carXx.getHaulage()+",");
	 if (null!=carXx.getStatus())
		 sqlInsert.append("status='"+carXx.getStatus()+"',");

	 sqlInsert.append("rq=sysdate where serial_no=");
	 sqlInsert.append(serial_no);
	 log.error(sqlInsert.toString());
	 java.sql.Connection con=null;
		java.sql.PreparedStatement stmt=null;
		java.sql.ResultSet rs=null;
		int a=0;
		try {
			Cls_connect cn = new Cls_connect();
	    	con = cn.connect().getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement(sqlInsert.toString());
		  	a=stmt.executeUpdate();
			con.commit();
			con.setAutoCommit(true);// 恢复默认	
			if (a>0)
			 { ret = true;
			 }
		} catch (SQLException se) {
			log.error(se.toString());
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
							 throw new Cls_exception("Ccic_CarmodelinfoinquiryOut .updateCarDto()"+e.toString());
						}
				     rs=null;  
							}
							if (stmt!=null) {
				try{
								stmt.close();}
				catch(Exception e){
							 throw new Cls_exception("Ccic_CarmodelinfoinquiryOut .updateCarDto()"+e.toString());
						}
				     stmt=null;
							}
							if (con!=null){
				try{
								con.close();
				}catch(Exception e){
							 throw new Cls_exception("Ccic_CarmodelinfoinquiryOut .updateCarDto()"+e.toString());
						}
				   con =null;
							}
		}   
     return ret;	   
 
}
    /** 查询失败返回的json数据
	 * @param fgResponse
	 * @return
	 */
	private String fgCarMIIR_faile(FGCarModelInfoInquiryResponse fgResponse) {
		JSONObject jb = null;
		CarMIIRJson carJ = new CarMIIRJson();
		carJ.setFlag(false);
		carJ.setInfo("保险公司接口查询失败："+fgResponse.getResponseHead().getReturnMessage());
		jb = JSONObject.fromObject(carJ);
		log.error("保险公司车型查询接口查询失败："+fgResponse.getResponseHead().getReturnMessage());
		return jb.toString();
	}
/*	private boolean SaveCarDto(String jycode,CarModelInfoInquiryResponseDTO carXx) throws Cls_exception{
		 boolean ret = false;
		 if (carXx == null) {
			    log.error("Ccic_CarmodelinfoinquiryOut.SaveCarDto() carXx is null");
		        throw new NullPointerException("Ccic_CarmodelinfoinquiryOut.SaveCarDto() carXx is null");
		      }	
		 StringBuffer sqlInsert = new StringBuffer();
		 sqlInsert.append("insert into KCS_CCIC_CARDTO values(AUTOQUOTE_ID.nextval,'"+jycode+"',?,?,?,?,?,?,?,");
		 sqlInsert.append("?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,sysdate)");
		    java.sql.Connection con=null;
			java.sql.PreparedStatement stmt=null;
			java.sql.ResultSet rs=null;
			int a=0;
			try {
				Cls_connect cn = new Cls_connect();
		    	con = cn.connect().getConnection();
				con.setAutoCommit(false);
				stmt=con.prepareStatement(sqlInsert.toString());
		        stmt.setString(1, carXx.getSearchSequenceNo());
		        stmt.setString(2, carXx.getVehicleId());
		        stmt.setString(3, carXx.getLicenseNo());
		        stmt.setString(4, carXx.getLicenseType());
		        stmt.setString(5, carXx.getFrameNo());
		        stmt.setString(6, carXx.getVinNo());
		        stmt.setString(7, carXx.getCarOwner());
		        stmt.setString(8, carXx.getEnrollDate());
		        stmt.setString(9, carXx.getEngineNo());
		        stmt.setString(10, carXx.getUseNatureCode());
		        stmt.setString(11, carXx.getVehicleType());
		        stmt.setString(12, carXx.getIneffectualDate());
		        stmt.setString(13, carXx.getRejectDate());
		        stmt.setString(14, carXx.getLastCheckDate());
		        stmt.setString(15, carXx.getTransferDate());
		        stmt.setDouble(16, carXx.getWholeWeight());
		        stmt.setDouble(17, carXx.getRatedPassengerCapacity());
		        stmt.setDouble(18, carXx.getTonnage());
		        stmt.setString(19, carXx.getMadeFactory());
		        stmt.setString(20, carXx.getModel());
		        stmt.setString(21, carXx.getBrandCN());
		        stmt.setString(22, carXx.getBrandEN());
		        stmt.setDouble(23, carXx.getHaulage());
		        stmt.setString(24, carXx.getStatus());

			  	a=stmt.executeUpdate();
				con.commit();
				con.setAutoCommit(true);// 恢复默认	
				if (a>0)
				 { ret = true;
				 }
			} catch (SQLException se) {
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
      return ret;	   
   }*/
	private boolean SaveCarModelDTO(String jycode,CarModelInfoInquiryResponseDTO carXx) throws Cls_exception{
		log.error("写入carModelDTO:"+jycode);
		 boolean ret = false;
		 if (carXx == null) {
			    log.error("Ccic_CarmodelinfoinquiryOut.SaveCarDto() carXx is null");
		        throw new NullPointerException("Ccic_CarmodelinfoinquiryOut.SaveCarDto() carXx is null");
		      }	
		 StringBuffer sqlInsert = new StringBuffer();
		 sqlInsert.append("insert into KCS_CCIC_CARMODELDTO values(AUTOQUOTE_MODEID.nextval,'"+jycode+"',");
		 sqlInsert.append("?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,");//20个
		 sqlInsert.append("?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,");	   
		 sqlInsert.append("?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,");
		 sqlInsert.append("?,?,?,sysdate)");
		 java.sql.Connection con=null;
			java.sql.PreparedStatement stmt=null;
			java.sql.ResultSet rs=null;
			try {
				Cls_connect cn = new Cls_connect();
		    	con = cn.connect().getConnection();
				con.setAutoCommit(false);
				stmt=con.prepareStatement(sqlInsert.toString());
				int size = carXx.getCarModel().length;
				log.error("carmodel.length="+size);
				CarModelDTO carModelDto = null;
				for (int i = 0; i < size; i++) {
					carModelDto = carXx.getCarModel(i);
					stmt.setString(1, carModelDto.getModelCode());
					stmt.setString(2, carModelDto.getModelName());
					stmt.setString(3, carModelDto.getBrandCN());
					stmt.setString(4, carModelDto.getSeries());
					stmt.setString(5, carModelDto.getImportFlag());
					stmt.setDouble(6, carModelDto.getRatedPassengerCapacity());
					stmt.setDouble(7, carModelDto.getTotalVehicleWeight());
					stmt.setDouble(8, carModelDto.getTonnage());
					stmt.setString(9, carModelDto.getDerailleurType());
					stmt.setString(10, carModelDto.getAbsFlag());
					stmt.setString(11, carModelDto.getAlarmFlag());
					stmt.setDouble(12, carModelDto.getAirbagNum());
					stmt.setString(13, carModelDto.getVehicleDescription());
					stmt.setDouble(14, carModelDto.getDisplacement());
					stmt.setString(15, carModelDto.getMarketYear());
					stmt.setString(16, carModelDto.getRiskFlag());
					stmt.setDouble(17, carModelDto.getReplacementValue());
					stmt.setString(18, carModelDto.getRefCode1());
					stmt.setString(19, carModelDto.getRefCode2());
					stmt.setString(20, carModelDto.getIsPriced());
					stmt.setString(21, carModelDto.getVehicleJingyou().getIndustryModelCode());
					stmt.setString(22, carModelDto.getVehicleJingyou().getIndustryVehicleCode());
					stmt.setString(23, carModelDto.getVehicleJingyou().getIndustryVehicleName());
					stmt.setString(24, carModelDto.getVehicleJingyou().getVehicleCode());
					stmt.setString(25, carModelDto.getVehicleJingyou().getVehicleName());
					stmt.setString(26, carModelDto.getVehicleJingyou().getFactoryCode());
					stmt.setString(27, carModelDto.getVehicleJingyou().getFactoryName());
					stmt.setString(28, carModelDto.getVehicleJingyou().getBrandCode());
					stmt.setString(29, carModelDto.getVehicleJingyou().getBrandName());
					stmt.setString(30, carModelDto.getVehicleJingyou().getFamilyCode());
					stmt.setString(31, carModelDto.getVehicleJingyou().getFamilyName());
					stmt.setString(32, carModelDto.getVehicleJingyou().getVehicleClassCode());
					stmt.setString(33, carModelDto.getVehicleJingyou().getVehicleClassName());
					stmt.setString(34, carModelDto.getVehicleJingyou().getVehicleType());
					stmt.setString(35, carModelDto.getVehicleJingyou().getDisplacement());
					stmt.setString(36, carModelDto.getVehicleJingyou().getSeat());
					stmt.setString(37, carModelDto.getVehicleJingyou().getTonnage());
					stmt.setString(38, carModelDto.getVehicleJingyou().getGearboxType());
					stmt.setString(39, carModelDto.getVehicleJingyou().getPrice());
					stmt.setString(40, carModelDto.getVehicleJingyou().getPricetype());
					stmt.setString(41, carModelDto.getVehicleJingyou().getPurchasePriceTax());
					stmt.setString(42, carModelDto.getVehicleJingyou().getPurchasePrice());
					stmt.setString(43, carModelDto.getVehicleJingyou().getHfCode());
					stmt.setString(44, carModelDto.getVehicleJingyou().getHfName());
					stmt.setString(45, carModelDto.getVehicleJingyou().getAntiTheft());
					stmt.setString(46, carModelDto.getVehicleJingyou().getAirbagNum());
					stmt.setString(47, carModelDto.getVehicleJingyou().getMarketDate());
					stmt.setString(48, carModelDto.getVehicleJingyou().getRiskFlags());
					stmt.setString(49, carModelDto.getVehicleJingyou().getStopFlag());
					stmt.setString(50, carModelDto.getVehicleJingyou().getFullWeight());
					stmt.setString(51, carModelDto.getVehicleJingyou().getRate());
					stmt.setString(52, carModelDto.getVehicleJingyou().getSearchCode());
					stmt.setString(53, carModelDto.getVehicleJingyou().getPower());
					stmt.setString(54, carModelDto.getVehicleJingyou().getFitsRiskRate());
					stmt.setString(55, carModelDto.getVehicleJingyou().getGroupFitsRate());
					stmt.setString(56, carModelDto.getVehicleJingyou().getGroupRepairRate());
					stmt.setString(57, carModelDto.getVehicleJingyou().getCarType());
					stmt.setString(58, carModelDto.getVehicleJingyou().getBdRiskFlag1());
					stmt.setString(59, carModelDto.getVehicleJingyou().getBdRiskFlag2());
					stmt.setString(60, carModelDto.getVehicleJingyou().getBdRiskFlag3());
					stmt.setString(61, carModelDto.getVehicleJingyou().getBdRiskFlag4());
					stmt.setString(62, carModelDto.getVehicleJingyou().getRemark());
					stmt.setString(63, carModelDto.getVehicleJingyou().getFlag());
					
					stmt.addBatch();
			     }
				 int[ ] counts=stmt.executeBatch();
				 int numBat=0;
				 for (int j = 0;j<counts.length;j++){
					 if (counts[j]== -2) 
						 numBat++;
				 }
				 if (size==numBat) ret = true;
				 stmt.close();
				 con.commit();
				 con.setAutoCommit(true);
			} catch (SQLException se) {
				log.error(se.toString());
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
      return ret;	   	   
	   } 
 /*   public  CarModelDTO GetCarModeDTO(String jycode,String modelCode)throws Cls_exception{
	
	 
	   return null;  
   }*/
     private CarMIIRJson CarMIIResponseDTOtoJson(CarModelInfoInquiryResponseDTO carXx){
	   int size = carXx.getCarModel().length;
	   DecimalFormat df   = new DecimalFormat("######0.00"); 
	   Double carValue = 0.0;
	   CarMRJson[] cars = new CarMRJson[size];
	     for (int i=0;i<size;i++){
	    	 CarMRJson car = new CarMRJson();
	    	 car.setDerailleurType(carXx.getCarModel(i).getDerailleurType());
	    	 car.setMarketYear(carXx.getCarModel(i).getMarketYear());
	    	 car.setModelCode(carXx.getCarModel(i).getModelCode());
	    	 car.setModelName(carXx.getCarModel(i).getModelName());
	    	 carValue = carXx.getCarModel(i).getReplacementValue()/10000;
	    	 car.setReplacementValue(df.format(carValue)+"万元");
	    	 car.setIndustryVehicleName(carXx.getCarModel(i).getVehicleJingyou().getIndustryVehicleName());
	    	 car.setIndustryModelCode(carXx.getCarModel(i).getVehicleJingyou().getIndustryModelCode());
	    	 cars[i] = car;
	     }
	   CarMIIRJson carJ = new CarMIIRJson();
	     carJ.setCarMRJ(cars);
	     carJ.setCarOwner(carXx.getCarOwner());
	     //carJ.setEngineNo(carXx.getEngineNo());
	     //carJ.setEnrollDate(carXx.getEnrollDate());
	     //carJ.setFrameNo(carXx.getFrameNo());
	     carJ.setInfo("");
	     carJ.setNum(size);
	return carJ;
	   
   }
}
