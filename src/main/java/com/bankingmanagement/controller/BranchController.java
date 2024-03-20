package com.bankingmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bankingmanagement.entity.Bank;
import com.bankingmanagement.entity.Branch;
import com.bankingmanagement.service.BranchService;

@Controller
@RequestMapping("/branches")
public class BranchController {
	
	@Autowired
	BranchService branchService;
	
	@GetMapping
	public ModelAndView getAllBranches(Model m) {
		
		List<Branch> branchList= new ArrayList<Branch>();
		
		try {
			branchList = branchService.getAllBranches();
			m.addAttribute("branch",branchList);	
			
		} catch (Exception e) {
		}
		
		return new ModelAndView("branchDetails");
	}

}
