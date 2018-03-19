package com.ps.springmvc.psbankapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping(value= {"","/index","index*"})
	public String index(){
		return "testRequestMapping";
	}
	
	//requestmapping in depth with help of @Requestparam
	
	/*@RequestMapping("/name")
	public String methodWithParam(@RequestParam String userName,Model model){
		System.out.println("requested by"+userName);
		model.addAttribute("userName",userName);
		return "testRequestMapping";
	}*/
	
	//make optional to enter user name and default value is provided
	
	@RequestMapping("/name")
	public String methodWithParam(@RequestParam(value="userName", required=false,defaultValue="manmeet")
	String userName,Model model){
		System.out.println("requested by"+userName);
		model.addAttribute("userName",userName);
		return "testRequestMapping";
	}
	
	//dynamic url
	@RequestMapping("/dynamic/{userName}")
	public String dynamicUrl(@PathVariable("userName")String userName){
		return "testRequestMapping";
	}
	
	//error page
	@RequestMapping("*")
	public String fallBackPage(){
		return "fileNotFound";
	}
}



