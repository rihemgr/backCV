package com.example.BackCV.controllers;

import java.util.List;

import com.example.BackCV.entities.Certificat;
import com.example.BackCV.services.CertificatService;

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
@RequestMapping("/certificat")
public class CertificatController {


   @Autowired
   CertificatService certificatService;
    

    @GetMapping("/all")
    
    public ResponseEntity<List<Certificat>> GetAllCertificats() {
       
        List <Certificat> certificats=this.certificatService.findAllCertificats();
        return new ResponseEntity<>(certificats,HttpStatus.OK);
        
    }

    @GetMapping("/find/{id}")
    
    public ResponseEntity <Certificat> GetActivitébyId(@PathVariable("id") String id){
       
        Certificat certificat=this.certificatService.findCertificatbyID(id).get();
        return new ResponseEntity<>(certificat,HttpStatus.OK);
        
    }


    @PostMapping("/add")
    
    public ResponseEntity <Certificat> addCertificat(@RequestBody Certificat certificat){
       
       Certificat newCertificat= this.certificatService.addCertificat(certificat);
        return new ResponseEntity<>(newCertificat,HttpStatus.CREATED);
        
    }

    
    @PutMapping("/update")
    
    public ResponseEntity <Certificat> updateCertificat(@RequestBody Certificat certificat){
       
       Certificat updateCertificat= this.certificatService.updateCertifat(certificat);
        return new ResponseEntity<>(updateCertificat,HttpStatus.OK);
        
    }

    @DeleteMapping("/delete/{id}")
    
    public ResponseEntity <Certificat> deleteCertificat(@PathVariable("id") String id){
       
        this.certificatService.deleteCertificatbyID(id);
        return new ResponseEntity<>(HttpStatus.OK);
        
    }



    
}

