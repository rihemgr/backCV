package com.example.BackCV.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Experience implements Serializable {

    
    @Id
    private String NomExperience;

    @ManyToOne
private User user;

    public Experience() {
    }

    public Experience(String nomExperience) {
        NomExperience = nomExperience;
    }

    public String getNomExperience() {
        return NomExperience;
    }

    public void setNomExperience(String nomExperience) {
        NomExperience = nomExperience;
    }

    

   

    @Override
    public String toString() {
        return "Experience [NomExperience=" + NomExperience + "]";
    }

    

    

    
    
}
