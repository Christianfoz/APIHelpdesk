package com.example.helpdesk.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_pessoa")
public class TipoPessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipoPessoa;
    @Column(name = "tipo_pessoa", nullable = false, length = 15)
    private String tipoPessoa;
    private List<Pessoa> pessoas;

    public TipoPessoa() {

    }

    public TipoPessoa(Integer idTipoPessoa, String tipoPessoa, List<Pessoa> pessoas) {
        this.idTipoPessoa = idTipoPessoa;
        this.tipoPessoa = tipoPessoa;
        this.pessoas = pessoas;
    }

    public Integer getIdTipoPessoa() {
        return this.idTipoPessoa;
    }

    public void setIdTipoPessoa(Integer idTipoPessoa) {
        this.idTipoPessoa = idTipoPessoa;
    }

    public String getTipoPessoa() {
        return this.tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public List<Pessoa> getPessoas() {
        return this.pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

}