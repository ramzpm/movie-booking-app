package com.sapient.movie.api.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Movies implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "MOVIE_ID")
    private Integer movieId;

    @Column(name = "MOVIE_NAME")
    private String movieName;

    @Column(name = "LANGUAGE")
    private String language;

    @Column(name = "DESCRIPTION")
    private String description;

}
