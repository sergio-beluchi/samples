package com.example.springshutdown;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PreDestroy;

@SpringBootApplication
public class SpringShutdownApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringShutdownApplication.class, args);
    }

    @PreDestroy
    public void onDestroy() {
        System.out.println("Spring Container is destroyed!");
    }

}
