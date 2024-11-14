package com.anillos.anillos.model.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.anillos.anillos.model.entities.Artefacto;
import com.anillos.anillos.model.entities.Personaje;

public interface IArtefactoService {

    public List<Artefacto> buscarTodos();

    public Artefacto findById(Integer id);

}
