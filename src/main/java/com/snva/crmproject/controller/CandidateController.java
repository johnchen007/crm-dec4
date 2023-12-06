package com.snva.crmproject.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snva.crmproject.entity.Candidate;
import com.snva.crmproject.service.CandidateService;

@RestController
@RequestMapping("/CandidateBasicDetails ")
public class CandidateController {
    @Autowired
    private CandidateService candidateService;

    @PostMapping("/add")
    public String addCandidate(@RequestBody Candidate candidate) {
        return candidateService.addCandidate(candidate);
    }

    @GetMapping("/all")
    public List<Candidate> getAllCandidates() {
        return candidateService.getAllCandidates();
    }

    @GetMapping("/{candidateId}")
    public Candidate getCandidateById(@PathVariable String candidateId) {
        return candidateService.getCandidateById(candidateId);
    }

    @PutMapping("/update")
    public String updateCandidate(@RequestBody Candidate recruiter, @RequestBody Candidate recruitAdmin) {
        return candidateService.updateCandidate(recruiter, recruitAdmin);
    }
}