package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MavenPraController {

	@RequestMapping(path = "/mavenpra", method = RequestMethod.GET)
	public String hello(Model model) {

		model.addAttribute("pramessage", "toketa!");
		return "mavenpra";
	}
}