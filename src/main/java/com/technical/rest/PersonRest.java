package com.technical.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.technical.model.Person;
import com.technical.service.PersonService;

@RestController
@RequestMapping("/personas")
public class PersonRest {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping
	private ResponseEntity<List<Person>> getAllPeople(){
		return ResponseEntity.ok(personService.findAll());
	}
	
	@PostMapping
	private ResponseEntity<Person> savePerson(@RequestBody Person person){
		try {
			Person savedPerson = personService.save(person);
		return ResponseEntity.created(new URI("/personas" + savedPerson.getId())).body(savedPerson);
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping("/{id}")
	 public void deleteById(@PathVariable("id") Integer id) {
		personService.deleteById(id);
	 }

}
