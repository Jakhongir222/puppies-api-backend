package com.example.puppiesapibackend.service;


import com.example.puppiesapibackend.dto.PuppyDTO;
import com.example.puppiesapibackend.model.Puppies;
import com.example.puppiesapibackend.repository.PuppyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    PuppyRepository repo;

    public Object getAllPuppies() {
        return repo.getAllPuppies();
    }

    public Object getSpecificPuppy(long puppyId) {
        return repo.getSpecificPuppy(puppyId);
    }

    public Object createPuppy(PuppyDTO puppyDTO) {
        return repo.createPuppy(new Puppies(puppyDTO.puppyBreed(), puppyDTO.puppyName(), puppyDTO.puppyBirthday()));
    }

    public void updatePuppy(long puppyId, PuppyDTO puppyDTO) {
        Optional<?> existingPuppy = (Optional<?>) repo.getSpecificPuppy(puppyId);
        if(existingPuppy.isPresent()){
            Puppies updatePuppy = new Puppies(puppyDTO.puppyBreed(), puppyDTO.puppyName(), puppyDTO.puppyBirthday());
            repo.save(updatePuppy);
        }else{
            throw new RuntimeException("Puppy not found");
        }
    }

    public void deletePuppy(long puppyId) {
         repo.deletePuppy(puppyId);
    }

}
