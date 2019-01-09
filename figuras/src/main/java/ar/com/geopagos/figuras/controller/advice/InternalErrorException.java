package ar.com.geopagos.figuras.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import ar.com.geopagos.figuras.exception.InternalException;
import ar.com.geopagos.figuras.response.ResponseError;

@RestControllerAdvice
public class InternalErrorException {

	@ExceptionHandler(InternalException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseError handleInternalError(InternalException ex) {
		return new ResponseError(ex.getMessage());
    }
}
