package com.example.BackCV.controllers;

import java.util.List;

import com.example.BackCV.entities.Competance;
import com.example.BackCV.services.CompetanceService;

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
@RequestMapping("/Competance")
public class CompetanceController {

    @Autowired
   CompetanceService competanceService;
    

    @GetMapping("/all")
    
    public ResponseEntity<List<Competance>> GetAllCompetances() {
       
        List <Competance> competances=this.competanceService.findAllCompetances();
        return new ResponseEntity<>(competances,HttpStatus.OK);
        
    }

    @GetMapping("/find/{id}")
    
    public ResponseEntity <Competance> GetCompetancebyId(@PathVariable("id") String id){
       
        Competance competance=this.competanceService.findCompetancebyID(id).get();
        return new ResponseEntity<>(competance,HttpStatus.OK);
        
    }


    @PostMapping("/add")
    
    public ResponseEntity <Competance> addCompetance(@RequestBody Competance competance){
       
       Competance newCompetance= this.competanceService.addCompetance(competance);
        return new ResponseEntity<>(newCompetance,HttpStatus.CREATED);
        
    }

    
    @PutMapping("/update")
    
    public ResponseEntity <Competance> updateCompetance(@RequestBody Competance competance){
       
       Competance updateCompetance= this.competanceService.updateCompetance(competance);
        return new ResponseEntity<>(updateCompetance,HttpStatus.OK);
        
    }

    @DeleteMapping("/delete/{id}")
    
    public ResponseEntity <Competance> deleteCompetance(@PathVariable("id") String id){
       
        this.competanceService.deleteCompetancebyID(id);
        return new ResponseEntity<>(HttpStatus.OK);
        
    }


    
}
