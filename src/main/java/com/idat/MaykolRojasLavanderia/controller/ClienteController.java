package com.idat.MaykolRojasLavanderia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MaykolRojasLavanderia.model.Cliente;
import com.idat.MaykolRojasLavanderia.service.ClienteService;


@Controller
@RequestMapping("/cliente/v1")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Cliente> listar(){
		return service.listarCliente();
	}

}
