package com.roman.onlinemagazine;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class SpringProjectStarter {

    public static void main(String[] args) {
        SpringApplication.run(SpringProjectStarter.class, args);
    }

}
