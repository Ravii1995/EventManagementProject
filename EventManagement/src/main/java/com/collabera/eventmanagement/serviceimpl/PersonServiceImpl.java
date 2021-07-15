package com.collabera.eventmanagement.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collabera.eventmanagement.model.Person;
import com.collabera.eventmanagement.repository.personRepository;
import com.collabera.eventmanagement.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	personRepository personrepository;

	@Override
	public Person insert(Person person) {
		return personrepository.save(person);
	}

	@Override
	public List<Person> getPersons() {
	
		   List<Person> persons = new ArrayList<>();
	        personrepository.findAll().forEach(persons::add);
	        return persons;
	
	}

	@Override
	public Person getPersonoById(Integer personid) {
		        return personrepository.findById(personid).get(); 
	}

	@Override
	public void deletePerson(Integer personid) {
		
		personrepository.deleteById(personid);
		
	}
	

}
