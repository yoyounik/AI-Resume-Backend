package com.example.aiResumeBuilder.controller;

import com.example.aiResumeBuilder.entity.Resume;
import com.example.aiResumeBuilder.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/resume")
public class ResumeController {
    @Autowired
    private ResumeService resumeService;

    @PostMapping
    public Resume SaveNewResume(Resume resume){
        return resumeService.createResume(resume);
    }

    @GetMapping
    public Optional<Resume> getNewResume(@PathVariable String id) {
        return resumeService.getResume(id);
    }

}
