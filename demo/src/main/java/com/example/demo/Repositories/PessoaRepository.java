package com.example.demo.Repositories;

import com.example.demo.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, String>{
    
}
