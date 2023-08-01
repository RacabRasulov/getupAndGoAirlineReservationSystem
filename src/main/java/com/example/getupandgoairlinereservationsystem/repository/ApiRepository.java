package com.example.getupandgoairlinereservationsystem.repository;

import com.example.getupandgoairlinereservationsystem.entity.FlightsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiRepository extends CrudRepository<FlightsEntity,Long> {


}
