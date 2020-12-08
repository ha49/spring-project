package com.example.fitness.repository;


import com.example.fitness.entity.Links;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinksRepository extends CrudRepository<Links, Long> {
    Links findByName(String name);
}