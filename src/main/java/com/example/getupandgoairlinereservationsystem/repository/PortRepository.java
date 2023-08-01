package com.example.getupandgoairlinereservationsystem.repository;

import com.example.getupandgoairlinereservationsystem.entity.PortsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PortRepository extends CrudRepository<PortsEntity,Long> {
    PortsEntity findById(long id);
    ArrayList<PortsEntity> findAll ();
}
