package com.example.BackCV.entities;

import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Activité implements Serializable {
    
@ManyToOne
private User user;


  
    @Id
    private String NomActivité;

    public Activité() {
    }

    public Activité(String nomActivité) {
        NomActivité = nomActivité;
    }

    public String getNomActivité() {
        return NomActivité;
    }

    

    

    public void setNomActivité(String nomActivité) {
        NomActivité = nomActivité;
    }

    @Override
    public String toString() {
        return "Activité [NomActivité=" + NomActivité + "]";
    }


    
    


    

    
}
