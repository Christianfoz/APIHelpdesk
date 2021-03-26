package com.example.helpdesk.repository;

import java.util.List;

import javax.websocket.server.PathParam;

import com.example.helpdesk.model.Sala;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaRepository extends CrudRepository<Sala, Integer> {
    Sala findById(int id);

    @Query("SELECT s FROM Sala s WHERE s.piso.idPiso = :id")
    List<Sala> buscarSalasPorPiso(@PathParam("id") int id);
}
