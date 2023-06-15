package com.example.demo.service.TourService;

import com.example.demo.model.Tour;
import com.example.demo.service.Enums.ResponseMessage;
import org.springframework.http.HttpStatus;
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

    @GetMapping("/{id}")
    public Tour getAllTours(@PathVariable Integer id) {
        return tourController.getTour(id);
    }
    @PostMapping("")
    public ResponseEntity<String> addTour(@RequestBody Tour tour) {
        Boolean success = this.tourController.addTour(tour);
        if(success) {
            return ResponseEntity.ok(ResponseMessage.POST_TOUR_SUCCESS.getResponseStatus());
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }
}
