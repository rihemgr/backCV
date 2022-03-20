package com.example.BackCV.services;

import java.util.List;
import java.util.Optional;

import com.example.BackCV.entities.Stage;
import com.example.BackCV.repositories.StageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StageService {

    @Autowired
    StageRepository stageRepository;
 

 public Stage addStage(Stage stage){
     
     return stageRepository.save(stage);

 }

 public List<Stage>findAllStages(){
     return stageRepository.findAll();
 }

 public Stage updateStage(Stage NewStage){
    return  stageRepository.save(NewStage);

     }

 public Optional<Stage> findStagebyID(String id){
    
     return stageRepository.findById(id);


 } 
 
 public void deleteStagebyID(String id){
    
    stageRepository.deleteById(id);
 }
     
     

    
}
