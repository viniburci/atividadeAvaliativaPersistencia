package com.example.demo;

import java.util.Objects;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.ToString;

@Entity
public class Filme {
    @Id
    private String id;

    private String nome;
    private int duraçaoEmMinutos;

    public Filme() {
        super();
        this.id = UUID.randomUUID().toString();
    }

    public Filme(String nome, int duraçaoEmMinutos) {
        this();
        this.nome = nome;
        this.duraçaoEmMinutos = duraçaoEmMinutos;
    }

    public String getId() {
        return id;
    }

    public int getDuraçaoEmMinutos() {
        return duraçaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public void setDuraçaoEmMinutos(int duraçaoEmMinutos) {
        this.duraçaoEmMinutos = duraçaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Filme)) {
            return false;
        }
        Filme filme = (Filme) o;
        return Objects.equals(id, Filme.id);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return"{"+
        " id='" + getId() + "'" +
        ", nome='" + getNome() + "'" +
        ", duração em minutos='" + getDuraçaoEmMinutos() + "'" +
        "}";
    }
}
