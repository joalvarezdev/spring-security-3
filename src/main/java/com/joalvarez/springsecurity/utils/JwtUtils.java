package com.joalvarez.springsecurity.utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class JwtUtils {

	private final String secretKey = "111ea306ff92406d9d7fcae67c059ac5";
	private final Long expiration = 86_400_000L;

	public String generateAccessToken(String username) {
		return Jwts.builder()
			.setSubject(username)
			.setIssuedAt(new Date(System.currentTimeMillis()))
			.setExpiration(new Date(System.currentTimeMillis() + expiration))
			.signWith(this.obtainSignatureKey(), SignatureAlgorithm.HS256)
			.compact();
	}

	private Key obtainSignatureKey() {
		byte[] keyBytes = Decoders.BASE64.decode(this.secretKey);
		return Keys.hmacShaKeyFor(keyBytes);
	}
}
