package com.example.demo.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Ingredient;
import com.example.demo.model.Note;
import com.example.demo.model.Receipe;
import com.example.demo.service.ReceipeService;

@Controller
@RequestMapping("/receipe")
public class ReceipeController {

	private ReceipeService receipeService;

	@Autowired
	public ReceipeController(ReceipeService receipeService) {
		super();
		this.receipeService = receipeService;
	}

	public ReceipeController() {
		super();
	}
	
	@RequestMapping("/list")
	public String listReceipe(Model theModel) {
		List<Receipe> rlist=receipeService.findAllReceipe();
		theModel.addAttribute("rrlist", rlist);
		return "home-form";
	}
	@PostMapping("/showreceipies")
	public String listDetails(@RequestParam("id") long id,   Model theModel) {
		Receipe re= receipeService.getRecipeById(id);
		Set<Ingredient>  i=re.getIngredient();
		
		Note n=re.getNote();
		theModel.addAttribute("rlist", re);
		theModel.addAttribute("ilist", i);
		theModel.addAttribute("nlist", n);
		return "list-form";
	}
	
}
