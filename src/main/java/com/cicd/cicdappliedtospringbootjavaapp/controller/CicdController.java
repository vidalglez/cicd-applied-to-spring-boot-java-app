package com.cicd.cicdappliedtospringbootjavaapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicdController {

	@GetMapping("/")
	public String home() {
        return "Gracias Totales Cerati!!!";
    }
}
