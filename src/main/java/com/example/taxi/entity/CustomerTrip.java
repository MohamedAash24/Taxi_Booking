package com.example.taxi.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer_trip")
public class CustomerTrip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_trip_id")
    private int customer_trip_id;
    @Column(name = "customer_id")
    private int customer_id ;
    @Column(name = "vehicle_type_id")
    private int vehicle_type_id;
    @Column(name = "rider_id")
    private int rider_id = 0;
    @Column(name = "start_point", length = 850)
    private String start_point;
    @Column(name = "end_point", length = 850)
    private String end_point;
    @Column(name = "start_lat", length = 45)
    private String start_lat;
    @Column(name = "start_lon", length = 45)
    private String start_lon;
    @Column(name = "end_lat", length = 45)
    private String end_lat;
    @Column(name = "end_lot", length = 45)
    private String end_lot;
    @Column(name = "customer_note", length = 450)
    private String customer_note;
    @Column(name = "rider_note", columnDefinition = "TEXT")
    private String rider_note;
    @Column(name = "arrived")
    private int arrived = 0;
    @Column(name = "arrived_date", length = 45)
    private String arrived_date;
    @Column(name = "arrived_time", length = 45)
    private String arrived_time;
    @Column(name = "trip_date", length = 45)
    private String trip_date;
    @Column(name = "trip_time", length = 45)
    private String trip_time;
    @Column(name = "trip_accept_time", length = 45)
    private String trip_accept_time;
    @Column(name = "trip_accept_date", length = 45)
    private String trip_accept_date;
    @Column(name = "trip_start_date", length = 45)
    private String trip_start_date;
    @Column(name = "trip_start_time", length = 45)
    private String trip_start_time;
    @Column(name = "trip_end_date", length = 45)
    private String trip_end_date;
    @Column(name = "trip_end_time", length = 45)
    private String trip_end_time;
    @Column(name = "reject_user_type")
    private int reject_user_type = 0;
    @Column(name = "reject_reason", length = 45)
    private String reject_reason;
    @Column(name = "reject_date", length = 45)
    private String reject_date;
    @Column(name = "reject_time", length = 45)
    private String reject_time;
    @Column(name = "trip_distance")
    private Double trip_distance = 0.00;
    @Column(name = "km_rate")
    private Double km_rate = 0.00;
    @Column(name = "company_commission_rate", length = 45)
    private String company_commission_rate;
    @Column(name = "payment_done")
    private int payment_done = 0;
    @Column(name = "payment_type")
    private int payment_type = 0;
    @Column(name = "trip_charge")
    private Double trip_charge = 0.00;
    @Column(name = "company_income", length = 45)
    private String company_income;
    @Column(name = "driver_income", length = 45)
    private String driver_income;
    @Column(name = "trip_status")
    private int trip_status = 0;
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_Id", updatable = false, insertable = false)
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "vehicle_type_id", referencedColumnName = "vehicle_type_Id", updatable = false, insertable = false)
    private com.example.taxi.entity.VehicleType VehicleType;
}
