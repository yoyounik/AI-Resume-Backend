package com.example.aiResumeBuilder.repository;


import com.example.aiResumeBuilder.entity.Resume;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResumeRepository extends MongoRepository<Resume, String> {

}