package com.snva.crmproject.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import com.snva.crmproject.entity.CandidateDetails;

public interface CandidateDetailsRepository extends JpaRepository<CandidateDetails, String> {
}