package com.example.BackCV.services;


import java.util.List;
import java.util.Optional;

import com.example.BackCV.entities.Competance;
import com.example.BackCV.repositories.CompetanceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CompetanceService {


    @Autowired
    CompetanceRepository competanceRepository;
 

 public Competance addCompetance(Competance competance){
     
     return competanceRepository.save(competance);

 }

 public List<Competance>findAllCompetances(){
     return competanceRepository.findAll();
 }

 public Competance updateCompetance(Competance NewCompetance){
    return  competanceRepository.save(NewCompetance);

     }

 public Optional<Competance> findCompetancebyID(String id){
    
     return competanceRepository.findById(id);


 } 
 
 public void deleteCompetancebyID(String id){
      competanceRepository.deleteById(id);
 }
     
     

     
    
}

