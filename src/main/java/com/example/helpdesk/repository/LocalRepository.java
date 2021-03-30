package com.example.helpdesk.repository;

import java.util.List;

import javax.websocket.server.PathParam;

import com.example.helpdesk.model.Local;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalRepository extends CrudRepository<Local, Integer> {
    @Query("SELECT l FROM Local l WHERE idLocal = :id")
    Local buscarPorId(@PathParam("id") int id);

    List<Local> findByLocalContainingIgnoreCase(String title);
}
