package com.example.helpdesk.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "situacao")
public class Situacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSituacao;
    @Column(name = "nome_situacao", nullable = false, length = 15)
    private String nomeSituacao;
    @OneToMany(mappedBy = "situacao")
    private List<Ordem> ordens;

    public Situacao() {

    }

    public Situacao(Integer idSituacao, String nomeSituacao, List<Ordem> ordens) {
        this.idSituacao = idSituacao;
        this.nomeSituacao = nomeSituacao;
        this.ordens = ordens;
    }

    public Integer getIdSituacao() {
        return this.idSituacao;
    }

    public void setIdSituacao(Integer idSituacao) {
        this.idSituacao = idSituacao;
    }

    public String getNomeSituacao() {
        return this.nomeSituacao;
    }

    public void setNomeSituacao(String nomeSituacao) {
        this.nomeSituacao = nomeSituacao;
    }

    public List<Ordem> getOrdens() {
        return this.ordens;
    }

    public void setOrdens(List<Ordem> ordens) {
        this.ordens = ordens;
    }



    

}
