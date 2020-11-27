package com.masterips.ProjetJEE.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Accueil {
	@GetMapping("/accueil")
	public String index (){
		return "index";
	}

}
