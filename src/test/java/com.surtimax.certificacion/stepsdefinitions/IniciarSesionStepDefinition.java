package com.surtimax.certificacion.stepsdefinitions;

import com.surtimax.certificacion.models.InicioSesionModel;
import com.surtimax.certificacion.questions.VerificarMensaje;
import com.surtimax.certificacion.tasks.AbreLaApp;
import com.surtimax.certificacion.tasks.IniciarSesion;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IniciarSesionStepDefinition {

    @Given("^(.*) abre la app de SurtiMax$")
    public void juanAbreLaAppDeSurtiMax(String usuario) {
        theActorCalled(usuario).wasAbleTo(AbreLaApp.deSurtiMax());
    }


    @Given("^Iniciar sesion con sus datos$")
    public void iniciarSesionConSusDatos(List<InicioSesionModel> inicioSesionModelList) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.conLasCredencialesDeUsuario(inicioSesionModelList.get(0)));
    }

    @Then("^Verifica el mensaje en el menu principal: (.*)$")
    public void verificaElMensajeEnElMenuPrincipalMensaje(String mensaje) {
        theActorInTheSpotlight().should(seeThat(VerificarMensaje.deCompraExitosa(mensaje)));
    }
}