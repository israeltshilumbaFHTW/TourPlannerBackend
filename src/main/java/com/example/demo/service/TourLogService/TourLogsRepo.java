package com.example.demo.service.TourLogService;

import com.example.demo.model.TourLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public interface TourLogsRepo extends JpaRepository<TourLog, Integer> {
    List<TourLog> findByTourId(Integer tourId);
}
