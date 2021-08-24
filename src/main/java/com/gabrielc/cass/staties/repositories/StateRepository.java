package com.gabrielc.cass.staties.repositories;

import com.gabrielc.cass.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
