package com.olimpica.steps;

import com.olimpica.pageObjects.PaginaUsuarioPages;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class PaginaUsuarioStep {
    PaginaUsuarioPages paginaUsuarioPages = new PaginaUsuarioPages();
    @Step

    public void validarUsuario(){
        // esto es para verificar que el elemento este disponible
        Assert.assertThat(paginaUsuarioPages.getDriver().findElement(paginaUsuarioPages.getLblUsuario()
        ).isDisplayed(), Matchers.is(true));
    }
}
