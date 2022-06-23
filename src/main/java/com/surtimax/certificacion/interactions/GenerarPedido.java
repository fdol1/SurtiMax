package com.surtimax.certificacion.interactions;

import com.surtimax.certificacion.interactions.choucair.Tap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.surtimax.certificacion.ui.UiCliente.BTN_ACEPTAR_PROBLEMA;
import static com.surtimax.certificacion.ui.UiCliente.BTN_PEDIDO;

public class GenerarPedido implements Interaction {

    public GenerarPedido() {
    }

    public static GenerarPedido paraElUsuario(){
        return Tasks.instrumented(GenerarPedido.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_PEDIDO, WebElementStateMatchers.isEnabled()).forNoMoreThan(7).seconds(),
                Tap.on(BTN_PEDIDO),
                ValidarDialogo.presentadoEnPantalla(BTN_ACEPTAR_PROBLEMA)
        );
    }
}
