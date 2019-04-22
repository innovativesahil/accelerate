package com.sahil.accelerateproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AccelerateProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccelerateProjectApplication.class, args);
    }

}
