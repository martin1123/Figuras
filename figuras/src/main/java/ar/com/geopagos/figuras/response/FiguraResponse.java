package ar.com.geopagos.figuras.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FiguraResponse {

	@JsonProperty("tipoFigura")
	private String tipoFigura;
	
	@JsonProperty("base")
	private Double base;
	
	@JsonProperty("altura")
	private Double altura;
	
	@JsonProperty("diametro")
	private Double diametro;
	
	@JsonProperty("area")
	private Double area;
	
	public FiguraResponse() {
		
	}

	/**
	 * @return the tipoFigura
	 */
	public String getTipoFigura() {
		return tipoFigura;
	}

	/**
	 * @param tipoFigura the tipoFigura to set
	 */
	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}

	/**
	 * @return the base
	 */
	public Double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(Double base) {
		this.base = base;
	}

	/**
	 * @return the altura
	 */
	public Double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(Double altura) {
		this.altura = altura;
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

	/**
	 * @return the area
	 */
	public Double getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(Double area) {
		this.area = area;
	}
	
	
}
