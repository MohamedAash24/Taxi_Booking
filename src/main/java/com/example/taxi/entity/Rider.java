package com.example.taxi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "rider")
public class Rider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rider_id")
    private int rider_Id;
    @Column(name = "rider_name", length = 150)
    private String rider_name;
    @Column(name = "common_name", length = 150)
    private String common_name;
    @Column(name = "address", columnDefinition = "TEXT")
    private String address;
    @Column(name = "nic", length = 45)
    private String nic;
    @Column(name = "dob", length = 45)
    private String dob;
    @Column(name = "mobile", length = 45)
    private String mobile;
    @Column(name = "home_mobile", length = 45)
    private String home_mobile;
    @Column(name = "profile_image", columnDefinition = "TEXT")
    private String profile_image;
    @Column(name = "email", length = 100)
    private String email;
    @Column(name = "licence_no", length = 45)
    private String licence_no;
    @Column(name = "username", length = 100)
    private String username;
    @Column(name = "password", length = 45)
    private String password;
    @Column(name = "verification", length = 45)
    private String verification;
    @Column(name = "gender")
    private int gender = 0;
    @Column(name = "birthday", length = 45)
    private String birthday;
    @Column(name = "register_date", length = 100)
    private String register_date;
    @Column(name = "register_time", length = 45)
    private String register_time;
    @Column(name = "notification_key", length = 200)
    private String notification_key;
    @Column(name = "admin_verified")
    private int admin_verified =0;
    @Column(name = "admin_verified_date", length = 45)
    private String admin_verified_date;
    @Column(name = "admin_verified_time", length = 45)
    private String admin_verified_time;
    @Column(name = "admin_verified_id", length = 45)
    private String admin_verified_id;
    @Column(name = "im_live")
    private int im_live =0;
    @Column(name = "licence_image_1", columnDefinition = "TEXT")
    private String licence_image_1;
    @Column(name = "licence_image_2", columnDefinition = "TEXT")
    private String licence_image_2;
    @Column(name = "total_cash_earn", length = 45)
    private String total_cash_earn ="0";
    @Column(name = "total_card_earn", length = 45)
    private String total_card_earn ="0";
    @Column(name = "company_paid", length = 45)
    private String company_paid ="0";
    @Column(name = "balance", length = 45)
    private String balance ="0";
    @Column(name = "current_lat", length = 50)
    private String current_lat;
    @Column(name = "current_lon", length = 50)
    private String current_lon;
    @Column(name = "status")
    private int status =0;

}
