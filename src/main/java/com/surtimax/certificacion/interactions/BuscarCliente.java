package com.surtimax.certificacion.interactions;

import com.surtimax.certificacion.interactions.choucair.Tap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.surtimax.certificacion.ui.UIMenuPrincipal.IMG_BUSCAR_CLIENTE;
import static com.surtimax.certificacion.ui.UIMenuPrincipal.LBL_MENSAJE;

public class BuscarCliente implements Interaction {


    public BuscarCliente(){}

    public static BuscarCliente paraRealizarPedido(){
        return Tasks.instrumented(BuscarCliente.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(LBL_MENSAJE, WebElementStateMatchers.isEnabled()).forNoMoreThan(7).seconds(),
                Tap.on(356,1356),
                Tap.on(IMG_BUSCAR_CLIENTE),
                Tap.on(65,894)
        );
    }
}
