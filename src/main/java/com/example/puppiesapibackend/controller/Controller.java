package com.example.puppiesapibackend.controller;


import com.example.puppiesapibackend.dto.PuppyDTO;
import com.example.puppiesapibackend.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<?> getSpecificPuppy(long puppyId) {
        return ResponseEntity.ok(service.getSpecificPuppy(puppyId));
    }

    @PostMapping
    public ResponseEntity<?> createPuppy(@PathVariable PuppyDTO puppyDTO){
        service.createPuppy(puppyDTO);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{puppyId}")
    public ResponseEntity<?> updatePuppy(@PathVariable long puppyId, @RequestBody PuppyDTO puppyDTO) {
        service.updatePuppy(puppyId, puppyDTO);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{puppyId}")
    public ResponseEntity<?> deletePuppy(long puppyId) {
        service.deletePuppy(puppyId);
        return ResponseEntity.ok().build();
    }
}
