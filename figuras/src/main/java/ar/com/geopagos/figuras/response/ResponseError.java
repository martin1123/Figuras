package ar.com.geopagos.figuras.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseError {

	@JsonProperty("mensaje_error")
	private String mensaje;

	public ResponseError(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
