package com.newhire.service;

import com.newhire.employee.*;

public interface ICredentialsService {

	String generatePassword();

	void generateEmailAddress(String firstName, String lastName);

	void showCredentials(Employee employee);

}
