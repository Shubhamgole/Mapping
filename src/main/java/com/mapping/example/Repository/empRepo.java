package com.mapping.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.example.Model.Address;

public interface empRepo extends JpaRepository<Address, Integer> {

}
