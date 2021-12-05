package com.bikkadIt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIt.entities.CountryMaster;

@Repository
public interface CountryRespository extends JpaRepository<CountryMaster, Integer> {

}
