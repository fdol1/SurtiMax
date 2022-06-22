package com.surtimax.certificacion.exceptions;

public class IniciarSesionException extends RuntimeException{

    private static final long serialVersionUID = 4L;

    private static final String ERROR = "Error al ingresar iniciar sesion con las credenciales";

    public IniciarSesionException (String mensaje, Throwable motivo){
        super(mensaje,motivo);
    }

    public static String Error() {
        return ERROR;
    }
}
