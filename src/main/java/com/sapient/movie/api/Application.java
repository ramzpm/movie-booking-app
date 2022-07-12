package com.sapient.movie.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Application {

    /**
     * Kickoff of this api will happen from ReviewsQuery class for getReviews query endpoint.
     * @param args default
     * @throws Exception object
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
