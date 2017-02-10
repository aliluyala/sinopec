/**
 * 
 */
package pkg_AccidentPolicy.pojo;

/**
 * @author Administrator
 *
 */
public class Insurer {
	private final static String yangguang="";//阳光保险  1
	private final static String renbao="";//人保财 2
	private final static String zhonghualianhe = "报案电话：95585。";//中华联合 3
	private final static String yingda = "";//英大  4
	private final static String bohai = "";//渤海保险  5
	private final static String taishan = "";//泰山  6
	private final static String dadi = "报案电话:95590";//大地  7
	private final static String pingan = "报案电话：95511 ";//平安保险  8
	private final static String anshengtianping = "";//安盛天平 9
	private final static String zijin = "";//紫金保险  10
	private final static String changan = "";//长安保险 11
	private final static String yatai = "报案电话：95506";//亚太保险 17 原民安
	private final static String url = "/opt/weblogic/user_projects/domains/base_domain/servers/bmzww/sinopec/";
	//private final static String url = "C:/jboss-as-7.1.0.Final/standalone/deployments/sinopec.war/";
    public static String getUrl() {
		return url;
	}
	private String getBrief(int bxgs) {
	  String retr = "";
	  if (bxgs==1) retr = getYangguang();
	  if (bxgs==2) retr = getRenbao();
	  if (bxgs==3) retr = getZhonghualianhe();
	  if (bxgs==4) retr = getYingda();
	  if (bxgs==5) retr = getBohai();
	  if (bxgs==6) retr = getTaishan();
	  if (bxgs==7) retr = getDadi();
	  if (bxgs==8) retr = getPingan();
	  if (bxgs==9) retr = getAnshengtianping();
	  if (bxgs==10) retr = getZijin();
	  if (bxgs==11) retr = getChangan();
	  if (bxgs ==17) retr = getYatai();
	  return retr;
    }
    public static String getYatai() {
		return yatai;
	}
	public String brief(int bxgs){
    	return getBrief(bxgs);
    }
	public static String getYangguang() {
		return yangguang;
	}
	public static String getRenbao() {
		return renbao;
	}
	public static String getZhonghualianhe() {
		return zhonghualianhe;
	}
	public static String getYingda() {
		return yingda;
	}
	public static String getBohai() {
		return bohai;
	}
	public static String getTaishan() {
		return taishan;
	}
	public static String getDadi() {
		return dadi;
	}
	public static String getPingan() {
		return pingan;
	}
	public static String getAnshengtianping() {
		return anshengtianping;
	}
	public static String getZijin() {
		return zijin;
	}
	public static String getChangan() {
		return changan;
	}
}
