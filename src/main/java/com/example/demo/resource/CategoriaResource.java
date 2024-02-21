package com.example.demo.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	private Categoria c1,c2;
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {
		List<Categoria> list = new ArrayList<>();
		c1 = new Categoria(1,"Informatica");
		c2 = new Categoria(2,"Escritotio");
		list.add(c1);
		list.add(c2);
		return list;
	}

}
