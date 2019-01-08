package ar.com.geopagos.figuras.request;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


@JsonTypeInfo(
		  use = JsonTypeInfo.Id.NAME, 
		  include = JsonTypeInfo.As.PROPERTY, 
		  property = "figuraType",
		  visible = true)
		@JsonSubTypes({ 
		  @Type(value = RequestFiguraNoCircular.class, name = "cuadrado"), 
		  @Type(value = RequestFiguraNoCircular.class, name = "triangulo"), 
		  @Type(value = RequestFiguraCircular.class, name = "circulo") 
		})
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class Request {
	
	@JsonProperty("figuraType")
	@NotNull(message = "Se debe indicar el tipo de figura")
	private String figuraType;
	
	/**
	 * @return the figuraType
	 */
	public String getFiguraType() {
		return figuraType;
	}

	/**
	 * @param figuraType the figuraType to set
	 */
	public void setFiguraType(String figuraType) {
		this.figuraType = figuraType;
	}

	//Necesario en caso de no ser circulo
	public abstract Double getBase();
	
	//Necesario en caso de no ser circulo
	public abstract Double getAltura();
	
	//Necesario en caso de ser circulo
	public abstract Double getDiamtro();
}
