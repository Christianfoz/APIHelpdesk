package com.example.helpdesk.repository;

import com.example.helpdesk.model.Pessoa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa,Integer>{
    
}
