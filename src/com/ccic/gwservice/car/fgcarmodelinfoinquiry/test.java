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
			/*requestDto.setLicenseNo("鲁cv7181");//车牌号码			
			requestDto.setEngineNo("HR16472896A");//发动机号
			requestDto.setVinNo("LGBG22E046Y057429");//车辆识别代号
			requestDto.setFrameNo("LGBG22E046Y057429");//车架号
			requestDto.setNewVehicle("0");//新车标志  1 是 0不是
			requestDto.setEcdemicVehicle("0");//外地车标志 1 是 0不是
			requestDto.setEnrollDate("2006-12-25");//初登日期
			requestDto.setVehicleModel("DFL7161AA");//车辆型号*/
			//requestDto.setModelCode("");//车型代码			
			//requestDto.setVehicleType("K33");//交管车辆种类 
			//requestDto.setVehicleStyleDesc("");//车辆描述
			requestDto.setLicenseType("02");//号牌种类
		   // requestDto.setVehicleBrand("");//车辆品牌
			
			requestDto.setLicenseNo("川AW56G9");//车牌号码			
			requestDto.setEngineNo("7120965");//发动机号
			requestDto.setVinNo("LP14545122112");//车辆识别代号
			requestDto.setFrameNo("LP14545122112");//车架号
			requestDto.setNewVehicle("1");//新车标志  1 是 0不是
			requestDto.setEcdemicVehicle("0");//外地车标志 1 是 0不是
			requestDto.setEnrollDate("2012-10-10");//初登日期
			requestDto.setVehicleModel("BORA 1.6AT");//车辆型号
			//requestDto.setVehicleBrand("大众");
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
			System.out.println("相应状态："+resphead.getStatus());
			System.out.println("应用相应代码："+resphead.getReturnCode());
			System.out.println("描述："+resphead.getReturnMessage());
			if (mark==0) {
				System.out.println("车主："+respbody.getCarOwner());
				System.out.println("车型："+carmodels[0].getModelName());
				System.out.println("最近定检日期:"+respbody.getLastCheckDate());
				System.out.println("转移登记日期"+respbody.getTransferDate());
				System.out.println("交管类型"+respbody.getVehicleType());
			    System.out.println("核定载客人数"+respbody.getRatedPassengerCapacity());
			    System.out.println("使用性质代码"+respbody.getUseNatureCode());
			    System.out.println("强制有效期止"+respbody.getRejectDate());
			    System.out.println("整备质量(千克)"+respbody.getWholeWeight()+carmodels[0].getTotalVehicleWeight());
			    System.out.println("车型种类"+carmodels[0].getImportFlag());
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
