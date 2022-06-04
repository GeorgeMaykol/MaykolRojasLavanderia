package com.idat.MaykolRojasLavanderia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MaykolRojasLavanderia.model.Ropa;
import com.idat.MaykolRojasLavanderia.service.RopaService;

@Controller
@RequestMapping("/ropa/v1")
public class RopaController {
	
	@Autowired
	private RopaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Ropa> listar(){
		return service.listarRopa();
	}


}
