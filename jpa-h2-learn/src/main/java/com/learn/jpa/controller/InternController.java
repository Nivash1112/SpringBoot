package com.learn.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.learn.jpa.model.Intern;
import com.learn.jpa.repo.InternRepository;

@Controller
public class InternController {
	@Autowired
	InternRepository repo;
	
	@RequestMapping("/home")
	public String home() {
		return "home.jsp";
		
	}
	
	@RequestMapping("/addData")
	public String addData(Intern intern) {
		repo.save(intern);
		return "home.jsp";
	}
	
	@RequestMapping("/findById")
	public ModelAndView findById(@RequestParam int internId) {
		ModelAndView mv=new ModelAndView("details.jsp");
		Intern intern=repo.findById(internId).orElse(null);
		mv.addObject("intern", intern);
		System.out.println(repo.findByInternName("tom"));
		System.out.println(repo.orderByName());
		return mv;
	}
	
	@RequestMapping("/deleteById")
	public String deleteById(@RequestParam int internId) {
		repo.deleteById(internId);
		return "delete.jsp";
	}
	
	
	@RequestMapping("/intern")
	@ResponseBody
	public String findAll() {
		return repo.findAll().toString();
	}
	
	@RequestMapping("/intern/{internId}")
	@ResponseBody
	public String findByAnnno(@PathVariable int internId) {
		return repo.findById(internId).toString();
	}

}
