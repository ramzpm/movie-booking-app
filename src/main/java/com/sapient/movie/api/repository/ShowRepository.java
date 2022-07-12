package com.sapient.movie.api.repository;

import com.sapient.movie.api.entity.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface ShowRepository extends JpaRepository<Show, Integer> {

    List<Show> findBylocationIdMovieIdDate(Integer locationId,Integer movieId,
                                           String date);


}