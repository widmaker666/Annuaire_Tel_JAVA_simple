package com.annuairealex.phonebook;

public class Contact {

	private String lastName;
	private String firstName;
	private String phoneNumber;

	public Contact(String lastName, String firstName, String phoneNumber) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.phoneNumber = phoneNumber;
	}

	// !Getters
	public String getLastName() {
		return lastName;
	};

	public String getFirstName() {
		return firstName;
	};

	public String getPhoneNumber() {
		return phoneNumber;
	};

	// !Setters
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return this.lastName + " " + this.firstName + " " + this.phoneNumber;
	}

}
