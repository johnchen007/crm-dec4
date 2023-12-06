package com.snva.crmproject.entity.userDetails;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
public class UserPersonalDetails {
	
	@Id
	private long userId;
	
	private String firstName;
	 
	private String lastName;
	 
	private String phone;
	 
	private String addressLine1; 
	 
	private String addressLine2; 
	 
	private String addressCity; 
	 
	private String addressState; 
	 
	private String addressCountry;  
	 
	private String addressZipCode; 
	@OneToOne
    @JoinColumn(name = "userId")
    @MapsId
    private User user;
	
	public UserPersonalDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserPersonalDetails(String firstName, String lastName, String phone, String address_Line1,
			String address_Line2, String address_City, String address_State, String address_Country,
			String address_ZipCode,User user) {
		super();
		this.userId=user.getUserId();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.addressLine1 = address_Line1;
		this.addressLine2 = address_Line2;
		this.addressCity = address_City;
		this.addressState = address_State;
		this.addressCountry = address_Country;
		this.addressZipCode = address_ZipCode;
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserPersonalDetails [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phone=" + phone + ", address_Line1=" + addressLine1 + ", address_Line2=" + addressLine2
				+ ", address_City=" + addressCity + ", address_State=" + addressState + ", address_Country="
				+ addressCountry + ", address_ZipCode=" + addressZipCode + ", user=" + user + "]";
	}
	public User toUser() {
		
		/*
		 * long userId, String username, String role, String firstName, String lastName, String phone,
			String addressLine1, String addressLine2, String addressCity, String addressState, String addressCountry,
			String addressZipCode
		 */
		return new User(userId,user.getUsername(),this.user.getRole(),firstName, lastName,phone,addressLine1,addressLine2,addressCity,addressState,addressCountry,addressZipCode);
	}
	
	
}
