package com.example.BackCV.repositories;

import com.example.BackCV.entities.Langues;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LangueRepository  extends JpaRepository<Langues,String>{
    
}