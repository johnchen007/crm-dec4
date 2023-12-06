package com.snva.crmproject.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.snva.crmproject.entity.Candidate;

@Service
public class CandidateServiceImpl implements CandidateService {
    private List<Candidate> candidateList = new ArrayList<>();

    @Override
    public String addCandidate(Candidate candidate) {
        
        candidateList.add(candidate);
        return "Candidate added successfully.";
    }

    @Override
    public List<Candidate> getAllCandidates() {
       
        return candidateList;
    }

    @Override
    public Candidate getCandidateById(String candidateId) {
        
        for (Candidate candidate : candidateList) {
            if (candidate.getCandidateId().equals(candidateId)) {
                return candidate;
            }
        }
        return null;
    }

    @Override
    public String updateCandidate(Candidate recruiter, Candidate recruitAdmin) {
        
        return "Candidate updated successfully.";
    }
}