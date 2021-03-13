package com.example.helpdesk.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tecnico")
public class Tecnico {
    @Id
    private Integer idTecnico;
    @OneToOne
    @MapsId
    private Pessoa pessoa;
    @OneToMany(mappedBy = "tecnico")
    private List<Ordem> ordens;

}
