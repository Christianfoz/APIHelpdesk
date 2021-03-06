package com.example.helpdesk.controller;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

import com.example.helpdesk.model.Ordem;
import com.example.helpdesk.repository.OrdemRepository;

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
@RequestMapping(path = "ordem")
public class OrdemController {
    @Autowired
    private OrdemRepository _ordemRepository;

    @PostMapping()
    public boolean criarOrdem(@RequestBody Ordem o) {
        try {
            ZonedDateTime date = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
            o.setDataInicio(date);
            _ordemRepository.save(o);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    @GetMapping
    public List<Ordem> listarOrdens() {
        try {
            List<Ordem> ordens = _ordemRepository.listarOrdens();
            return ordens;
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping("listarPorTitulo/{pesquisa}")
    public List<Ordem> listarPorTitulo(@PathVariable(required = false, name = "pesquisa") String pesquisa) {
        try {
            if (pesquisa == "" || pesquisa == null) {
                List<Ordem> ordens = _ordemRepository.listarOrdens();
                return ordens;
            } else {
                List<Ordem> ordens = _ordemRepository.findByTituloContainingIgnoreCase(pesquisa);
                return ordens;
            }

        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping("listarChamadosCriadosPorPessoa/{id}")
    public List<Ordem> listarChamadosCriadosPorPessoa(@PathVariable("id") int id) {
        try {
            List<Ordem> ordens = _ordemRepository.listarChamadosCriadosPorPessoa(id);
            return ordens;
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping("listarChamadosAceitosPorPessoa/{id}")
    public List<Ordem> listarChamadosAceitosPorPessoa(@PathVariable("id") int id) {
        try {
            List<Ordem> ordens = _ordemRepository.listarChamadosAceitosPorPessoa(id);
            return ordens;
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping("/listarPorSituacao/{id}")
    public List<Ordem> listarOrdensPorSituacao(@PathVariable("id") int id) {
        try {
            List<Ordem> ordens = _ordemRepository.listarOrdensPorSituacao(id);
            return ordens;
        } catch (Exception e) {
            return null;
        }
    }

    @PutMapping("/atualizaParaEmProgresso")
    public boolean atualizarOrdemParaEmProgresso(@RequestBody Ordem o) {
        try {
            _ordemRepository.save(o);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    @PutMapping("/atualizaParaResolvido")
    public boolean atualizarOrdemParaResolvido(@RequestBody Ordem o) {
        try {
            ZonedDateTime date = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
            o.setDataTermino(date);
            _ordemRepository.save(o);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    @PutMapping()
    public boolean editarChamado(@RequestBody Ordem o) {
        try {
            _ordemRepository.save(o);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    @DeleteMapping("/{id}")
    public boolean deletarChamado(@PathVariable("id") int id) {
        try {
            Optional<Ordem> o = _ordemRepository.findById(id);
            o.get().setStatus(false);
            _ordemRepository.save(o.get());
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
