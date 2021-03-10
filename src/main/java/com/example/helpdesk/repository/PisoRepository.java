package com.example.helpdesk.repository;

import com.example.helpdesk.model.Piso;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PisoRepository extends CrudRepository<Piso,Integer>{
    Piso findById(int id);
}
