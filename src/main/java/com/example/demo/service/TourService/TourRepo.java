package com.example.demo.service.TourService;

import com.example.demo.model.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourRepo extends JpaRepository<Tour, Integer> {
}
