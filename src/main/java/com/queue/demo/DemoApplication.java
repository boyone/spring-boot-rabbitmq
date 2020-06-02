package com.queue.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoApplication {

    /*@Profile("usage_message")
    @Bean
    public CommandLineRunner usage() {
        return args -> {
            System.out.println("This app uses Spring Profiles to control its " +
                "behavior.\n");
            System.out.println("Sample usage: java -jar rabbit - tutorials" +
                ".jar --spring.profiles.active = hello - world, sender");
        };
    }*/

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
