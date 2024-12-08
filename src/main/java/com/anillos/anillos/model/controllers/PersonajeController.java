package com.anillos.anillos.model.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anillos.anillos.model.entities.Artefacto;
import com.anillos.anillos.model.entities.Personaje;
import com.anillos.anillos.model.entities.Posesion;
import com.anillos.anillos.model.services.implementations.PersonajeService;
import com.anillos.anillos.model.services.implementations.PosesionService;


@RestController
@RequestMapping("/personajes")
public class PersonajeController {
@Autowired
PersonajeService servicePersonaje;
@GetMapping("/all")
public List<Personaje> getAllPersonajes(){
    return servicePersonaje.buscarTodos();
}
@GetMapping("/{id}")
public Personaje getPersonajeById(@PathVariable("id") Integer id){
    return servicePersonaje.findById(id);
}

@PostMapping(value = "/guardarArtefacto")
public void guardarPersonajeConArtefacto(@RequestBody Personaje personaje) {
    if (personaje.getListaPosesiones() != null && !personaje.getListaPosesiones().isEmpty()) {
        for (Posesion posesion : personaje.getListaPosesiones()) {
            if (posesion.getArtefacto() != null && posesion.getArtefacto().getId() != null) {
                Artefacto artefacto = ArtefactoService.findById(posesion.getArtefacto().getId());

                if (artefacto != null) {
                    posesion.setArtefacto(artefacto);
                    posesion.setPersonaje(personaje);
                    PosesionService.save(posesion);
                } else {
                    System.out.println("Artefacto no encontrado");
                }
            }
        }
    }
}


}
