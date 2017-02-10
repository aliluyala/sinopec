/**
 * 
 */
package pkg_auto.autobj.ccic.serverProcess;

import org.apache.log4j.Logger;

import pkg_sinopec.Cls_exception;
import pkg_auto.autobj.pojo.TmpCarDTO;
import pkg_auto.autobj.pojo.Ccic_endpoint;
import com.ccic.gwservice.car.fgcarmodelinfoinquiry.CarModelInfoInquiryRequestDTO;
import com.ccic.gwservice.car.fgcarmodelinfoinquiry.FGCarModelInfoInquiryRequest;
import com.ccic.gwservice.car.fgcarmodelinfoinquiry.RequestHeadDTO;

/**大地车险  车险查询  查询输入封装
 * @author Administrator
 *
 */
public class Ccic_CarModelInfoInquiryIn {
	private  Logger log = Logger.getLogger(Ccic_CarModelInfoInquiryIn.class);   
  /*
   * 接口头信息
   */
	private  RequestHeadDTO getCarModelinfoInquiryRequestHeadDto(String bmzjgh) throws Cls_exception {
		log.error("接口头");
	   String trxCode = "D0001";
	   java.util.Date date1=new java.util.Date();  
	   
	   RequestHeadDTO heads = new RequestHeadDTO(
			   Ccic_endpoint.getCcicChannelcode(),
			   Ccic_endpoint.getCcicChannelname(),
			   Ccic_endpoint.getCcicChannelcomcode(),
			   Ccic_endpoint.getCcicChannelcomname(),
			   Ccic_endpoint.getCcicChannelproductcode(),
			   Ccic_endpoint.getCcicOperator(),
			   trxCode,
			   Ccic_endpoint.getCcicChannelseqno(),
			   date1,
			   Ccic_endpoint.getCcicRegioncode(),
			   Ccic_endpoint.getCcicMakechannel(),
			   Ccic_endpoint.getCcicPassword());
	   Ccic_channelCom channelCom = new  Ccic_channelCom ();
	   String channelComCode = channelCom.getCcicComCode(bmzjgh);
	   heads.setChannelComCode(channelComCode);
	  // heads.setChannelComCode("23014002");
	   return heads;  
   }
	/*
	 * 非新车 车险查询
	 */
	private  CarModelInfoInquiryRequestDTO getCarModelInfoInquiryRequestDTO(TmpCarDTO car){
	  /* log.error(car.getCphm()+"/"+car.getChllx()+"/"+car.getCjhm()+"/"+car.getFdjhm()+"/"+car.getVehicleBrand()
	   +"/"+car.getVehicleModel()+"/"+car.getVehicleType()+"/"+car.getWdche()+"/"+car.getEnrollDate()+"/"+car.getChgOwnerFlag());*/
		log.error("非新车："+car.getCphm());
	   CarModelInfoInquiryRequestDTO ccicRequest = new CarModelInfoInquiryRequestDTO();
	   ccicRequest.setLicenseNo(car.getCphm());//号牌号码
	   ccicRequest.setEngineNo(car.getFdjhm());//发动机号
	   ccicRequest.setFrameNo(car.getCjhm());//车架号
	   ccicRequest.setVinNo(car.getCjhm());
	   ////////////此处新车标志传那个字段？
	   ccicRequest.setNewVehicle(car.getNewcarmark());//新车标志
	   ccicRequest.setEcdemicVehicle(car.getWdche());//外地车
	   ccicRequest.setEnrollDate(car.getEnrollDate());//初登日期
	   ccicRequest.setVehicleModel(car.getVehicleModel());//车辆型号
	   /*
	   ccicRequest.setLicenseType(car.getChllx());//号牌种类
	   ccicRequest.setVehicleBrand(car.getVehicleBrand());//车辆品牌	   
	   ccicRequest.setVehicleType(car.getVehicleType());//交管车辆型号	   
	   ccicRequest.setVehicleStyleDesc("");//车辆描述
	   ccicRequest.setModelCode("");//车型代码
       */
	   return ccicRequest;	   	   
   }
	/*
	 * 新车  车险查询
	 */
	private CarModelInfoInquiryRequestDTO getNewCarModelInfoInquiryRequestDTO(TmpCarDTO car){
		   log.error("新车："+car.getCjhm());
		   CarModelInfoInquiryRequestDTO ccicRequest = new CarModelInfoInquiryRequestDTO();
		   ccicRequest.setNewVehicle("1");//新车标志
		   ccicRequest.setFrameNo(car.getCjhm());//车架号
		   ccicRequest.setVinNo(car.getCjhm());
		   ccicRequest.setEngineNo(car.getFdjhm());//发动机号
		   ccicRequest.setVehicleModel(car.getVehicleModel());//车辆型号
		   ccicRequest.setEnrollDate(car.getEnrollDate());//初登日期
		   /*
		   ccicRequest.setVehicleBrand(car.getVehicleBrand());//车辆品牌		   
		   ccicRequest.setVehicleType(car.getVehicleType());//交管车辆型号
		   ccicRequest.setEcdemicVehicle(car.getWdche());//外地车
		   */
		   return ccicRequest;	   	   
	   }	
	/*
	 * 大地 费改车型查询 接口 封装
	 */
   public  FGCarModelInfoInquiryRequest getCarModelInfoInquiryRequest(String bmzjgh,TmpCarDTO car) throws Cls_exception{
	       FGCarModelInfoInquiryRequest carreq =null ;
	       //String mark = car.getNewcarmark();
		   String mark = car.getNoLicenseFlag();
		   log.error("NoLicenseFlag = "+mark);
		   if ("1".equals(mark)) {//新车
			   CarModelInfoInquiryRequestDTO requestDto = getNewCarModelInfoInquiryRequestDTO(car);
			   RequestHeadDTO headDto = getCarModelinfoInquiryRequestHeadDto(bmzjgh);
			   carreq = new FGCarModelInfoInquiryRequest(
					   headDto,	requestDto	   
			   );
		   } else if ("0".equals(mark)) {//非新车
			   CarModelInfoInquiryRequestDTO requestDto = getCarModelInfoInquiryRequestDTO(car);
			   RequestHeadDTO headDto = getCarModelinfoInquiryRequestHeadDto(bmzjgh);
			   carreq = new FGCarModelInfoInquiryRequest( headDto,	requestDto	 ); 
			  
		   } 
	return carreq ;	   
   }
   public static void main(String[] args){
	   TmpCarDTO car = new TmpCarDTO();
		car.setCphm("鲁cv7181");
		car.setChllx("02");
		car.setNewcarmark("0");
		car.setFdjhm("");
		car.setCjhm("");
		car.setVehicleBrand("");
		car.setVehicleModel("");
		
		//FGCarModelInfoInquiryRequest fgCarMIIRequest = getCarModelInfoInquiryRequest(car);
		//System.out.println(fgCarMIIRequest.getRequestBody().getLicenseNo());
	   
   }
   
   
}
