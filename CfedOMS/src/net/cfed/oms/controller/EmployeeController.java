/**
 * 
 */
package net.cfed.oms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.cfed.oms.model.SendMailModel;
import net.cfed.oms.service.EmployeeService;
import net.cfed.oms.serviceImpl.EmployeeServiceImpl;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



/**
 * @author nijesh
 *
 */
@Controller
public class EmployeeController {
	
	@RequestMapping("/team")
	public ModelAndView helloWorld() {

		String message = "Welcome admin";
		//System.out.println(message);
		return new ModelAndView("employees", "message", message);
	}
	
	@RequestMapping("/registration")
	public ModelAndView registraton(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(" testing ");
		SendMailModel sendMailModel = new SendMailModel();
		
		String emailId = request.getParameter("emailId");
		System.out.println(" Email Id : "+emailId);
		sendMailModel.setEmailId(emailId);
		
		EmployeeServiceImpl employeeServiceImpl = new EmployeeService();
		String message = employeeServiceImpl.sendRegistration(sendMailModel);
		
		System.out.println(" message : "+message);
		//System.out.println(message);
		return new ModelAndView("employees", "message", message);
	}

}
