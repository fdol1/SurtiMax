package com.surtimax.certificacion.exceptions;

public class AceptarPermisosException extends RuntimeException{

    private static final long serialVersionUID = 4L;

    private static final String ERROR = "Error al realizar pedido";

    public AceptarPermisosException (String mensaje, Throwable motivo){
        super(mensaje,motivo);
    }

    public static String Error() {
        return ERROR;
    }
}
