/**
 * 
 */
package net.cfed.oms.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.cfed.oms.model.BranchModel;
import net.cfed.oms.service.BranchService;
import net.cfed.oms.serviceImpl.BranchServiceImpl;



/**
 * @author IT
 *
 */
@Controller		 
public class BranchController {
	
	@RequestMapping("/branchers")
	public ModelAndView branchList(HttpServletRequest request, HttpServletResponse response ) {
		System.out.println(" inside branchList ");
		BranchModel branch = new BranchModel();
		BranchServiceImpl branchServiceImpl = new BranchService();
		List<BranchModel> branchList = branchServiceImpl.getBranchList();
		String message = "Welcome to Office Management System";
		System.out.println(message);
		return new ModelAndView("hello", "message", message);
		//return null;
	}

}
