/**
 * 
 */
package pkg_AccidentPolicy.pojo;

import java.util.List;

/**
 * @author Administrator
 * 卡单产品信息表
 */
public class AccidentPolicyKind extends AccidentPolicy {
	private int serial_no=0;
	private int kind_id = 0;
	private int yw_type=0;
	private String name = "";
	private int policy_no = 0;
	private String kind = "";
	private Double price = 0.0;
	private int maxlimite = 0;
	private String picture_id = "";
	private int mark = 0;
	private String s_maxlimite = "";
	private int stocks = 0;
	private int sales = 0;
	private Double suminsured = 0.0;
	private List<TempObj> xm_list;
	public List<TempObj> getXm_list() {
		return xm_list;
	}
	public void setXm_list(List<TempObj> xm_list) {
		this.xm_list = xm_list;
	}
	public Double getSuminsured() {
		return suminsured;
	}
	public void setSuminsured(Double suminsured) {
		this.suminsured = suminsured;
	}
	public int getStocks() {
		return stocks;
	}
	public int getSales() {
		return sales;
	}
	public void setStocks(int stocks) {
		this.stocks = stocks;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public String getS_maxlimite() {
		return s_maxlimite;
	}
	public void setS_maxlimite(String s_maxlimite) {
		this.s_maxlimite = s_maxlimite;
	}
	
	public int getKind_id() {
		return kind_id;
	}
	public void setKind_id(int kind_id) {
		this.kind_id = kind_id;
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
	public int getPolicy_no() {
		return policy_no;
	}
	public String getKind() {
		return kind;
	}
	public Double getPrice() {
		return price;
	}
	public int getMaxlimite() {
		return maxlimite;
	}
	public String getPicture_id() {
		return picture_id;
	}
	public int getMark() {
		return mark;
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
	public void setPolicy_no(int policy_no) {
		this.policy_no = policy_no;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setMaxlimite(int maxlimite) {
		this.maxlimite = maxlimite;
	}
	public void setPicture_id(String picture_id) {
		this.picture_id = picture_id;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
}
