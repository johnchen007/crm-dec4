package com.snva.crmproject.service;

import java.util.List;

import com.snva.crmproject.entity.CandidateBasicDetails;

public interface CandidateService {
    String addNewCandidate(CandidateBasicDetails candidate);
    List<CandidateBasicDetails> getAllCandidates();
    CandidateBasicDetails getCandidateById(String candidateId);
    String updateCandidate(CandidateBasicDetails updatedCandidate);
}