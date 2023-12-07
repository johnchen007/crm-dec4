package com.snva.crmproject.entity;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "candidate")
public class Candidate {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "candidate_id")
    private Long candidateId;
	@Column(name = "recruiter_Name")
    private String recruiterName;
	@Column(name = "skill_Set")
    private String skillSet;
	@Column(name = "batch_Number")
    private String batchNumber;
	@Column(name = "candidate_Status")
    private String candidateStatus;
	@Column(name = "first_Name")
    private String firstName;
	@Column(name = "middle_Name")
    private String middleName;
	@Column(name = "last_Name")
    private String lastName;
	@Column(name = "email_")
    private String email;
	@Column(name = "contact_Number")
    private String contactNumber;
	@Column(name = "alternate_Number")
    private String alternateNumber;
	@Column(name = "college_")
    private String college;
	@Column(name = "country_")
    private String country;
	@Column(name = "state_")
    private String state;
	@Column(name = "city_")
    private String city;
	@Column(name = "workExperience_Months")
    private int workExperienceMonths;
	@Column(name = "workExperienceYears")
    private int workExperienceYears;
	@Column(name = "visa_Status")
    private String visaStatus;
	@Column(name = "optStart_Date")
    private Date optStartDate;
	@Column(name = "optEnd_Date")
    private Date optEndDate;
	@Column(name = "ssn_")
    private String ssn;
	@Column(name = "source_")
    private String source;
	@Column(name = "communication_Skills")
    private int communicationSkills;
	@Column(name = "resume_Attachment")
    private String resumeAttachment;
	@Column(name = "additionalDocuments_Attachment")
    private String additionalDocumentsAttachment;
	@Column(name = "recruitment_Remarks")
    private String recruitmentRemarks;
	@Column(name = "interview_Date")
    private Date interviewDate;
	@Column(name = "interview_Name")
    private String interviewName;
	@Column(name = "loi_Sent")
    private String loiSent;
    @Column(name = "loi_Accepted")
    private String loiAccepted;
    @Column(name = "joined_Batch")
    private boolean joinedBatch;
    @Column(name = "batchStart_Date")
    private Date batchStartDate;
    
    
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Candidate(Long candidateId, String recruiterName, String skillSet, String batchNumber,
			String candidateStatus, String firstName, String middleName, String lastName, String email,
			String contactNumber, String alternateNumber, String college, String country, String state, String city,
			int workExperienceMonths, int workExperienceYears, String visaStatus, Date optStartDate, Date optEndDate,
			String ssn, String source, int communicationSkills, String resumeAttachment,
			String additionalDocumentsAttachment, String recruitmentRemarks, Date interviewDate, String interviewName,
			String loiSent, String loiAccepted, boolean joinedBatch, Date batchStartDate) {
		super();
		this.candidateId = candidateId;
		this.recruiterName = recruiterName;
		this.skillSet = skillSet;
		this.batchNumber = batchNumber;
		this.candidateStatus = candidateStatus;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.contactNumber = contactNumber;
		this.alternateNumber = alternateNumber;
		this.college = college;
		this.country = country;
		this.state = state;
		this.city = city;
		this.workExperienceMonths = workExperienceMonths;
		this.workExperienceYears = workExperienceYears;
		this.visaStatus = visaStatus;
		this.optStartDate = optStartDate;
		this.optEndDate = optEndDate;
		this.ssn = ssn;
		this.source = source;
		this.communicationSkills = communicationSkills;
		this.resumeAttachment = resumeAttachment;
		this.additionalDocumentsAttachment = additionalDocumentsAttachment;
		this.recruitmentRemarks = recruitmentRemarks;
		this.interviewDate = interviewDate;
		this.interviewName = interviewName;
		this.loiSent = loiSent;
		this.loiAccepted = loiAccepted;
		this.joinedBatch = joinedBatch;
		this.batchStartDate = batchStartDate;
	}


	public Long getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Long candidateId) {
		this.candidateId = candidateId;
	}
	public String getRecruiterName() {
		return recruiterName;
	}
	public void setRecruiterName(String recruiterName) {
		this.recruiterName = recruiterName;
	}
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	public String getBatchNumber() {
		return batchNumber;
	}
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}
	public String getCandidateStatus() {
		return candidateStatus;
	}
	public void setCandidateStatus(String candidateStatus) {
		this.candidateStatus = candidateStatus;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAlternateNumber() {
		return alternateNumber;
	}
	public void setAlternateNumber(String alternateNumber) {
		this.alternateNumber = alternateNumber;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getWorkExperienceMonths() {
		return workExperienceMonths;
	}
	public void setWorkExperienceMonths(int workExperienceMonths) {
		this.workExperienceMonths = workExperienceMonths;
	}
	public int getWorkExperienceYears() {
		return workExperienceYears;
	}
	public void setWorkExperienceYears(int workExperienceYears) {
		this.workExperienceYears = workExperienceYears;
	}
	public String getVisaStatus() {
		return visaStatus;
	}
	public void setVisaStatus(String visaStatus) {
		this.visaStatus = visaStatus;
	}
	public Date getOptStartDate() {
		return optStartDate;
	}
	public void setOptStartDate(Date optStartDate) {
		this.optStartDate = optStartDate;
	}
	public Date getOptEndDate() {
		return optEndDate;
	}
	public void setOptEndDate(Date optEndDate) {
		this.optEndDate = optEndDate;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public int getCommunicationSkills() {
		return communicationSkills;
	}
	public void setCommunicationSkills(int communicationSkills) {
		this.communicationSkills = communicationSkills;
	}
	public String getResumeAttachment() {
		return resumeAttachment;
	}
	public void setResumeAttachment(String resumeAttachment) {
		this.resumeAttachment = resumeAttachment;
	}
	public String getAdditionalDocumentsAttachment() {
		return additionalDocumentsAttachment;
	}
	public void setAdditionalDocumentsAttachment(String additionalDocumentsAttachment) {
		this.additionalDocumentsAttachment = additionalDocumentsAttachment;
	}
	public String getRecruitmentRemarks() {
		return recruitmentRemarks;
	}
	public void setRecruitmentRemarks(String recruitmentRemarks) {
		this.recruitmentRemarks = recruitmentRemarks;
	}
	public Date getInterviewDate() {
		return interviewDate;
	}
	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}
	public String getInterviewName() {
		return interviewName;
	}
	public void setInterviewName(String interviewName) {
		this.interviewName = interviewName;
	}
	public String getLoiSent() {
		return loiSent;
	}
	public void setLoiSent(String loiSent) {
		this.loiSent = loiSent;
	}
	public String getLoiAccepted() {
		return loiAccepted;
	}
	public void setLoiAccepted(String loiAccepted) {
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
	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", recruiterName=" + recruiterName + ", skillSet=" + skillSet
				+ ", batchNumber=" + batchNumber + ", candidateStatus=" + candidateStatus + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", email=" + email + ", contactNumber="
				+ contactNumber + ", alternateNumber=" + alternateNumber + ", college=" + college + ", country="
				+ country + ", state=" + state + ", city=" + city + ", workExperienceMonths=" + workExperienceMonths
				+ ", workExperienceYears=" + workExperienceYears + ", visaStatus=" + visaStatus + ", optStartDate="
				+ optStartDate + ", optEndDate=" + optEndDate + ", ssn=" + ssn + ", source=" + source
				+ ", communicationSkills=" + communicationSkills + ", resumeAttachment=" + resumeAttachment
				+ ", additionalDocumentsAttachment=" + additionalDocumentsAttachment + ", recruitmentRemarks="
				+ recruitmentRemarks + ", interviewDate=" + interviewDate + ", interviewName=" + interviewName
				+ ", loiSent=" + loiSent + ", loiAccepted=" + loiAccepted + ", joinedBatch=" + joinedBatch
				+ ", batchStartDate=" + batchStartDate + "]";
	}

    
}
