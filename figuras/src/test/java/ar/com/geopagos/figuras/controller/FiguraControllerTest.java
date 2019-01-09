package ar.com.geopagos.figuras.controller;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import ar.com.geopagos.figuras.service.FiguraService;

@RunWith(SpringRunner.class)
@WebMvcTest(FiguraController.class)
public class FiguraControllerTest {

	@Autowired
    private MockMvc mvc;
	
	@MockBean
    private FiguraService service;
	
	@Test
	public void creacionTrianguloTest()
	  throws Exception {
	     
		mvc.perform(post("/")
	      .contentType(MediaType.APPLICATION_JSON).content("{\"figuraType\": \"triangulo\",\n" + 
	      		"\"base\":5.0,\n" + 
	      		"\"altura\": 10.0\n" + 
	      		"}"))
	      .andExpect(status().isCreated());
		
	}
	
	@Test
	public void creacionCuadradoTest()
	  throws Exception {
	     
		mvc.perform(post("/")
	      .contentType(MediaType.APPLICATION_JSON).content("{\"figuraType\": \"cuadrado\",\n" + 
	      		"\"base\":5.0,\n" + 
	      		"\"altura\": 5.0\n" + 
	      		"}"))
	      .andExpect(status().isCreated());
		
	}
	
	@Test
	public void creacionCirculoTest()
	  throws Exception {
	     
		mvc.perform(post("/")
	      .contentType(MediaType.APPLICATION_JSON).content("{\"figuraType\": \"circulo\",\n" + 
	      		"\"diametro\":4.0\n" + 
	      		"}"))
	      .andExpect(status().isCreated());
		
	}
	
	@Test
	public void creacionFiguraNoIdentificadaTest()
	  throws Exception {
	     
		mvc.perform(post("/")
	      .contentType(MediaType.APPLICATION_JSON).content("{\"figuraType\": \"abcd\",\n" + 
	      		"\"diametro\":4.0\n" + 
	      		"}"))
	      .andExpect(status().is4xxClientError());
		
	}
	
	@Test
	public void creacionFiguraNulaTest()
	  throws Exception {
	     
		mvc.perform(post("/")
	      .contentType(MediaType.APPLICATION_JSON).content("{\"figuraType\": null,\n" + 
	      		"\"diametro\":4.0\n" + 
	      		"}"))
	      .andExpect(status().is4xxClientError());
		
	}
	
	@Test
	public void obtenerFiguraTest()
	  throws Exception {
		
		mvc.perform(get("/1")
	      .contentType(MediaType.APPLICATION_JSON).content("{}"))
	      .andExpect(status().isOk());
		
	}
	
	@Test
	public void obtenerTodasLasFigurasTest()
	  throws Exception {
		mvc.perform(get("/")
	      .contentType(MediaType.APPLICATION_JSON).content("{}"))
	      .andExpect(status().isOk());
		
	}
}
