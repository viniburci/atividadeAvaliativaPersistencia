package com.example.demo.Services;

import javax.transaction.Transactional;

import com.example.demo.AtorCoadjuvante;

import com.example.demo.Repositories.AtorCoadjuvanteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AtorCoadjuvanteService {

    @Autowired
    private AtorCoadjuvanteRepository repo;
    

    public java.util.List<AtorCoadjuvante> obterTodos() {
		return repo.findAll();
    }
    
    public AtorCoadjuvante findAtorCoadjuvantelbyId (String id){
        return repo.findById(id).get();
    }
}
