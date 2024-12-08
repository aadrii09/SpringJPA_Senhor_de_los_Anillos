package com.anillos.anillos.model.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anillos.anillos.model.entities.Posesion;
import com.anillos.anillos.model.repository.IPosesionRepository;
import com.anillos.anillos.model.services.interfaces.IPosesionService;

@Service
public class PosesionService implements IPosesionService {
    @Autowired
    IPosesionRepository posesionRepo;
    @Override
    public List<Posesion> buscarTodo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarTodo'");
    }

    @Override
    public Posesion findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public void save(Posesion posesion) {
        posesionRepo.save(posesion);
    }


}
