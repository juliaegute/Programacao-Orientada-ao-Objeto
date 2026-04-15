package org.example.projetospringdata.Dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, unique = true, length = 120)
    private long total_horas;

    public Curso() {
        // Construtor padrao exigido pela JPA.
    }

    public Curso(String nome, long horas) {
        this.nome = nome;
        this.total_horas = horas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTotal_horas() {
        return total_horas;
    }

    public void setTotal_horas(long total_horas) {
        this.total_horas = total_horas;
    }
}