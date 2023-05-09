package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

//date/time, comment, difficulty, total time, and rating
@Entity
public class TourLog {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer id;

    private String date;
    private String comment;
    private Integer difficulty;
    private Integer totalTime;
    private Double rating;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "tour_id", nullable = true)
    private Tour tour;
}
