package com.example.forexeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ForexEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForexEurekaServerApplication.class, args);
    }

}
