package com.idat.MaykolRojasLavanderia.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "ropas")
public class Ropa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRopa;
	private String tipoRopa;
	private String descripcion;
	
	@ManyToMany(mappedBy = "ropas", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Cliente> clientes = new ArrayList<>();
	
	@ManyToMany(mappedBy = "ropas", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Lavadora> lavadoras = new ArrayList<>();

}
