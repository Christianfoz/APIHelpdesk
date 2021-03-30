package com.example.helpdesk.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ordem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOrdem;
    @Column(length = 20, nullable = false)
    private String titulo;
    @Column(length = 120, nullable = false)
    private String descricao;
    @Column(length = 120, nullable = true)
    private String solucao;
    @Column(nullable = true)
    private String imagem;
    private Date dataInicio;
    private Date dataTermino;
    @ManyToOne
    private Situacao situacao;
    @ManyToOne
    private Pessoa cliente;
    @ManyToOne(optional = true)
    private Pessoa tecnico;
    @ManyToOne(optional = false)
    private Local local;

    public Ordem() {

    }

    public Ordem(Integer idOrdem, String titulo, String descricao, String solucao, String imagem, Date dataInicio,
            Date dataTermino, Situacao situacao, Pessoa cliente, Pessoa tecnico, Local local) {
        this.idOrdem = idOrdem;
        this.titulo = titulo;
        this.descricao = descricao;
        this.solucao = solucao;
        this.imagem = imagem;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.situacao = situacao;
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.local = local;
    }

    public Integer getIdOrdem() {
        return this.idOrdem;
    }

    public void setIdOrdem(Integer idOrdem) {
        this.idOrdem = idOrdem;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSolucao() {
        return this.solucao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

    public String getImagem() {
        return this.imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Date getDataInicio() {
        return this.dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return this.dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public Situacao getSituacao() {
        return this.situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Pessoa getCliente() {
        return this.cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Pessoa getTecnico() {
        return this.tecnico;
    }

    public void setTecnico(Pessoa tecnico) {
        this.tecnico = tecnico;
    }

    public Local getLocal() {
        return this.local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

}
