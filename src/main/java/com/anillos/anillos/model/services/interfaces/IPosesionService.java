package com.anillos.anillos.model.services.interfaces;

import java.util.List;
import java.util.Optional;


import com.anillos.anillos.model.entities.Posesion;

public interface IPosesionService {

    public List<Posesion> buscarTodo();

    public Posesion findById(Integer id);

    public void save(Posesion posesion);

}
