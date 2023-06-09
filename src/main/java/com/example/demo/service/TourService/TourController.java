package com.example.demo.service.TourService;

import com.example.demo.model.Tour;
import com.example.demo.service.WeatherService.WeatherRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class TourController {

    private final TourRepo tourRepo;

    public TourController(TourRepo tourRepo) {
       this.tourRepo = tourRepo;
    }

    public Boolean addTour(Tour tour) {
        //do MapQuest Logic here

        System.out.println(tour.toString());
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

    public Tour getTour(Integer id) {

        return (Tour) tourRepo.findById(id).orElse(null);
    }

    public Boolean deleteTour(Integer id) {
        this.tourRepo.deleteById(id);
        return true;
    }
}
