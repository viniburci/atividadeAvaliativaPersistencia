package com.example.demo;

import javax.persistence.Entity;

@Entity
public class Local extends BaseEntity{
    private String País;
    private String Cidade;

    public Local() {
        super();
    }

    public Local(String país, String cidade) {
        this();
        this.País = país;
        this.Cidade = cidade;
    }

    public String getCidade() {
        return Cidade;
    }
    public String getPaís() {
        return País;
    }



    public void setCidade(String cidade) {
        Cidade = cidade;
    }
    public void setPaís(String país) {
        País = país;
    }
   
    @Override
    public String toString() {
        return "LOCAL: PAIS='" + getPaís()+ "', " + "CIDADE='" + getCidade() + "', ID='" + getId() + "'";
    }
}
