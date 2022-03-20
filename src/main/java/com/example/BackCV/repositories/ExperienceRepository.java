package com.example.BackCV.repositories;

import com.example.BackCV.entities.Experience;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience,String> {
    
}