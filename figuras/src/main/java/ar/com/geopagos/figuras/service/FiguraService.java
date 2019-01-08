package ar.com.geopagos.figuras.service;

import ar.com.geopagos.figuras.request.Request;
import ar.com.geopagos.figuras.response.FiguraResponse;

public interface FiguraService {
	public FiguraResponse registrarFigura(Request infoFigura);
	
	public FiguraResponse obtenerFigura(int pos);
}
