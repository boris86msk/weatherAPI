package ru.example.weatherapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.example.weatherapi.cervice.WeatherRTSimpl;
import ru.example.weatherapi.dto.ResponseDto;

@RestController
public class WeatherController {
    @Autowired
    WeatherRTSimpl weatherRTSimpl;

    @GetMapping("/test")
    public @ResponseBody ResponseDto simpleQuery() {
        ResponseDto allInfo = weatherRTSimpl.getAllInfo();
        return allInfo;
    }

}
