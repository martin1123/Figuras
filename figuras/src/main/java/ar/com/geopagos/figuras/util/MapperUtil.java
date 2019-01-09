package ar.com.geopagos.figuras.util;

import org.modelmapper.ModelMapper;

/**
 * Clase que provee soporte para el mapeo entre objetos de clases distintas
 * 
 *
 */
public class MapperUtil {
	
	private static ModelMapper modelMapper = new ModelMapper();

	/**
	 * @return the modelMapper
	 */
	public static ModelMapper getMapper() {
		return modelMapper;
	}

	/**
	 * @param modelMapper the modelMapper to set
	 */
	public static void setMapper(ModelMapper modelMapper) {
		MapperUtil.modelMapper = modelMapper;
	}
	
	
}
