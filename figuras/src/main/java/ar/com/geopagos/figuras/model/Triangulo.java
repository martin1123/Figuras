package ar.com.geopagos.figuras.model;

public class Triangulo extends FiguraNoCircular {

	public Triangulo() {
		super();
	}
	
	public Triangulo(Double base, Double altura) {
		super(base,altura);
	}
	
	@Override
	public Double getArea() {
		return this.getBase() * this.getAltura() / 2;
	}

	@Override
	public String getTipoFigura() {
		return "Triangulo";
	}

}
