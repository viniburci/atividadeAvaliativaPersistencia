package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

@Entity
public class AtorCoadjuvante extends Pessoa {

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Filme> filmesParticipados = new ArrayList<>();
        

    public AtorCoadjuvante() {
        super();
    }

    public AtorCoadjuvante(String nome) {
        super(nome);
    }

    public void setFilmesParticipados(List<Filme> filmesParticipados) {
        this.filmesParticipados = filmesParticipados;
    }

    public void setFilmeParticipado(Filme filme){
        this.filmesParticipados.add(filme);
    }

    public List<Filme> getFilmesParticipados() {
        return filmesParticipados;
    }

    public double getCacheTotalFilmes(){
        double totalCache = 0.00;
        for (Filme filme : filmesParticipados) {
            totalCache = totalCache + (filme.getTotalBilheteria()/10);
        }
        return totalCache;
    }
}











