package com.surtimax.certificacion.stepsdefinitions;

import com.surtimax.certificacion.models.InfoPedidoModel;
import com.surtimax.certificacion.models.InfoPersonalClienteModel;
import com.surtimax.certificacion.questions.VerificarNombreDeCliente;
import com.surtimax.certificacion.tasks.RealizarPedido;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RealizarPedidoStepDefinition {

    @When("^realiza un pedido en la app con la info del pedido$")
    public void realizaUnPedidoEnLaApp(List<InfoPedidoModel> infoPedidoModelList) {
        theActorInTheSpotlight().attemptsTo(RealizarPedido.desdeLaAppSurtiMax(infoPedidoModelList.get(0)));
    }

    @Then("^al finalizar el pedido, ve su nombre en la pantalla de cliente$")
    public void alFinalizarElPedidoVeSuNombreEnLaPantallaDeCliente(List<InfoPersonalClienteModel> infoPersonalClienteModelList) {
        theActorInTheSpotlight().should(seeThat(VerificarNombreDeCliente.alTerminarPedido(infoPersonalClienteModelList.get(0))));
    }
}