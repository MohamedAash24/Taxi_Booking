package com.example.taxi.controller;

import com.example.taxi.dto.LoginDTO;
import com.example.taxi.service.AdminService;
import com.example.taxi.service.serviceImpl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class LoginController {
    @Autowired
    AdminServiceImpl adminServiceImpl;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDTO loginDTO){

        return adminServiceImpl.login(loginDTO);
    }

}
