package com.example.helpdesk.controller;

import javax.websocket.server.PathParam;

import com.example.helpdesk.model.Bloco;
import com.example.helpdesk.repository.BlocoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "bloco")
public class BlocoController {
    @Autowired
    private BlocoRepository _blocoRepository;

    @GetMapping()
    public Iterable<Bloco> listarBlocos(){
        try{
            Iterable<Bloco> blocos = _blocoRepository.findAll();
            return blocos;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    @GetMapping("/{id}")
    public Bloco buscarBloco(@PathParam("id") int id){
        try{
            Bloco bloco = _blocoRepository.findById(id);
            return bloco;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    @PostMapping()
    public boolean criarBloco(@RequestBody Bloco bloco){
        try{
            _blocoRepository.save(bloco);
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }

    @PutMapping()
    public boolean editarBloco(@RequestBody Bloco bloco){
        try{
            _blocoRepository.save(bloco);
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }

    @DeleteMapping("/{id}")
    public boolean deletarBloco(@PathParam("id") int id){
        Bloco bloco = _blocoRepository.findById(id);
        if(bloco != null){
            _blocoRepository.delete(bloco);
            return true;
        }else{
            return false;
        }
    }
}


