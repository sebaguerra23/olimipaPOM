package com.olimpica.stepDefinitions;

import com.olimpica.pageObjects.PaginaPrincipalPages;
import com.olimpica.pageObjects.PaginaUsuarioPages;
import com.olimpica.steps.PaginaPrincipalStep;
import com.olimpica.steps.PaginaUsuarioStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dados;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class RegistroSAOStepDefinition {
    @Steps
    PaginaPrincipalStep paginaPrincipalStep;
    @Steps
    PaginaUsuarioStep paginaUsuarioStep;

    @Dados("^que el usuario encuentre la pagina principal del sao$")
    public void queElUsuarioEncuentreLaPaginaPrincipalDelSao() {
        paginaPrincipalStep.abrirNavegador();
    }


    @Cuando("^el usuario se registre en la pagina del sao$")
    public void elUsuarioSeRegistreEnLaPaginaDelSao() {
      paginaPrincipalStep.registroCompleto();
       // paginaPrincipalStep.clickEntrar();
      //paginaPrincipalStep.clickRegistrarse();
      //paginaPrincipalStep.escribirEmail();


    }

    @Entonces("^se valida el registro exitoso$")
    public void seValidaElRegistroExitoso() {
      paginaUsuarioStep.validarUsuario();

    }
}
