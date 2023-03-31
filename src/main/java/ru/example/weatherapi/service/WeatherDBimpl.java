package ru.example.weatherapi.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.example.weatherapi.dto.ResponseDto;

@Service
public class WeatherDBimpl implements WeatherDB {
    private static final String URL = "http://localhost:8082/";

    @Override
    public String saveResponse(ResponseDto responseDto) {
        RestTemplate restTemplate = new RestTemplate();
        String res = null;
        try {
             res = restTemplate.exchange(
                    URL,
                    HttpMethod.POST,
                    new HttpEntity<>(responseDto),
                    String.class
            ).getBody();
            return res;
        } catch (Exception e) {
            throw new IllegalArgumentException("Неверные параметры ввода");
        }
    }
}
