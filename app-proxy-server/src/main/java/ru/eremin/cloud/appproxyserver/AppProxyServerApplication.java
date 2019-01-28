package ru.eremin.cloud.appproxyserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@EnableZuulProxy
@SpringBootApplication
public class AppProxyServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppProxyServerApplication.class, args);
    }

}

