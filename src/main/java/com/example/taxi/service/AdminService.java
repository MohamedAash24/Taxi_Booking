package com.example.taxi.service;

import com.example.taxi.dto.LoginDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    public ResponseEntity<?> login(LoginDTO loginDTO);

    public boolean findByUsername(LoginDTO loginDTO);
}
