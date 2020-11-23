package com.example.demo.Services;

import java.util.List;

import javax.transaction.Transactional;

import com.example.demo.AtorPrincipal;
import com.example.demo.Repositories.AtorPrincipalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AtorPrincipalService {

    @Autowired
    private AtorPrincipalRepository repo;

    public void criarAtor(String nome) {
        repo.save(new AtorPrincipal(nome));
    }

    public java.util.List<AtorPrincipal> obterTodos() {
		return repo.findAll();
    }
    
    public AtorPrincipal findAtorPrincipalbyId (String id){
        return repo.findById(id).get();
    }
}
