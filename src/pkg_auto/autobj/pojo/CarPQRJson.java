/**
 * 精确报价信息与页面交互转换json的类
 */
package pkg_auto.autobj.pojo;

/**
 * @author Administrator
 *
 */
public class CarPQRJson {
	private boolean flag;
    private String jycode="";
    private String info="";
    private int num=0;
    private int serial_no=0;
    public boolean isFlag() {
		return flag;
	}
	public String getJycode() {
		return jycode;
	}
	public String getInfo() {
		return info;
	}
	public int getNum() {
		return num;
	}
	public int getSerial_no() {
		return serial_no;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public void setJycode(String jycode) {
		this.jycode = jycode;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setSerial_no(int serial_no) {
		this.serial_no = serial_no;
	}
	
}
