package com.example.taxi.util;

import com.example.taxi.entity.Admin;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.nio.file.AccessDeniedException;
import java.util.Date;

@Component
public class JwtUtil {

    private static String SECRET = "kzxm0Ng3+u943X8ntHQu4+vPXJbCEek9JSuQRnIxn6fGigSFsWVrXsF5bvVXDD70zlnhqBlH5WeWef+7tJ75qNCN3dMtOnCXP/+ThhT0Orw=";
    private static long expiryDuration = 60 * 30 ;

    public String generateAccessToken(Admin admin){
        long currentTimeMillis = System.currentTimeMillis();

        long expireTime = currentTimeMillis + expiryDuration * 1000;
        Date issuedAt = new Date(currentTimeMillis);
        Date expiredAt = new Date(expireTime);

        Claims claims = Jwts.claims()
                .setIssuer(String.valueOf(admin.getAdminUserId()))
                .setIssuedAt(issuedAt)
                .setExpiration(expiredAt);
        claims.put("username",admin.getUsername());
        claims.put("email",admin.getEmail());

        return Jwts.builder().setClaims(claims).signWith(SignatureAlgorithm.HS512,SECRET).compact();
    }

    public Claims verifyAccessToken(String authorization) throws Exception{

        try {
            Claims claims = Jwts.parser().setSigningKey(SECRET).parseClaimsJws(authorization).getBody();
            System.out.println(claims.get("email"));
            return claims;
        }catch (Exception e){
            throw new AccessDeniedException("Access Denied! Please login again");
        }
    }
}
