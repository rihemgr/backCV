package com.example.BackCV.controllers;

import java.util.List;

import com.example.BackCV.entities.Projet;
import com.example.BackCV.services.ProjetService;

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
@RequestMapping("/Projet")
public class ProjetController {

    @Autowired
    ProjetService projetService;
     
 
     @GetMapping("/all")
     
     public ResponseEntity<List<Projet>> GetAllProjets() {
        
         List <Projet> competances=this.projetService.findAllProjets();
         return new ResponseEntity<>(competances,HttpStatus.OK);
         
     }
 
     @GetMapping("/find/{id}")
     
     public ResponseEntity <Projet> GetProjetbyId(@PathVariable("id") String id){
        
         Projet projet=this.projetService.findProjetbyID(id).get();
         return new ResponseEntity<>(projet,HttpStatus.OK);
         
     }
 
 
     @PostMapping("/add")
     
     public ResponseEntity <Projet> addProjet(@RequestBody Projet projet){
        
        Projet newProjet= this.projetService.addProjet(projet);
         return new ResponseEntity<>(newProjet,HttpStatus.CREATED);
         
     }
 
     
     @PutMapping("/update")
     
     public ResponseEntity <Projet> updateProjet(@RequestBody Projet projet){
        
        Projet updateProjet= this.projetService.updateProjet(projet);
         return new ResponseEntity<>(updateProjet,HttpStatus.OK);
         
     }
 
     @DeleteMapping("/delete/{id}")
     
     public ResponseEntity <Projet> deleteCompetance(@PathVariable("id") String id){
        
         this.projetService.deleteProjetbyID(id);
         return new ResponseEntity<>(HttpStatus.OK);
         
     }
 
    
}
