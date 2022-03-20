package com.example.BackCV.controllers;

import java.util.List;

import com.example.BackCV.entities.Activité;
import com.example.BackCV.services.ActivitéService;

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
@RequestMapping("/Activité")
public class ActivitéController {


    
    @Autowired
    ActivitéService activitéService;

    @GetMapping("/all")
    
    public ResponseEntity<List<Activité>>GetAllActivities(){
       
        List <Activité> activities=this.activitéService.findAllActivites();
        return new ResponseEntity<>(activities,HttpStatus.OK);
        
    }

    @GetMapping("/find/{id}")
    
    public ResponseEntity <Activité> GetActivitébyId(@PathVariable("id") String id){
       
        Activité activité=this.activitéService.findActivitebyID(id).get();
        return new ResponseEntity<>(activité,HttpStatus.OK);
        
    }


    @PostMapping("/add")
    
    public ResponseEntity <Activité> addActivité(@RequestBody Activité activité){
       
       Activité newActivité= this.activitéService.addActivité(activité);
        return new ResponseEntity<>(newActivité,HttpStatus.CREATED);
        
    }

    
    @PutMapping("/update")
    
    public ResponseEntity <Activité> updateActivité(@RequestBody Activité activité){
       
       Activité updateActivité= this.activitéService.updateActivité(activité);
        return new ResponseEntity<>(updateActivité,HttpStatus.OK);
        
    }

    @DeleteMapping("/delete/{id}")

    public ResponseEntity <Activité> deleteEmployee(@PathVariable("id") String id){
       
        this.activitéService.deleteEmployeebyID(id);
        return new ResponseEntity<>(HttpStatus.OK);
        
    }


    
}

    


