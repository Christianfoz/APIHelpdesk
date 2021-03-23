package com.example.helpdesk.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "bloco")
public class Bloco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBloco;
    @Column(name = "nome_bloco", nullable = false, length = 15)
    private String nomeBloco;
    @OneToMany(mappedBy = "bloco")
    private List<Ordem> ordens;
    @OneToMany(mappedBy = "bloco")
    @JsonIgnore
    private List<Piso> pisos;

    public Bloco() {

    }

    public Bloco(Integer idBloco, String nomeBloco, List<Ordem> ordens, List<Piso> pisos) {
        this.idBloco = idBloco;
        this.nomeBloco = nomeBloco;
        this.ordens = ordens;
        this.pisos = pisos;
    }

    public Integer getIdBloco() {
        return this.idBloco;
    }

    public void setIdBloco(Integer idBloco) {
        this.idBloco = idBloco;
    }

    public String getNomeBloco() {
        return this.nomeBloco;
    }

    public void setNomeBloco(String nomeBloco) {
        this.nomeBloco = nomeBloco;
    }

    public List<Ordem> getOrdens() {
        return this.ordens;
    }

    public void setOrdens(List<Ordem> ordens) {
        this.ordens = ordens;
    }

    public List<Piso> getPisos() {
        return this.pisos;
    }

    public void setPisos(List<Piso> pisos) {
        this.pisos = pisos;
    }

}
