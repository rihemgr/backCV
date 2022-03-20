package com.example.BackCV.repositories;

import com.example.BackCV.entities.Competance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetanceRepository extends JpaRepository<Competance,String> {
    
}
