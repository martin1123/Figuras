package ar.com.geopagos.figuras.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import ar.com.geopagos.figuras.exception.FiguraNoEncontradaException;
import ar.com.geopagos.figuras.response.ResponseError;

@RestControllerAdvice
public class NotFoundControllerAdvice {

    @ExceptionHandler(FiguraNoEncontradaException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseError handleFiguraNoEncontrada(FiguraNoEncontradaException ex) {
		return new ResponseError(ex.getMessage());
    }
	
}
