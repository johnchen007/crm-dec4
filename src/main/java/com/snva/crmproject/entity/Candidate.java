package com.snva.crmproject.entity;


import java.util.Date;

public class Candidate {

	
	    private String candidateId;
	    private String skillSet;
	    private int communicationSkills;
	    private String addressLine1;
	    private String addressLine2;
	    private String addressCity;
	    private String addressState;
	    private String addressCountry;
	    private String addressZipCode;
	    private String source;
	    private String recruiterRemarks;
	    private String techInterviewDate;
	    private String interviewerFeedback;
	    private String candidateInterviewStatus;
	    private boolean loiSent;
	    private boolean loiAccepted;
	    private boolean joinedBatch;
	    private Date batchStartDate;
	    
	
	    
		public Candidate() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public Candidate(String candidateId, String skillSet, int communicationSkills, String addressLine1,
				String addressLine2, String addressCity, String addressState, String addressCountry,
				String addressZipCode, String source, String recruiterRemarks, String techInterviewDate,
				String interviewerFeedback, String candidateInterviewStatus, boolean loiSent, boolean loiAccepted,
				boolean joinedBatch, Date batchStartDate) {
			super();
			this.candidateId = candidateId;
			this.skillSet = skillSet;
			this.communicationSkills = communicationSkills;
			this.addressLine1 = addressLine1;
			this.addressLine2 = addressLine2;
			this.addressCity = addressCity;
			this.addressState = addressState;
			this.addressCountry = addressCountry;
			this.addressZipCode = addressZipCode;
			this.source = source;
			this.recruiterRemarks = recruiterRemarks;
			this.techInterviewDate = techInterviewDate;
			this.interviewerFeedback = interviewerFeedback;
			this.candidateInterviewStatus = candidateInterviewStatus;
			this.loiSent = loiSent;
			this.loiAccepted = loiAccepted;
			this.joinedBatch = joinedBatch;
			this.batchStartDate = batchStartDate;
		}


		
		
		public String getCandidateId() {
			return candidateId;
		}
		public void setCandidateId(String candidateId) {
			this.candidateId = candidateId;
		}
		public String getSkillSet() {
			return skillSet;
		}
		public void setSkillSet(String skillSet) {
			this.skillSet = skillSet;
		}
		public int getCommunicationSkills() {
			return communicationSkills;
		}
		public void setCommunicationSkills(int communicationSkills) {
			this.communicationSkills = communicationSkills;
		}
		public String getAddressLine1() {
			return addressLine1;
		}
		public void setAddressLine1(String addressLine1) {
			this.addressLine1 = addressLine1;
		}
		public String getAddressLine2() {
			return addressLine2;
		}
		public void setAddressLine2(String addressLine2) {
			this.addressLine2 = addressLine2;
		}
		public String getAddressCity() {
			return addressCity;
		}
		public void setAddressCity(String addressCity) {
			this.addressCity = addressCity;
		}
		public String getAddressState() {
			return addressState;
		}
		public void setAddressState(String addressState) {
			this.addressState = addressState;
		}
		public String getAddressCountry() {
			return addressCountry;
		}
		public void setAddressCountry(String addressCountry) {
			this.addressCountry = addressCountry;
		}
		public String getAddressZipCode() {
			return addressZipCode;
		}
		public void setAddressZipCode(String addressZipCode) {
			this.addressZipCode = addressZipCode;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getRecruiterRemarks() {
			return recruiterRemarks;
		}
		public void setRecruiterRemarks(String recruiterRemarks) {
			this.recruiterRemarks = recruiterRemarks;
		}
		public String getTechInterviewDate() {
			return techInterviewDate;
		}
		public void setTechInterviewDate(String techInterviewDate) {
			this.techInterviewDate = techInterviewDate;
		}
		public String getInterviewerFeedback() {
			return interviewerFeedback;
		}
		public void setInterviewerFeedback(String interviewerFeedback) {
			this.interviewerFeedback = interviewerFeedback;
		}
		public String getCandidateInterviewStatus() {
			return candidateInterviewStatus;
		}
		public void setCandidateInterviewStatus(String candidateInterviewStatus) {
			this.candidateInterviewStatus = candidateInterviewStatus;
		}
		public boolean isLoiSent() {
			return loiSent;
		}
		public void setLoiSent(boolean loiSent) {
			this.loiSent = loiSent;
		}
		public boolean isLoiAccepted() {
			return loiAccepted;
		}
		public void setLoiAccepted(boolean loiAccepted) {
			this.loiAccepted = loiAccepted;
		}
		public boolean isJoinedBatch() {
			return joinedBatch;
		}
		public void setJoinedBatch(boolean joinedBatch) {
			this.joinedBatch = joinedBatch;
		}
		public Date getBatchStartDate() {
			return batchStartDate;
		}
		public void setBatchStartDate(Date batchStartDate) {
			this.batchStartDate = batchStartDate;
		}
	    
	    
	    
}

