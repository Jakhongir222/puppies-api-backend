package com.example.puppiesapibackend.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.UUID;

@Entity
public class Puppies {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long puppyId;
    @Column(name= "puppy_breed")
    private String puppyBreed;
    @Column(name="puppy_name")
    private String puppyName;
    @Column(name="puppy_birthday")
    private String puppyBirthday;
    public Puppies(){
    }

    public Puppies(String puppyBreed, String puppyName, String puppyBirthday) {
        this.puppyBreed = puppyBreed;
        this.puppyName = puppyName;
        this.puppyBirthday = puppyBirthday;
    }

    public Puppies(UUID randomUUID, String puppyBreed, String puppyName, String puppyBirthday) {
    }

    public long getPuppyId() {
        return puppyId;
    }

    public void setPuppyId(long puppyId) {
        this.puppyId = puppyId;
    }

    public String getPuppyBreed() {
        return puppyBreed;
    }

    public void setPuppyBreed(String puppyBreed) {
        this.puppyBreed = puppyBreed;
    }

    public String getPuppyName() {
        return puppyName;
    }

    public void setPuppyName(String puppyName) {
        this.puppyName = puppyName;
    }

    public String getPuppyBirthday() {
        return puppyBirthday;
    }

    public void setPuppyBirthday(String puppyBirthday) {
        this.puppyBirthday = puppyBirthday;
    }
}
