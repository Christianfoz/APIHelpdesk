package com.example.helpdesk.model;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idComentario;
    @Column(name = "comentario", nullable = false)
    private String comentario;
    @ManyToOne
    private Pessoa criadorComentario;
    @ManyToOne(optional = false)
    private Ordem ordem;
    private ZonedDateTime dataComentario;

    public Comentario(Integer idComentario, String comentario, Pessoa criadorComentario, Ordem ordem,
            ZonedDateTime dataComentario) {
        this.idComentario = idComentario;
        this.comentario = comentario;
        this.criadorComentario = criadorComentario;
        this.ordem = ordem;
        this.dataComentario = dataComentario;
    }

    public Comentario() {

    }

    public Integer getIdComentario() {
        return this.idComentario;
    }

    public void setIdComentario(Integer idComentario) {
        this.idComentario = idComentario;
    }

    public String getComentario() {
        return this.comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Pessoa getCriadorComentario() {
        return this.criadorComentario;
    }

    public void setCriadorComentario(Pessoa criadorComentario) {
        this.criadorComentario = criadorComentario;
    }

    public Ordem getOrdem() {
        return this.ordem;
    }

    public void setOrdem(Ordem ordem) {
        this.ordem = ordem;
    }

    public ZonedDateTime getDataComentario() {
        return this.dataComentario;
    }

    public void setDataComentario(ZonedDateTime dataComentario) {
        this.dataComentario = dataComentario;
    }

}
