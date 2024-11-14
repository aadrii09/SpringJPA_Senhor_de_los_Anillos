package com.anillos.anillos.model.entities;

import java.time.LocalDate;
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
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "personajes")
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
    @Column(length = 55, nullable = false)
    private String nombre;
    @Column(length = 55, nullable = false)
    private String raza;
    @Column(length = 55, nullable = false)
    private String alianza;
    @JsonManagedReference 
    @OneToMany(mappedBy = "personaje",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Posesion> listaPosesiones = new ArrayList<>();
    
    public Personaje() {
    }

    public Personaje(Integer id, String nombre, String raza, String alianza, List<Posesion> listaPosesiones) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.alianza = alianza;
        this.listaPosesiones = listaPosesiones;
    }

    public Personaje(String nombre, String raza, String alianza, List<Posesion> listaPosesiones) {
        this.nombre = nombre;
        this.raza = raza;
        this.alianza = alianza;
        this.listaPosesiones = listaPosesiones;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAlianza() {
        return alianza;
    }

    public void setAlianza(String alianza) {
        this.alianza = alianza;
    }

    public List<Posesion> getListaPosesiones() {
        return listaPosesiones;
    }

    public void setListaPosesiones(List<Posesion> listaPosesiones) {
        this.listaPosesiones = listaPosesiones;
    }

    









}

