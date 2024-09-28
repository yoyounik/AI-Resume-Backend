package com.example.aiResumeBuilder.entity;


import com.example.aiResumeBuilder.entity.Education;
import com.example.aiResumeBuilder.entity.Experience;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "resumes")
@Data
public class Resume {
    @Id
    private String id;
    private String name;
    private String email;
    private List<Experience> experiences;
    private List<Education> educations;
    private List<String> skills;
}
