package com.surtimax.certificacion.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UiAlertaDeDialogo {

    public static final Target BTN_ACEPTAR =
            Target.the("Acepta las condiciones que se presentan en la alerta de dialogo")
                    .located(By.id( "android:id/button1"));

    public static final Target BTN_CANCELAR =
            Target.the("Cancela las condiciones que se presentan en la alerta de dialogo")
                    .located(By.id( "android:id/button2"));

}