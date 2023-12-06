package com.snva.crmproject.service;


import java.util.List;

import com.snva.crmproject.entity.Candidate;

public interface CandidateService {
    String addCandidate(Candidate candidate);
    
    List<Candidate> getAllCandidates();
    
    Candidate getCandidateById(String candidateId);
    
    String updateCandidate(Candidate recruiter, Candidate recruitAdmin);
}
