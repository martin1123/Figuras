package ar.com.geopagos.figuras.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestFiguraCircular extends Request{

	@JsonProperty("diametro")
	private Double diametro;

	@Override
	public Double getBase() {
		return null;
	}

	@Override
	public Double getAltura() {
		return null;
	}

	@Override
	public Double getDiamtro() {
		return diametro;
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

}
