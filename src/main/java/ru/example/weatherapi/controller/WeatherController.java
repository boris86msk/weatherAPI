package ru.example.weatherapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.example.weatherapi.service.WeatherDBimpl;
import ru.example.weatherapi.service.WeatherRTSimpl;
import ru.example.weatherapi.dto.ResponseDto;

@RestController
public class WeatherController {
    @Autowired
    private WeatherRTSimpl weatherRTSimpl;

    @Autowired
    private WeatherDBimpl weatherDBimpl;

    @GetMapping("/test")
    public @ResponseBody ResponseDto simpleQuery(@RequestParam String param) {
        throw  new NullPointerException();
//        ResponseDto allInfo = weatherRTSimpl.getAllInfo(param);
//        weatherDBimpl.saveResponse(allInfo);
       // return allInfo;
    }

}

/**
 *  Омск 55.0318, 73.2926
 *  Тверь 56.8687, 35.8522
 *
 */
