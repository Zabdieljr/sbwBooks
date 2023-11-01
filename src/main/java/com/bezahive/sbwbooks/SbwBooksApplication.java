package com.bezahive.sbwbooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// add jpa auditing
@EnableJpaAuditing
// enable Jpa Repositories
@EnableJpaRepositories(basePackages = "com.bezahive.sbwbooks.repositories")

public class SbwBooksApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbwBooksApplication.class, args);
    }

}
