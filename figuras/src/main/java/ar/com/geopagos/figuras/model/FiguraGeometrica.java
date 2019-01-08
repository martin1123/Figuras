package ar.com.geopagos.figuras.model;

public interface FiguraGeometrica {

	public Double getBase();

	public Double getAltura();

	public Double getArea();

	public Double getDiamtero();
	
	public void setDiamtero(Double diametro);

	public void setBase(Double base);

	public void setAltura(Double altura);

	public String getTipoFigura();

}
