package com.example.BackCV.repositories;



import com.example.BackCV.entities.Activité;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource
public interface ActivitéRepository  extends JpaRepository<Activité,String>{
    
}