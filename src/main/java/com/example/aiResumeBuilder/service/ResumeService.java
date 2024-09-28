package com.example.aiResumeBuilder.service;

import com.example.aiResumeBuilder.entity.Resume;
import com.example.aiResumeBuilder.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ResumeService {
    @Autowired
    private ResumeRepository resumeRepository;

    public Resume createResume(Resume resume){
        return resumeRepository.save(resume);
    }

    public Optional<Resume> getResume(String id) {
        return resumeRepository.findById(id);
    }
}