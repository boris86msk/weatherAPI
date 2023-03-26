package ru.example.weatherapi.cervice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.example.weatherapi.dto.ResponseDto;

@Service
public class WeatherRTSimpl implements WeatherRestTemplateService {

    @Value("${API_Key}")
    private String api_key;

    private String method_api = "current.json";
    private static final String ROOT_URL = "http://api.weatherapi.com/v1/";
    private static final String PARAM = "%s%s?key=%s&q=auto:ip&aqi=no";

    @Override
    public ResponseDto getAllInfo() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseDto resBody = restTemplate.exchange(
                String.format(PARAM, ROOT_URL, method_api, api_key),
                HttpMethod.GET,
                new HttpEntity<>(null),
                ResponseDto.class
        ).getBody();
        System.out.println(resBody);
        return resBody;
    }

}


/**
 * при поддержке https://www.weatherapi.com/
 */