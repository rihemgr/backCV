package com.example.BackCV.controllers;

import java.util.List;

import com.example.BackCV.entities.Stage;
import com.example.BackCV.services.StageService;

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
@RequestMapping("/Stage")
public class StageController {

    @Autowired
    StageService stageService;
     
 
     @GetMapping("/all")
     
     public ResponseEntity<List<Stage>> GetAllStages() {
        
         List <Stage> stages=this.stageService.findAllStages();
         return new ResponseEntity<>(stages,HttpStatus.OK);
         
     }
 
     @GetMapping("/find/{id}")
     
     public ResponseEntity <Stage> GetStagebyId(@PathVariable("id") String id){
        
         Stage stage=this.stageService.findStagebyID(id).get();
         return new ResponseEntity<>(stage,HttpStatus.OK);
         
     }
 
 
     @PostMapping("/add")
     
     public ResponseEntity <Stage> addProjet(@RequestBody Stage  stage){
        
        Stage newStage= this.stageService.addStage(stage);
         return new ResponseEntity<>(newStage,HttpStatus.CREATED);
         
     }
 
     
     @PutMapping("/update")
     
     public ResponseEntity <Stage> updateStage(@RequestBody Stage stage){
        
        Stage updateStage= this.stageService.addStage(stage);
         return new ResponseEntity<>(updateStage,HttpStatus.OK);
         
     }
 
     @DeleteMapping("/delete/{id}")
     
     public ResponseEntity <Stage> deleteCompetance(@PathVariable("id") String id){
        
         this.stageService.deleteStagebyID(id);
         return new ResponseEntity<>(HttpStatus.OK);
         
     }
 
    
}

