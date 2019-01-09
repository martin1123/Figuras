package ar.com.geopagos.figuras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ar.com.geopagos.figuras.request.Request;
import ar.com.geopagos.figuras.response.FiguraResponse;
import ar.com.geopagos.figuras.service.FiguraService;


@RestController
@RequestMapping("/")
public class FiguraController {

	@Autowired
	private FiguraService service;
	
	/**
	 * Metodo de registro de figuras
	 * @param request Request en formato Json
	 * @return FiguraResponse Json de la figura registrada
	 */
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public FiguraResponse registrarFigura(@Validated @RequestBody Request request) throws Exception {
		return service.registrarFigura(request);
	}
	
	/**
	 * Metodo de obtencion de figuras por orden de creacion
	 * @param posicionFigura Posicion de figura en almacen de figuras
	 * @return FiguraResponse
	 */
	@GetMapping(value = "{posicion}", produces = MediaType.APPLICATION_JSON_VALUE)
	public FiguraResponse obtenerFigura(@PathVariable("posicion") int posicionFigura) {
		return service.obtenerFigura(posicionFigura);
	}
	
	/**
	 * Metodo de obtencion de todas las figuras 
	 * @return List<FiguraResponse> Figuras almacenadas en memoria
	 */
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<FiguraResponse> obtenerFiguras() {
		return service.obtenerTodasLasFiguras();
	}
	
}
