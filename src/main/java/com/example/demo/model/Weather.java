package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Weather {
    @Id
    @SequenceGenerator(
            name = "weather_id_sequence",
            sequenceName = "weather_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "weather_id_sequence"
    )
    private Integer id;
    private String location;
    private Integer degree;
}
