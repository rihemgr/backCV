package com.example.BackCV.services;


import java.util.List;
import java.util.Optional;

import com.example.BackCV.entities.Certificat;
import com.example.BackCV.repositories.CertificatRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CertificatService {


    @Autowired
    CertificatRepository certificatRepository;
 

 public Certificat addCertificat(Certificat certificat){
     
     return certificatRepository.save(certificat);

 }

 public List<Certificat>findAllCertificats(){
     return certificatRepository.findAll();
 }

 public Certificat updateCertifat(Certificat NewCertificat){
    return  certificatRepository.save(NewCertificat);

     }

 public Optional<Certificat> findCertificatbyID(String id){
    
     return certificatRepository.findById(id);


 } 
 
 public void deleteCertificatbyID(String id){
        certificatRepository.deleteById(id);
 }
     
     

     
    
}
