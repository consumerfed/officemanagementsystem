/**
 * 
 */
package net.cfed.oms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InboxController {
	
	@RequestMapping("/inbox")
	public ModelAndView helloWorld() {
		String message = "Welcome Shimjith !";
		return new ModelAndView("messages", "message", message);
	}

}
