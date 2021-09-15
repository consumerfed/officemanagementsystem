package net.cfed.oms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld() {

		String message = "Welcome to Office Management System";
		System.out.println(message);
		return new ModelAndView("hello", "message", message);
	}
	
	@RequestMapping("/login")
	public ModelAndView loginPage() {

		String message = "";
		System.out.println(message);
		return new ModelAndView("login", "message", message);
	}
	
	@RequestMapping("/contact")
	public ModelAndView contactUsPage() {

		String message = "Welcome to Office Management System";
		System.out.println(message);
		return new ModelAndView("contactUs", "message", message);
	}
	
	@RequestMapping("/unitMap")
	public ModelAndView unitMapPage() {

		String message = "Welcome to Office Management System";
		System.out.println(message);
		return new ModelAndView("triveniMap", "message", message);
	}

}
