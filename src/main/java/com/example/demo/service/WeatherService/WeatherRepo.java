package com.example.demo.service.WeatherService;

import com.example.demo.model.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WeatherRepo extends JpaRepository<Weather, Integer> {
}
