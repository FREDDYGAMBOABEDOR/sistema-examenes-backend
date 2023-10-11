package com.sistemaexamenesbackend.servicios;

import com.sistemaexamenesbackend.entidades.Categoria;
import com.sistemaexamenesbackend.entidades.Examen;

import java.util.List;
import java.util.Set;

public interface ExamenService {

    Examen agregarExamen(Examen examen);

    Examen actualizarExamen(Examen examen);

    Set<Examen> obtenerExamenes();

    Examen obtenerExamen(Long examenId);

    void eliminarExamen(Long examenId);

   List<Examen> listarExamenesDeUnaCategoria(Categoria categoria);

   List<Examen> obtenerExamenesActivos();

   List<Examen> obtenerExamenesActivosDeUnaCategoria(Categoria categoria);
}
