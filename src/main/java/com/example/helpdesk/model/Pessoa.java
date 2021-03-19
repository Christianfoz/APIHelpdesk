package com.example.helpdesk.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPessoa;
    @Column(length = 20)
    private String nome;
    @Column(length = 50)
    private String sobrenome;
    @Column(length = 14, unique = true)
    private String cpf;
    @Column(length = 20)
    private String telefone;
    @Column(length = 30, unique = true)
    private String email;
    private String senha;
    @Column(nullable = true)
    private String foto;
    @OneToMany(mappedBy = "cliente")
    private List<Ordem> ordemCriada;
    @OneToMany(mappedBy = "tecnico")
    private List<Ordem> ordemAceita;
    @ManyToOne
    private TipoPessoa tipoPessoa;

    public Pessoa() {

    }

    public Pessoa(Integer idPessoa, String nome, String sobrenome, String cpf, String telefone, String email,
            String senha, String foto, List<Ordem> ordemCriada, List<Ordem> ordemAceita, TipoPessoa tipoPessoa) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.foto = foto;
        this.ordemCriada = ordemCriada;
        this.ordemAceita = ordemAceita;
        this.tipoPessoa = tipoPessoa;
    }

    public Integer getIdPessoa() {
        return this.idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFoto() {
        return this.foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public List<Ordem> getOrdemCriada() {
        return this.ordemCriada;
    }

    public void setOrdemCriada(List<Ordem> ordemCriada) {
        this.ordemCriada = ordemCriada;
    }

    public List<Ordem> getOrdemAceita() {
        return this.ordemAceita;
    }

    public void setOrdemAceita(List<Ordem> ordemAceita) {
        this.ordemAceita = ordemAceita;
    }

    public TipoPessoa getTipoPessoa() {
        return this.tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

}
