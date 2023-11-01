package com.bezahive.sbwbooks;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
// add jpa auditing
@EnableJpaAuditing
// enable Jpa Repositories
@EnableJpaRepositories(basePackages = "com.bezahive.sbwbooks.repositories")

public class SbwBooksApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbwBooksApplication.class, args);
    }


    // display a: we are online message on console

    @Bean
        public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
     return args -> {
         System.out.println("We are online");
                    };
        }

}
