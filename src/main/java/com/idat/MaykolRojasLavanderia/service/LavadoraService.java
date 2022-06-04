package com.idat.MaykolRojasLavanderia.service;

import java.util.List;

import com.idat.MaykolRojasLavanderia.model.Lavadora;

public interface LavadoraService {
	
	public void guardarLavadora(Lavadora l);
	public void eliminarLavadora(Integer id);
	public void editarLavadora(Lavadora l);
	public List<Lavadora> listarLavadora();
	public Lavadora lavadoraById(Integer id);

}
