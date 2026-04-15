package org.example.projetospringdata.Repositorio;

import org.example.projetospringdata.Dominio.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepositorio extends JpaRepository<Curso, Long>{
}
