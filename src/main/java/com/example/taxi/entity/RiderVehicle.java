package com.example.taxi.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rider_vehicle")
public class RiderVehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rider_vehicle_id")
    private int rider_vehicle_id;

    @Column(name = "rider_id")
    private int rider_id ;
    @Column(name = "vehicle_type_id")
    private int vehicle_type_id ;
    @Column(name = "plate_no", length = 45)
    private String plate_no;
    @Column(name = "color", length = 100)
    private String color;
    @Column(name = "register_no", length = 45)
    private String register_no;
    @Column(name = "manufacture_year", length = 45)
    private String manufacture_year;
    @Column(name = "other", columnDefinition = "TEXT")
    private String other;
    @Column(name = "vehicle_image", columnDefinition = "TEXT")
    private String vehicle_image;
    @Column(name = "vehicle_image_2", columnDefinition = "TEXT")
    private String vehicle_image_2;
    @Column(name = "status")
    private int status = 0;

    @ManyToOne
    @JoinColumn(name = "rider_id", referencedColumnName = "rider_Id", updatable = false, insertable = false)
    private Rider rider;
    @ManyToOne
    @JoinColumn(name = "vehicle_type_id", referencedColumnName = "vehicle_type_Id", updatable = false, insertable = false)
    private VehicleType VehicleType;


}
