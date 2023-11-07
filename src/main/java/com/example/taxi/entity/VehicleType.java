package com.example.taxi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "vehicle_type")
public class VehicleType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_type_id")
    private int vehicle_type_id;
    @Column(name = "vehicle_type", length = 150)
    private String vehicle_type;
    @Column(name = "image", columnDefinition = "TEXT")
    private String image;
    @Column(name = "detail", columnDefinition = "TEXT")
    private String detail;
    @Column(name = "per_km_charge")
    private Double per_km_charge = 0.00;
    @Column(name = "company_income_rate", length = 10)
    private String company_income_rate;
    @Column(name = "delay_charge")
    private Double delay_charge = 0.00;
    @Column(name = "passenger_count", length = 10)
    private String passenger_count;
    @Column(name = "order_level", length = 10)
    private String order_level;
    @Column(name = "initial_distance", length = 45)
    private String initial_distance ="1";
    @Column(name = "initial_distance_charge", length = 45)
    private String initial_distance_charge ="50";
    @Column(name = "status")
    private int status = 1 ;
}
