package com.books.venilson.api.de.livros.controllers;

import com.books.venilson.api.de.livros.models.Livro;
import com.books.venilson.api.de.livros.models.LivroDTO;
import com.books.venilson.api.de.livros.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    private LivroService service;

    @PostMapping
    public ResponseEntity<Livro> criarLivro(@RequestBody LivroDTO livroDTO){
        Livro novoLivro = service.criarLivro(livroDTO);
        return new ResponseEntity<>(novoLivro, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Livro>> listarLivros(){
        var livros = service.listarLivros();
        return new ResponseEntity<>(livros, HttpStatus.OK);
    }
}
