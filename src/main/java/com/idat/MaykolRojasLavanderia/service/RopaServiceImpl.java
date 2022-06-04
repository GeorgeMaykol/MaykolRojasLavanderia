package com.idat.MaykolRojasLavanderia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MaykolRojasLavanderia.model.Ropa;
import com.idat.MaykolRojasLavanderia.repository.RopaRepository;

@Service
public class RopaServiceImpl implements RopaService{
	
	@Autowired
	private RopaRepository repository;

	@Override
	public void guardarRopa(Ropa r) {
		Ropa ropa = new Ropa();
		ropa.setDescripcion(r.getDescripcion());
		ropa.setTipoRopa(r.getTipoRopa());
		repository.save(ropa);
		
	}

	@Override
	public void eliminarRopa(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public void editarRopa(Ropa r) {
		Ropa ropa = new Ropa();
		ropa.setIdRopa(r.getIdRopa());
		ropa.setDescripcion(r.getDescripcion());
		ropa.setTipoRopa(r.getTipoRopa());
		repository.saveAndFlush(ropa);
		
	}

	@Override
	public List<Ropa> listarRopa() {
		return repository.findAll();
	}

	@Override
	public Ropa ropaById(Integer id) {
		return repository.findById(id).orElse(null);
	}

}
