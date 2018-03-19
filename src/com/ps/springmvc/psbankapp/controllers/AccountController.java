package com.ps.springmvc.psbankapp.controllers;


import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ps.springmvc.psbankapp.model.Account;

@Controller
public class AccountController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class,ste);
		}
	
	@RequestMapping("/")
	public String showHomepage() {
	return "index";
	}
	
	@RequestMapping("/new")
	public String newAccount(Model model){
		model.addAttribute("account", new Account());
		return "newAccount";
	}
	
	@RequestMapping("/showAccount")
	public String showAccount(){
		return "showAccount";
	}
	
	//Done with http
	/*@RequestMapping(value="/saveAccount", method=RequestMethod.POST)
	public String saveAccount(Model model,HttpServletRequest request){
		
		String acNo = request.getParameter("accountNo");
		String customerName = request.getParameter("accountHolderName");
		String balance = request.getParameter("balance");
		
		//Rather than passing value pass object 
		/*model.addAttribute("accountNo", acNo);
		model.addAttribute("accountHolderName",customerName);
		model.addAttribute("balance",balance);*
		
		Account account = new Account();
		account.setAccountNo(Integer.parseInt(acNo));
		account.setAccountHolderName(customerName);
		account.setBalance(Integer.parseInt(balance));
		
		model.addAttribute("account",account);
		return "showAccount";
	}*/
	
	//done with@Requestparam
	/*@RequestMapping(value="/saveAccount", method=RequestMethod.POST)
	public String saveAccount(Model model,
			@RequestParam("accountNo") String acNo,
			@RequestParam("accountHolderName") String customerName,
			@RequestParam("balance") String balance){
		
		Account account = new Account();
		account.setAccountNo(Integer.parseInt(acNo));
		account.setAccountHolderName(customerName);
		account.setBalance(Integer.parseInt(balance));
		
		
		
		model.addAttribute("account",account);
		return "showAccount";
	}*/
	
	//done with@Requestparam and using object
		/*@RequestMapping(value="/saveAccount", method=RequestMethod.POST)
		public String saveAccount(Model model,
				Account account){
		
			model.addAttribute("account",account);
			return "showAccount";
		}*/
	
	//for validation purpose
	@RequestMapping(value="/saveAccount",method=RequestMethod.POST)
	public String saveAccount(@Valid @ModelAttribute("account")Account account,BindingResult result){
	
		if (result.hasErrors())
			return "newAccount";
		else
			return "showAccount";
	}
	
	


}
