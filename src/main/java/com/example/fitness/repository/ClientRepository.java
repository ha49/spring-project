package com.example.fitness.repository;

import com.example.fitness.entity.FlxClient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<FlxClient, Long> {
    FlxClient findByLastName(String lastName);
}