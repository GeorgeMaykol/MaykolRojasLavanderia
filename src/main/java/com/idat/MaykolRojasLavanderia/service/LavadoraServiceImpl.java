package com.idat.MaykolRojasLavanderia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MaykolRojasLavanderia.model.Lavadora;
import com.idat.MaykolRojasLavanderia.repository.LavadoraRepository;

@Service
public class LavadoraServiceImpl implements LavadoraService {
	
	@Autowired
	private LavadoraRepository repository;

	@Override
	public void guardarLavadora(Lavadora l) {
		Lavadora lavadora = new Lavadora();
		lavadora.setIdLavadora(l.getIdLavadora());
		lavadora.setDescripcion(l.getDescripcion());
		lavadora.setMarca(l.getMarca());
		lavadora.setVoltaje(l.getVoltaje());
		repository.save(lavadora);
		
	}

	@Override
	public void eliminarLavadora(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public void editarLavadora(Lavadora l) {
		Lavadora lavadora = new Lavadora();
		lavadora.setIdLavadora(l.getIdLavadora());
		lavadora.setDescripcion(l.getDescripcion());
		lavadora.setMarca(l.getMarca());
		lavadora.setVoltaje(l.getVoltaje());
		repository.saveAndFlush(lavadora);
		
	}

	@Override
	public List<Lavadora> listarLavadora() {
		return repository.findAll();
	}

	@Override
	public Lavadora lavadoraById(Integer id) {
		return repository.findById(id).orElse(null);
	}

	

}
