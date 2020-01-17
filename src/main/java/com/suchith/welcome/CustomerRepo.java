package com.suchith.welcome;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suchith.entities.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
