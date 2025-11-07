package com.kalolytic.losdigitaljourney.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/applicants")
public class ApplicantController {

    @GetMapping("/ping")
    public String healthCheck() {
        return "Applicant API is up!";
    }
}