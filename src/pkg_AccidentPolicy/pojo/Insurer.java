/**
 * 
 */
package pkg_AccidentPolicy.pojo;

/**
 * @author Administrator
 *
 */
public class Insurer {
	private final static String yangguang="";//���Ᵽ��  1
	private final static String renbao="";//�˱��� 2
	private final static String zhonghualianhe = "�����绰��95585��";//�л����� 3
	private final static String yingda = "";//Ӣ��  4
	private final static String bohai = "";//��������  5
	private final static String taishan = "";//̩ɽ  6
	private final static String dadi = "�����绰:95590";//���  7
	private final static String pingan = "�����绰��95511 ";//ƽ������  8
	private final static String anshengtianping = "";//��ʢ��ƽ 9
	private final static String zijin = "";//�Ͻ���  10
	private final static String changan = "";//�������� 11
	private final static String yatai = "�����绰��95506";//��̫���� 17 ԭ��
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
