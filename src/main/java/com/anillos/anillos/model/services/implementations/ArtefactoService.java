package com.anillos.anillos.model.services.implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anillos.anillos.model.entities.Artefacto;
import com.anillos.anillos.model.services.interfaces.IArtefactoService;

@Service
public class ArtefactoService implements IArtefactoService  {

    @Override
    public List<Artefacto> buscarTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarTodos'");
    }

    @Override
    public Artefacto findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

}
