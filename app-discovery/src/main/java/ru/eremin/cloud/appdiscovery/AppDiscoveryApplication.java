package ru.eremin.cloud.appdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AppDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppDiscoveryApplication.class, args);
    }

}

