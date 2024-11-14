package com.anillos.anillos.model.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.anillos.anillos.model.entities.Personaje;

public interface IPersonajeService {

    public List<Personaje> buscarTodos();

    public Personaje findById(Integer id);

}
