package ar.com.geopagos.figuras.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import ar.com.geopagos.figuras.request.Request;
import ar.com.geopagos.figuras.request.RequestFiguraCircular;
import ar.com.geopagos.figuras.request.RequestFiguraNoCircular;
import ar.com.geopagos.figuras.response.FiguraResponse;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class FiguraServiceTest {

	@TestConfiguration
	static class FiguraServiceImplTestContextConfiguration {

		@Bean("circulo")
		public Request getCirculo() {
			RequestFiguraCircular circulo = new RequestFiguraCircular();
			circulo.setFiguraType("circulo");
			circulo.setDiametro(4.0);
			return circulo;
		}

		@Bean("cuadrado")
		public Request getCuadrado() {
			RequestFiguraNoCircular cuadrado = new RequestFiguraNoCircular();
			cuadrado.setAltura(2.0);
			cuadrado.setBase(2.0);
			cuadrado.setFiguraType("cuadrado");
			return cuadrado;
		}

		@Bean("triangulo")
		public Request getTriangulo() {
			RequestFiguraNoCircular triangulo = new RequestFiguraNoCircular();
			triangulo.setAltura(5.0);
			triangulo.setBase(10.0);
			triangulo.setFiguraType("triangulo");
			return triangulo;
		}

	}

	@Autowired
	private FiguraService figuraService;

	@Autowired
	@Qualifier("circulo")
	private Request circuloReq;

	@Autowired
	@Qualifier("cuadrado")
	private Request cuadradoReq;

	@Autowired
	@Qualifier("triangulo")
	private Request trianguloReq;

	@Test
	public void resgitrarCirculo() {

		FiguraResponse figura = figuraService.registrarFigura(circuloReq);

		//Verifica que la figura devuelta calcule bien el area
		assert (figura.getArea().equals(Math.PI * Math.pow((circuloReq.getDiametro() / 2), 2)));
	}
	
	@Test
	public void resgitrarCuadrado() {

		FiguraResponse figura = figuraService.registrarFigura(cuadradoReq);

		//Verifica que la figura devuelta calcule bien el area
		assert (figura.getArea().equals(cuadradoReq.getBase()*cuadradoReq.getAltura()));
	}
	
	@Test
	public void resgitrarTriangulo() {

		FiguraResponse figura = figuraService.registrarFigura(trianguloReq);

		//Verifica que la figura devuelta calcule bien el area
		assert (figura.getArea().equals(trianguloReq.getBase()*trianguloReq.getAltura()/2));
	}

}
