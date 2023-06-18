package com.example.demo.service.TourLogService;

import com.example.demo.model.Tour;
import com.example.demo.model.TourLog;
import com.example.demo.service.TourService.TourRepo;

import java.util.*;

public class TourLogsController {

    private final TourLogsRepo tourLogsRepo;
    private final TourRepo tourRepo;

    public TourLogsController(TourLogsRepo tourLogsRepo, TourRepo tourRepo) {
        this.tourLogsRepo = tourLogsRepo;
        this.tourRepo = tourRepo;
    }

    public List<TourLog> getAllTourLogs(Integer tour_id) {
        List<TourLog> tourLogList = tourLogsRepo.findAll();
        List<TourLog> tourLogListById = new ArrayList<>();

        tourLogList.forEach(tourLog -> {
            if (Objects.equals(tourLog.getTour().getId(), tour_id)) {
               tourLogListById.add(tourLog);
            }
        });
        return tourLogListById;

    }

    public Boolean addTourLog(TourLog tourLog, Integer tour_id) {
        //find Tour first
        Tour tour = tourRepo.findById(tour_id).orElseThrow(() -> new IllegalArgumentException("Customer not found"));
        //set TourLog in tour
        tourLog.setTour(tour);
        //save TourLog
        tourLogsRepo.save(tourLog);
        this.tourLogsRepo.save(tourLog);
        return true;
    }

    public Boolean deleteTourLog(Integer id) {
        this.tourLogsRepo.deleteById(id);
        return true;
    }
}
