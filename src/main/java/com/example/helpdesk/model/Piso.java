package com.example.helpdesk.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "piso")
public class Piso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPiso;
    @Column(name = "nome_piso", nullable = false, length = 15)
    private String nomePiso;
    @OneToMany(mappedBy = "piso")
    @JsonIgnore
    private List<Ordem> ordens;

    @ManyToOne
    private Bloco bloco;
    @OneToMany(mappedBy = "piso")
    @JsonIgnore
    private List<Sala> salas;

    public Piso(Integer idPiso, String nomePiso, List<Ordem> ordens, Bloco bloco, List<Sala> salas) {
        this.idPiso = idPiso;
        this.nomePiso = nomePiso;
        this.ordens = ordens;
        this.bloco = bloco;
        this.salas = salas;
    }

    public Piso() {

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

    public Bloco getBloco() {
        return this.bloco;
    }

    public void setBloco(Bloco bloco) {
        this.bloco = bloco;
    }

    public List<Sala> getSalas() {
        return this.salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

}
