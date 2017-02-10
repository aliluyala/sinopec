/**
 * 车牌
 */
package pkg_auto.autobj.pojo;

/**
 * @author Administrator
 *
 */
public class CarLicense {
	private String licenseTypeCode="";//车牌类型代码
	private String licenseTypeName="";//车牌类型
	public String getLicenseTypeCode() {
		return licenseTypeCode;
	}
	public String getLicenseTypeName() {
		return licenseTypeName;
	}
	public void setLicenseTypeCode(String licenseTypeCode) {
		this.licenseTypeCode = licenseTypeCode;
	}
	public void setLicenseTypeName(String licenseTypeName) {
		this.licenseTypeName = licenseTypeName;
	}
	
	
}
