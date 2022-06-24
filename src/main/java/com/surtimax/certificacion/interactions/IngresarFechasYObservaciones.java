package com.surtimax.certificacion.interactions;

import com.surtimax.certificacion.interactions.choucair.Tap;
import com.surtimax.certificacion.models.InfoPedidoModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.surtimax.certificacion.ui.UiPedido.BTN_FINALIZAR;
import static com.surtimax.certificacion.ui.UiResumen.*;

public class IngresarFechasYObservaciones implements Interaction {

    private final InfoPedidoModel infoPedidoModel;

    public IngresarFechasYObservaciones(InfoPedidoModel infoPedidoModel) {
        this.infoPedidoModel = infoPedidoModel;
    }

    public static IngresarFechasYObservaciones delPedido(InfoPedidoModel infoPedidoModel){
        return Tasks.instrumented(IngresarFechasYObservaciones.class, infoPedidoModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_SELECCIONAR_FECHA, WebElementStateMatchers.isEnabled()).forNoMoreThan(7).seconds(),
                Tap.on(BTN_SELECCIONAR_FECHA),
                Click.on(String.format(LBL_ITEM_CALENDARIO,infoPedidoModel.getFecha())),
                Tap.on(BTN_ACEPTAR_FECHA),
                Enter.theValue(infoPedidoModel.getObservacion()).into(TXT_OBSERVACION),
                Tap.on(357,1070),
                Tap.on(105,1162),
                Tap.on(BTN_ACEPTAR_FIRMA),
                Tap.on(BTN_FINALIZAR)
        );
    }
}