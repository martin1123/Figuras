package ar.com.geopagos.figuras.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import ar.com.geopagos.figuras.exception.FiguraIncorrectaException;

@RestControllerAdvice
public class FiguraIncorrectaControllerAdvice {

	@ExceptionHandler(FiguraIncorrectaException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
	public void handleFiguraIncorrecta() {
		
    }
}
