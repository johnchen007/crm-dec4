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
        Long candidateId = updatedCandidate.getCandidateId();
        

        
        Candidate existingCandidate = getCandidateById(candidateId);

       
        if (existingCandidate != null) {
            
            existingCandidate.setRecruiterName(updatedCandidate.getRecruiterName());
            existingCandidate.setSkillSet(updatedCandidate.getSkillSet());
            existingCandidate.setBatchNumber(updatedCandidate.getBatchNumber());
            existingCandidate.setCandidateStatus(updatedCandidate.getCandidateStatus());
            existingCandidate.setFirstName(updatedCandidate.getFirstName());
            existingCandidate.setMiddleName(updatedCandidate.getMiddleName());
            existingCandidate.setLastName(updatedCandidate.getLastName());
            existingCandidate.setEmail(updatedCandidate.getEmail());
            existingCandidate.setContactNumber(updatedCandidate.getContactNumber());
            existingCandidate.setAlternateNumber(updatedCandidate.getAlternateNumber());
            existingCandidate.setCollege(updatedCandidate.getCollege());
            existingCandidate.setCountry(updatedCandidate.getCountry());
            existingCandidate.setState(updatedCandidate.getState());
            existingCandidate.setCity(updatedCandidate.getCity());
            existingCandidate.setWorkExperienceMonths(updatedCandidate.getWorkExperienceMonths());
            existingCandidate.setWorkExperienceYears(updatedCandidate.getWorkExperienceYears());
            existingCandidate.setVisaStatus(updatedCandidate.getVisaStatus());
            existingCandidate.setOptStartDate(updatedCandidate.getOptStartDate());
            existingCandidate.setOptEndDate(updatedCandidate.getOptEndDate());
            existingCandidate.setSsn(updatedCandidate.getSsn());
            existingCandidate.setSource(updatedCandidate.getSource());
            existingCandidate.setCommunicationSkills(updatedCandidate.getCommunicationSkills());
            existingCandidate.setResumeAttachment(updatedCandidate.getResumeAttachment());
            existingCandidate.setAdditionalDocumentsAttachment(updatedCandidate.getAdditionalDocumentsAttachment());
            existingCandidate.setRecruitmentRemarks(updatedCandidate.getRecruitmentRemarks());
            existingCandidate.setInterviewDate(updatedCandidate.getInterviewDate());
            existingCandidate.setInterviewName(updatedCandidate.getInterviewName());
            existingCandidate.setLoiSent(updatedCandidate.getLoiSent());
            existingCandidate.setLoiAccepted(updatedCandidate.getLoiAccepted());
            existingCandidate.setJoinedBatch(updatedCandidate.isJoinedBatch());
            existingCandidate.setBatchStartDate(updatedCandidate.getBatchStartDate());

            return "Candidate updated successfully.";
        } else {
            return "Candidate with ID " + candidateId + " not found.";
        }
    }


    
    private Long generateCandidateId() {
        
        return (long) (candidateList.size() + 1);
    }
}