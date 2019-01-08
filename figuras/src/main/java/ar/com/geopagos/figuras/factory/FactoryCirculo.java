package ar.com.geopagos.figuras.factory;

import org.springframework.stereotype.Component;

import ar.com.geopagos.figuras.model.Circulo;
import ar.com.geopagos.figuras.model.FiguraGeometrica;

@Component
public class FactoryCirculo implements FactoryFigura {

	@Override
	public FiguraGeometrica fabricarFigura() {
		return new Circulo();
	}

	@Override
	public FactoryFiguraType getFactoryFiguraType() {
		return FactoryFiguraType.CIRCULO;
	}

}
