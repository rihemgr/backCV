package com.example.BackCV.services;

import java.util.List;
import java.util.Optional;

import com.example.BackCV.entities.Langues;
import com.example.BackCV.repositories.LangueRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LangueService {


    @Autowired
    LangueRepository langueRepository;
 

 public Langues addLangue(Langues langue){
     
     return langueRepository.save(langue);

 }

 public List<Langues>findAllLangues(){
     return langueRepository.findAll();
 }

 public Langues updateCompetance(Langues newLangues){
    return  langueRepository.save(newLangues);

     }

 public Optional<Langues> findLanguebyID(String id){
    
     return langueRepository.findById(id);



 } 
 
 public void deleteLanguebyID(String id){
    
    langueRepository.deleteById(id);
 }
     
     

    
}
