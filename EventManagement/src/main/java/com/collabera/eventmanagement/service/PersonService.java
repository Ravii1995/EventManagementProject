package com.collabera.eventmanagement.service;

import java.util.List;

import com.collabera.eventmanagement.model.Person;

public interface PersonService {
	 Person insert(Person person);
	 List<Person> getPersons();
	 Person getPersonoById(Integer personid);
	 void deletePerson(Integer personid);
}
