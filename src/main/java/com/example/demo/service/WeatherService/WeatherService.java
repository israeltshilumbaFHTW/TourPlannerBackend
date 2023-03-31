package com.example.demo.service.WeatherService;

import com.example.demo.model.Weather;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherService {
    private final WeatherController weatherController;

    public WeatherService(WeatherRepo weatherRepo) { //nicht sehr elegant gelöst
        this.weatherController = new WeatherController(weatherRepo);
    }

    @GetMapping("/")
    public List<Weather> getAllWeather() {
        return weatherController.getAllWeather();
    }

    @PostMapping("/")
    public Weather addWeather(@RequestBody Weather weather) {
        return this.weatherController.addWeather(weather);
    }
}
