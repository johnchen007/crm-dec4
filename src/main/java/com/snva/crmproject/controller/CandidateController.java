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

import com.snva.crmproject.entity.CandidateBasicDetails;
import com.snva.crmproject.service.CandidateService;

@RestController
@RequestMapping("/Candidates")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @PostMapping("/add")
    public String addCandidate(@RequestBody CandidateBasicDetails candidateBasicDetails) {
        System.out.println(candidateBasicDetails.getDetails().getAddressCity());
    	return candidateService.addNewCandidate(candidateBasicDetails);
    }

    @GetMapping("/all")
    public List<CandidateBasicDetails> getAllCandidates() {
        return candidateService.getAllCandidates();
    }

    @GetMapping("/{candidateId}")
    public CandidateBasicDetails getCandidateById(@PathVariable String candidateId) {
        return candidateService.getCandidateById(candidateId);
    }

    @PutMapping("/update")
    public String updateCandidate(@RequestBody CandidateBasicDetails updatedCandidate) {
        return candidateService.updateCandidate(updatedCandidate);
    }
}