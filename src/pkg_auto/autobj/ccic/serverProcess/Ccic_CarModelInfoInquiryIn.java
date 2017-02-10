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

/**��س���  ���ղ�ѯ  ��ѯ�����װ
 * @author Administrator
 *
 */
public class Ccic_CarModelInfoInquiryIn {
	private  Logger log = Logger.getLogger(Ccic_CarModelInfoInquiryIn.class);   
  /*
   * �ӿ�ͷ��Ϣ
   */
	private  RequestHeadDTO getCarModelinfoInquiryRequestHeadDto(String bmzjgh) throws Cls_exception {
		log.error("�ӿ�ͷ");
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
	 * ���³� ���ղ�ѯ
	 */
	private  CarModelInfoInquiryRequestDTO getCarModelInfoInquiryRequestDTO(TmpCarDTO car){
	  /* log.error(car.getCphm()+"/"+car.getChllx()+"/"+car.getCjhm()+"/"+car.getFdjhm()+"/"+car.getVehicleBrand()
	   +"/"+car.getVehicleModel()+"/"+car.getVehicleType()+"/"+car.getWdche()+"/"+car.getEnrollDate()+"/"+car.getChgOwnerFlag());*/
		log.error("���³���"+car.getCphm());
	   CarModelInfoInquiryRequestDTO ccicRequest = new CarModelInfoInquiryRequestDTO();
	   ccicRequest.setLicenseNo(car.getCphm());//���ƺ���
	   ccicRequest.setEngineNo(car.getFdjhm());//��������
	   ccicRequest.setFrameNo(car.getCjhm());//���ܺ�
	   ccicRequest.setVinNo(car.getCjhm());
	   ////////////�˴��³���־���Ǹ��ֶΣ�
	   ccicRequest.setNewVehicle(car.getNewcarmark());//�³���־
	   ccicRequest.setEcdemicVehicle(car.getWdche());//��س�
	   ccicRequest.setEnrollDate(car.getEnrollDate());//��������
	   ccicRequest.setVehicleModel(car.getVehicleModel());//�����ͺ�
	   /*
	   ccicRequest.setLicenseType(car.getChllx());//��������
	   ccicRequest.setVehicleBrand(car.getVehicleBrand());//����Ʒ��	   
	   ccicRequest.setVehicleType(car.getVehicleType());//���ܳ����ͺ�	   
	   ccicRequest.setVehicleStyleDesc("");//��������
	   ccicRequest.setModelCode("");//���ʹ���
       */
	   return ccicRequest;	   	   
   }
	/*
	 * �³�  ���ղ�ѯ
	 */
	private CarModelInfoInquiryRequestDTO getNewCarModelInfoInquiryRequestDTO(TmpCarDTO car){
		   log.error("�³���"+car.getCjhm());
		   CarModelInfoInquiryRequestDTO ccicRequest = new CarModelInfoInquiryRequestDTO();
		   ccicRequest.setNewVehicle("1");//�³���־
		   ccicRequest.setFrameNo(car.getCjhm());//���ܺ�
		   ccicRequest.setVinNo(car.getCjhm());
		   ccicRequest.setEngineNo(car.getFdjhm());//��������
		   ccicRequest.setVehicleModel(car.getVehicleModel());//�����ͺ�
		   ccicRequest.setEnrollDate(car.getEnrollDate());//��������
		   /*
		   ccicRequest.setVehicleBrand(car.getVehicleBrand());//����Ʒ��		   
		   ccicRequest.setVehicleType(car.getVehicleType());//���ܳ����ͺ�
		   ccicRequest.setEcdemicVehicle(car.getWdche());//��س�
		   */
		   return ccicRequest;	   	   
	   }	
	/*
	 * ��� �Ѹĳ��Ͳ�ѯ �ӿ� ��װ
	 */
   public  FGCarModelInfoInquiryRequest getCarModelInfoInquiryRequest(String bmzjgh,TmpCarDTO car) throws Cls_exception{
	       FGCarModelInfoInquiryRequest carreq =null ;
	       //String mark = car.getNewcarmark();
		   String mark = car.getNoLicenseFlag();
		   log.error("NoLicenseFlag = "+mark);
		   if ("1".equals(mark)) {//�³�
			   CarModelInfoInquiryRequestDTO requestDto = getNewCarModelInfoInquiryRequestDTO(car);
			   RequestHeadDTO headDto = getCarModelinfoInquiryRequestHeadDto(bmzjgh);
			   carreq = new FGCarModelInfoInquiryRequest(
					   headDto,	requestDto	   
			   );
		   } else if ("0".equals(mark)) {//���³�
			   CarModelInfoInquiryRequestDTO requestDto = getCarModelInfoInquiryRequestDTO(car);
			   RequestHeadDTO headDto = getCarModelinfoInquiryRequestHeadDto(bmzjgh);
			   carreq = new FGCarModelInfoInquiryRequest( headDto,	requestDto	 ); 
			  
		   } 
	return carreq ;	   
   }
   public static void main(String[] args){
	   TmpCarDTO car = new TmpCarDTO();
		car.setCphm("³cv7181");
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
