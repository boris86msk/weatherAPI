package ru.example.weatherapi.service;

import ru.example.weatherapi.dto.ResponseDto;

public interface WeatherDB {

    public String saveResponse(ResponseDto responseDto);
}
