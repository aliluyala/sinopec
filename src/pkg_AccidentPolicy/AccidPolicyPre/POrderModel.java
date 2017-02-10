package pkg_AccidentPolicy.AccidPolicyPre;

import org.apache.log4j.Logger;

import pkg_sinopec.Cls_exception;

public class POrderModel extends POrder {
	private Logger log = Logger.getLogger(POrderModel.class);
	private String str_mod = "";
	private int p_sfz = 0;
	private int p_jshz = 0;
	public int getP_sfz() {
		return p_sfz;
	}
	public void setP_sfz(int p_sfz) {
		this.p_sfz = p_sfz;
	}
	public int getP_jshz() {
		return p_jshz;
	}
	public void setP_jshz(int p_jshz) {
		this.p_jshz = p_jshz;
	}
	public String getStr_mod() {
		return str_mod;
	}
	public void setStr_mod(String str_mod) {
		this.str_mod = str_mod;
	}
	public boolean  getOrderMOdel(int serial_no) throws Cls_exception {
		boolean tag = initialize(serial_no); 
		int kdxh = this.getPolicy_no();
		APolicy apolicy = new APolicy();
		apolicy.initialize(kdxh);
		String mode = apolicy.getTb_mode();
		log.error(mode);
		setStr_mod( makeModStr(mode));
		setP_sfz(apolicy.getPicture_sfz());
		setP_jshz(apolicy.getPicture_jshz());
		
		return tag;
		
	}
	private String makeModStr(String mode){
		String str = "";
		if ("mode_aqtx".equals(mode)) 
			str= mode_aqtx();
		if ("mode_cxwy".equals(mode)||"mode_jxwy".equals(mode)||"mode_jzhzh".equals(mode))
		    str = mode_cxwy();
		if ("mode_jwy".equals(mode))
			str = mode_jwy();
		if ("mode_tqb".equals(mode))
			str = mode_tqb();
		if ("mode_wawj".equals(mode)||"mode_ytrq".equals(mode)||"mode_sd_addr".equals(mode))
			str = mode_wawj();
		if ("mode_xan".equals(mode))
			str = mode_xan();
		if ("mode_ytaq".equals(mode)||"mode_ytjch".equals(mode)||"mode_sd_simple".equals(mode))
			str = mode_ytjch();
		if ("mode_ytpan".equals(mode)||"mode_sd_zhiye".equals(mode))
			str = mode_ytpan();
		if ("mode_sd_children".equals(mode))
			str = mode_sd_children();
		if ("mode_sd_jibing".equals(mode))
			str = mode_sd_jb();
		if ("mode_ly_elu".equals(mode))
			str = mode_ly_elu();
		return str;
	}
	private String mode_ly_elu() {
		StringBuffer strb = new StringBuffer();
		strb.append("<tr><td>被保人姓名(同投保人):</td> <td>");
		strb.append(this.getInsured_name());
		strb.append("</td><td>联系手机号:</td><td>");
		strb.append(this.getInsured_tel());
		strb.append("</td><td>被保人身份证号:</td><td>");
		strb.append(this.getInsured_idnum());
		strb.append("</td></tr><tr><td>出行目的地:</td><td colspan=\"5\" align=\"left\">");
		strb.append(this.getTbr_addr());
		strb.append(" </td></tr><tr><td>车牌号码:</td><td>	");
		strb.append(this.getInsured_name2());
		strb.append("</td><td>车险到期日:</td><td>");
		strb.append(this.getInsured_school());
		strb.append("</td><td>交通意外险生效日:</td><td>");
		strb.append(this.getVin());
		strb.append("</td></tr><tr><td>地址:</td><td colspan=\"5\" align=\"left\">");
		strb.append(this.getInsured_job());
		strb.append(" </td></tr>");
		return strb.toString();
	}
	private String mode_sd_jb() {
		StringBuffer strb = new StringBuffer();
		strb.append("<tr><td>被保险人姓名:</td><td>");
		strb.append(this.getInsured_name());
		strb.append("</td><td>联系手机:</td><td>");
		strb.append(this.getInsured_tel());
		strb.append("</td><td>被保险人身份证件类型:</td><td>");
		strb.append(this.getInsured_id());
		strb.append("</td></tr><tr><td>被保险人证件号码:</td><td>");
		strb.append(this.getInsured_idnum());
		strb.append("</td><td>被保险人健康状态告知:</td><td colspan=\"3\">");
		strb.append(this.getInsured_job());
		strb.append("</td></tr>");
		return strb.toString();		
	}
	private String mode_sd_children() {
		StringBuffer strb = new StringBuffer();
		strb.append("<tr><td>投保人姓名:</td> <td>");
		strb.append(this.getTbr_name());
		strb.append("</td><td>联系手机号:</td><td>");
		strb.append(this.getTbr_tel());
		strb.append("</td><td>投保人身份证号:</td><td>");
		strb.append(this.getTbr_sfz());
		strb.append("</td></tr><tr><td>被保险人姓名:</td><td>");
		strb.append(this.getInsured_name());
		strb.append("</td><td>被保险人证件号码:</td><td>");
		strb.append(this.getInsured_idnum());
		strb.append("</td><td></td><td>");
		strb.append("</td></tr>");
		return strb.toString();
	}
	private String mode_ytpan() {
		StringBuffer strb = new StringBuffer();
		strb.append("<tr><td>被保险人姓名:</td><td>");
		strb.append(this.getInsured_name());
		strb.append("</td><td>联系手机:</td><td>");
		strb.append(this.getInsured_tel());
		strb.append("</td><td></td><td></td></tr><tr><td>被保险人身份证件类型:</td><td>");
		strb.append(this.getInsured_id());
		strb.append("</td><td>被保险人证件号码:</td><td>");
		strb.append(this.getInsured_idnum());
		strb.append("</td><td>被保险人职业:</td><td>");
		strb.append(this.getInsured_job());
		strb.append("</td></tr>");
		return strb.toString();
	}
	private String mode_ytjch() {
		StringBuffer strb = new StringBuffer();
		strb.append("<tr><td>被保险人姓名:</td><td>");
		strb.append(this.getInsured_name());
		strb.append("</td><td>联系手机:</td><td>");
		strb.append(this.getInsured_tel());
		strb.append("</td></tr><tr><td>被保险人身份证件类型:</td><td>");
		strb.append(this.getInsured_id());
		strb.append("</td><td>被保险人证件号码:</td><td>");
		strb.append(this.getInsured_idnum());
		strb.append("</td></tr>");
		return strb.toString();
	}
	private String mode_xan() {
		StringBuffer strb = new StringBuffer();
		strb.append("<tr><td>投保人姓名:</td> <td>");
		strb.append(this.getTbr_name());
		strb.append("</td><td>联系手机号:</td><td>");
		strb.append(this.getTbr_tel());
		strb.append("</td><td>投保人身份证号:</td><td>");
		strb.append(this.getTbr_sfz());
		strb.append("</td></tr><tr><td>被保险人姓名:</td><td>");
		strb.append(this.getInsured_name());
		strb.append("</td><td>联系手机:</td><td>");
		strb.append(this.getInsured_tel());
		strb.append("</td><td>与投保人关系:</td><td>");
		strb.append(this.getRelation());
		strb.append("</td></tr><tr><td>被保险人身份证件类型:</td><td>");
		strb.append(this.getInsured_id());
		strb.append("</td><td>被保险人证件号码:</td><td>");
		strb.append(this.getInsured_idnum());
		strb.append("</td><td>被保险人职业:</td><td>");
		strb.append(this.getInsured_job());
		strb.append("</td></tr>");
		return strb.toString();
	}
	private String mode_wawj() {
		StringBuffer strb = new StringBuffer();
		strb.append("<tr><td>被保险人姓名:</td><td>");
		strb.append(this.getInsured_name());
		strb.append("</td><td>联系手机:</td><td>");
		strb.append(this.getInsured_tel());
		strb.append("</td><td></td><td></td></tr><tr><td>被保险人身份证件类型:</td><td> ");
		strb.append(this.getInsured_id());
		strb.append("</td><td>被保险人证件号码:</td><td>");
		strb.append(this.getInsured_idnum());
		strb.append("</td><td></td><td></td></tr><tr><td>投保人家庭详细地址(门牌号):</td><td colspan=\"5\">");
		strb.append(this.getTbr_addr());
		strb.append("</td></tr>");
		return strb.toString();
	}
	private String mode_tqb() {
		StringBuffer strb = new StringBuffer();
		strb.append("<tr><td>投保人姓名(同被保险人):</td> <td>");
		strb.append(this.getTbr_name());
		strb.append("</td><td>联系手机号:</td><td>");
		strb.append(this.getTbr_tel());
		strb.append("</td><td>投保人身份证号:</td><td>");
		strb.append(this.getTbr_sfz());
		strb.append("</td></tr><tr><td>投保人家庭详细地址(门牌号):</td><td colspan=\"5\" align=\"left\">");
		strb.append(this.getTbr_addr());
		strb.append(" </td></tr><tr><td>被监护人姓名(儿童):</td><td>	");
		strb.append(this.getInsured_name());
		strb.append("</td><td>学校及班级:</td><td>");
		strb.append(this.getInsured_school());
		strb.append("</td><td>被监护人身份证号:</td><td>");
		strb.append(this.getInsured_idnum());
		strb.append("</td></tr>");
		return strb.toString();
	}
	private String mode_jwy() {
		StringBuffer strb = new StringBuffer();
		strb.append("<tr><td>投保人姓名:</td><td>");
		strb.append(this.getTbr_name());
		strb.append("</td><td>联系手机号:</td><td>");
		strb.append(this.getTbr_tel());
		strb.append("</td><td>投保人身份证号:</td><td>");
		strb.append(this.getTbr_sfz());
		strb.append("</td></tr><tr><td>投保人家庭详细地址(门牌号):</td><td colspan=\"3\" align=\"left\">");
		strb.append(this.getTbr_addr());
		strb.append("</td><td></td><td></td></tr><tr><td>被保险人一姓名:</td><td>");
		strb.append(this.getInsured_name());
		strb.append("</td><td>证件类型:</td><td>");
		strb.append(this.getInsured_id());
		strb.append("</td><td>证件号码:</td><td>");
		strb.append(this.getInsured_idnum());
		strb.append("</td></tr><tr><td>被保险人二姓名:</td><td>");
		strb.append(this.getInsured_name2());
		strb.append("</td><td>证件类型:</td><td>");
		strb.append(this.getInsured_id2());
		strb.append("</td><td>证件号码:</td><td>");
		strb.append(this.getInsured_idnum2());
		strb.append("</td></tr><tr><td>被保险人三姓名:</td><td>");
		strb.append(this.getInsured_name3());
		strb.append("</td><td>证件类型:</td><td>");
		strb.append(this.getInsured_id3());
		strb.append("</td><td>证件号码:</td> <td>");
		strb.append(this.getInsured_idnum3());
		strb.append("</td></tr><tr><td>被保险人四姓名:</td><td>");
		strb.append(this.getInsured_name4());
		strb.append("</td><td>证件类型:</td><td>");
		strb.append(this.getInsured_id4());
		strb.append("</td><td>证件号码:</td> <td>");
		strb.append(this.getInsured_idnum4());
		strb.append("</td></tr><tr><td>被保险人五姓名:</td><td>");
		strb.append(this.getInsured_name5());
		strb.append("</td><td>证件类型:</td><td>");
		strb.append(this.getInsured_id5());
		strb.append("</td><td>证件号码:</td> <td>");
		strb.append(this.getInsured_idnum5());
		strb.append("</td></tr>");
		return strb.toString();
	}
	private String mode_cxwy() {
		StringBuffer strb = new StringBuffer();
		strb.append("<tr><td>投保人姓名:</td> <td>");
		strb.append(this.getTbr_name());
		strb.append("</td><td>联系手机号:</td><td>");
		strb.append(this.getTbr_tel());
		strb.append("</td><td>投保人身份证号:</td><td>");
		strb.append(this.getTbr_sfz());
		strb.append("</td></tr><tr><td>投保人家庭详细地址(门牌号):</td><td colspan=\"5\" align=\"left\">");
		strb.append(this.getTbr_addr());
		strb.append(" </td></tr><tr><td>被保险人姓名:</td><td>	");
		strb.append(this.getInsured_name());
		strb.append("</td><td>联系手机:</td><td>");
		strb.append(this.getInsured_tel());
		strb.append("</td><td>与投保人关系:</td><td>");
		strb.append(this.getRelation());
		strb.append("</td></tr><tr><td>被保险人身份证件类型:</td><td>");
		strb.append(this.getInsured_id());
		strb.append("</td><td>被保险人证件号码:</td><td>");
		strb.append(this.getInsured_idnum());
		strb.append("</td><td></td><td></td></tr>");
		return strb.toString();
	}
	private String mode_aqtx() {
		StringBuffer strb = new StringBuffer();
		strb.append("<tr><td>投保人姓名:</td><td>");
		strb.append(this.getTbr_name());
		strb.append("</td><td>联系手机号:</td><td>");
		strb.append(this.getTbr_tel());
		strb.append("</td><td>投保人身份证号:</td><td>");
		strb.append(this.getTbr_sfz());
		strb.append("</td></tr><tr><td>投保人家庭详细地址(门牌号):</td><td colspan=\"5\">");
		strb.append(this.getTbr_addr());
		strb.append(" </td></tr><tr><td>被保险人姓名:</td><td>	");
		strb.append(this.getInsured_name());
		strb.append("</td><td>联系手机:</td><td>");
		strb.append(this.getInsured_tel());
		strb.append("</td><td>与投保人关系:</td><td>");
		strb.append(this.getRelation());
		strb.append("</td></tr><tr><td>被保险人身份证件类型:</td<td>>");
		strb.append(this.getInsured_id());
		strb.append("</td><td>被保险人证件号码:</td><td>");
		strb.append(this.getInsured_idnum());
		strb.append("</td><td>被保险非机动车车架号:</td><td>");
		strb.append(this.getVin());
		strb.append("</td></tr>");
		return strb.toString();
	}

}
