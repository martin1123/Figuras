package ar.com.geopagos.figuras.request;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestFiguraNoCircular extends Request {

	@JsonProperty("base")
	@NotNull(message = "Se debe indicar la base de la figura")
	private Double base;

	@JsonProperty("altura")
	@NotNull(message = "Se debe indicar la altura de la figura")
	private Double altura;

	@Override
	public Double getBase() {
		return this.base;
	}

	@Override
	public Double getAltura() {
		return this.altura;
	}

	@Override
	public Double getDiamtro() {
		return null;
	}

	/**
	 * @param base
	 *            the base to set
	 */
	public void setBase(Double base) {
		this.base = base;
	}

	/**
	 * @param altura
	 *            the altura to set
	 */
	public void setAltura(Double altura) {
		this.altura = altura;
	}

}
