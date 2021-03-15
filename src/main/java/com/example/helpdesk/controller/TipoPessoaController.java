package com.example.helpdesk.controller;

import javax.websocket.server.PathParam;

import com.example.helpdesk.model.TipoPessoa;
import com.example.helpdesk.repository.TipoPessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "tipopessoa")
@RestController
public class TipoPessoaController {
    @Autowired
    private TipoPessoaRepository tipoPessoaRepository;

    @GetMapping()
    public Iterable<TipoPessoa> listarTipos() {
        try {
            Iterable<TipoPessoa> tipos = tipoPessoaRepository.findAll();
            return tipos;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    @GetMapping("/{id}")
    public TipoPessoa buscarTipo(@PathParam("id") int id) {
        try {
            TipoPessoa tipoPessoa = tipoPessoaRepository.findById(id);
            return tipoPessoa;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    @PostMapping()
    public boolean criarSala(@RequestBody TipoPessoa tp) {
        try {
            tipoPessoaRepository.save(tp);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    @PutMapping()
    public boolean editarTipo(@RequestBody TipoPessoa tp) {
        try {
            tipoPessoaRepository.save(tp);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    @DeleteMapping("/{id}")
    public boolean deletarTipo(@PathParam("id") int id) {
        TipoPessoa tp = tipoPessoaRepository.findById(id);
        if (tp != null) {
            tipoPessoaRepository.delete(tp);
            return true;
        } else {
            return false;
        }
    }
}
