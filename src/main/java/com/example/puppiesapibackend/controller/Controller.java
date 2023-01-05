package com.example.puppiesapibackend.controller;


import com.example.puppiesapibackend.dto.PuppyDTO;
import com.example.puppiesapibackend.model.Puppies;
import com.example.puppiesapibackend.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/puppies")
public class Controller {

    @Autowired
    Service service;

    @GetMapping
    public ResponseEntity<?> getAllPuppies (){
        return ResponseEntity.ok(service.getAllPuppies());
    }

    @GetMapping("/{puppyId}")
    public ResponseEntity<?> getSpecificPuppy(@PathVariable Long puppyId) {
        return ResponseEntity.ok(service.getSpecificPuppy(puppyId));
    }

    @PostMapping
    public ResponseEntity<?> createPuppy(@RequestBody PuppyDTO puppyDTO){
        service.createPuppy(puppyDTO);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{puppyId}")
    public ResponseEntity<?> updatePuppy(@PathVariable long puppyId, @RequestBody PuppyDTO puppyDTO) {
        Optional<Puppies> existingPuppy = (Optional<Puppies>) service.getSpecificPuppy(puppyId);
        if (!existingPuppy.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        Puppies puppy = existingPuppy.get();
        puppy.setPuppyName(puppyDTO.puppyName());
        puppy.setPuppyBreed(puppyDTO.puppyBreed());
        puppy.setPuppyBirthday(puppyDTO.puppyBirthday());
        service.updatePuppy(puppy);
        return ResponseEntity.ok().build();
    }


    @DeleteMapping("/{puppyId}")
    public ResponseEntity<?> deletePuppy(@PathVariable Long puppyId) {
        service.deletePuppy(puppyId);
        return ResponseEntity.ok().build();
    }
}
