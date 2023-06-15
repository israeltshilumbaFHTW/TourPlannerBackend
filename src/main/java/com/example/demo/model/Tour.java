package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

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
    private String estimatedTime;
    private String date;
    @Lob
    private String imageUrl;
    private String routeInformation;
    private Integer popularity;
    private Double childFriendliness;

    @OneToMany(mappedBy = "tour", cascade = CascadeType.ALL)
    private List<TourLog> tourLogList;

}
