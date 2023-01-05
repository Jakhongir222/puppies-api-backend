package com.example.puppiesapibackend.service;


import com.example.puppiesapibackend.dto.PuppyDTO;
import com.example.puppiesapibackend.model.Puppies;
import com.example.puppiesapibackend.repository.PuppyRepository;
import org.springframework.beans.factory.annotation.Autowired;



@org.springframework.stereotype.Service
public class Service {

    @Autowired
    PuppyRepository repo;

    public Object getAllPuppies() {
        return repo.getAllPuppies();
    }

    public Object getSpecificPuppy(Long puppyId) {
        return repo.getSpecificPuppy(puppyId);
    }

    public Object createPuppy(PuppyDTO puppyDTO) {
        return repo.createPuppy(new Puppies(puppyDTO.puppyBreed(), puppyDTO.puppyName(), puppyDTO.puppyBirthday()));
    }

    public void deletePuppy(Long puppyId) {
         repo.deletePuppy(puppyId);
    }

    public void updatePuppy(Puppies puppy) {
        repo.save(puppy);
    }
}
