package com.example.helpdesk.repository;

import java.util.List;

import com.example.helpdesk.model.Ordem;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface OrdemRepository extends CrudRepository<Ordem, Integer> {

    @Query("SELECT o FROM Ordem o ")
    List<Ordem> listarOrdens();

    @Query("SELECT o FROM Ordem o WHERE o.situacao.idSituacao = :id")
    List<Ordem> listarOrdensPorSituacao(@PathVariable("id") int id);
}
