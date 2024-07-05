package com.books.venilson.api.de.livros.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "livros")
@Setter
@Getter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
public class Livro implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;
    private String genero;
    private int copiasDisponiveis;

    public Livro(LivroDTO livroDTO){
        this.titulo = livroDTO.titulo();
        this.autor = livroDTO.autor();
        this.genero = livroDTO.genero();
        this.copiasDisponiveis = livroDTO.copiasDisponiveis();
    }
}
