package com.anillos.anillos.model.entities;

import java.sql.Date;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "posesiones")
public class Posesion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
    //@JsonIgnore en vez de padres e hijos se puede poner esto quitando en la clase padre  @JsonManagedReference 
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "personaje_id")
    private Personaje personaje;
    //@JsonIgnore
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "artefacto_id")
    private Artefacto artefacto;
    @Column(nullable = false)
    private LocalDate fechaInicio;
    @Column(nullable = true)
    private LocalDate fechaFin;
  
    public Posesion(Integer id, Personaje personaje, Artefacto artefacto, LocalDate fechaInicio, LocalDate fechaFin) {
        this.id = id;
        this.personaje = personaje;
        this.artefacto = artefacto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Posesion(Personaje personaje, Artefacto artefacto, LocalDate fechaInicio, LocalDate fechaFin) {
        this.personaje = personaje;
        this.artefacto = artefacto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Posesion() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public Artefacto getArtefacto() {
        return artefacto;
    }

    public void setArtefacto(Artefacto artefacto) {
        this.artefacto = artefacto;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    
    












    
    }

   