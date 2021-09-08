package Aula.de.java.AulaDeJava.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Aula.de.java.AulaDeJava.model.entities.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {
	
	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(20, "Lucas", "123.456.789-00");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Isabelle", "987.654.321-00");
	}
	@GetMapping
	public Cliente obterClientePorId2(
			@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Cliente(id, "Milena", "111.222.333-00");
	}
}
