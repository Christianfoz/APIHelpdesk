package com.example.helpdesk.repository;

import com.example.helpdesk.model.Bloco;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocoRepository extends CrudRepository<Bloco, Integer> {
    Bloco findById(int id);
}
