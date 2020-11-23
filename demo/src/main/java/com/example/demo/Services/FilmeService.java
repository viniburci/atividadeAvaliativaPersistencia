package com.example.demo.Services;

import java.util.ArrayList;

import javax.transaction.Transactional;

import com.example.demo.Filme;
import com.example.demo.Repositories.FilmeRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
@Transactional
public class FilmeService {

    @Autowired
    private FilmeRepository repo;

    public void criarFilmes (){
        for (int i = 0; i < 5; i++) {
            repo.save(new Filme("Missao impossivel" +(i+1), 70 + i*5));
        }
    }

    public String sayHello (){
        return "Hello!";
    }

	public java.util.List<Filme> obterTodos() {
		return repo.findAll();
    }
    
    public Filme findFilmeById (String id){
        return repo.findById(id).get();
    }
}
