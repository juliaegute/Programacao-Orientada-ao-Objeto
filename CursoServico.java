package org.example.projetospringdata.Servico;

import org.example.projetospringdata.Dominio.Curso;
import org.example.projetospringdata.Repositorio.CursoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServico {

    private final CursoRepositorio repositorio;

    public CursoServico(CursoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public Curso salvar(Curso curso) {
        return repositorio.save(curso);
    }

    public List<Curso> listar() {
        return repositorio.findAll();
    }

    public Curso buscar(Long id) {
        return repositorio.findById(id)
                .orElseThrow();
    }

    public void deletar(Long id) {
        repositorio.existsById(id);
    }

}
