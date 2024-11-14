package com.anillos.anillos.model.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="artefactos")
public class Artefacto {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private Integer id ;
    @Column(length = 55, nullable = false)
    private String nombre;
    @Column(length = 55, nullable = false)
    private String tipo;
    @JsonManagedReference 
    @OneToMany(mappedBy = "artefacto",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Posesion> listaPosesiones = new ArrayList<>();
    
    public Artefacto(Integer id, String nombre, String tipo, List<Posesion> listaPosesiones) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.listaPosesiones = listaPosesiones;
    }

    public Artefacto(String nombre, String tipo, List<Posesion> listaPosesiones) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.listaPosesiones = listaPosesiones;
    }

    public Artefacto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Posesion> getListaPosesiones() {
        return listaPosesiones;
    }

    public void setListaPosesiones(List<Posesion> listaPosesiones) {
        this.listaPosesiones = listaPosesiones;
    }
    
    





    
}
