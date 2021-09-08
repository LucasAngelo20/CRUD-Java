package Aula.de.java.AulaDeJava.model.repositories;

import org.springframework.data.repository.CrudRepository;

import Aula.de.java.AulaDeJava.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

	
}
