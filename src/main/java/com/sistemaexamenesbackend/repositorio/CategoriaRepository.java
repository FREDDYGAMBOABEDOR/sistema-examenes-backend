package com.sistemaexamenesbackend.repositorio;

import com.sistemaexamenesbackend.entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
}
