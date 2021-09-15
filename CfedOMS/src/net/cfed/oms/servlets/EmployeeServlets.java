package net.cfed.oms.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.cfed.oms.model.SendMailModel;
import net.cfed.oms.service.EmployeeService;
import net.cfed.oms.serviceImpl.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeServlets
 */
public class EmployeeServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(" testing ");
		SendMailModel sendMailModel = new SendMailModel();
		
		String emailId = request.getParameter("emailId");
		System.out.println(" Email Id : "+emailId);
		sendMailModel.setEmailId(emailId);
		
		EmployeeServiceImpl employeeServiceImpl = new EmployeeService();
		String message = employeeServiceImpl.sendRegistration(sendMailModel);
		
		System.out.println(" message : "+message);
	}

}
