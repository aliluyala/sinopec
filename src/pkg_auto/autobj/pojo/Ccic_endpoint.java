/**
 * 
 */
package pkg_auto.autobj.pojo;

/**
 * @author Administrator
 * ccic报文请求地址、报文头字段信息
 */
public class Ccic_endpoint {
	//private final static String host = "ywtest.ccic-net.com.cn:8912";
	//private final static String host = "10.154.13.104:8081";
	private final static String host = "10.154.13.83:6934";
	private final static String url_ccic_CarModelInfoInquiry="http://"+host+"/car/feigai/CarModelInfoInquiry";
	private final static String url_ccic_CarFGPreciseQuote="http://"+host+"/car/feigai/PreciseQuote";

	//private final static String url_ccic_CarModelInfoInquiry="https://ywtest.ccic-net.com.cn:8912/car/feigai/CarModelInfoInquiry";
	//private final static String url_ccic_CarFGPreciseQuote="https://ywtest.ccic-net.com.cn:8912/car/feigai/PreciseQuote";
	private final static String ccic_channelCode="GW0000033";
	private final static String ccic_channelName="";
	//private final static String ccic_channelComCode="23014002";
	//private final static String ccic_channelComCode="37010626";
	private final static String ccic_channelComCode="";	
	private final static String ccic_channelComName="";
	private final static String ccic_channelProductCode="DDK";//电销渠道
	private final static String ccic_operator="";
	private final static String ccic_trxCode="";
	private final static String ccic_regionCode="19";
	private final static String ccic_channelSeqNo="";
	private final static String ccic_makeChannel="";
	private final static String ccic_passWord="";



	public static String getUrlCcicCarfgprecisequote() {
		return url_ccic_CarFGPreciseQuote;
	}

	public static String getCcicChannelseqno() {
		return ccic_channelSeqNo;
	}

	public static String getCcicMakechannel() {
		return ccic_makeChannel;
	}

	public static String getCcicPassword() {
		return ccic_passWord;
	}

	public static String getCcicChannelcode() {
		return ccic_channelCode;
	}

	public static String getCcicChannelname() {
		return ccic_channelName;
	}

	public static String getCcicChannelcomcode() {
		return ccic_channelComCode;
	}

	public static String getCcicChannelcomname() {
		return ccic_channelComName;
	}

	public static String getCcicChannelproductcode() {
		return ccic_channelProductCode;
	}

	public static String getCcicOperator() {
		return ccic_operator;
	}

	public static String getCcicTrxcode() {
		return ccic_trxCode;
	}

	public static String getCcicRegioncode() {
		return ccic_regionCode;
	}

	public static String getUrlCcicCarmodelinfoinquiry() {
		return url_ccic_CarModelInfoInquiry;
	}

}
