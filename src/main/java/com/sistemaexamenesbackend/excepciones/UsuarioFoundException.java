package com.sistemaexamenesbackend.excepciones;

public class UsuarioFoundException extends Exception{
    public UsuarioFoundException(){

        super("El usuario con ese usename ya exciste en la base de datos, vuelva ");

    }

    public UsuarioFoundException(String mensaje){

        super(mensaje);

    }

}
