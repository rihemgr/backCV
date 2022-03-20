package com.example.BackCV.services;

import java.util.List;
import java.util.Optional;

import com.example.BackCV.entities.Experience;
import com.example.BackCV.repositories.ExperienceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExperienceService {
    


    @Autowired
    ExperienceRepository experienceRepository;
 

 public Experience addCompetance(Experience experience){
     
     return experienceRepository.save(experience);

 }

 public List<Experience>findAllExperiences(){
     return experienceRepository.findAll();
 }

 public Experience updateExperience(Experience NewExperience){
    return  experienceRepository.save(NewExperience);

     }

 public Optional<Experience> findExperiencebyID(String id){
    
     return experienceRepository.findById(id);


 } 
 
 public void deleteExperiencebyID(String id){
    
    experienceRepository.deleteById(id);
 }
     
     

}
