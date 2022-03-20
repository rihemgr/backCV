package com.example.BackCV.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Competance  implements Serializable{
    
   
    @Id
    private String NomCompetance;

    @ManyToOne
private User user;

    public Competance() {
    }

    public Competance(String nomCompetance) {
        NomCompetance = nomCompetance;
    }

    public String getNomCompetance() {
        return NomCompetance;
    }

    public void setNomCompetance(String nomCompetance) {
        NomCompetance = nomCompetance;
    }

    

  

    @Override
    public String toString() {
        return "Competance [NomCompetance=" + NomCompetance + "]";
    }


    


    

    
    
}
