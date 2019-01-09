package ar.com.geopagos.figuras.factory;

import ar.com.geopagos.figuras.model.FiguraGeometrica;

public interface FactoryFigura {

	public FiguraGeometrica fabricarFigura();
	
	public FactoryFiguraType getFactoryFiguraType();
	
}
