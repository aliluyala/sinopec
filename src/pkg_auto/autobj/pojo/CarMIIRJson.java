/**
 * 车型查询基础信息与页面交互转换json的类
 */
package pkg_auto.autobj.pojo;

/**
 * @author Administrator
 *
 */
public class CarMIIRJson {
	private boolean flag;
    private String jycode="";
    private String info="";
    private String carOwner="";
    private String frameNo="";
    private String engineNo="";
    private String enrollDate="";
    private int num=0;
    private int serial_no=0;
    private CarMRJson[] carMRJ;	
    public int getSerial_no() {
		return serial_no;
	}
	public void setSerial_no(int serial_no) {
		this.serial_no = serial_no;
	}
	
	public String getJycode() {
		return jycode;
	}
	public CarMRJson[] getCarMRJ() {
		return carMRJ;
	}
	public void setJycode(String jycode) {
		this.jycode = jycode;
	}
	public void setCarMRJ(CarMRJson[] carMRJ) {
		this.carMRJ = carMRJ;
	}
	public boolean isFlag() {
		return flag;
	}
	public String getInfo() {
		return info;
	}
	public String getCarOwner() {
		return carOwner;
	}
	public String getFrameNo() {
		return frameNo;
	}
	public String getEngineNo() {
		return engineNo;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public int getNum() {
		return num;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}
	public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
