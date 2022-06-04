package com.idat.MaykolRojasLavanderia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MaykolRojasLavanderia.model.Lavadora;

@Repository
public interface LavadoraRepository extends JpaRepository<Lavadora, Integer>{

}
