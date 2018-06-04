package com.eoxys.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class devController {

	@RequestMapping(value="hello", method = {RequestMethod.GET,RequestMethod.POST})
	public String hello() {
		
		
		return "hello devopps";
		
	}
}
