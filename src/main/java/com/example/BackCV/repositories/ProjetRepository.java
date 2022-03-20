package com.example.BackCV.repositories;

import com.example.BackCV.entities.Projet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetRepository extends JpaRepository<Projet,String> {
    
}
