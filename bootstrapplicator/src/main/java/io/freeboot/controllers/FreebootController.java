package io.freeboot.controllers;

import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.freeboot.generators.ControllerTemplate;
import io.freeboot.generators.models.ControllerModel;

@Controller
public class FreebootController {

	@RequestMapping("/") 
	public String freeboot(Model model) {
		
		model.addAttribute("page", "generator");
		
		return "freeboot";
		
	}
	
	@RequestMapping("/generate/controller") 
	public String controller(@RequestParam String controllerName, Model model) {

		ControllerTemplate controllerTemplate = new ControllerTemplate();
		ControllerModel controllerModel = new ControllerModel(controllerName);
		model.addAttribute("generated", controllerTemplate.generate(controllerModel));
		model.addAttribute("page", "output");

		return "freeboot";
	}

}
