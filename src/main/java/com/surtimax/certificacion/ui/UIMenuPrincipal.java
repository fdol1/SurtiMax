package com.surtimax.certificacion.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UIMenuPrincipal {

    public static final Target LBL_MENSAJE =
            Target.the("Campo donde se muestra mensaje de compra exitosa")
                    .located(By.xpath("//*[@class='android.widget.TextView' and @package='com.celuweb.Aliados' and @text = 'Fuerza de Venta']"));

}
