package com.surtimax.certificacion.ui;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UIInicioDeSesion {

    public static final Target TXT_USUARIO =
            Target.the("Campo para el usuario")
                    .located(By.id("com.celuweb.Aliados:id/txtUsuario"));
    public static final Target TXT_CLAVE =
            Target.the("Campo para la clave")
                    .located(By.id("com.celuweb.Aliados:id/txtClave"));
    public static final Target BTN_INICIAR_SESION =
            Target.the("Boton para iniciar sesion")
                    .located(By.id("com.celuweb.Aliados:id/btnIniciar"));
}