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
@Table(name = "local")
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLocal;
    @Column(length = 60)
    private String local;
    @JsonIgnore
    @OneToMany(mappedBy = "local")
    private List<Ordem> ordens;

    public Local() {

    }

    public Local(Integer idLocal, String local, List<Ordem> ordens) {
        this.idLocal = idLocal;
        this.local = local;
        this.ordens = ordens;
    }

    public Integer getIdLocal() {
        return this.idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<Ordem> getOrdens() {
        return this.ordens;
    }

    public void setOrdens(List<Ordem> ordens) {
        this.ordens = ordens;
    }

}
