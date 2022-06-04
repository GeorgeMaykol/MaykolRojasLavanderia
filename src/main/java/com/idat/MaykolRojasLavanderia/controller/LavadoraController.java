package com.idat.MaykolRojasLavanderia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MaykolRojasLavanderia.model.Lavadora;
import com.idat.MaykolRojasLavanderia.service.LavadoraService;

@Controller
@RequestMapping("/lavadora/v1")
public class LavadoraController {
	
	@Autowired
	private LavadoraService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Lavadora> listar(){
		return service.listarLavadora();
	}

}
