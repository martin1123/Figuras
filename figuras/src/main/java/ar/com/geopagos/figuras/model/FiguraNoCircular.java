package ar.com.geopagos.figuras.model;


public abstract class FiguraNoCircular implements FiguraGeometrica {

	private Double base;
	
	private Double altura;
	
	public FiguraNoCircular() {
		
	}
	
	public FiguraNoCircular(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public Double getDiamtero() {
		return null;
	}
	
	@Override
	public void setDiamtero(Double diametro) {
		//No se hace nada debido a que no posee diametro
	}
	
	/**
	 * @return the base
	 */
	@Override
	public Double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	@Override
	public void setBase(Double base) {
		this.base = base;
	}

	/**
	 * @return the altura
	 */
	@Override
	public Double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	@Override
	public void setAltura(Double altura) {
		this.altura = altura;
	}

}
