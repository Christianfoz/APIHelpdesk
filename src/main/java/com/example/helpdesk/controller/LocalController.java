package com.example.helpdesk.controller;

import com.example.helpdesk.model.Local;
import com.example.helpdesk.repository.LocalRepository;

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
@RequestMapping(path = "local")
public class LocalController {
    @Autowired
    private LocalRepository localRepository;

    @PostMapping
    public boolean inserirLocal(@RequestBody Local l) {
        try {
            localRepository.save(l);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @GetMapping
    public Iterable<Local> buscarLocais() {
        try {
            Iterable<Local> locais = localRepository.findAll();
            return locais;
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping("/busca/{pesquisa}")
    public Iterable<Local> buscarLocais(@PathVariable("pesquisa") String pesquisa) {
        try {
            Iterable<Local> locais = localRepository.findByLocalContainingIgnoreCase(pesquisa);
            return locais;
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping("/{id}")
    public Local buscaLocalPorId(@PathVariable("id") int id) {
        try {
            Local local = localRepository.buscarPorId(id);
            return local;
        } catch (Exception e) {
            return null;
        }
    }

    @PutMapping
    public boolean atualizarLocal(@RequestBody Local l) {
        try {
            localRepository.save(l);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @DeleteMapping("/{id}")
    public boolean deletarLocal(@PathVariable("id") int id) {
        try {
            Local l = localRepository.buscarPorId(id);
            if (l != null) {
                try {
                    localRepository.delete(l);
                    return true;
                } catch (Exception e) {
                    return false;
                }
            } else {
                return false;
            }

        } catch (Exception e) {
            return false;
        }
    }

}
