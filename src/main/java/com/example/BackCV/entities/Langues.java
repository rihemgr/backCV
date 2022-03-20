package com.example.BackCV.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Langues implements Serializable {


    @ManyToOne
private User user;

    @Id
    
    private String NomLangue;

    public Langues() {
    }

    public Langues(String nomLangue) {
        NomLangue = nomLangue;
    }

    public String getNomLangue() {
        return NomLangue;
    }

    public void setNomLangue(String nomLangue) {
        NomLangue = nomLangue;
    }

    

   

    @Override
    public String toString() {
        return "Langues [NomLangue=" + NomLangue + "]";
    }


    


    

    
    
}
