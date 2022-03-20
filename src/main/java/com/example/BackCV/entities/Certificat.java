package com.example.BackCV.entities;

import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Certificat implements Serializable {

    @ManyToOne
private User user;
    @Id
    private String NomCertificat;

    public Certificat() {
    }

    public Certificat(String nomCertificat) {
        NomCertificat = nomCertificat;
    }

    public String getNomCertificat() {
        return NomCertificat;
    }

    public void setNomCertificat(String nomCertificat) {
        NomCertificat = nomCertificat;
    }

    

    

    @Override
    public String toString() {
        return "Certificat [NomCertificat=" + NomCertificat + "]";
    }


    


    

    
    
}

