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
public class Tour {
    @Id
    @SequenceGenerator(
            name = "tour_id_sequence",
            sequenceName = "tour_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tour_id_sequence"
    )
    private Integer id;
    private String name;
    private String description;
    private String fromLocation;
    private String toLocation;
    private String transportType;
    private Double distance;
    private Double estimatedTime;

}
