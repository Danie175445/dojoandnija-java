package com.daniel.dojoandninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.daniel.dojoandninja.model.Dojo;

@Controller
public class DojoController {
	@GetMapping("/home")
	public String home(@ModelAttribute("dojo")Dojo dojo) {
		return "home.jsp";
	}
		
	@PostMapping("/dojo")
	public String createDojo(@ModelAttribute("dojo")Dojo dojo) {
			return "redirect: /dojo";
	}
}
