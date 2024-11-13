package org.example;

import io.github.cdimascio.dotenv.Dotenv;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Main {
    public static void main(String[] args) {

        Dotenv dotenv = Dotenv.load();
        String secretKey = dotenv.get("JWT_SECRET_KEY");
        String jwtExpirationStr = dotenv.get("JWT_EXPIRATION_TIME");
        Long jwtExpiration = Long.parseLong(jwtExpirationStr);

        System.out.println("Secret Key: " + secretKey);
        System.out.println("JWT Expire: " + jwtExpiration);

    }
}