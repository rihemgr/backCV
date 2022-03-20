package com.example.BackCV.repositories;

import com.example.BackCV.entities.Certificat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificatRepository extends JpaRepository<Certificat,String>{
    
}
