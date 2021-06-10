package com.example.helpdesk.repository;

import java.util.List;

import com.example.helpdesk.model.Comentario;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface ComentarioRepository extends CrudRepository<Comentario, Integer> {

    @Query("SELECT o FROM Comentario o WHERE o.ordem.idOrdem = :id")
    List<Comentario> listarComentariosPorChamado(@PathVariable("id") int id);
}
