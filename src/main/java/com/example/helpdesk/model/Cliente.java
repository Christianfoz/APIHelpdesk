package com.example.helpdesk.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    private Integer idCliente;
    @OneToOne
    @MapsId
    private Pessoa pessoa;
    @OneToMany(mappedBy = "cliente")
    private List<Ordem> ordens;
}
