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
@Table(name = "sala")
public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSala;
    @Column(name = "nome_sala", nullable = false, length = 20)
    private String nomeSala;
    @OneToMany(mappedBy = "sala")
    @JsonIgnore
    private List<Ordem> ordens;
    @ManyToOne
    private Piso piso;

    public Sala(Integer idSala, String nomeSala, List<Ordem> ordens, Piso piso) {
        this.idSala = idSala;
        this.nomeSala = nomeSala;
        this.ordens = ordens;
        this.piso = piso;
    }

    public Sala() {

    }

    public Integer getIdSala() {
        return this.idSala;
    }

    public void setIdSala(Integer idSala) {
        this.idSala = idSala;
    }

    public String getNomeSala() {
        return this.nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public List<Ordem> getOrdens() {
        return this.ordens;
    }

    public void setOrdens(List<Ordem> ordens) {
        this.ordens = ordens;
    }

    public Piso getPiso() {
        return this.piso;
    }

    public void setPiso(Piso piso) {
        this.piso = piso;
    }

}
