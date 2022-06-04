package com.idat.MaykolRojasLavanderia.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	private String nombreCliente;
	private String apellidoCliente;
	private String nroCelular;
	private String direccion;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="cliente_ropa",
	joinColumns = @JoinColumn(name="id_Cliente", nullable = false, unique = true, foreignKey=
	@ForeignKey(foreignKeyDefinition = "foreign key(id_Cliente) references clientes (id_Cliente)")),
	inverseJoinColumns = @JoinColumn(name="id_Ropa", nullable = false, unique = true, foreignKey = 
	@ForeignKey(foreignKeyDefinition = 
	"foreign key(id_Ropa) references ropas (id_Ropa)")))
	private List<Ropa> ropas = new ArrayList<>();

}
