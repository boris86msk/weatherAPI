package ru.example.weatherapi.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ResponseDto {
    private LocationDto location;

    private CurrentDto current;

}
