package com.idat.MaykolRojasLavanderia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MaykolRojasLavanderia.model.Ropa;

@Repository
public interface RopaRepository extends JpaRepository<Ropa, Integer>{

}
