package com.example.BackCV.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import com.fasterxml.jackson.annotation.JsonView;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     
    private String nom;
    private String email;
    private String imageUrl;
    private String numTel;
    private String adresse;
    private String profil;
    private String education;
    private String centreInteret;
    

    
    
    
    @OneToMany( cascade=CascadeType.ALL, mappedBy = "user", fetch = FetchType.LAZY)
    private List<Experience> experiences ;

    
    @OneToMany( cascade=CascadeType.ALL, mappedBy = "user", fetch = FetchType.LAZY)
    private List<Stage> stages;

    @OneToMany( cascade=CascadeType.ALL, mappedBy = "user", fetch = FetchType.LAZY)
    private List<Competance> competances;

    @OneToMany( cascade=CascadeType.ALL, mappedBy = "user", fetch = FetchType.LAZY)
    private List<Projet> projets;

    @OneToMany( cascade=CascadeType.ALL, mappedBy = "user", fetch = FetchType.LAZY)
    private List<Langues> langues;
   
    @OneToMany( cascade=CascadeType.ALL, mappedBy = "user", fetch = FetchType.LAZY)
    private List<Experience> activités;

    @OneToMany( cascade=CascadeType.ALL, mappedBy = "user", fetch = FetchType.LAZY)
    private List<Certificat> certificats;


    public User() {
    }


    public User(Long id, String nom, String email, String imageUrl, String numTel, String adresse, String profil,
            String education, String centreInteret, List<Experience> experiences, List<Stage> stages,
            List<Competance> competances, List<Projet> projets, List<Langues> langues, List<Experience> activités,
            List<Certificat> certificats) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.imageUrl = imageUrl;
        this.numTel = numTel;
        this.adresse = adresse;
        this.profil = profil;
        this.education = education;
        this.centreInteret = centreInteret;
        this.experiences = experiences;
        this.stages = stages;
        this.competances = competances;
        this.projets = projets;
        this.langues = langues;
        this.activités = activités;
        this.certificats = certificats;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getImageUrl() {
        return imageUrl;
    }


    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public String getNumTel() {
        return numTel;
    }


    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }


    public String getAdresse() {
        return adresse;
    }


    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    public String getProfil() {
        return profil;
    }


    public void setProfil(String profil) {
        this.profil = profil;
    }


    public String getEducation() {
        return education;
    }


    public void setEducation(String education) {
        this.education = education;
    }


    public String getCentreInteret() {
        return centreInteret;
    }


    public void setCentreInteret(String centreInteret) {
        this.centreInteret = centreInteret;
    }


    public List<Experience> getExperiences() {
        return experiences;
    }


    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;
    }


    public List<Stage> getStages() {
        return stages;
    }


    public void setStages(List<Stage> stages) {
        this.stages = stages;
    }


    public List<Competance> getCompetances() {
        return competances;
    }


    public void setCompetances(List<Competance> competances) {
        this.competances = competances;
    }


    public List<Projet> getProjets() {
        return projets;
    }


    public void setProjets(List<Projet> projets) {
        this.projets = projets;
    }


    public List<Langues> getLangues() {
        return langues;
    }


    public void setLangues(List<Langues> langues) {
        this.langues = langues;
    }


    public List<Experience> getActivités() {
        return activités;
    }


    public void setActivités(List<Experience> activités) {
        this.activités = activités;
    }


    public List<Certificat> getCertificats() {
        return certificats;
    }


    public void setCertificats(List<Certificat> certificats) {
        this.certificats = certificats;
    }


    @Override
    public String toString() {
        return "User [activités=" + activités + ", adresse=" + adresse + ", centreInteret=" + centreInteret
                + ", certificats=" + certificats + ", competances=" + competances + ", education=" + education
                + ", email=" + email + ", experiences=" + experiences + ", id=" + id + ", imageUrl=" + imageUrl
                + ", langues=" + langues + ", nom=" + nom + ", numTel=" + numTel + ", profil=" + profil + ", projets="
                + projets + ", stages=" + stages + "]";
    }


   


    




    
}
