package com.hromenko.carserviceroman.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    private Long id;

    @Column
    private String owner_email;

    @Column
    private String brand;

    @Column
    private String model;

    @Column
    private int year_of_manufacturer;

    @Column
    private String vehicle_identification_number;

    @Column
    private String registration_number;

    @Column
    private int mileage;

    @Column
    private String engine_model;

    @Column
    private float engine_volume;

    @Column
    private String fuel_type;

    @Column
    private String transmission_type;

    @Column
    private String color;

    @Column
    private String body_type;
}
