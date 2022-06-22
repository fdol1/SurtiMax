package com.surtimax.certificacion.tasks;

import com.surtimax.certificacion.interactions.AceptarPermisos;
import com.surtimax.certificacion.interactions.IngresarCredenciales;
import com.surtimax.certificacion.models.InicioSesionModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class IniciarSesion implements Task {

    private InicioSesionModel inicioSesionModelData;

    public IniciarSesion(InicioSesionModel inicioSesionModelData){
        this.inicioSesionModelData = inicioSesionModelData;
    }

    public static IniciarSesion conLasCredencialesDeUsuario(InicioSesionModel inicioSesionModelData){
        return Tasks.instrumented(IniciarSesion.class, inicioSesionModelData);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                AceptarPermisos.enLaApp(),
                IngresarCredenciales.enLaAppSurtiMax(inicioSesionModelData)
        );
    }
}