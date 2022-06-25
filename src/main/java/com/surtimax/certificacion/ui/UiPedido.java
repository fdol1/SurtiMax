package com.surtimax.certificacion.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UiPedido {

    public static final Target BTN_FINALIZAR =
            Target.the("Boton para finalizar la orden de pedido")
                    .located(By.id("com.celuweb.Aliados:id/btnFinalizar"));

    public static final Target BTN_MAS =
            Target.the("Boton para aumentar la cantidad del producto")
                    .located(By.id("com.celuweb.Aliados:id/txtMas"));

    public static final Target BTN_ACEPTAR_PEDIDO =
            Target.the("Boton para aumentar la cantidad del producto")
                    .located(By.id("com.celuweb.Aliados:id/btnAceptarEnviarInfo"));

    public static final Target LBL_NOMBRE_USUARIO =
            Target.the("Campo con el nombre del usuario que hace el pedido")
                    .located(By.id("com.celuweb.Aliados:id/txtRazonSocial"));
}