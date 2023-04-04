package com.example.demo.service.WeatherService;

import com.example.demo.model.Weather;

import java.nio.file.Watchable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public Weather getWeather(Integer weatherId) {

        Optional<Weather> weatherOptional = weatherRepo.findById(weatherId); //may return an empty result
        Weather weather = (Weather) weatherOptional.orElse(null);

        return weather;
    }


}
