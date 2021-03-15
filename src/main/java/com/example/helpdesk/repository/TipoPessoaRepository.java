package com.example.helpdesk.repository;

import com.example.helpdesk.model.TipoPessoa;

import org.springframework.data.repository.CrudRepository;

public interface TipoPessoaRepository extends CrudRepository<TipoPessoa, Integer> {
    TipoPessoa findById(int id);
}
