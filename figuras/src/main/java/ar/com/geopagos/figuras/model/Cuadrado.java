package ar.com.geopagos.figuras.model;

public class Cuadrado extends FiguraNoCircular {

	public Cuadrado() {
		super();
	}
	
	public Cuadrado(Double base, Double altura) {
		super(base,altura);
	}
	
	@Override
	public Double getArea() {
		return this.getBase() * this.getAltura();
	}

	@Override
	public String getTipoFigura() {
		return "Cuadrado";
	}

}
