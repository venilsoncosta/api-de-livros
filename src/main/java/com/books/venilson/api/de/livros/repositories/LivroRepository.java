package com.books.venilson.api.de.livros.repositories;

import com.books.venilson.api.de.livros.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
