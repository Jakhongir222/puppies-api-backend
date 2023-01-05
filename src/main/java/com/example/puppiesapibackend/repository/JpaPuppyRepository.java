package com.example.puppiesapibackend.repository;

import com.example.puppiesapibackend.model.Puppies;
import org.springframework.data.repository.CrudRepository;

public interface JpaPuppyRepository extends CrudRepository <Puppies, Long> {
}
