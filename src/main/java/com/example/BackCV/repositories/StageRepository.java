package com.example.BackCV.repositories;

import com.example.BackCV.entities.Stage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StageRepository extends JpaRepository<Stage,String> {
    
}