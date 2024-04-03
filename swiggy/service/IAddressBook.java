package com.ust.swiggy.service;

import java.util.Set;

import com.ust.swiggy.exception.DuplicateErrorException;
import com.ust.swiggy.exception.NoEntriesException;
import com.ust.swiggy.exception.NoEntryException;
import com.ust.swiggy.model.Address;

/**
 * Address Book Interface
 *
 */
public interface IAddressBook {
	/**
	 * @param address
	 * @return boolean true/false
	 * @throws DuplicateErrorException
	 * @throws NullPointerException
	 */
	public abstract boolean addAddress(final Address address) throws DuplicateErrorException, NullPointerException;

	/**
	 * @param firstName
	 * @return boolean true/false
	 * @throws NoEntriesException
	 * @throws NoEntryException
	 * @throws NullPointerException
	 */
	public abstract boolean removeAddress(final String firstName)
			throws NoEntriesException, NoEntryException, NullPointerException;

	/**
	 * @return Set<Address>
	 * @throws NoEntriesException
	 */
	default public Set<Address> getAllAddressEntries() throws NoEntriesException {
		System.out.println();
		return null;

	}

}
