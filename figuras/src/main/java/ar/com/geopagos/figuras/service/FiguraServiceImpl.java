package ar.com.geopagos.figuras.service;

import org.springframework.stereotype.Service;

import ar.com.geopagos.figuras.exception.FiguraNoEncontradaException;
import ar.com.geopagos.figuras.exception.InternalException;
import ar.com.geopagos.figuras.factory.FactoryStore;
import ar.com.geopagos.figuras.model.FiguraGeometrica;
import ar.com.geopagos.figuras.request.Request;
import ar.com.geopagos.figuras.response.FiguraResponse;
import ar.com.geopagos.figuras.store.FigurasStore;
import ar.com.geopagos.figuras.util.MapperUtil;

@Service
public class FiguraServiceImpl implements FiguraService {

	@Override
	public FiguraResponse registrarFigura(Request infoFigura) {
		FiguraGeometrica figura = FactoryStore.getFactory(infoFigura.getFiguraType()).fabricarFigura();
		
		//Setea atributos necesarios para cualquier tipo de figura
		figura.setAltura(infoFigura.getAltura());
		figura.setBase(infoFigura.getBase());
		figura.setDiamtero(infoFigura.getDiametro());
		
		if(!FigurasStore.addFigura(figura)) {
			throw new InternalException("No se pudo almacenar la figura en memoria");
		}
		
		//Retorna el Json de la figura registrada
		return MapperUtil.getMapper().map(figura, FiguraResponse.class);
	}

	@Override
	public FiguraResponse obtenerFigura(int pos) {
		
		FiguraGeometrica figura;
		
		try {
			figura = FigurasStore.getFigura(pos);
		}catch(IndexOutOfBoundsException ex) {
			throw new FiguraNoEncontradaException("No se encontro una figura en la posicion ingresada");
		}
		
		//Retorna el Json de la figura obtenida
		return MapperUtil.getMapper().map(figura, FiguraResponse.class);
	}

}
