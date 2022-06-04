package com.idat.MaykolRojasLavanderia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MaykolRojasLavanderia.model.Cliente;
import com.idat.MaykolRojasLavanderia.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteRepository repository;

	@Override
	public void guardarCliente(Cliente c) {
		Cliente cliente = new Cliente();
		cliente.setNombreCliente(c.getNombreCliente());
		cliente.setApellidoCliente(c.getApellidoCliente());
		cliente.setNroCelular(c.getNroCelular());
		cliente.setDireccion(c.getDireccion());		
		repository.save(cliente);
	}

	@Override
	public void eliminarCliente(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public void editarCliente(Cliente c) {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(c.getIdCliente());
		cliente.setNombreCliente(c.getNombreCliente());
		cliente.setApellidoCliente(c.getApellidoCliente());
		cliente.setNroCelular(c.getNroCelular());
		cliente.setDireccion(c.getDireccion());
		repository.saveAndFlush(cliente);
		
	}

	@Override
	public List<Cliente> listarCliente() {
		return repository.findAll();
	}

	@Override
	public Cliente clienteById(Integer id) {
		return repository.findById(id).orElse(null);
	}

}
