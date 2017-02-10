/**
 * 
 */
package pkg_AccidentPolicy.pojo;

/**
 * @author Administrator
 * 保险公司卡单种类信息
 */
public class AccidentPolicy {
	private int serial_no=0;
	private int yw_type=0;
	private String name = "";
	private int picture_sfz = 0;
	private int picture_jshz = 0;
	private int picture_syr = 0;
	private String brief = "";
	private String tb_mode = "";
	private String rule_exp = "";
	private String tb_exp = "";
	private String salescity="";
		
	public String getSalescity() {
		return salescity;
	}
	public void setSalescity(String salescity) {
		this.salescity = salescity;
	}
	public String getTb_mode() {
		return tb_mode;
	}
	public void setTb_mode(String tb_mode) {
		this.tb_mode = tb_mode;
	}
	public int getSerial_no() {
		return serial_no;
	}
	public int getYw_type() {
		return yw_type;
	}
	public String getName() {
		return name;
	}
		public int getPicture_sfz() {
		return picture_sfz;
	}
	public int getPicture_jshz() {
		return picture_jshz;
	}
	public int getPicture_syr() {
		return picture_syr;
	}
	public String getBrief() {
		return brief;
	}
	public void setSerial_no(int serial_no) {
		this.serial_no = serial_no;
	}
	public void setYw_type(int yw_type) {
		this.yw_type = yw_type;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPicture_sfz(int picture_sfz) {
		this.picture_sfz = picture_sfz;
	}
	public void setPicture_jshz(int picture_jshz) {
		this.picture_jshz = picture_jshz;
	}
	public void setPicture_syr(int picture_syr) {
		this.picture_syr = picture_syr;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getRule_exp() {
		return rule_exp;
	}
	public String getTb_exp() {
		return tb_exp;
	}
	public void setRule_exp(String rule_exp) {
		this.rule_exp = rule_exp;
	}
	public void setTb_exp(String tb_exp) {
		this.tb_exp = tb_exp;
	}
}
