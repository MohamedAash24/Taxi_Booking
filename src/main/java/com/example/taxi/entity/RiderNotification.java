package com.example.taxi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rider_notification")

public class RiderNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rider_notification_id")
    private int rider_notification_id;

    @Column(name = "notification_topic")
    private String notification_topic;
    @Column(name = "notification", columnDefinition = "TEXT")
    private String notification;

    @Column(length = 45, name = "date")
    private String date;

    @Column(length = 45, name = "time")
    private String time;

    @Column(name = "show_to_user")
    private int show_to_user = 0;

    @Column(name = "status")
    private int status = 1;

    @Column(name = "rider_id")
    private int rider_id;

    @ManyToOne
    @JoinColumn(name = "rider_id", referencedColumnName = "rider_Id", updatable = false, insertable = false)
    private Rider rider;

}
