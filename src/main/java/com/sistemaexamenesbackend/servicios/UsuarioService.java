package com.sistemaexamenesbackend.servicios;

import com.sistemaexamenesbackend.entidades.Usuario;
import com.sistemaexamenesbackend.entidades.UsuarioRol;

import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);
}
