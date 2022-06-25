package com.surtimax.certificacion.tasks;

import com.surtimax.certificacion.exceptions.IniciarSesionException;
import com.surtimax.certificacion.interactions.AceptarPermisos;
import com.surtimax.certificacion.interactions.IngresarCredenciales;
import com.surtimax.certificacion.interactions.choucair.TakeScreenshot;
import com.surtimax.certificacion.models.InicioSesionModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class IniciarSesion implements Task {

    private final InicioSesionModel inicioSesionModelData;

    public IniciarSesion(InicioSesionModel inicioSesionModelData){
        this.inicioSesionModelData = inicioSesionModelData;
    }

    public static IniciarSesion conLasCredencialesDeUsuario(InicioSesionModel inicioSesionModelData){
        return Tasks.instrumented(IniciarSesion.class, inicioSesionModelData);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    AceptarPermisos.enLaApp(),
                    IngresarCredenciales.enLaAppSurtiMax(inicioSesionModelData)
            );
            actor.attemptsTo(TakeScreenshot.asEvidence());
        }catch (RuntimeException eX){
            throw new IniciarSesionException(IniciarSesionException.Error(),eX);
        }
    }
}