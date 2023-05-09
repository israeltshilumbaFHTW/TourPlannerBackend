package com.example.demo.service.TourLogService;

import com.example.demo.model.TourLog;
import com.example.demo.service.TourService.TourRepo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tourLogs")
public class TourLogsService {
    private final TourLogsController tourLogsController;
    public TourLogsService(TourLogsRepo tourLogsRepo, TourRepo tourRepo) {
        this.tourLogsController = new TourLogsController(tourLogsRepo, tourRepo);
    }

    @GetMapping("/{tour_id}")
    public List<TourLog> getAllTours(@PathVariable Integer tour_id) {
        return tourLogsController.getAllTourLogs(tour_id);
    }

    @PostMapping("/{tour_id}")
    public ResponseEntity<String> addTourLog(@RequestBody TourLog tourLog, @PathVariable Integer tour_id) {
        Boolean success = tourLogsController.addTourLog(tourLog, tour_id);
        if (success) {
            return ResponseEntity.ok("successfully added");
        } else {
            return ResponseEntity.status((HttpStatus.CONFLICT)).build();
        }
    }
}
