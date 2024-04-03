package com.ust.swiggy.model;

import java.io.Serializable;

/**
 * Address Entity Class
 *
 */
/**
 * @author 219660
 *
 */
public class Address implements Serializable {

	/**
	 * @return street Id
	 */
	public int getStreetId() {
		return streetId;
	}

	/**
	 * @param streetId
	 */
	public void setStreetId(int streetId) {
		this.streetId = streetId;
	}

	/**
	 * @return first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return pin code
	 */
	public int getPinCode() {
		return pinCode;
	}

	/**
	 * @param pinCode
	 */
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	/**
	 * @param streetId
	 * @param firstName
	 * @param lastName
	 * @param pinCode
	 */
	public Address(int streetId, String firstName, String lastName, int pinCode) {
		super();
		this.streetId = streetId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.pinCode = pinCode;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * @see java.lang.Object#hashCode()
	 */
	private int streetId;
	private String firstName;
	private String lastName;
	private int pinCode;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + pinCode;
		result = prime * result + streetId;
		return result;
	}

	/*
	 * ()
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Address)) {
			return false;
		}
		Address other = (Address) obj;
		if (firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(other.firstName)) {
			return false;
		}
		if (lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(other.lastName)) {
			return false;
		}
		if (pinCode != other.pinCode) {
			return false;
		}
		if (streetId != other.streetId) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Address [streetId=" + streetId + ", firstName=" + firstName + ", lastName=" + lastName + ", pinCode="
				+ pinCode + "]";
	}

}
