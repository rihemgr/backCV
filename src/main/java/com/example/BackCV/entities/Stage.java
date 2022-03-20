package com.example.BackCV.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Stage implements Serializable {

    @ManyToOne
private User user;

    @Id
    private String nomProjet;

    public Stage() {
    }

    public Stage(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public String getNomProjet() {
        return nomProjet;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    

   
    @Override
    public String toString() {
        return "Stage [nomProjet=" + nomProjet + "]";
    }

    
    

    

    
    
}
