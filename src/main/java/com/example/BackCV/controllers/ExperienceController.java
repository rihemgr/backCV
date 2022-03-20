package com.example.BackCV.controllers;

import java.util.List;

import com.example.BackCV.entities.Experience;
import com.example.BackCV.services.ExperienceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/Experience")
public class ExperienceController {

    @Autowired
    ExperienceService experienceService;
     
 
     @GetMapping("/all")
     
     public ResponseEntity<List<Experience>> GetAllCompetances() {
        
         List <Experience> experiences=this.experienceService.findAllExperiences();
         return new ResponseEntity<>(experiences,HttpStatus.OK);
         
     }
 
     @GetMapping("/find/{id}")
     
     public ResponseEntity <Experience> GetExperiencebyId(@PathVariable("id") String id){
        
         Experience experience=this.experienceService.findExperiencebyID(id).get();
         return new ResponseEntity<>(experience,HttpStatus.OK);
         
     }
 
 
     @PostMapping("/add")
     
     public ResponseEntity <Experience> addExperience(@RequestBody Experience experience){
        
        Experience newExperience= this.experienceService.addCompetance(experience);
         return new ResponseEntity<>(newExperience,HttpStatus.CREATED);
         
     }
 
     
     @PutMapping("/update")
     
     public ResponseEntity <Experience> updateExperience(@RequestBody Experience experience){
        
        Experience updateExperience= this.experienceService.updateExperience(experience);
         return new ResponseEntity<>(updateExperience,HttpStatus.OK);
         
     }
 
     @DeleteMapping("/delete/{id}")
     
     public ResponseEntity <Experience> deleteExperience(@PathVariable("id") String id){
        
         this.experienceService.deleteExperiencebyID(id);
         return new ResponseEntity<>(HttpStatus.OK);
         
     }
 



    
}

