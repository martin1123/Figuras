package ar.com.geopagos.figuras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public FiguraResponse registrarFigura(@Validated @RequestBody Request request) throws Exception {
		return service.registrarFigura(request);
	}
	
	/**
	 * Metodo de obtencion de figuras por orden de creacion
	 * @param posicionFigura Posicion de figura en almacen de figuras
	 * @return FiguraResponse
	 */
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public FiguraResponse obtenerFigura(@RequestParam("posicion") int posicionFigura) {
		return service.obtenerFigura(posicionFigura);
	}
	
}
