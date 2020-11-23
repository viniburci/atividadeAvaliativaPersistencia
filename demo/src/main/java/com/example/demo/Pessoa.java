package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa extends BaseEntity{

    private String nome;
    private String cidadeNatal;
    private int idade;

    //private Set<Filme> filmesParticipados = new HashSet<>();

    public Pessoa() {
        super();
    }

    public Pessoa(String nome) {
        this();
        this.nome = nome;
    }
    
    public String getCidadeNatal() {
        return cidadeNatal;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public void setCidadeNatal(String cidadeNatal) {
        this.cidadeNatal = cidadeNatal;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Pessoa, " + 
        "id='" + getId() + "', " +
        "nome='" + getNome() + "', " +
        "idade='" + getIdade() + "', " +
        "cidade natal='" + getCidadeNatal() + "\n";
    }
}
