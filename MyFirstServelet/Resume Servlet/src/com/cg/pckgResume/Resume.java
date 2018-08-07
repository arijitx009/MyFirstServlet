package com.cg.pckgResume;

import java.util.Arrays;

public class Resume {
	private String firstname;
	private String lastname;
	private String Gender;
	private String dob;
	private String emaild;
	private String[] hobbies;
	private String[] skills;
	private String address;
	private String description;
	private String HighestQualification;
	private String contact;
	




	public String getContact() {
		return contact;
	}




	public String getHighestQualification() {
		return HighestQualification;
	}




	public String getFirstname() {
		return firstname;
	}




	public String getLastname() {
		return lastname;
	}




	public Resume(String firstname, String lastname, String gender,String dob, String emaild, String[] hobbies,
			String[] skills, String address, String description, String highestQualification, String contact) {
		this.firstname = firstname;
		this.lastname = lastname;
		Gender = gender;
		this.dob = dob;
		this.emaild = emaild;
		this.hobbies = hobbies;
		this.skills = skills;
		this.address = address;
		this.description = description;
		HighestQualification = highestQualification;
		this.contact = contact;
	}




	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}




	public void setLastname(String lastname) {
		this.lastname = lastname;
	}




	public void setGender(String gender) {
		Gender = gender;
	}




	public void set(String dob) {
		this.dob = dob;
	}




	public void setEmaild(String emaild) {
		this.emaild = emaild;
	}




	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}




	public void setSkills(String[] skills) {
		this.skills = skills;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public void setHighestQualification(String highestQualification) {
		HighestQualification = highestQualification;
	}




	public void setContact(String contact) {
		this.contact = contact;
	}




	public String getGender() {
		return Gender;
	}




	public String getDob() {
		return dob;
	}




	public String getEmaild() {
		return emaild;
	}




	public String[] getHobbies() {
		return hobbies;
	}




	public String[] getSkills() {
		return skills;
	}




	public String getAddress() {
		return address;
	}




	public String getDescription() {
		return description;
	}




	@Override
	public String toString() {
		return "Resume [firstname=" + firstname + ", lastname=" + lastname + ", Gender=" + Gender + ", dob=" + dob
				+ ", emaild=" + emaild + ", hobbies=" + Arrays.toString(hobbies) + ", skills=" + Arrays.toString(skills)
				+ ", address=" + address + ", description=" + description + ", HighestQualification="
				+ HighestQualification + ", contact=" + contact + "]";
	}




}
