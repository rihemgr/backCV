package com.example.BackCV.services;


import java.util.List;
import java.util.Optional;

import com.example.BackCV.entities.User;
import com.example.BackCV.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    
    UserRepository userRepository;
 

 public User addUser(User user){
     
     return userRepository.save(user);

 }

 public List<User>findAllUsers(){
     return userRepository.findAll();
 }

 public User updateUser(User NewUser){
    return  userRepository.save(NewUser);

     }

 public Optional<User> findUserbyID(Long id){
    
     return userRepository.findById(id);


 } 
 
 public void deleteUserbyID(Long id){
      
    userRepository.deleteById(id);
 }
     
     

    
}
