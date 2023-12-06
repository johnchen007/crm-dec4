package com.snva.crmproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CandidateAttachments")
public class CandidateAttachments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long attachmentId;
	private String candidateId;
	private boolean isResume;
	private String attachement;
	
	public CandidateAttachments() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CandidateAttachments(Long attachmentId, String candidateId, boolean isResume, String attachement) {
		super();
		this.attachmentId = attachmentId;
		this.candidateId = candidateId;
		this.isResume = isResume;
		this.attachement = attachement;
	}

	public Long getAttachmentId() {
		return attachmentId;
	}
	public void setAttachmentId(Long attachmentId) {
		this.attachmentId = attachmentId;
	}
	public String getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}
	public boolean isResume() {
		return isResume;
	}
	public void setResume(boolean isResume) {
		this.isResume = isResume;
	}
	public String getAttachement() {
		return attachement;
	}
	public void setAttachement(String attachement) {
		this.attachement = attachement;
	}
	
	

}
