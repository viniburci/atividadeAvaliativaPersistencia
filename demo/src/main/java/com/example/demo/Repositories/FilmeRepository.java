package com.example.demo.Repositories;

import com.example.demo.Filme;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, String> {
    
}
