package com.example.demo.Services;

import javax.transaction.Transactional;

import com.example.demo.Local;
import com.example.demo.Repositories.LocalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;

@Service
@Transactional
public class LocalService {
    
    @Autowired
    private LocalRepository repo;

    public void criarLocais() {
        repo.save(new Local("EUA", "Nova Iorque"));
        repo.save(new Local("República Checa", "Praga"));
    }

    public Local findLocalById(String id) {
        return repo.findById(id).get();
    }

    public java.util.List<Local> obterLocais() {
        return repo.findAll();
    }
    
}
