package com.suchith.welcome;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Transactional
public class WelcomeController {

	@Autowired
	CustomerRepo customerRepo;
	
	@RequestMapping(method = RequestMethod.GET,value = {"/","/index","/welcome"})
	public String getIndexPage() {
		
		return "index";
	}
	
}
