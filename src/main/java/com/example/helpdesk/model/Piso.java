package com.example.helpdesk.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "piso")
public class Piso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPiso;
    @Column(name = "nome_piso",nullable = false,length = 15)
    private String nomePiso;
    private List<Ordem> ordens;

    public Piso() {

    }

    public Piso(Integer idPiso, String nomePiso, List<Ordem> ordens) {
        this.idPiso = idPiso;
        this.nomePiso = nomePiso;
        this.ordens = ordens;
    }

    public Integer getIdPiso() {
        return this.idPiso;
    }

    public void setIdPiso(Integer idPiso) {
        this.idPiso = idPiso;
    }

    public String getNomePiso() {
        return this.nomePiso;
    }

    public void setNomePiso(String nomePiso) {
        this.nomePiso = nomePiso;
    }

    public List<Ordem> getOrdens() {
        return this.ordens;
    }

    public void setOrdens(List<Ordem> ordens) {
        this.ordens = ordens;
    }



}
