package com.honeywell.HoneywellApp;

import java.util.Objects;

public class EncryptionDetails {

	private String firstName;
	private String message;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public EncryptionDetails(String firstName, String message) {
		super();
		this.firstName = firstName;
		this.message = message;
	}
	public EncryptionDetails() {
		super();
	}
	@Override
	public String toString() {
		return "EncryptionDetails [firstName=" + firstName + ", message=" + message + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(firstName, message);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EncryptionDetails other = (EncryptionDetails) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(message, other.message);
	}
	
	
}
