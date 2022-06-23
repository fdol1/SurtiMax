package com.surtimax.certificacion.stepsdefinitions;

import com.surtimax.certificacion.tasks.IniciarSesion;
import com.surtimax.certificacion.tasks.RealizarPedido;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RealizarPedidoStepDefinition {

    @When("^realiza un pedido en la app$")
    public void realizaUnPedidoEnLaApp() {
        theActorInTheSpotlight().attemptsTo(RealizarPedido.desdeLaAppSurtiMax());
    }
}
