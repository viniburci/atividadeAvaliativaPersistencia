package com.example.demo.Services;

import java.util.ArrayList;
import java.util.Set;

import javax.transaction.Transactional;

import com.example.demo.Filme;
import com.example.demo.Repositories.FilmeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import antlr.collections.List;

@Service
@Transactional
public class FilmeService {

    @Autowired
    private FilmeRepository repo;

    //private List<Filme> lista = new ArrayList<>();

    public void criarFilmes (){
        for (int i = 0; i < 5; i++) {
            repo.save(new Filme("Missão impossível" + i, 60+i*5));
        }
    }


    public static String sayHello (){
        return "Hello!";
    }


	public java.util.List<Filme> obterTodos() {
		return repo.findAll();
	}
}
