package com.surtimax.certificacion.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UiPermisos {

    public static final Target BTN_PERMITIR_GALERIA =
            Target.the("Campo para dar permiso de galaria")
                    .located(By.id("com.android.permissioncontroller:id/permission_allow_button"));

    public static final Target BTN_DENEGAR_GALERIA =
            Target.the("Campo para denegar permiso de galaria")
                    .located(By.id("com.android.permissioncontroller:id/permission_deny_button"));

    public static final Target BTN_PERMITIR_LLAMADAS =
            Target.the("Campo para dar permiso a las llamadas")
                    .located(By.id("com.android.permissioncontroller:id/permission_allow_button"));

    public static final Target BTN_DENEGAR_LLAMADAS =
            Target.the("Campo para denegar permiso a las llamadas")
                    .located(By.id("com.android.permissioncontroller:id/permission_deny_button"));

    public static final Target BTN_UBICACION_SIEMPRE =
            Target.the("Campo para permitir la ubicacion siempre")
                    .located(By.id("com.android.permissioncontroller:id/permission_allow_always_button"));

    public static final Target BTN_UBICACION_PARCIAL =
            Target.the("Campo para permitir la ubicacion cuando se usa la app")
                    .located(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));

    public static final Target BTN_UBICACION_NUNCA =
            Target.the("Campo para denegar la ubicacion")
                    .located(By.id("com.android.permissioncontroller:id/permission_deny_button"));

    public static final Target BTN_PERMITIR_FOTOS_VIDEOS =
            Target.the("Campo para permitir que la app tome fotos y videos")
                    .located(By.id("com.android.permissioncontroller:id/permission_allow_button"));

    public static final Target BTN_NEGAR_FOTOS_VIDEOS =
            Target.the("Campo para negar que la app tome fotos y videos")
                    .located(By.id("com.android.permissioncontroller:id/permission_deny_button"));
}