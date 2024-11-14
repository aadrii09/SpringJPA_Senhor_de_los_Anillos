package com.anillos.anillos.model.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anillos.anillos.model.entities.Personaje;
import com.anillos.anillos.model.repository.IPersonajeRepository;
import com.anillos.anillos.model.services.interfaces.IPersonajeService;

@Service
public class PersonajeService implements IPersonajeService {




    
    @Autowired
    IPersonajeRepository personajeRepo;


    @Override
    public List<Personaje> buscarTodos() {
        List<Personaje> lista = personajeRepo.findAll();
        return lista;
       
    }


    @Override
    public Personaje findById(Integer id) {
     
         Optional<Personaje> optional = personajeRepo.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }else{
            return null;
        } 

        //return personajeRepo.findById(id).get();
    }

   


}
