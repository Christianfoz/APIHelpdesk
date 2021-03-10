package com.example.helpdesk.repository;

import com.example.helpdesk.model.Sala;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaRepository extends CrudRepository<Sala,Integer>{
    Sala findById(int id);
}
