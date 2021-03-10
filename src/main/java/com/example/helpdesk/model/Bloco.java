package com.example.helpdesk.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bloco")
public class Bloco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBloco;
    @Column(name = "nome_bloco",nullable = false,length = 15)
    private String nomeBloco;
    private List<Ordem> ordens;

    public Bloco() {

    }

    public Bloco(Integer idBloco, String nomeBloco, List<Ordem> ordens) {
        this.idBloco = idBloco;
        this.nomeBloco = nomeBloco;
        this.ordens = ordens;
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




}
