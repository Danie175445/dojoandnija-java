package com.daniel.dojoandninja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.daniel.dojoandninja.model.Dojo;
import com.daniel.dojoandninja.model.Ninja;
import com.daniel.dojoandninja.service.DojoService;
import com.daniel.dojoandninja.service.NinjaService;

import jakarta.validation.Valid;

@Controller
public class MainController {
	@Autowired
	DojoService dojoService;
	
	@Autowired
	NinjaService ninjaService;
	
	@GetMapping("/dojo")
	public String home(@ModelAttribute("dojo")Dojo dojo) {
		return "home.jsp";
	}
		
	@PostMapping("/dojo")
	public String createDojo(@Valid@ModelAttribute("dojo")Dojo dojo,BindingResult result) {
		if(result.hasErrors()) {
			return "home.jsp";
		}
		else {
			dojoService.create(dojo);
			return "redirect:/home";
		}
	}
	
	@GetMapping("/ninja")
	public String createNinja(@ModelAttribute("ninja")Ninja ninja, Model model) {
		List<Dojo>dojos = dojoService.findall();
		model.addAttribute("dojos",dojos);
		return "newNinja.jsp";
	}
	
	@PostMapping("/ninja")
	public String create(@Valid@ModelAttribute("ninja")Ninja ninja,BindingResult result,Model model) {
		if(result.hasErrors()) {
			List<Dojo>dojos = dojoService.findall();
			model.addAttribute("dojos",dojos);
			return "newNinja.jsp";
		}
		else {
			ninjaService.create(ninja);
			return "redirect:/dojo/" + ninja.getDojo().getId();
		}
	} 
	
	@GetMapping("/dojo/{id}")
	public String dojoClass(Model model,@PathVariable("id")Long id) {
		Dojo dojo= dojoService.getOne(id);
		model.addAttribute(dojo);
		return "showDojoClass.jsp";
	}
}
