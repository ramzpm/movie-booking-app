package com.sapient.movie.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@NamedNativeQuery(
        name = "getAllEmployeesByDeptId",
        query = "SELECT id, firstName, lastName, email, department.id, department.name " +
                "FROM employee, department " +
                "WHERE department.id = ?",
        resultClass=Show.class
)
public class Show implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "SHOW_ID")
    private String showId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "MOVIE_ID")
    private Movies movie;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "THEATRE_ID")
    private Theatre theatre;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "LOCATION_ID")
    private Location location;


    @Column(name = "TIME")
    private String time;

}
