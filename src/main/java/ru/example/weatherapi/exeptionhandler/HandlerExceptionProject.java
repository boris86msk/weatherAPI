package ru.example.weatherapi.exeptionhandler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.example.weatherapi.dto.ResponseDto;

@RestControllerAdvice
@Slf4j
public class HandlerExceptionProject {

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<?> handlerNullPointerEx(NullPointerException e) {
        log.error("Лог тестовой ошибки, сработал ExceptionHandler, отловленна ошибка NullPointerException");
        log.info("бла бла ...");
        ResponseDto responseDto = new ResponseDto();
        responseDto.setErrorMessage("тестовая ошибка");

        return ResponseEntity
                .badRequest()
                .body(responseDto);
    }

}
