package com.surtimax.certificacion.interactions;

import com.surtimax.certificacion.exceptions.IngresarCredencialesException;
import com.surtimax.certificacion.exceptions.IniciarSesionException;
import com.surtimax.certificacion.interactions.choucair.TakeScreenshot;
import com.surtimax.certificacion.interactions.choucair.Tap;
import com.surtimax.certificacion.models.InicioSesionModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.logging.Logger;

import static com.surtimax.certificacion.ui.UIInicioDeSesion.*;

public class IngresarCredenciales implements Interaction {

    private final InicioSesionModel inicioSesionModelData;

    public IngresarCredenciales(InicioSesionModel inicioSesionModelData){
        this.inicioSesionModelData = inicioSesionModelData;
    }

    public static IngresarCredenciales enLaAppSurtiMax(InicioSesionModel inicioSesionModelData){
        return Tasks.instrumented(IngresarCredenciales.class, inicioSesionModelData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    WaitUntil.the(TXT_USUARIO, WebElementStateMatchers.isEnabled()).forNoMoreThan(7).seconds(),
                    Enter.theValue(inicioSesionModelData.getUsuario()).into(TXT_USUARIO),
                    Enter.theValue(inicioSesionModelData.getClave()).into(TXT_CLAVE),
                    Tap.on(BTN_INICIAR_SESION)
            );
            actor.attemptsTo(TakeScreenshot.asEvidence());
        }catch (RuntimeException eX){
            throw new IngresarCredencialesException(IngresarCredencialesException.Error(),eX);
        }
    }
}