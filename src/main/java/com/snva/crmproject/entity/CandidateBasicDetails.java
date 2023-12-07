package com.snva.crmproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="CandidateBasicDetails")
public class CandidateBasicDetails {
	@Id
	private String candidateId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String recruiterName;
	private String email;
	private String phoneNumber;
	private String workExperience;
	private String visaStatus;
	private String ssn;
	
	
	
	public CandidateBasicDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CandidateBasicDetails(String candidateId, String firstName, String middleName, String lastName,
			String recruiterName, String email, String phoneNumber, String workExperience, String visaStatus,
			String ssn) {
		super();
		this.candidateId = candidateId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.recruiterName = recruiterName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.workExperience = workExperience;
		this.visaStatus = visaStatus;
		this.ssn = ssn;
	}
	public String getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
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
	public String getRecruiterName() {
		return recruiterName;
	}
	public void setRecruiterName(String recruiterName) {
		this.recruiterName = recruiterName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}
	public String getVisaStatus() {
		return visaStatus;
	}
	public void setVisaStatus(String visaStatus) {
		this.visaStatus = visaStatus;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	
}
