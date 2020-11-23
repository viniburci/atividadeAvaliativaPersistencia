package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.example.demo.Filme;

@Entity
public class Diretor extends Pessoa {

    @OneToOne
    private Filme filmeProduzido;

    public Diretor() {
        super();
    }
    
    public Diretor(String nome) {
        super(nome);
    }

    public void setFilmeProduzido(Filme filmeProduzido) {
        this.filmeProduzido = filmeProduzido;
    }

    public Filme getFilmeProduzido() {
        return filmeProduzido;
    }

    @Override
    public String toString(){
        return "Diretor: " +
        "id='" + getId() + "', " +
        "nome='" + getNome() + "', " +
        "idade='" + getIdade() + "', " +
        "cidade natal='" + getCidadeNatal() + "\n";
    }
}
