package com.bikkadIt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIt.entities.UserAccounts;

@Repository
public interface UserRepository extends JpaRepository<UserAccounts, Integer> {

}
