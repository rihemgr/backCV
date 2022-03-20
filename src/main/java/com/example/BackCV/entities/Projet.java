package com.example.BackCV.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Projet  implements Serializable{

    @ManyToOne
    private User user;

    @Id
   
    private String NomProjet;

    
    public Projet() {
    }


    public Projet(String nomProjet) {
        NomProjet = nomProjet;
    }


    public String getNomProjet() {
        return NomProjet;
    }


    public void setNomProjet(String nomProjet) {
        NomProjet = nomProjet;
    }

    


    


    @Override
    public String toString() {
        return "Projet [NomProjet=" + NomProjet + "]";
    }

    





    
    
}

