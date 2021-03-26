package com.example.helpdesk.repository;

import java.util.List;

import javax.websocket.server.PathParam;

import com.example.helpdesk.model.Piso;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PisoRepository extends CrudRepository<Piso, Integer> {
    Piso findById(int id);

    @Query("SELECT p FROM Piso p WHERE p.bloco.idBloco = :id")
    List<Piso> buscarPisosPorBloco(@PathParam("id") int id);

}
