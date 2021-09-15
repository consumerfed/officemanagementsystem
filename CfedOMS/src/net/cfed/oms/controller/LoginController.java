/**
 * 
 */
package net.cfed.oms.controller;

/**
 * @author nijesh
 *
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/home")
	public ModelAndView loginAuthentication(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = null;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String message = " Your attempt to login failed ";
		if(username.equals("yourname@email.com")&&password.equals("password")){
			message = " Welcome Admin !";
			modelAndView = new ModelAndView("home", "message", message);
		}else{
			modelAndView = new ModelAndView("login", "message", message);
		}
		System.out.println(message);
		return modelAndView;
	}

}
