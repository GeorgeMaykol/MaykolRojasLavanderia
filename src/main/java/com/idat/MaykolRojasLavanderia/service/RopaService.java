package com.idat.MaykolRojasLavanderia.service;

import java.util.List;

import com.idat.MaykolRojasLavanderia.model.Ropa;

public interface RopaService {
	
	public void guardarRopa(Ropa r);
	public void eliminarRopa(Integer id);
	public void editarRopa(Ropa r);
	public List<Ropa> listarRopa();
	public Ropa ropaById(Integer id);

}
