package ar.com.geopagos.figuras.factory;

import org.springframework.stereotype.Component;

import ar.com.geopagos.figuras.model.FiguraGeometrica;
import ar.com.geopagos.figuras.model.Triangulo;

@Component
public class FactoryTriangulo implements FactoryFigura {

	@Override
	public FiguraGeometrica fabricarFigura() {
		return new Triangulo();
	}

	@Override
	public FactoryFiguraType getFactoryFiguraType() {
		return FactoryFiguraType.TRIANGULO;
	}

}
