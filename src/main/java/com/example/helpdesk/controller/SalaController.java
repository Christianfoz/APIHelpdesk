package com.example.helpdesk.controller;

import javax.websocket.server.PathParam;

import com.example.helpdesk.model.Sala;
import com.example.helpdesk.repository.SalaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "sala")
public class SalaController {
    @Autowired
    public SalaRepository _salaRepository;

    @GetMapping()
    public Iterable<Sala> listarSalas(){
        try{
            Iterable<Sala> salas = _salaRepository.findAll();
            return salas;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    @GetMapping("/id")
    public Sala buscarSala(@PathParam("id") int id){
        try{
            Sala sala = _salaRepository.findById(id);
            return sala;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }

    @PostMapping()
    public boolean criarSala(Sala s){
        try{
            _salaRepository.save(s);
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }

    @PutMapping()
    public boolean editarSala(Sala s){
        try{
            _salaRepository.save(s);
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }

    @DeleteMapping("/{id}")
    public boolean deletarSala(@PathParam("id") int id){
        Sala s = _salaRepository.findById(id);
        if(s != null){
            _salaRepository.delete(s);
            return true;
        }else{
            return false;
        }
    }


}
