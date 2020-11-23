package com.example.demo.Services;

import java.util.List;

import javax.transaction.Transactional;

import com.example.demo.AtorCoadjuvante;
import com.example.demo.AtorPrincipal;
import com.example.demo.Diretor;
import com.example.demo.Pessoa;

import com.example.demo.Repositories.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PessoaService {
    
    @Autowired
    private PessoaRepository repo;

    public List<Pessoa> obterTodos(){
        return repo.findAll();
    }

    public void criarAtorPrincipal(){
        repo.save(new AtorPrincipal("Tom Cruise"));
    }

    public void criarAtoresCoadjuvantes(){
        repo.save(new AtorCoadjuvante("Ving Rhames"));
        repo.save(new AtorCoadjuvante("Simon Pegg"));
        repo.save(new AtorCoadjuvante("Henry Cavill"));
    }

    public void criarDiretores(){
        repo.save(new Diretor("Brian de Palma"));
        repo.save(new Diretor("John Woo"));
        repo.save(new Diretor("Christopher McQuarrie"));
    }

}