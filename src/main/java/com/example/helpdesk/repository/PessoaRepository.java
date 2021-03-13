package com.example.helpdesk.repository;

import com.example.helpdesk.model.Pessoa;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa,Integer>{
    Pessoa findById(int id);

    @Query("SELECT p FROM Pessoa p WHERE p.email = :email AND p.senha = :senhaSha")
    Pessoa logarPessoa(@PathVariable("email") String email, @PathVariable("senha") String senhaSha);
}
