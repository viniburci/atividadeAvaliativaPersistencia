package com.example.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.criteria.JoinType;

import com.example.demo.AtorPrincipal;
import com.example.demo.AtorCoadjuvante;
import com.example.demo.Diretor;

import org.hibernate.engine.transaction.spi.JoinStatus;

@Entity
public class Filme extends BaseEntity {

    private String nome;
    private int duraçaoEmMinutos;
    private double totalBilheteria;

    @OneToOne
    private Local localGravaçao;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<AtorCoadjuvante> atoresCoadjuvantes;
    @ManyToOne(fetch=FetchType.EAGER)
    private AtorPrincipal atorPrincipal;
    @OneToOne
    private Diretor diretor;

    public Filme() {
        super();
    }

    public Filme(String nome, int duraçaoEmMinutos) {
        this();
        this.nome = nome;
        this.duraçaoEmMinutos = duraçaoEmMinutos;
    }

    public Filme(String nome, int duraçaoEmMinutos, AtorPrincipal atorPrincipal, Diretor diretor) {
        this();
        this.nome = nome;
        this.duraçaoEmMinutos = duraçaoEmMinutos;
        this.atorPrincipal = atorPrincipal;
        this.diretor = diretor;
    }

    public int getDuraçaoEmMinutos() {
        return duraçaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }
    public AtorPrincipal getAtorPrincipal() {
        return atorPrincipal;
    }
    public Diretor getDiretor() {
        return diretor;
    }
    public double getTotalBilheteria() {
        return totalBilheteria;
    }
    public List<AtorCoadjuvante> getAtoresCoadjuvantes() {
        return atoresCoadjuvantes;
    }
    public Local getLocalGravaçao() {
        return localGravaçao;
    }




    public void setDuraçaoEmMinutos(int duraçaoEmMinutos) {
        this.duraçaoEmMinutos = duraçaoEmMinutos;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAtorPrincipal(AtorPrincipal atorPrincipal) {
        this.atorPrincipal = atorPrincipal;
        atorPrincipal.setFilmesParticipados(this);
    }
    public void setAtoresCoadjuvantes(List<AtorCoadjuvante> atoresCoadjuvantes) {
        this.atoresCoadjuvantes = atoresCoadjuvantes;
        for (AtorCoadjuvante atorCoadjuvante : atoresCoadjuvantes) {
            atorCoadjuvante.setFilmeParticipado(this);
        }
    }
    public void setAtorCoadjuvante(AtorCoadjuvante ator){
        this.atoresCoadjuvantes.add(ator);
        ator.setFilmeParticipado(this);
    }
    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
        diretor.setFilmeProduzido(this);
    }
    public void setTotalBilheteria(double totalBilheteria) {
        this.totalBilheteria = totalBilheteria;
    }
    public void setLocalGravaçao(Local localGravaçao) {
        this.localGravaçao = localGravaçao;
    }

    
    @Override
    public String toString() {
        return"{"+ "Filme: " +
        " id='" + getId() + "'" +
        ", nome='" + getNome() + "'" +
        ", duração em minutos='" + getDuraçaoEmMinutos() + "'" +
        "diretor='" + getDiretor() + "'" +
        "ator principal='" + getAtorPrincipal() + "'" +
        "ator coadjuvante='" + getAtoresCoadjuvantes() + "'" +
        "local de gravaçao='" + getLocalGravaçao() + "'" +
        "}";
    }

}
