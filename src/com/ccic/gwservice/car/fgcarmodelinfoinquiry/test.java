/**
 * 
 */
package com.ccic.gwservice.car.fgcarmodelinfoinquiry;

import org.apache.axis.AxisFault;
import org.apache.axis.AxisProperties;

import pkg_auto.autobj.pojo.Ccic_endpoint;

/**
 * @author Administrator
 *
 */
public class test {
	public static void testchx(){
	try {	  
		  java.util.Date date1=new java.util.Date();
		  String trxCode = "D0001";

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
			
			CarModelInfoInquiryRequestDTO requestDto = new CarModelInfoInquiryRequestDTO();
			/*requestDto.setLicenseNo("³cv7181");//���ƺ���			
			requestDto.setEngineNo("HR16472896A");//��������
			requestDto.setVinNo("LGBG22E046Y057429");//����ʶ�����
			requestDto.setFrameNo("LGBG22E046Y057429");//���ܺ�
			requestDto.setNewVehicle("0");//�³���־  1 �� 0����
			requestDto.setEcdemicVehicle("0");//��س���־ 1 �� 0����
			requestDto.setEnrollDate("2006-12-25");//��������
			requestDto.setVehicleModel("DFL7161AA");//�����ͺ�*/
			//requestDto.setModelCode("");//���ʹ���			
			//requestDto.setVehicleType("K33");//���ܳ������� 
			//requestDto.setVehicleStyleDesc("");//��������
			requestDto.setLicenseType("02");//��������
		   // requestDto.setVehicleBrand("");//����Ʒ��
			
			requestDto.setLicenseNo("��AW56G9");//���ƺ���			
			requestDto.setEngineNo("7120965");//��������
			requestDto.setVinNo("LP14545122112");//����ʶ�����
			requestDto.setFrameNo("LP14545122112");//���ܺ�
			requestDto.setNewVehicle("1");//�³���־  1 �� 0����
			requestDto.setEcdemicVehicle("0");//��س���־ 1 �� 0����
			requestDto.setEnrollDate("2012-10-10");//��������
			requestDto.setVehicleModel("BORA 1.6AT");//�����ͺ�
			//requestDto.setVehicleBrand("����");
			//requestDto.setVehicleType("K42");
			AxisProperties.setProperty("axis.socketSecureFactory","pkg_sinopec.autobj.mySsl.MyCustomSSLSocketFactory");
			
			FGCarModelInfoInquiryProxy proxy = new FGCarModelInfoInquiryProxy(Ccic_endpoint.getUrlCcicCarmodelinfoinquiry());
			

			 FGCarModelInfoInquiryRequest carreq = new  FGCarModelInfoInquiryRequest();
			 carreq.setRequestHead(heads);
			 carreq.setRequestBody(requestDto);
			 
			
			FGCarModelInfoInquiryResponse resp = proxy.FGCarModelInfoInquiry(carreq);
			if (resp!=null)
			System.out.println(resp.toString());
			else System.out.println("null");
			ResponseHeadDTO resphead = resp.getResponseHead();
			CarModelInfoInquiryResponseDTO respbody = resp.getResponseBody();
			CarModelDTO[] carmodels = respbody.getCarModel();
			System.out.println(carmodels.length);
			int mark = resphead.getStatus();
			System.out.println("��Ӧ״̬��"+resphead.getStatus());
			System.out.println("Ӧ����Ӧ���룺"+resphead.getReturnCode());
			System.out.println("������"+resphead.getReturnMessage());
			if (mark==0) {
				System.out.println("������"+respbody.getCarOwner());
				System.out.println("���ͣ�"+carmodels[0].getModelName());
				System.out.println("�����������:"+respbody.getLastCheckDate());
				System.out.println("ת�ƵǼ�����"+respbody.getTransferDate());
				System.out.println("��������"+respbody.getVehicleType());
			    System.out.println("�˶��ؿ�����"+respbody.getRatedPassengerCapacity());
			    System.out.println("ʹ�����ʴ���"+respbody.getUseNatureCode());
			    System.out.println("ǿ����Ч��ֹ"+respbody.getRejectDate());
			    System.out.println("��������(ǧ��)"+respbody.getWholeWeight()+carmodels[0].getTotalVehicleWeight());
			    System.out.println("��������"+carmodels[0].getImportFlag());
				System.out.println(carmodels[0].getVehicleJingyou().getIndustryModelCode());
				System.out.println(carmodels[0].getVehicleJingyou().getIndustryVehicleCode());
				System.out.println(carmodels[0].getVehicleJingyou().getIndustryVehicleName());
			}
			
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
	  public static void main(String[] args){
		  
		  testchx();
		  
	  }	
}	
