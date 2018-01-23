package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import mongo.repositories.*;

@SpringBootApplication
@EnableMongoRepositories(basePackages="mongo.repositories")

public class MusicCruxApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicCruxApplication.class, args);
    }
}
