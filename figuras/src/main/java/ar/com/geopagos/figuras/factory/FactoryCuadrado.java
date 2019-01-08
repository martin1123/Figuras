package ar.com.geopagos.figuras.factory;

import org.springframework.stereotype.Component;

import ar.com.geopagos.figuras.model.Cuadrado;
import ar.com.geopagos.figuras.model.FiguraGeometrica;

@Component
public class FactoryCuadrado implements FactoryFigura {

	@Override
	public FiguraGeometrica fabricarFigura() {
		return new Cuadrado();
	}

	@Override
	public FactoryFiguraType getFactoryFiguraType() {
		return FactoryFiguraType.CUADRADO;
	}

}
