package com.sapient.movie.api.controller;

import com.sapient.movie.api.entity.Show;
import com.sapient.movie.api.service.ShowService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/shows")
@AllArgsConstructor
@Slf4j
public class ShowController {

    ShowService showService;

    @GetMapping(value = "/{locationId}/{movieId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Show>> getAllMoviesForLocation
                    (@PathVariable final String locationId,@PathVariable final String movieId,
                    @RequestParam final String date) {

        List<Show> response = showService.getShowDetailsForDateAndLocation(locationId,movieId,date);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}