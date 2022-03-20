package com.example.BackCV.services;

import java.util.List;
import java.util.Optional;

import com.example.BackCV.entities.Projet;
import com.example.BackCV.repositories.ProjetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProjetService {


    @Autowired
    ProjetRepository projetRepository;
 

 public Projet addProjet(Projet projet){
     
     return projetRepository.save(projet);

 }

 public List<Projet>findAllProjets(){
     return projetRepository.findAll();
 }

 public  Projet updateProjet(Projet NewProjet){
    return  projetRepository.save(NewProjet);

     }

     
 public Optional<Projet> findProjetbyID(String id){
    
     return projetRepository.findById(id);


 } 
 
 public void deleteProjetbyID(String id){
      
    projetRepository.deleteById(id);
 }
 



}
