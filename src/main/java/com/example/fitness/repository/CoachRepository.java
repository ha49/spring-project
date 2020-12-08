package com.example.fitness.repository;

import com.example.fitness.entity.Coach;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoachRepository extends CrudRepository<Coach, Integer> {
    Coach findByLastName(String lastName);
}