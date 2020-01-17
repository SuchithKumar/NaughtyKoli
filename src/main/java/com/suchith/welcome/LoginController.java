package com.suchith.welcome;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.suchith.entities.Customer;

@Controller
public class LoginController {

	@Autowired
	CustomerRepo customerRepo;
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String validateLogin(@RequestParam Integer custId,@RequestParam String password) {
		
		 Optional<Customer> customer = customerRepo.findById(custId);
		
		if(customer.isPresent() && customer.get().getPassword().equals(password)) {
			return "contact";
		}else {
			return "index";
		}
	}
	
}
