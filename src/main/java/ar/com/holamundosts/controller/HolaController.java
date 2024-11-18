package ar.com.holamundosts.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

	@GetMapping("/")
	public String index() {
		return "Hello Spring Boot!";
	}
	
	
	@Value("${ambiente}")
	private String ambiente;

	
	
	@GetMapping("/saludar")
	public String saludar() {
		return "Hola mundo Spring Boot";
	}
	
	@GetMapping("/saludo1/{variable}")
	public String saludo1(@PathVariable(value = "variable") String variable) {
		return "Hola "+variable;
	}
	
	@GetMapping("/saludo2")
	public String saludo2(@PathParam(value = "nombre") String nombre) {
		return "Hola "+nombre+" saludando con @PathParam";
	}
	
	@GetMapping("/verambiente")
	public String verAmbiente() {
		return "Estoy en el ambiente:" +ambiente;
	}
	
	

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	
	
	

}
