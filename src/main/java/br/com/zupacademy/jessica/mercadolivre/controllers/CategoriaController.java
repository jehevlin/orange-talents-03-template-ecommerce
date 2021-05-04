package br.com.zupacademy.jessica.mercadolivre.controllers;

import br.com.zupacademy.jessica.mercadolivre.models.Categoria;
import br.com.zupacademy.jessica.mercadolivre.repositories.CategoriaRepository;
import br.com.zupacademy.jessica.mercadolivre.requests.CadastrarCategoriaRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "categorias")
public class CategoriaController {

    private final CategoriaRepository repository;

    public CategoriaController(CategoriaRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<?> cadastrarCategoria(@Valid @RequestBody CadastrarCategoriaRequest request) {
        Categoria categoria = repository.save(request.toModel());
        return new ResponseEntity<>(categoria, HttpStatus.OK);
    }
}
