package com.anillos.anillos.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anillos.anillos.model.entities.Personaje;

public interface IPersonajeRepository extends JpaRepository <Personaje, Integer>{

    

}
