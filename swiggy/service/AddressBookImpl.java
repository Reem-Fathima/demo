package com.ust.swiggy.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import com.ust.swiggy.exception.DuplicateErrorException;
import com.ust.swiggy.exception.NoEntriesException;
import com.ust.swiggy.exception.NoEntryException;
import com.ust.swiggy.model.Address;

/**
 * Address Book Implementation
 *
 */
public class AddressBookImpl implements IAddressBook {
	private Set<Address> addressBook = null;

	/**
	 * 
	 */
	public AddressBookImpl() {
		addressBook = new HashSet<Address>();
	}

	@Override
	public boolean addAddress(Address address) throws DuplicateErrorException, NullPointerException {
		final String METHOD_NAME = "addAddress";
		System.out.println("Method Invoked:" + this.getClass().getName() + ":" + METHOD_NAME + ":" + address);
		if (address == null) {
			throw new NullPointerException(Error.NULL_ERROR);
		}
		boolean addAddressFlag = addressBook.add(address);
		if (!addAddressFlag) {
			throw new DuplicateErrorException(Error.DUPLICATE_ERROR);
		}
		System.out.println("Method Response:" + this.getClass().getName() + ":" + addAddressFlag);
		return addAddressFlag;
	}

	@Override
	public boolean removeAddress(String firstName) throws NoEntriesException, NoEntryException, NullPointerException {
		final String METHOD_NAME = "removeAddress";
		System.out.println("Method Invoked:" + this.getClass().getName() + ":" + METHOD_NAME + ":" + firstName);

		// Check for null or empty firstName
		Optional.ofNullable(firstName).filter(name -> !name.isEmpty())
				.orElseThrow(() -> new NullPointerException(Error.NULL_ERROR));

		// Check if the addressBook is empty
		if (addressBook.isEmpty()) {
			throw new NoEntriesException(Error.NO_ENTRIES_ERROR);
		}

		// Remove the address if found
		boolean addressRemoveFlag = addressBook.removeIf(address -> firstName.equals(address.getFirstName()));

		if (!addressRemoveFlag) {
			throw new NoEntryException(Error.FIRST_NAME_NULL_ERROR + firstName);
		}

		System.out.println("Method Response:" + this.getClass().getName() + ":" + addressRemoveFlag);
		return addressRemoveFlag;
	}

}
