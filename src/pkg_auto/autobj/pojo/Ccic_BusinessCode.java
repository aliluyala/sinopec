/**
 * 
 */
package pkg_auto.autobj.pojo;

/**
 * @author Administrator
 *关系人种类标记代码
 */
public class Ccic_BusinessCode {
	private final static String PRIVY_CarOwner="0010000";
	private final static String PRIVY_Insured="0100000";
	public static String getPrivyCarowner() {
		return PRIVY_CarOwner;
	}
	public static String getPrivyInsured() {
		return PRIVY_Insured;
	}
}
