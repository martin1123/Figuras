package ar.com.geopagos.figuras.model;

public class Circulo implements FiguraGeometrica {

	private Double diametro;
	
	public Circulo() {
		
	}
	
	public Circulo(Double diametro) {
		super();
		this.diametro = diametro;
	}

	@Override
	public Double getArea() {
		return Math.PI * Math.pow((this.diametro / 2), 2);
	}

	@Override
	public Double getDiamtero() {
		return this.diametro;
	}

	@Override
	public Double getBase() {
		return null;
	}

	@Override
	public Double getAltura() {
		return null;
	}

	@Override
	public String getTipoFigura() {
		return "Circulo";
	}

	/**
	 * @return the diametro
	 */
	public Double getDiametro() {
		return diametro;
	}

	/**
	 * @param diametro the diametro to set
	 */
	public void setDiametro(Double diametro) {
		this.diametro = diametro;
	}

	@Override
	public void setDiamtero(Double diametro) {
		this.diametro = diametro;
	}

	@Override
	public void setBase(Double base) {
		//No se hace nada debido a que no tiene base
	}

	@Override
	public void setAltura(Double altura) {
		//No se hace nada debido a que no tiene altura
	}
	
	

}
