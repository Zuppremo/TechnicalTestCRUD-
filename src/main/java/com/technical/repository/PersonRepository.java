package com.technical.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technical.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>
{

}
