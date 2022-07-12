package com.sapient.movie.api.service;

import com.sapient.movie.api.entity.Show;
import com.sapient.movie.api.repository.ShowRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ShowService {

    ShowRepository repository;

    public List<Show> getShowDetailsForDateAndLocation(String locationId, String movieId,
                                                       String date) {

        return null;
       /* return  repository.findBylocationIdAndMovieIdAnddate(Integer.valueOf(locationId),
                Integer.valueOf(movieId),date);*/
    }

}
