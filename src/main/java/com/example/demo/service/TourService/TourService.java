package com.example.demo.service.TourService;

import com.example.demo.model.Tour;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tours")
public class TourService {
    private final TourController tourController;

    public TourService(TourRepo tourRepo) {
        this.tourController = new TourController(tourRepo);
    }

    @GetMapping("")
    public List<Tour> getAllTours() {
        return tourController.getAllTours();
    }

    @PostMapping("")
    public ResponseEntity<Void> addTour(@RequestBody Tour tour) {
        Boolean success = this.tourController.addTour(tour);
        if(success) {
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }
}
