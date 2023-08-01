package com.example.getupandgoairlinereservationsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Port")
public class PortsEntity {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String airportName;
    private String airportValue;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
