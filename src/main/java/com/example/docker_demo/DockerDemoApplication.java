package com.example.docker_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.time.ZonedDateTime;

@SpringBootApplication
public class DockerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerDemoApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void applicationReadyEventHandler() {
        System.out.println(ZonedDateTime.now() + " Server Is Ready!!!");
    }


}
