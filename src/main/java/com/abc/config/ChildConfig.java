package com.abc.config;

import com.abc.bean.LaunchPad;
import com.abc.bean.Rocket;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChildConfig {

    @Bean
    public LaunchPad launchPad(Rocket rocket) {
        LaunchPad launchPad = new LaunchPad();
        launchPad.setRocket(rocket);
        return launchPad;
    }
}
