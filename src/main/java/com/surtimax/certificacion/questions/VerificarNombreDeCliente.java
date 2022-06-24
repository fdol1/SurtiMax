package com.surtimax.certificacion.questions;

import com.surtimax.certificacion.models.InfoPersonalClienteModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.surtimax.certificacion.ui.UiPedido.LBL_NOMBRE_USUARIO;
public class VerificarNombreDeCliente implements Question<Boolean> {

    private final InfoPersonalClienteModel infoPersonalClienteModel;

    public VerificarNombreDeCliente(InfoPersonalClienteModel infoPersonalClienteModel) {
        this.infoPersonalClienteModel = infoPersonalClienteModel;
    }

    public  static VerificarNombreDeCliente alTerminarPedido(InfoPersonalClienteModel infoPersonalClienteModel){
        return new VerificarNombreDeCliente(infoPersonalClienteModel);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                WaitUntil.the(LBL_NOMBRE_USUARIO, WebElementStateMatchers.isEnabled()).forNoMoreThan(8).seconds()
        );
        return infoPersonalClienteModel.getNombreCliente().equals(Text.of(LBL_NOMBRE_USUARIO).viewedBy(actor).asString());
    }
}
