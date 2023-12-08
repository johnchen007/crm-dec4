package com.snva.crmproject.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.snva.crmproject.entity.CandidateAttachments;

public interface CandidateAttachmentsRepository extends JpaRepository<CandidateAttachments, Long> {
}