package com.surtimax.certificacion.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UiBuscarClinte {

    public static final Target LBL_LISTA_CLIENTE =
            Target.the("Lista de clientes para pedidos")
                    .located(By.xpath("//*[@class='android.widget.ListView' and @package='com.celuweb.Aliados' and @resource-id = 'com.celuweb.Aliados:id/listaClienteRutero']"));

}
