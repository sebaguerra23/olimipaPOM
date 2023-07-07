package com.olimpica.stepDefinitions;

import com.olimpica.steps.PaginaPrincipalStep;
import com.olimpica.steps.PaginaUsuarioStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dados;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class InicioSesionSAOStepDefinition {
    @Steps
    PaginaPrincipalStep paginaPrincipalStep;
    @Steps
    PaginaUsuarioStep paginaUsuarioStep;


    @Cuando("^el usuario ingrese las credenciales$")
    public void elUsuarioIngreseLasCredenciales() {
        paginaPrincipalStep.inicioSesion();
    }
    @Entonces("^se valida que el inicio de sesion es exitoso$")
    public void seValidaQueElInicioDeSesionEsExitoso() {
       paginaUsuarioStep.validarUsuario();
    }
}
