package com.example.puppiesapibackend.repository;

import com.example.puppiesapibackend.model.Puppies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PuppyRepository {

    @Autowired
    private JpaPuppyRepository repo;


    public Object getAllPuppies() {
        return repo.findAll();
    }

    public Object getSpecificPuppy(long puppyId) {
        return repo.findById(puppyId);
    }


    public Object createPuppy(Puppies puppies) {
        return repo.save(puppies);
    }

    public void deletePuppy(long puppyId) {
        repo.deleteById(puppyId);
    }

    public Object save(Puppies updatePuppy) {
        return repo.save(updatePuppy);
    }
}
