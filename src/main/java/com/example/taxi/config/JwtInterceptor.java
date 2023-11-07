package com.example.taxi.config;

import com.example.taxi.dto.RequestMetaDTO;
import com.example.taxi.util.JwtUtil;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class JwtInterceptor implements HandlerInterceptor {

    @Autowired
    JwtUtil jwtUtil;

    RequestMetaDTO requestMetaDTO;

    public JwtInterceptor(RequestMetaDTO requestMetaDTO){
        this.requestMetaDTO = requestMetaDTO;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String authorization = request.getHeader("authorization");
//        if (!(request.getRequestURI().contains("auth"))){
//            Claims claims = jwtUtil.verifyAccessToken(authorization);
//
//            requestMetaDTO.setAdminUserId(Long.valueOf(claims.getIssuer()));
//            requestMetaDTO.setUserName(claims.get("username").toString());
//        }
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
