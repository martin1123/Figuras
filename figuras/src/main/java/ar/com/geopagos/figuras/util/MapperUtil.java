package ar.com.geopagos.figuras.util;

import org.modelmapper.ModelMapper;

/**
 * Class that provides support for class mapping
 * @author Teceng-Gaming
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
