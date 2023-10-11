package com.sistemaexamenesbackend.excepciones;

public class UsuarioNotFoundException extends Exception {

    public UsuarioNotFoundException(){

        super("El usuario con ese usename no excite en la base de datos, vuelva ");

    }

    public UsuarioNotFoundException(String mensaje){

        super(mensaje);

    }
}
