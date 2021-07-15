package com.collabera.eventmanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.collabera.eventmanagement.model.Person;

@Repository
public interface personRepository extends CrudRepository<Person,Integer>{

}
