package com.bankingmanagement.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.LogManager;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bankingmanagement.entity.Bank;
import com.bankingmanagement.service.BankService;

@Controller
@RequestMapping("/banks")
public class BankController {
	
	@Autowired
	BankService bankService;
	
	
	@GetMapping
	public ModelAndView getAllBanks(Model m) {
		
		List<Bank> bankList= new ArrayList<Bank>();
		
		try {
			bankList = bankService.getAllBanks();
			m.addAttribute("bank",bankList);	
			
		} catch (Exception e) {
		}
		
		return new ModelAndView("bankDetails");
	}
	
	@GetMapping("/delete/{id}")
	public String deleteBank(@PathVariable("id") int id) {
		int result = 0;
		try {
			result = bankService.deleteBank(id);
		} catch (Exception e) {
		}
		return "redirect:/banks";
	}
	
	@GetMapping("/add")
	public ModelAndView addBank(Model model) {
		
		model.addAttribute("bank", new Bank());
		return new ModelAndView("saveBank");
	}

	@PostMapping("/save")
	public String saveBank(@ModelAttribute("bank") Bank bank) {
		try {
			bankService.saveBank(bank);

		} catch (Exception e) {
		}
		return "redirect:/banks";
	}
	
	@GetMapping("/editDetails/{id}")
	public String updateCourse(@PathVariable("id") int id,Model m) {
		
		Optional<Bank> bank=bankService.getBankById(id);
		m.addAttribute("bank", bank);
		return "updateBank";
	}
	
	@PostMapping("/editDetails/update")
	public String updateBank(@ModelAttribute("bank") Bank bank) {
		int result = 0;
		try {
			 bankService.saveBank(bank);
		} catch (Exception e) {
		}
		return "redirect:/banks";
}

	@GetMapping("/search")
	public ModelAndView search(@RequestParam String name, Model m) {
		Optional<Bank> result = bankService.getBankByName(name);
//		ModelAndView mav = new ModelAndView("search");
		//mav.addA("bank", result);
		List<Bank> bankList = new ArrayList<>();
		bankList.add(result.get());
		m.addAttribute("bank",bankList);	
		return new ModelAndView("bankDetails");		
	}	
}
