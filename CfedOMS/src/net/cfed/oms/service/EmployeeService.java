/**
 * 
 */
package net.cfed.oms.service;

import net.cfed.oms.model.SendMailModel;
import net.cfed.oms.serviceImpl.EmployeeServiceImpl;
import net.cfed.oms.utils.SendEmail;

/**
 * @author nijesh
 *
 */
public class EmployeeService implements EmployeeServiceImpl {

	@Override
	public String sendRegistration(SendMailModel sendMailModel) {
		// TODO Auto-generated method stub
		SendEmail sendEmail = new SendEmail();
		String result = sendEmail.sendRegistrationMail(sendMailModel);
		return result;
	}

}
