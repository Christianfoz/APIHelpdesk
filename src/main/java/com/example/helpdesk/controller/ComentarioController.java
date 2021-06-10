package com.example.helpdesk.controller;

import java.util.List;

import com.example.helpdesk.model.Comentario;
import com.example.helpdesk.repository.ComentarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "comentario")
public class ComentarioController {
    @Autowired
    private ComentarioRepository comentarioRepository;

    @PostMapping()
    public boolean inserirComentario(@RequestBody Comentario comentario) {
        try {
            comentarioRepository.save(comentario);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @GetMapping("/{id}")
    public List<Comentario> listarComentarios(@PathVariable("id") int id) {
        try {
            List<Comentario> comentarios = comentarioRepository.listarComentariosPorChamado(id);
            return comentarios;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
