package com.surtimax.certificacion.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UiResumen {

    public static final Target BTN_SELECCIONAR_FECHA =
            Target.the("Boton para sacar el menu del calendario")
                    .located(By.id("com.celuweb.Aliados:id/txtFecha"));

    public static String LBL_ITEM_CALENDARIO = "//android.view.View[@content-desc='%s']";

    public static final Target BTN_ACEPTAR_FECHA =
            Target.the("Boton para aceptar la fecha seleccionada")
                    .located(By.id("com.celuweb.Aliados:id/done_button"));

    public static final Target TXT_OBSERVACION =
            Target.the("Campo para ingresar observacion del pedido")
                    .located(By.id("com.celuweb.Aliados:id/txtObservacion"));

    public static final Target TXT_FIRMA =
            Target.the("Campo para firmar")
                    .located(By.id("com.celuweb.Aliados:id/inkn"));

    public static final Target BTN_ACEPTAR_FIRMA =
            Target.the("Boton para aceptar la firma")
                    .located(By.id("com.celuweb.Aliados:id/llAceptarFirma"));

    public static final Target BTN_ACEPTAR_RESUMEN =
            Target.the("Boton para aceptar el resumen realizado")
                    .located(By.id("com.celuweb.Aliados:id/btnFinalizar"));
}