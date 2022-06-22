package com.surtimax.certificacion.tasks;

import com.surtimax.certificacion.interactions.choucair.TakeScreenshot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.logging.Logger;

public class AbreLaApp implements Task {

    public AbreLaApp(){}

    public static AbreLaApp deSurtiMax(){
        return Tasks.instrumented(AbreLaApp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Logger.getAnonymousLogger().info("Se abre app surtiMax");
        actor.attemptsTo(TakeScreenshot.asEvidence());
    }
}