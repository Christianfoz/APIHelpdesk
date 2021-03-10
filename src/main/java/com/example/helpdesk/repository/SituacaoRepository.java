package com.example.helpdesk.repository;

import com.example.helpdesk.model.Situacao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SituacaoRepository extends CrudRepository<Situacao,Integer>{
    Situacao findById(int id);
}
