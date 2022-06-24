package com.surtimax.certificacion.interactions;

import com.surtimax.certificacion.interactions.choucair.Tap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.surtimax.certificacion.ui.UiPermisos.*;

public class AceptarPermisos implements Interaction {

    public AceptarPermisos(){}

    public static AceptarPermisos enLaApp(){
        return Tasks.instrumented(AceptarPermisos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_PERMITIR_GALERIA, WebElementStateMatchers.isEnabled()).forNoMoreThan(7).seconds(),
                Tap.on(BTN_PERMITIR_GALERIA),
                Tap.on(BTN_PERMITIR_LLAMADAS),
                Tap.on(BTN_UBICACION_SIEMPRE),
                Tap.on(BTN_PERMITIR_FOTOS_VIDEOS)
        );
    }
}