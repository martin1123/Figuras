package ar.com.geopagos.figuras.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.geopagos.figuras.exception.FiguraIncorrectaException;

@Service
public class FactoryStore {
	
	@Autowired
	private List<FactoryFigura> factoriesFiguras;
	
	private static final Map<FactoryFiguraType,FactoryFigura> factories = new HashMap<>();
	
	/**
	 * Crea Mapa con cada factory indexado por su tipo
	 */
    @PostConstruct
    public void initFactoryStore() {
    	factoriesFiguras.stream().forEach(f -> factories.put(f.getFactoryFiguraType(), f));
    }
    
    /**
     * Busca factory por su tipo
     * @param factoryType Tipo de factory
     * @return Factory deseada
     */
    public static FactoryFigura getFactory(String factoryType) {
    	try {
    		return factories.get(FactoryFiguraType.valueOf(factoryType.toUpperCase()));
    	}catch(RuntimeException ex) {
    		throw new FiguraIncorrectaException("El tipo de figura ingresado es incorrecto");
    	}
    }
}
