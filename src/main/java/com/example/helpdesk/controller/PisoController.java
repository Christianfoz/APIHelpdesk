package com.example.helpdesk.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import com.example.helpdesk.model.Piso;
import com.example.helpdesk.repository.PisoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "piso")
public class PisoController {
    @Autowired
    private PisoRepository _pisoRepository;

    @GetMapping()
    public Iterable<Piso> listarPisos() {
        try {
            Iterable<Piso> pisos = _pisoRepository.findAll();
            return pisos;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    @GetMapping("/{id}")
    public Piso buscarPiso(@PathParam("id") int id) {
        try {
            Piso piso = _pisoRepository.findById(id);
            return piso;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    @GetMapping("/buscarPorBloco/{id}")
    public List<Piso> buscarPisoPorBloco(@PathVariable("id") int id) {
        try {
            List<Piso> pisos = _pisoRepository.buscarPisosPorBloco(id);
            return pisos;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    @PostMapping()
    public boolean criarPiso(@RequestBody Piso p) {
        try {
            _pisoRepository.save(p);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    @PutMapping()
    public boolean editarPiso(@RequestBody Piso p) {
        try {
            _pisoRepository.save(p);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    @DeleteMapping("/{id}")
    public boolean deletarPiso(@PathParam("id") int id) {
        Piso p = _pisoRepository.findById(id);
        if (p != null) {
            _pisoRepository.delete(p);
            return true;
        } else {
            return false;
        }
    }

}
