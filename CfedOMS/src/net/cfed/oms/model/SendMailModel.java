/**
 * SendRegistration, Send Business card, Send Triveni Details
 */
package net.cfed.oms.model;

/**
 * @author nijesh
 *
 */
public class SendMailModel {
	
	private String emailId = null;
	private String userName = null;
	private int employeeId = 0;
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	

}
