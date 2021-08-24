package com.gabrielc.cass.countries.repositories;

import com.gabrielc.cass.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
