package com.bankingmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bankingmanagement.entity.Customer;
import com.bankingmanagement.entity.Loan;
import com.bankingmanagement.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping
	public ModelAndView getAllCustomers(Model m) {
		
		List<Customer> custList= new ArrayList<Customer>();
		
		try {
			custList = customerService.getAllCustomers();
			m.addAttribute("customer",custList);	
		} catch (Exception e) {
		}
		
		return new ModelAndView("customerDetails");
	}
}
