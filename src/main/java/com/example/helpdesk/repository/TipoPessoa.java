package com.example.helpdesk.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPessoa extends CrudRepository<TipoPessoa, Integer>{
    
}
