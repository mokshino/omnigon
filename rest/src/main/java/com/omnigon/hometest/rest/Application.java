package com.omnigon.hometest.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Application.
 */
@SpringBootApplication(scanBasePackages = "hometest")
public class Application {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
