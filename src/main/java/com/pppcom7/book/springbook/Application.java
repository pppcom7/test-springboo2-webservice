package com.pppcom7.book.springbook;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import static org.springframework.boot.SpringApplication.run;
import static org.springframework.boot.autoconfigure.SpringBootApplication.*;
@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        run(Application.class, args);
    }
}
