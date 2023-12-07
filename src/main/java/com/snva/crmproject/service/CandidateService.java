package com.snva.crmproject.service;


import java.util.List;

import com.snva.crmproject.entity.Candidate;

public interface CandidateService {
    String addNewCandidate(Candidate candidate);
    List<Candidate> getAllCandidates();
    Candidate getCandidateById(Long candidateId);
    String updateCandidate(Candidate updatedCandidate, String recruiterName, String recruitAdmin);
    
}