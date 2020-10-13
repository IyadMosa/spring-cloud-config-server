package com.usersinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UsersInfoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsersInfoServiceApplication.class, args);
    }

}
