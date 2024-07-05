package com.books.venilson.api.de.livros.models;

public record LivroDTO(
        Long id,
        String titulo,
        String autor,
        String genero,
        int copiasDisponiveis
) {
}
