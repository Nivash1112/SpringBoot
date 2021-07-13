package com.learn.jwtlearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JwtSimpleController {
	
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "<h1>Welcome</h1>";
	}
	
	@RequestMapping("/user")
	@ResponseBody
	public String user() {
		return "<h1>Welcome User</h1>";
	}
	
	@RequestMapping("/admin")
	@ResponseBody
	public String admin() {
		return "<h1>Welcome Admin</h1>";
	}

}
