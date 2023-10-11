package com.mapping.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.example.Model.Employe;

public interface addressRepo extends JpaRepository<Employe, Integer>{

}
