package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class AtorPrincipal extends Pessoa {

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Filme> filmesParticipados = new ArrayList<>();
    

    public AtorPrincipal() {
        super();
    }

    public AtorPrincipal(String nome) {
        super(nome);
    }

    public int getCacheTotalFilmes(){
        //get total de dinheiro de todos os filmes feitos
        return 0;
    }

    public void setFilmesParticipados(Filme filmesParticipados) {
        this.filmesParticipados.add(filmesParticipados);
    }
    public List<Filme> getFilmesParticipados() {
        return filmesParticipados;
    }
}
