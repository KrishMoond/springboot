package com.example.demo.util;

import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {
	
	private final String secretKey="qwertyuioplkjhgfdsazxcvbnasdfghjmcrtyhn";
	
	
	public SecretKey getkey() {
		return Keys.hmacShaKeyFor(secretKey.getBytes());
	}
	
	public String createToken(String username) {
	    return Jwts.builder()
	            .subject(username)
	            .issuedAt(new Date(System.currentTimeMillis()))
	            .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) 
	            .signWith(getkey())
	            .compact();
	}
	
	public String getUsername(String token) {
	    return Jwts.parser()
	            .verifyWith(getkey())
	            .build()
	            .parseSignedClaims(token)
	            .getPayload()
	            .getSubject();
	}
	
	public boolean isTokenExpired(String token) {
        Date expiration = Jwts.parser()
                .verifyWith(getkey())
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .getExpiration();
        
        return expiration.before(new Date()); 
    }
    
    public boolean isValidToken(String username, String token) {
        String extractedUsername = getUsername(token);
        
        return extractedUsername.equals(username) && !isTokenExpired(token);
    }
}
