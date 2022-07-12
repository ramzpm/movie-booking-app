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
public class Theatre implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "THEATRE_ID")
    private Integer theatreId;

    @Column(name = "THEATRE_NAME")
    private String theatreName;

    @Column(name = "SCREEN_NAME")
    private String screenName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "LOCATION_ID")
    private Location location;

}
