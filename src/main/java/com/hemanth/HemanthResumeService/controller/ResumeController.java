package com.hemanth.HemanthResumeService.controller;

import com.hemanth.HemanthResumeService.service.ResumeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/Hemanth")
@Tag(name = "Resume API", description = "API to provide Resume and Portfolio details")
public class ResumeController {


    private final ResumeService resumeService;
    @Autowired
    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @Operation(summary = "Get About Me Info", description = "Fetch personal and professional details")
    @GetMapping("/aboutMe") // This should map to http://localhost:8080/api/v1/about
    public Map<String, String> getAboutMeInfo() {
        return resumeService.getAboutInfo();
    }

    @Operation(summary = "Get Education Info", description = "Fetch educational qualifications and certifications")
    @GetMapping("myEducation")
    public Map<String, Object> getMyEducationInfo() {
        return resumeService.getEducationInfo();
    }

    @Operation(summary = "Get Project List", description = "Fetch a list of projects in the portfolio")
    @GetMapping("/projects") // This should map to http://localhost:8080/api/v1/projects
    public List<Map<String, String>> getProjects() {
        return resumeService.getProjects();
    }

    @Operation(summary = "Get Professional Experience", description = "Fetch professional experience details including responsibilities and achievements")
    @GetMapping("/professionalExperience") // This should map to http://localhost:8080/api/v1/Hemanth/professionalExperience
    public Map<String, Object> getProfessionalExperience() {
        return resumeService.getProfessionalExperience();
    }

}
