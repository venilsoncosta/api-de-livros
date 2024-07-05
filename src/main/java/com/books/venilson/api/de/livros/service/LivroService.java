package com.books.venilson.api.de.livros.service;

import com.books.venilson.api.de.livros.models.Livro;
import com.books.venilson.api.de.livros.models.LivroDTO;
import com.books.venilson.api.de.livros.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public void salvarLivro(Livro livro) {
        this.livroRepository.save(livro);
    }

    public Livro criarLivro(LivroDTO livro){
        Livro novoLivro = new Livro(livro);
        this.salvarLivro(novoLivro);
        return novoLivro;
    }

    public List<Livro> listarLivros(){
        return this.livroRepository.findAll();
    }
}
