package com.surtimax.certificacion.tasks;

import com.surtimax.certificacion.interactions.BuscarCliente;
import com.surtimax.certificacion.interactions.GenerarPedido;
import com.surtimax.certificacion.interactions.ValidarDialogo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static com.surtimax.certificacion.ui.UiAlertaDeDialogo.BTN_ACEPTAR;

public class RealizarPedido implements Task {

    public RealizarPedido(){}

    public static RealizarPedido desdeLaAppSurtiMax(){
        return Tasks.instrumented(RealizarPedido.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                BuscarCliente.paraRealizarPedido(),
                ValidarDialogo.presentadoEnPantalla(BTN_ACEPTAR),
                GenerarPedido.paraElUsuario()
        );

    }
}
