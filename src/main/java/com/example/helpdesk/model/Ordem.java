package com.example.helpdesk.model;

import java.util.Date;

public class Ordem {
    private Integer idOrdem;
    private String titulo;
    private String descricao;
    private String solucao;
    private String imagem;
    private Date dataInicio;
    private Date dataTermino;
    private Situacao situacao;
    private Pessoa cliente;
    private Pessoa tecnico;
    private Bloco bloco;
    private Sala sala;
    private Piso piso;

    public Ordem() {

    }
    
    public Ordem(Integer idOrdem, String titulo, String descricao, String solucao, String imagem, Date dataInicio, Date dataTermino, Situacao situacao, Pessoa cliente, Pessoa tecnico, Bloco bloco, Sala sala, Piso piso) {
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
        this.bloco = bloco;
        this.sala = sala;
        this.piso = piso;
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

    public Bloco getBloco() {
        return this.bloco;
    }

    public void setBloco(Bloco bloco) {
        this.bloco = bloco;
    }

    public Sala getSala() {
        return this.sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Piso getPiso() {
        return this.piso;
    }

    public void setPiso(Piso piso) {
        this.piso = piso;
    }




}
