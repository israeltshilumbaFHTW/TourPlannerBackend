package com.example.demo.service.TourService;

import com.example.demo.model.Tour;
import com.example.demo.service.WeatherService.WeatherRepo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public class TourController {

    private final TourRepo tourRepo;

    public TourController(TourRepo tourRepo) {
       this.tourRepo = tourRepo;
    }

    public Boolean addTour(Tour tour) {
        this.tourRepo.save(tour);
        return true;
    }

    public List<Tour> getAllTours() {
        List<Tour> tourList = tourRepo.findAll();

        if (tourList.isEmpty()) {
            return new ArrayList<>();
        }
        return tourList;
    }
}
