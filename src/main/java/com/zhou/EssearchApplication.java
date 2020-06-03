package com.zhou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class EssearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(EssearchApplication.class, args);
    }

}

