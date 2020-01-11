package com.solt.demo.demo;

import com.solt.demo.demo.manytomanydemo.service.IDatabase;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ManyToManyApplication {
private final IDatabase iDatabase;

    public ManyToManyApplication(IDatabase iDatabase) {
        this.iDatabase = iDatabase;
    }

    public static void main(String[] args) {
        SpringApplication.run(ManyToManyApplication.class, args);
    }
    @Bean
    public CommandLineRunner runner(){
        return args -> {
            iDatabase.createTable();

        };
    }

}

