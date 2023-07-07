package com.olimpica.pageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.olimpica.com/")
public class PaginaPrincipalPages extends PageObject {
    By btnMiCuenta = By.xpath("//span[contains(text(),'Mi Cuenta')]");
    By btnEntrarCorreo = By.xpath("Iniciar sesión");
    By btnRegistrarse = By.xpath("//a[@class='vtex-login-2-x-dontHaveAccount link dim c-link t-small']");

    By txtCorreo = By.xpath("//input[@type='email']");
    By btnEnviar = By.xpath("//span[@class='t-small']");
    By txtContrasena = By.xpath("//input[@type='password']");
    By txtConfirmarContrasena = By.xpath("//input[@class='vtex-styleguide-9-x-input ma0 border-box vtex-styleguide-9-x-hideDecorators vtex-styleguide-9-x-noAppearance br2   w-100 bn outline-0 bg-base c-on-base b--muted-4 hover-b--muted-3 t-body ph5 ']");
    By btnCrear = By.xpath("//span[contains(text(),'Crear')]");
    By ventanaEmergente = By.xpath("//div[@class='styles_overlay__CLSq- vtex-modal__overlay undefined']/parent::div");
    By txtCorreoInicioSesion = By.xpath("//input[@class='vtex-styleguide-9-x-input ma0 border-box vtex-styleguide-9-x-hideDecorators vtex-styleguide-9-x-noAppearance br2   w-100 bn outline-0 bg-base c-on-base b--muted-4 hover-b--muted-3 t-body ph5 ']");
    By txtPasswordInicioSesion = By.xpath("//input[@type='password']");
    By btnEntrar= By.xpath("//span[contains(text(),'Entrar')]");
    public By getBtnMiCuenta() {
        return btnMiCuenta;

    }

    public By getBtnEntrar() {
        return btnEntrar;
    }

    public By getBtnRegistrarse() {
        return btnRegistrarse;
    }

    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getBtnEnviar() {
        return btnEnviar;
    }

    public By getTxtContrasena() {
        return txtContrasena;
    }

    public By getTxtConfirmarContrasena() {
        return txtConfirmarContrasena;
    }

    public By getBtnCrear() {
        return btnCrear;
    }

    public By getBtnEntrarCorreo() {
        return btnEntrarCorreo;
    }

    public By getVentanaEmergente() {
        return ventanaEmergente;
    }

    public By getTxtCorreoInicioSesion() {
        return txtCorreoInicioSesion;
    }

    public By getTxtPasswordInicioSesion() {
        return txtPasswordInicioSesion;
    }


}
