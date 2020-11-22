package com.example.demo.Repositories;

import com.example.demo.Filme;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public interface FilmeRepository extends JpaRepository<Filme, String> {
    
}
