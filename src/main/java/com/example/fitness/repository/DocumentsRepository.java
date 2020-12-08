package com.example.fitness.repository;

import com.example.fitness.entity.Documents;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentsRepository extends CrudRepository<Documents, Long> {
    Documents findByName(String name);
}