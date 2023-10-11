package com.sistemaexamenesbackend.repositorio;

import com.sistemaexamenesbackend.entidades.Examen;
import com.sistemaexamenesbackend.entidades.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface PreguntaRepository extends JpaRepository<Pregunta, Long>{
// Devuelve un conjunto de preguntas
    Set<Pregunta> findByExamen(Examen examen);
}
