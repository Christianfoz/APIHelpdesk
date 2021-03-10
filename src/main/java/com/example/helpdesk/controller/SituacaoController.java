package com.example.helpdesk.controller;

import javax.websocket.server.PathParam;

import com.example.helpdesk.model.Situacao;
import com.example.helpdesk.repository.SituacaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("situacao")
public class SituacaoController {
    @Autowired
    private SituacaoRepository _situacaoRepository;

    @GetMapping()
    public Iterable<Situacao> listarSituacoes(){
        try{
            Iterable<Situacao> situacoes = _situacaoRepository.findAll();
            return situacoes;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    @GetMapping("/id")
    public Situacao buscarSituacao(@PathParam("id") int id){
        try{
            Situacao situacao = _situacaoRepository.findById(id);
            return situacao;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    @PostMapping()
    public boolean criarSituacao(Situacao s){
        try{
            _situacaoRepository.save(s);
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }

    @PutMapping()
    public boolean editarSituacao(Situacao s){
        try{
            _situacaoRepository.save(s);
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }

    @DeleteMapping("/{id}")
    public boolean deletarSituacao(@PathParam("id") int id){
        Situacao s = _situacaoRepository.findById(id);
        if(s != null){
            _situacaoRepository.delete(s);
            return true;
        }else{
            return false;
        }
    }
}
