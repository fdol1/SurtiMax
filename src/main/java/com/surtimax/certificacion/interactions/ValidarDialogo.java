package com.surtimax.certificacion.interactions;

import com.surtimax.certificacion.interactions.choucair.Tap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarDialogo implements Interaction {

    private Target elementoAValidar;

    public ValidarDialogo(Target elementoAValidar) {
        this.elementoAValidar = elementoAValidar;
    }

    public static ValidarDialogo presentadoEnPantalla(Target elementoAValidar){
        return Tasks.instrumented(ValidarDialogo.class, elementoAValidar);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if(elementoAValidar.resolveFor(actor).isVisible()){
            actor.attemptsTo(
                    Tap.on(elementoAValidar)
            );
        }
    }
}