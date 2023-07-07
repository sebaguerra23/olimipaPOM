package com.olimpica.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaUsuarioPages extends PageObject {
    By lblUsuario = By.xpath("//span[@class='vtex-login-2-x-profile truncate t-action--small order-1 pl4 gray dn db-l']");


    public By getLblUsuario() {
        return lblUsuario;
    }
}
