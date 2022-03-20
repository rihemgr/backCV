package com.example.BackCV.services;

import java.util.List;
import java.util.Optional;

import com.example.BackCV.entities.Activité;
import com.example.BackCV.repositories.ActivitéRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivitéService {

    @Autowired
       ActivitéRepository activitéRepository;
    

    public Activité addActivité(Activité activité){
        
        return activitéRepository.save(activité);

    }

    public List<Activité>findAllActivites(){
        return activitéRepository.findAll();
    }

    public Activité updateActivité(Activité NewActivité){
       return  activitéRepository.save(NewActivité);

        }

    public Optional<Activité> findActivitebyID(String id){
       
        return activitéRepository.findById(id);


    } 
    
    public void deleteEmployeebyID(String id){
         activitéRepository.deleteById(id);
    }
        
        

        
    }












    

