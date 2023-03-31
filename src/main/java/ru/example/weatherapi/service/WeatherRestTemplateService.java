package ru.example.weatherapi.service;

import ru.example.weatherapi.dto.ResponseDto;

public interface WeatherRestTemplateService {
    public ResponseDto getAllInfo(String param);

}
