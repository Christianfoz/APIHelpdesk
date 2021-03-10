package com.example.helpdesk.repository;

import com.example.helpdesk.model.Ordem;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemRepository extends CrudRepository<Ordem,Integer>{
    
}
