package com.sistemaexamenesbackend.repositorio;

import com.sistemaexamenesbackend.entidades.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol,Long> {
}
