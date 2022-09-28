package com.technical.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technical.model.Country;

public interface CountryRepository extends JpaRepository<Country, Integer>
{

}
