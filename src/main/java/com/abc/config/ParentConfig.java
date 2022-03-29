package com.abc.config;

import com.abc.bean.Rocket;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ParentConfig {

    @Bean
    public Rocket rocket(@Value("${rocketId}") int rocketId,
                         @Value("${fuelType}") String fuelType) {

        Rocket rocket = new Rocket();
        rocket.setRocketId(rocketId);
        rocket.setFuelType(fuelType);
        return rocket;
    }
}
