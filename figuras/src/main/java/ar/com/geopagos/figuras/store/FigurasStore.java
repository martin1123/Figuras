package ar.com.geopagos.figuras.store;

import java.util.List;
import java.util.Vector;

import ar.com.geopagos.figuras.model.FiguraGeometrica;

/**
 * Clase que almacena figuras en memoria
 */
public class FigurasStore {
	private static List<FiguraGeometrica> figuras = new Vector<>();
	
	public static FiguraGeometrica getFigura(int pos) {
		return figuras.get(pos);
	}
	
	public static Boolean addFigura(FiguraGeometrica figura) {
		return figuras.add(figura);
	}
	
}
