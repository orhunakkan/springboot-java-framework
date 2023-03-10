package com.example.spring05springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This annotation is equivalent to @SpringBootConfiguration, @EnableAutoConfiguration, and @ComponentScan
@SpringBootApplication
public class Spring05SpringBootDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(Spring05SpringBootDemoApplication.class, args);

    }
}
