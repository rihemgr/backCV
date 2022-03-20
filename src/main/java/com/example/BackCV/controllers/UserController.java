package com.example.BackCV.controllers;

import java.util.List;

import com.example.BackCV.entities.User;
import com.example.BackCV.services.UserService;

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

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController

@RequestMapping("/User")
public class UserController {

    @Autowired
    UserService userService;
     
 
     @GetMapping("/all")
     
     public ResponseEntity<List<User>> GetAllUsers() {
        
         List <User> competances=this.userService.findAllUsers();
         return new ResponseEntity<>(competances,HttpStatus.OK);
         
     }
 
     @GetMapping("/find/{id}")
     
     public ResponseEntity <User> GetUserbyId(@PathVariable("id") Long id){
        
         User user=this.userService.findUserbyID(id).get();
         return new ResponseEntity<>(user,HttpStatus.OK);
         
     }
 
 
     @PostMapping("/add")
     
     public ResponseEntity <User> addUser(@RequestBody User user){
        
        User newUser= this.userService.addUser(user);
         return new ResponseEntity<>(newUser,HttpStatus.CREATED);
         
     }
 
     
     @PutMapping("/update")
     
     public ResponseEntity <User> updateCompetance(@RequestBody User user){
        
        User updateUser= this.userService.updateUser(user);
         return new ResponseEntity<>(updateUser,HttpStatus.OK);
         
     }
 
     @DeleteMapping("/delete/{id}")
     
     public ResponseEntity <User> deleteCompetance(@PathVariable("id") Long id){
        
         this.userService.deleteUserbyID(id);
         return new ResponseEntity<>(HttpStatus.OK);
         
     }
 
    
}
