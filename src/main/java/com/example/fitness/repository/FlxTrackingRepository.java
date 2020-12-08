package com.example.fitness.repository;

import com.example.fitness.entity.FlxTracking;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlxTrackingRepository extends CrudRepository<FlxTracking, Long> {

    // Optional<Tracking> findById(Long id).Get

    @Query("SELECT i FROM FlxTracking i where i.flxClient.id = :flxClientId")
    Iterable<FlxTracking> findTrackingByFlxClientId(Long flxClientId);

}