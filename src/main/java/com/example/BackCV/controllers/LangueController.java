package com.example.BackCV.controllers;

import java.util.List;

import com.example.BackCV.entities.Langues;
import com.example.BackCV.services.LangueService;

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
@RequestMapping("/Langue")
public class LangueController {

    @Autowired
    LangueService langueService;
     
 
     @GetMapping("/all")
     
     public ResponseEntity<List<Langues>> GetAllLangues() {
        
         List <Langues> langues=this.langueService.findAllLangues();
         return new ResponseEntity<>(langues,HttpStatus.OK);
         
     }
 
     @GetMapping("/find/{id}")
     
     public ResponseEntity <Langues> GetLanguebyId(@PathVariable("id") String id){
        
         Langues langue=this.langueService.findLanguebyID(id).get();
         return new ResponseEntity<>(langue,HttpStatus.OK);
         
     }
 
 
     @PostMapping("/add")
     
     public ResponseEntity <Langues> addLangue(@RequestBody Langues langue){
        
        Langues newLangue= this.langueService.addLangue(langue);
         return new ResponseEntity<>(newLangue,HttpStatus.CREATED);
         
     }
 
     
     @PutMapping("/update")
    
     public ResponseEntity <Langues> updateCompetance(@RequestBody Langues langue){
        
        Langues updateLangue= this.langueService.updateCompetance(langue);
         return new ResponseEntity<>(updateLangue,HttpStatus.OK);
         
     }
 
     @DeleteMapping("/delete/{id}")
     
     public ResponseEntity <Langues> deleteCompetance(@PathVariable("id") String id){
        
         this.langueService.deleteLanguebyID(id);
         return new ResponseEntity<>(HttpStatus.OK);
         
     }
 
    
}
