package com.example.demo.Services;

import javax.transaction.Transactional;

import com.example.demo.Diretor;
import com.example.demo.Repositories.DiretorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class DiretorService {
    
    @Autowired
    private DiretorRepository repo;

    public void criarDiretor(String nome){
        repo.save(new Diretor(nome));
    }

    public java.util.List<Diretor> obterTodos() {
		return repo.findAll();
    }
    
    public Diretor findDiretorById(String id){
        return repo.findById(id).get();
    }

}
