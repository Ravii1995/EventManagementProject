package com.collabera.eventmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.eventmanagement.model.Person;
import com.collabera.eventmanagement.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService personservice;
	
	
	  //The function is send to data into database.
	@PostMapping("/person")
	public void save( Person person) {
	    personservice.insert(person);
	}
	
	  //The function receives a GET request, processes it and gives back a list of Person as a response.
	@GetMapping("/persons")
	public List<Person> getAllPersons()
	{
 		return personservice.getPersons();
		
	}
	
	
	  //The function receives a GET request, processes it, and gives back a particular records of Person as a response.
    @GetMapping({"/{personid}"})
    public ResponseEntity<Person> getPerson(@PathVariable Integer personid) {
        return new ResponseEntity<>(personservice.getPersonoById(personid), HttpStatus.OK);
    }
	
    //The function receives a DELETE request, deletes the Person with the specified Id.
    @DeleteMapping({"/{personid}"})
    public void deletePerson(@PathVariable("personid") Integer personid) {
        personservice.deletePerson(personid);
   
    }

}
