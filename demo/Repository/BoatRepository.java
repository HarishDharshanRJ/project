package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.BoatModel;

public interface BoatRepository extends JpaRepository<BoatModel, Integer> {

}