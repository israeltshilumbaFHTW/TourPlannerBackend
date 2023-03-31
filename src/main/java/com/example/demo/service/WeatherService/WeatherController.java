package com.example.demo.service.WeatherService;

import com.example.demo.model.Weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherController {

    private final WeatherRepo weatherRepo;

    public WeatherController(WeatherRepo weatherRepo) {
        this.weatherRepo = weatherRepo;
    }

    public Weather addWeather(Weather weather) {
        return this.weatherRepo.save(weather);
    }

    public List<Weather> getAllWeather() {
        List<Weather> weatherList = weatherRepo.findAll();

        if (weatherList.isEmpty()) {
            return new ArrayList<>();
        }
        return weatherList;
    }


}
