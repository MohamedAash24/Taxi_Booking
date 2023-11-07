package com.example.taxi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "rider_rating")
public class RiderRating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rider_rating_id")
    private int rider_rating_id;
    @Column(name = "customer_trip_id")
    private int customer_trip_id ;
    @Column(name = "date", length = 45)
    private String date;
    @Column(name = "time", length = 45)
    private String time;
    @Column(name = "star_rate", length = 45)
    private String star_rate;
    @Column(name = "comment", columnDefinition = "TEXT")
    private String comment;
    @Column(name = "status")
    private int status =1;

    @ManyToOne
    @JoinColumn(name = "customer_trip_id", referencedColumnName = "customer_trip_Id", updatable = false, insertable = false)
    private com.example.taxi.entity.CustomerTrip CustomerTrip;
}
