/**
 * 车型查询车型信息与页面交互转换json的类
 */
package pkg_auto.autobj.pojo;

/**
 * @author Administrator
 *
 */
public class CarMRJson {
      private String modelName="";
      private String modelCode="";
      private String marketYear="";
      private String derailleurType="";
      private String industryVehicleName="";
      private String industryModelCode="";
      private String replacementValue="";
	public String getIndustryModelCode() {
		return industryModelCode;
	}
	public void setIndustryModelCode(String industryModelCode) {
		this.industryModelCode = industryModelCode;
	}
	public String getReplacementValue() {
		return replacementValue;
	}
	public void setReplacementValue(String replacementValue) {
		this.replacementValue = replacementValue;
	}
	public String getIndustryVehicleName() {
		return industryVehicleName;
	}
	public void setIndustryVehicleName(String industryVehicleName) {
		this.industryVehicleName = industryVehicleName;
	}
	public String getModelName() {
		return modelName;
	}
	public String getModelCode() {
		return modelCode;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	public String getMarketYear() {
		return marketYear;
	}
	public String getDerailleurType() {
		return derailleurType;
	}
	public void setMarketYear(String marketYear) {
		this.marketYear = marketYear;
	}
	public void setDerailleurType(String derailleurType) {
		this.derailleurType = derailleurType;
	}
}
