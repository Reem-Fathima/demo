package com.ust.swiggy.main;

import com.ust.swiggy.exception.DuplicateErrorException;
import com.ust.swiggy.exception.NoEntriesException;
import com.ust.swiggy.exception.NoEntryException;
import com.ust.swiggy.model.Address;
import com.ust.swiggy.service.AddressBookImpl;
import com.ust.swiggy.service.IAddressBook;

/**
 * Main Class
 *
 */
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		IAddressBook addressBookManager = new AddressBookImpl();

		try {
			addressBookManager.addAddress(new Address(111, "Reema", "Fathima", 680004));
			addressBookManager.addAddress(new Address(112, "Lily", "John", 789922));

		} catch (DuplicateErrorException | NullPointerException e) {
			System.out.println("Can't add address " + e.getMessage());
		} finally {
			System.out.println("Exited");
		}

		try {
			addressBookManager.removeAddress("Reema");
		} catch (NullPointerException | NoEntriesException | NoEntryException e) {
			System.out.println("Can't remove address " + e.getMessage());
		} finally {
			System.out.println("Exited");
		}
	}
}
