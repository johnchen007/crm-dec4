package com.snva.crmproject.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import com.snva.crmproject.entity.CandidateAttachments;

import java.util.List;

public interface CandidateAttachmentsRepository extends JpaRepository<CandidateAttachments, Long> {
    List<CandidateAttachments> findByCandidateId(String candidateId);
    void deleteByCandidateId(String candidateId);
}
