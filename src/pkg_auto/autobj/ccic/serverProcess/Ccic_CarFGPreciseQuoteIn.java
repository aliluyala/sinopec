/**
 * 
 */
package pkg_auto.autobj.ccic.serverProcess;

import java.sql.SQLException;
import java.sql.SQLRecoverableException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.time.DurationFormatUtils;
import org.apache.log4j.Logger;

import pkg_sinopec.Cls_connect;
import pkg_sinopec.Cls_exception;
import pkg_sinopec.IniReader;
import pkg_auto.autobj.pojo.Ccic_endpoint;
import pkg_auto.autobj.pojo.PremiumCar;

import com.ccic.gwservice.car.fgcpiprecisequote.AgentDTO;
import com.ccic.gwservice.car.fgcpiprecisequote.AnnualTaxDTO;
import com.ccic.gwservice.car.fgcpiprecisequote.CarDTO;
import com.ccic.gwservice.car.fgcpiprecisequote.CarTaxDTO;
import com.ccic.gwservice.car.fgcpiprecisequote.FGPreciseQuoteRequest;
import com.ccic.gwservice.car.fgcpiprecisequote.KindDTO;
import com.ccic.gwservice.car.fgcpiprecisequote.OtherDTO;
import com.ccic.gwservice.car.fgcpiprecisequote.PreciseQuoteRequestDTO;
import com.ccic.gwservice.car.fgcpiprecisequote.PrivyDTO;
import com.ccic.gwservice.car.fgcpiprecisequote.RequestHeadDTO;
import com.ccic.gwservice.car.fgcpiprecisequote.VehicleJingyouDTO;
import com.ccic.gwservice.car.fgcpiprecisequote.ExtendInfoDTO;

/**大地车险  精确报价 接口 输入
 * @author Administrator
 * 
 */
