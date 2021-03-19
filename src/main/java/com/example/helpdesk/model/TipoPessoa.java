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
@Table(name = "tipopessoa")
public class TipoPessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipoPessoa;
    @Column(length = 10, nullable = false)
    private String nomeTipoPessoa;
    @OneToMany(mappedBy = "tipoPessoa")
    @JsonIgnore
    private List<Pessoa> pessoas;

    public TipoPessoa() {

    }

    public TipoPessoa(Integer idTipoPessoa, String nomeTipoPessoa, List<Pessoa> pessoas) {
        this.idTipoPessoa = idTipoPessoa;
        this.nomeTipoPessoa = nomeTipoPessoa;
        this.pessoas = pessoas;
    }

    public Integer getIdTipoPessoa() {
        return this.idTipoPessoa;
    }

    public void setIdTipoPessoa(Integer idTipoPessoa) {
        this.idTipoPessoa = idTipoPessoa;
    }

    public String getNomeTipoPessoa() {
        return this.nomeTipoPessoa;
    }

    public void setNomeTipoPessoa(String nomeTipoPessoa) {
        this.nomeTipoPessoa = nomeTipoPessoa;
    }

    public List<Pessoa> getPessoas() {
        return this.pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

}
