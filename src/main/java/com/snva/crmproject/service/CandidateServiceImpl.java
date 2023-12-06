package com.snva.crmproject.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.snva.crmproject.entity.Candidate;

@Service
public class CandidateServiceImpl implements CandidateService {
    private List<Candidate> candidateList = new ArrayList<>();

    @Override
    public String addNewCandidate(Candidate candidate) {
        Long candidateId = generateCandidateId();
        candidate.setCandidateId(candidateId);

        candidateList.add(candidate);
        return "Candidate added successfully. Candidate ID: " + candidateId;
    }

    @Override
    public List<Candidate> getAllCandidates() {
        return candidateList;
    }

    @Override
    public Candidate getCandidateById(Long candidateId) {
        for (Candidate candidate : candidateList) {
            if (candidate.getCandidateId().equals(candidateId)) {
                return candidate;
            }
        }
        return null;
    }

    @Override
    public String updateCandidate(Candidate updatedCandidate, String recruiterName, String recruitAdmin) {
        
        return "Candidate updated successfully.";
    }

    
    private Long generateCandidateId() {
        
        return (long) (candidateList.size() + 1);
    }
}