public class Ccic_CarFGPreciseQuoteIn {
	private Logger log = Logger.getLogger(Ccic_CarFGPreciseQuoteIn.class);
   /**
    * 接口头部信息
    * @param bmzjgh
    * @return
 * @throws Cls_exception 
    */
	private RequestHeadDTO getCarFGPreciseQuoteRequestHeadDto(String bmzjgh) throws Cls_exception {
		String trxCode = "D0003";
		java.util.Date date1 = new java.util.Date();

		RequestHeadDTO heads = new RequestHeadDTO(
				Ccic_endpoint.getCcicChannelcode(),
				Ccic_endpoint.getCcicChannelname(),
				Ccic_endpoint.getCcicChannelcomcode(),
				Ccic_endpoint.getCcicChannelcomname(),
				Ccic_endpoint.getCcicChannelproductcode(),
				Ccic_endpoint.getCcicOperator(), trxCode,
				Ccic_endpoint.getCcicChannelseqno(), date1,
				Ccic_endpoint.getCcicRegioncode(),
				Ccic_endpoint.getCcicMakechannel(),
				Ccic_endpoint.getCcicPassword());
		 Ccic_channelCom channelCom = new  Ccic_channelCom ();
		   String channelComCode = channelCom.getCcicComCode(bmzjgh);
		   heads.setChannelComCode(channelComCode);
		 //  heads.setChannelComCode("37010626");
		return heads;
	}
	/**
	 * 精确报价请求接口输入封装
	 * @param jycode
	 * @param serial_no
	 * @param quotationType
	 * @param bmzjgh
	 * @return
	 */
	public FGPreciseQuoteRequest getFGPreciseQuoteRequest(String jycode,String serial_no,String quotationType,String bmzjgh)  {
		FGPreciseQuoteRequest preciseReq = null;		
		try {
			RequestHeadDTO headDTO = getCarFGPreciseQuoteRequestHeadDto(bmzjgh);
			PreciseQuoteRequestDTO requestDto = getPreciseQuoteRequestDTO(jycode,serial_no,quotationType);
			if (null!=requestDto)
			preciseReq = new FGPreciseQuoteRequest(headDTO,requestDto);
		} catch (Exception e) {
			log.error("getFGPreciseQuoteRequest:"+e.toString());
			e.printStackTrace();
		}

		return preciseReq;
	}
/*	public void printstr(FGPreciseQuoteRequest res) {
		RequestHeadDTO head = res.getRequestHead();
	  System.out.println("RequestHeadDTO:");
	  System.out.println(""+head.getChannelCode());
	  System.out.println(""+head.getChannelName());
	  System.out.println(""+head.getChannelComCode());
	  System.out.println(""+head.getChannelComName());
	  System.out.println(""+head.getChannelProductCode());
	  System.out.println(""+head.getOperator());
	  System.out.println(""+head.getTrxCode());
	  System.out.println(""+head.getChannelSeqNo());
	  System.out.println(""+head.getTrxDate());
	  System.out.println(""+head.getRegionCode());
	  System.out.println(""+head.getMakeChannel());
	  System.out.println(""+head.getPassWord());
	  System.out.println("PreciseQuoteRequestDTO:");
	  PreciseQuoteRequestDTO body = res.getRequestBody();
	  System.out.println(""+body.getQuotationType());
	  System.out.println(""+body.getOperateDate());
	  System.out.println(""+body.getStartDate());
	  System.out.println(""+body.getEndDate());
	  System.out.println(""+body.getLastYearEndDate());
	  System.out.println(""+body.getLimitType());
	  System.out.println(""+body.getIsRenewed());
	  System.out.println(""+body.getRenewPolicyNo());
	  System.out.println(""+body.getContractNo());
	  System.out.println(""+body.getExpectDiscount());
	  System.out.println(""+body.getIsAboutAgri());
	  System.out.println(""+body.getQueryAreaCode());
	  System.out.println("CarDTO:");
	  CarDTO car = body.getCars();
	  System.out.println(""+car.getPmQueryNo());
	  System.out.println(""+car.getCarinsureDrelation());
	  System.out.println(""+car.getCarOwner());
	  System.out.println(""+car.getVehicleID());
	  System.out.println(""+car.getLicenseNo());
	  System.out.println(""+car.getLicenseColorcode());
	  System.out.println(""+car.getLicenseType());
	  System.out.println(""+car.getImportFlag());
	  System.out.println(""+car.getCarKindCode());
	  System.out.println(""+car.getModelCode());
	  System.out.println(""+car.getModelName());
	  System.out.println(""+car.getFrameNo());
	  System.out.println(""+car.getVinNo());
	  System.out.println(""+car.getEngineNo());
	  System.out.println(""+car.getUseNatureCode());
	  System.out.println(""+car.getVehicleCategory());
	  System.out.println(""+car.getEnrollDate());
	  System.out.println(""+car.getUserYear());
	  System.out.println(""+car.getRunMiles());
	  System.out.println(""+car.getColorCode());
	  System.out.println(""+car.getRunAreaCode());
	  System.out.println(""+car.getPurchasePrice());
	  System.out.println(""+car.getActualValue());
	  System.out.println(""+car.getClauseType());
	  System.out.println(""+car.getViolatedTimes());
	  System.out.println(""+car.getEcdemicVehicle());
	  System.out.println(""+car.getTransferDate());
	  System.out.println(""+car.getNewVehicle());
	  System.out.println(""+car.getNoLicenseFlag());
	  System.out.println(""+car.getChgOwnerFlag());
	  System.out.println(""+car.getSafeDevice());
	  System.out.println(""+car.getParkSite());
	  System.out.println(""+car.getCertificateDate());
	  System.out.println(""+car.getVehicleBrand());
	  System.out.println(""+car.getNoDamageYears());
	  System.out.println(""+car.getLoanVehicleFlag());
	  System.out.println(""+car.getSpecialCarFlag());
	  System.out.println(""+car.getFuelType());
	  System.out.println(""+car.getNet());
	  System.out.println(""+car.getExhaustScale());
	  System.out.println(""+car.getPowerScale());
	  System.out.println(""+car.getSeatCount());
	  System.out.println(""+car.getTonCount());
	  System.out.println(""+car.getMadeFactory());
	  System.out.println(""+car.getStatus());
	  System.out.println(""+car.getFleetFlag());
	  System.out.println(""+car.getCarChecker());
	  System.out.println(""+car.getCarCheckStatus());
	  System.out.println(""+car.getUncheckReasonCode());
	  System.out.println(""+car.getCarCheckTime());
	  System.out.println(""+car.getCarRegiste());
	  System.out.println(""+car.getCarTypeAlias());
	  System.out.println(""+car.getIndustryModelCode());
	  System.out.println(""+car.getBasicRateCode());
	  System.out.println(""+car.getIndustryVehicleCode());
	  System.out.println(""+car.getIndustryVehicleName());
	  System.out.println(""+car.getSpecialModelFlag());
	  
	  System.out.println("CarTaxDTO:");
	  CarTaxDTO tax = body.getCarTax();
	  System.out.println(""+tax.getTaxFlag());
	  System.out.println(""+tax.getBenchmarkTax());
	  System.out.println(""+tax.getTax());
	  System.out.println(""+tax.getTaxOverdue());
	  System.out.println(""+tax.getSurCharge());
	  System.out.println(""+tax.getStartTaxDate());
	  System.out.println(""+tax.getSumPayment());
	  System.out.println(""+tax.getTaxCertificateno1());
	  System.out.println(""+tax.getRevenue());
	  System.out.println(""+tax.getRefuseReason());
	  System.out.println("AnnualTaxDTO:");
	  AnnualTaxDTO atax = tax.getCurrentTaxDue();
	  System.out.println(""+atax.getTaxType());
	  System.out.println(""+atax.getSerialNo());
	  System.out.println(""+atax.getTaxLocationCode());
	  System.out.println(""+atax.getTaxStartDate());
	  System.out.println(""+atax.getTaxEndDate());
	  System.out.println(""+atax.getTaxUnitTypeCode());
	  System.out.println(""+atax.getUnitRate());
	  System.out.println(""+atax.getDeclareDate());
	  System.out.println(""+atax.getAnnualTaxAmount());
	  System.out.println(""+atax.getExceedDate());
	  System.out.println(""+atax.getExceedDaysCount());	   
	  
	  System.out.println("PrivyDTO:");
	  PrivyDTO[] privys = body.getPrivy();
	  for (PrivyDTO pri:privys) {
		  System.out.println(""+pri.getInsuredFlag());
		  System.out.println(""+pri.getInsuredCode());
		  System.out.println(""+pri.getContactName());
		  System.out.println(""+pri.getAcceptSMS());
		  System.out.println(""+pri.getInsuredName());
		  System.out.println(""+pri.getAliasName());
		  System.out.println(""+pri.getInsuredAddress());
		  System.out.println(""+pri.getPostCode());
		  System.out.println(""+pri.getInsuredNature());
		  System.out.println(""+pri.getAppendPrintName());
		  System.out.println(""+pri.getUnitType());
		  System.out.println(""+pri.getIdentifyType());
		  System.out.println(""+pri.getIdentifyNumber());
		  System.out.println(""+pri.getPhoneNumber());
		  System.out.println(""+pri.getMobile());
		  System.out.println(""+pri.getSex());
		  System.out.println(""+pri.getDrivingLicenseNo());
		  System.out.println(""+pri.getDriverAge());
		  System.out.println(""+pri.getPeccancy());
		  System.out.println(""+pri.getAcceptLicenseDate());
		  System.out.println(""+pri.getMainDriverFlag());
		  System.out.println("------------------");
	  }
	  
	  System.out.println("KindDTO:");
	  KindDTO[] kinds = body.getKinds();
	  for (KindDTO kind:kinds){
		  System.out.println(""+kind.getKindCode());
		  System.out.println(""+kind.getKindName());
		  System.out.println(""+kind.getSerialNo());
		  System.out.println(""+kind.getQuantity());
		  System.out.println(""+kind.getUnitAmount());
		  System.out.println(""+kind.getAmount());
		  System.out.println(""+kind.getValue());
		  System.out.println(""+kind.getDeductibleRate());
		  System.out.println(""+kind.getRate());
		  System.out.println(""+kind.getDisCount());
		  System.out.println(""+kind.getAdjustRate());
		  System.out.println(""+kind.getBenchmarkPremium());
		  System.out.println(""+kind.getPremium());
		  System.out.println(""+kind.getKindFlag());
		  System.out.println(""+kind.getModeCode());
		  System.out.println("------------------");	  
	  }
	  
	  System.out.println("VehicleJingyouDTO:");
	  VehicleJingyouDTO veh = body.getVehicleJingyou();
	  System.out.println(""+veh.getVehicleCode());
	  System.out.println(""+veh.getVehicleName());
	  System.out.println(""+veh.getFactoryCode());
	  System.out.println(""+veh.getFactoryName());
	  System.out.println(""+veh.getBrandCode());
	  System.out.println(""+veh.getBrandName());
	  System.out.println(""+veh.getFamilyCode());
	  System.out.println(""+veh.getFamilyName());
	  System.out.println(""+veh.getVehicleClassCode());
	  System.out.println(""+veh.getVehicleClassName());
	  System.out.println(""+veh.getVehicleType());
	  System.out.println(""+veh.getDisplacement());
	  System.out.println(""+veh.getSeat());
	  System.out.println(""+veh.getTonnage());
	  System.out.println(""+veh.getGearboxType());
	  System.out.println(""+veh.getPrice());
	  System.out.println(""+veh.getPurchasePriceTax());
	  System.out.println(""+veh.getPurchasePrice());
	  System.out.println(""+veh.getHfCode());
	  System.out.println(""+veh.getHfName());
	  System.out.println(""+veh.getPricetype());
	  System.out.println(""+veh.getAntiTheft());
	  System.out.println(""+veh.getAirbagNum());
	  System.out.println(""+veh.getMarketDate());
	  System.out.println(""+veh.getRiskFlags());
	  System.out.println(""+veh.getStopFlag());
	  System.out.println(""+veh.getFullWeight());
	  System.out.println(""+veh.getRate());
	  System.out.println(""+veh.getSearchCode());
	  System.out.println(""+veh.getPower());
	  System.out.println(""+veh.getFitsRiskRate());
	  System.out.println(""+veh.getGroupFitsRate());
	  System.out.println(""+veh.getGroupRepairRate());
	  System.out.println(""+veh.getCarType());
	  System.out.println(""+veh.getBdRiskFlag1());
	  System.out.println(""+veh.getBdRiskFlag2());
	  System.out.println(""+veh.getBdRiskFlag3());
	  System.out.println(""+veh.getBdRiskFlag4());
	  System.out.println(""+veh.getRemark());
	  System.out.println(""+veh.getFlag());
	  
	  
	  System.out.println("OtherDTO:");
	  OtherDTO other = body.getOther();
	  if (null==other) System.out.println("null");
	  else {
		  System.out.println(""+other.getAgentCode());
		  System.out.println(""+other.getAgreementNum());
		  System.out.println(""+other.getArgueSolution());
		  System.out.println(""+other.getArbitBoardname());
	  }
	  
	  System.out.println("AgentDTO:");
	  AgentDTO agen = body.getAgent();
	  if (null==agen) System.out.println("null");
	  else {
		  System.out.println(""+agen.getCertificateNo());
		  System.out.println(""+agen.getAgencyCode());
		  System.out.println(""+agen.getAgencyName());
	  }
	}*/
	private PreciseQuoteRequestDTO getPreciseQuoteRequestDTO(String jycode,String serial_no,String quotationType) {
		PreciseQuoteRequestDTO preciseRequest = new PreciseQuoteRequestDTO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date1=new java.util.Date();		
		try {
			PremiumCar premium = new PremiumCar();
		premium.getPremiumCar(jycode, serial_no);
		String strStartDate = premium.getStartdate();// 起保日期
		String endDate = premium.getEndDate();//终保日期
		log.error("起保日期="+strStartDate);
		String strEnrollDate = premium.getEnrollDate();// 车辆登记日期
		log.error("车辆登记日期="+strEnrollDate);
		String importFlag = premium.getImportFlag();//车型种类
		if ("进口".equals(importFlag)) importFlag="A";
		else importFlag="B";
		preciseRequest.setOperateDate(sdf.format(date1));//交易日期
		preciseRequest.setStartDate(strStartDate);//起保日期
		preciseRequest.setEndDate(endDate);//终保日期
		preciseRequest.setQuotationType(quotationType);//报价类型
		preciseRequest.setIsRenewed("0");//是否续保
		preciseRequest.setLimitType("3");//底限折扣
			
		CarDTO car = getCarDTO(serial_no);
		car.setClauseType("01");//费改地区地区：01-示范条款（综合型）
		car.setCarinsureDrelation(getCarinsureDrelation(jycode));//被保险人与车辆关系
		car.setImportFlag(importFlag);
		car.setUserYear(getuserYear(strStartDate,strEnrollDate));//使用年限
		log.error("使用年限="+getuserYear(strStartDate,strEnrollDate));
		car.setActualValue(Double.parseDouble(calCarActualValue(jycode, serial_no)));//实际价值
		preciseRequest.setCars(car);	
		
		PrivyDTO[] privys = getPrivyDTO(jycode);
		preciseRequest.setPrivy(privys);
		
		KindDTO[] kinds = getKindDTO(jycode);
		preciseRequest.setKinds(kinds);
		
		String modecode = car.getModelCode();
		VehicleJingyouDTO veh = getVehicleJingyouDTO(jycode,modecode);
		preciseRequest.setVehicleJingyou(veh);
		
		 if ("1".equals(quotationType)||"3".equals(quotationType)) {
			CarTaxDTO cartax = getCartaxDTO(jycode);
			preciseRequest.setCarTax(cartax);
		 }
		 OtherDTO other = new OtherDTO();
		 other.setArgueSolution("1");
		 preciseRequest.setOther(other);

		}catch (Cls_exception e){
			log.error("Ccic_CarFGPreciseQuoteIn:"+e.toString());
			preciseRequest = null;
			e.printStackTrace();
		} catch (Exception e) {
			log.error("Ccic_CarFGPreciseQuoteIn:"+e.toString());
			preciseRequest = null;
			e.printStackTrace();
		}
		return preciseRequest;
	}
	private CarTaxDTO getCartaxDTO(String jycode) throws Cls_exception{
		CarTaxDTO cartax = new CarTaxDTO();
		AnnualTaxDTO  tax = new AnnualTaxDTO();
		ExtendInfoDTO extinfo = new ExtendInfoDTO();
		
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select * from kcs_ccic_cartaxdto where MESSAGEID='");
		sql.append(jycode);
		sql.append("'");
		log.error(sql.toString());
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());		
			rs = pstmt.executeQuery();
			while (rs.next()) {
				log.error("taxflag="+rs.getString("taxflag")+"/"+rs.getString("taxStartDate"));
                cartax.setTaxFlag(rs.getString("taxflag"));

                tax.setTaxStartDate(rs.getString("taxStartDate"));
                extinfo.setKey("lastTaxDate");
                extinfo.setValue(rs.getString("lastTaxDate"));
			}
		} catch(SQLRecoverableException e){
			log.error("Ccic_CarFGPreciseQuoteIn:"+e.toString());
			e.printStackTrace();
		} catch (SQLException e) {
			log.error("Ccic_CarFGPreciseQuoteIn:"+e.toString());
			e.printStackTrace();			
		} catch (Exception e) {
			log.error("Ccic_CarFGPreciseQuoteIn:"+e.toString());
			throw new Cls_exception("Ccic_CarFGPreciseQuoteIn.getCartaxDTO() "
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
				throw new Cls_exception("Ccic_CarFGPreciseQuoteIn.getCartaxDTO()"
						+ e.toString());
			}

		}
		ExtendInfoDTO[] extendInfo = {extinfo};
		cartax.setCurrentTaxDue(tax);
		cartax.setExtendInfo(extendInfo);
		return cartax;   	
		
	}
	private CarDTO getCarDTO(String serial_no) throws Cls_exception{
		CarDTO car = new CarDTO();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select t.carKindCode,t.engineno,t.frameno,t.vinno,t.tonnage,t.enrolldate,t.usenaturecode,t.ecdemicvehicle,");
		sql.append("t.newvehicle,t.nolicenseflag,t.chgownerflag,t.vehicletype,t.transferdate,t.loanvehicleflag,t.specialcarflag,");
		sql.append("t.fueltype,t.fleetflag,a.brandName,a.familyName,t.licenseNo,t.licenseType,");
		sql.append("a.modelcode,a.modelname,a.seat,a.fullweight,a.displacement,a.power,a.price,");
		sql.append("a.industryModelCode,a.industryVehicleCode,a.industryVehicleName");
		sql.append(" from kcs_ccic_cardto t,kcs_ccic_carmodeldto a ");
		sql.append(" where t.serial_no="+serial_no+" and a.messageid=t.messageid and t.modelcode=a.modelcode");		
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
               car.setCarKindCode(rs.getString("carKindCode"));
               car.setEngineNo(rs.getString("engineno"));
               car.setFrameNo(rs.getString("frameno"));
               car.setVinNo(rs.getString("vinno"));
               car.setTonCount(rs.getDouble("tonnage"));
               car.setEnrollDate(rs.getString("enrolldate"));
               car.setUseNatureCode(rs.getString("usenaturecode"));
               car.setEcdemicVehicle(rs.getString("ecdemicvehicle"));
               car.setNewVehicle(rs.getString("newvehicle"));
               car.setNoLicenseFlag(rs.getString("nolicenseflag"));
               car.setChgOwnerFlag(rs.getString("chgownerflag"));
               if ("1".equals(rs.getString("chgownerflag")))
            	   car.setTransferDate(rs.getString("transferdate"));
               car.setVehicleCategory(rs.getString("vehicletype"));
               car.setLoanVehicleFlag(rs.getString("loanvehicleflag"));
               car.setSpecialCarFlag(rs.getString("specialcarflag"));
               car.setFuelType(rs.getString("fueltype"));
               car.setFleetFlag(rs.getString("fleetflag"));
               car.setCarTypeAlias(rs.getString("brandName")+rs.getString("familyName"));
               if (!rs.getString("licenseNo").contains("新车")) {
                   car.setLicenseNo(rs.getString("licenseNo"));
                   car.setLicenseType(rs.getString("licenseType"));
               }
               car.setModelCode(rs.getString("modelcode"));
               car.setModelName(rs.getString("modelname"));
               car.setSeatCount(rs.getInt("seat"));
               car.setNet(rs.getDouble("fullweight"));
               car.setExhaustScale(rs.getDouble("displacement"));
               car.setPowerScale(rs.getDouble("power"));
               car.setPurchasePrice(rs.getDouble("price"));
               car.setIndustryModelCode(rs.getString("industryModelCode"));
               car.setIndustryVehicleCode(rs.getString("industryVehicleCode"));
               car.setIndustryVehicleName(rs.getString("industryVehicleName"));
               car.setCarRegiste("0");
               car.setSpecialModelFlag("0");
               
			}
		} catch(SQLRecoverableException e){
			log.error("Ccic_CarFGPreciseQuoteIn.getCarDTO()"+e.toString());
			e.printStackTrace();
		} catch (SQLException e) {
			log.error("Ccic_CarFGPreciseQuoteIn.getCarDTO()"+e.toString());
			e.printStackTrace();
		} catch (Exception e) {
			log.error("Ccic_CarFGPreciseQuoteIn.getCarDTO()"+e.toString());
			throw new Cls_exception("Ccic_CarFGPreciseQuoteIn.getCarDTO() "
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
				throw new Cls_exception("Ccic_CarFGPreciseQuoteIn.getCarDTO()"
						+ e.toString());
			}

		}

		return car;   		
	}
	private String getCarinsureDrelation(String jycode) throws  Cls_exception {
		String str="";
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select carinsureDrelation from KCS_CCIC_PRIVYDTO where MESSAGEID='");
		sql.append(jycode);
		sql.append("' and insuredFlag='0100000'");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());		
			rs = pstmt.executeQuery();
			while (rs.next()) {
                str = rs.getString("carinsureDrelation");
			}
		} catch(SQLRecoverableException e){
			log.error("Ccic_CarFGPreciseQuoteIn.getCarinsureDrelation() "+e.toString());
			e.printStackTrace();
		} catch (SQLException e) {
			log.error("Ccic_CarFGPreciseQuoteIn.getCarinsureDrelation() "+e.toString());
			e.printStackTrace();			
		} catch (Exception e) {
			log.error("Ccic_CarFGPreciseQuoteIn.getCarinsureDrelation() "+e.toString());
			throw new Cls_exception("Ccic_CarFGPreciseQuoteIn.getCarinsureDrelation() "
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
				throw new Cls_exception("Ccic_CarFGPreciseQuoteIn.getCarinsureDrelation()"
						+ e.toString());
			}

		}
		return str;   				
	}
	private  PrivyDTO[] getPrivyDTO(String jycode) throws Cls_exception {
		ArrayList<PrivyDTO> rtnAL = new ArrayList<PrivyDTO>();
		boolean acceptSMS = false;
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		PrivyDTO[] privys = null;
		int size = 0;
		StringBuffer sql = new StringBuffer();
		sql.append("select * from KCS_CCIC_PRIVYDTO where MESSAGEID='");
		sql.append(jycode);
		sql.append("'");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());
		
			rs = pstmt.executeQuery();
			PrivyDTO privy;
			while (rs.next()) {
				privy = new PrivyDTO();
				privy.setInsuredFlag(rs.getString("insuredFlag"));
				privy.setInsuredName(rs.getString("insuredName"));
				privy.setAcceptSMS(acceptSMS);
				privy.setInsuredNature(rs.getString("insuredNature"));
				privy.setUnitType(rs.getString("unitType"));
				privy.setIdentifyType(rs.getString("identifyType"));
				privy.setIdentifyNumber(rs.getString("identifyNumber"));
				rtnAL.add(privy);
				privy = null;
			}
			if (null!=rtnAL)
			  size = rtnAL.size();
			if (size>0)
				privys  = (PrivyDTO[]) rtnAL.toArray(new PrivyDTO[size]);
		} catch(SQLRecoverableException e){
			log.error("Ccic_CarFGPreciseQuoteIn.getPrivyDTO() "+e.toString());
			e.printStackTrace();
		} catch (SQLException e) {
			log.error("Ccic_CarFGPreciseQuoteIn.getPrivyDTO() "+e.toString());
			e.printStackTrace();			
		} catch (Exception e) {
			log.error("Ccic_CarFGPreciseQuoteIn.getPrivyDTO() "+e.toString());
			throw new Cls_exception("Ccic_CarFGPreciseQuoteIn.getPrivyDTO() "
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
				throw new Cls_exception("Ccic_CarFGPreciseQuoteIn.getPrivyDTO()"
						+ e.toString());
			}

		}
		return privys ;   	
		
	}
	private KindDTO[] getKindDTO(String jycode) throws Cls_exception{
		ArrayList<KindDTO> rtnAL = new ArrayList<KindDTO>();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		KindDTO[] kinds = null;
		int size = 0;
		StringBuffer sql = new StringBuffer();
		sql.append("select * from kcs_ccic_kinddto where MESSAGEID='");
		sql.append(jycode);
		sql.append("'");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());
		
			rs = pstmt.executeQuery();
			KindDTO kind;
			while (rs.next()) {
				kind = new KindDTO();
                kind.setKindCode(rs.getString("kindCode"));
                kind.setKindName(rs.getString("kindName"));
                kind.setSerialNo(rs.getInt("serialno"));
                kind.setQuantity(rs.getInt("quantity"));
                kind.setUnitAmount(rs.getDouble("unitAmount"));
                kind.setAmount(rs.getDouble("amount"));
                kind.setModeCode(rs.getString("modeCode"));
                kind.setKindFlag(rs.getString("kindFlag"));
				rtnAL.add(kind);
				kind = null;
			}
			if (null!=rtnAL)
			  size = rtnAL.size();
			if (size>0)
				kinds = (KindDTO[]) rtnAL.toArray(new KindDTO[size]);
		} catch(SQLRecoverableException e){
			log.error("Ccic_CarFGPreciseQuoteIn.getKindDTO() "+e.toString());
			e.printStackTrace();
		} catch (SQLException e) {
			log.error("Ccic_CarFGPreciseQuoteIn.getKindDTO() "+e.toString());
			e.printStackTrace();			
		} catch (Exception e) {
			log.error("Ccic_CarFGPreciseQuoteIn.getKindDTO() "+e.toString());
			throw new Cls_exception("Ccic_CarFGPreciseQuoteIn.getKindDTO() "
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
				throw new Cls_exception("Ccic_CarFGPreciseQuoteIn.getKindDTO()"
						+ e.toString());
			}

		}
		return kinds;   				
	}
	private  VehicleJingyouDTO  getVehicleJingyouDTO(String jycode,String modecode) throws Cls_exception{
		VehicleJingyouDTO veh = new VehicleJingyouDTO();
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select t.*,t.displacement/1000 as dis from KCS_CCIC_CARMODELDTO t where MESSAGEID=? and modelCode=?");
		try {
			Cls_connect cn = new Cls_connect();
			conn = cn.connect().getConnection();
			pstmt = conn.prepareStatement(sql.toString());
		    pstmt.setString(1, jycode);
		    pstmt.setString(2, modecode);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				veh.setVehicleCode(rs.getString("vehicleCode"));
                veh.setVehicleName(rs.getString("vehicleName"));
                veh.setFactoryCode(rs.getString("factoryCode"));
                veh.setFactoryName(rs.getString("factoryName"));
                veh.setBrandCode(rs.getString("brandCode"));
                veh.setBrandName(rs.getString("brandName"));
                veh.setFamilyCode(rs.getString("familyCode"));
                veh.setFamilyName(rs.getString("familyName"));
                veh.setVehicleClassCode(rs.getString("vehicleClassCode"));
                veh.setVehicleClassName(rs.getString("vehicleClassName"));
                veh.setVehicleType(rs.getString("vehicleType"));
                veh.setDisplacement(rs.getString("dis"));
                veh.setSeat(rs.getString("seat"));
                veh.setTonnage(rs.getString("tonnage"));
                veh.setGearboxType(rs.getString("gearboxType"));
                veh.setPrice(rs.getString("price"));
                veh.setPricetype(rs.getString("pricetype"));
                veh.setPurchasePriceTax(rs.getString("purchasePriceTax"));
                veh.setPurchasePrice(rs.getString("purchasePrice"));
                veh.setHfCode(rs.getString("hfCode"));
                veh.setHfName(rs.getString("hfname"));
                veh.setAntiTheft(rs.getString("antiTheft"));
                veh.setAirbagNum(rs.getString("airbagNum"));
                veh.setMarketDate(rs.getString("marketDate"));
                veh.setRiskFlags(rs.getString("riskFlags"));
                veh.setStopFlag(rs.getString("stopFlag"));
                veh.setFullWeight(rs.getString("fullWeight"));
                veh.setRate(rs.getString("rate"));
                veh.setSearchCode(rs.getString("searchCode"));
                veh.setPower(rs.getString("power"));
			}
		} catch(SQLRecoverableException e){
			log.error(e.toString());
			e.printStackTrace();
		} catch (SQLException e) {
			log.error(e.toString());
			e.printStackTrace();
		} catch (Exception e) {
			log.error(e.toString());
			throw new Cls_exception("Ccic_CarFGPreciseQuoteIn.getVehicleJingyouDTO() "
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
				throw new Cls_exception("Ccic_CarFGPreciseQuoteIn.getVehicleJingyouDTO()"
						+ e.toString());
			}

		}

		return veh;   	
	}
	/*
	 * 计算车辆使用年限
	 */
	private int getuserYear(String strStartDate,String strEnrollDate) throws Exception {
		//log.error("使用年限:"+strStartDate+"/"+strEnrollDate);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date stardate = sdf.parse(strStartDate);
		Date enddate = sdf.parse(strEnrollDate);
		/*Calendar calendar = Calendar.getInstance(); 
        calendar.setTime(enddate);
        calendar.add(Calendar.DAY_OF_MONTH, +1);
        enddate = calendar.getTime();  
		int smonth =Integer.parseInt(DurationFormatUtils.formatPeriod(enddate.getTime(),
				stardate.getTime(), "M"));
		int syear = smonth/12;
		log.error(syear+"="+smonth+"/12");*/
		int smonth =Integer.parseInt(DurationFormatUtils.formatPeriod(enddate.getTime(),
				stardate.getTime(), "M"));
		int syear=0;
		if (smonth<11) 
			syear = 0;
		else if (smonth>=11&&smonth<24) 
			syear = 1;
		else {
			Calendar calendar = Calendar.getInstance(); 
	        calendar.setTime(stardate);
	        calendar.add(Calendar.DAY_OF_MONTH, +1);
	        stardate = calendar.getTime(); 
	        smonth =Integer.parseInt(DurationFormatUtils.formatPeriod(enddate.getTime(),
					stardate.getTime(), "M"));
	        syear = smonth/12;
		}
		log.error(syear+"="+smonth+"/12");
		return syear;
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
		log.error("月--"+iDepreciateMonths);
		dblSumDepreciationRate = iDepreciateMonths * dblDepreciationRate;// 总折旧率
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
}
