package com.olimpica.steps;

import com.olimpica.models.EsperaExplicita;
import com.olimpica.pageObjects.PaginaPrincipalPages;

import net.thucydides.core.annotations.Step;

import org.openqa.selenium.JavascriptExecutor;


public class PaginaPrincipalStep {

    PaginaPrincipalPages paginaPrincipalPages = new PaginaPrincipalPages();
    EsperaExplicita esperaExplicita = new EsperaExplicita();


    @Step
    public void abrirNavegador( ) {
        paginaPrincipalPages.open();

    }

    @Step
    public void clickMiCuenta( ) {
        paginaPrincipalPages.getDriver().findElement( paginaPrincipalPages.getBtnMiCuenta() ).click();
    }

    @Step
    public void clickEntrarCorreo( ) {
        esperaExplicita.esperaExplicitaClick( paginaPrincipalPages.getDriver(), paginaPrincipalPages.getBtnEntrarCorreo() );
        paginaPrincipalPages.getDriver().findElement( paginaPrincipalPages.getBtnEntrarCorreo() ).click();
    }

    @Step
    public void clickRegistrarse( ) {
        esperaExplicita.esperaExplicitaClick( paginaPrincipalPages.getDriver(), paginaPrincipalPages.getBtnRegistrarse() );
        paginaPrincipalPages.getDriver().findElement( paginaPrincipalPages.getBtnRegistrarse() ).click();

    }

    @Step
    public void escribirEmail( ) {
        esperaExplicita.esperaExplicitaClick( paginaPrincipalPages.getDriver(), paginaPrincipalPages.getTxtCorreo() );
        paginaPrincipalPages.getDriver().findElement( paginaPrincipalPages.getTxtCorreo() ).sendKeys( "alt.j9-foe4dt9i@yopmail.com" );
    }

    @Step
    public void clickEnviar( ) {

        paginaPrincipalPages.getDriver().findElement( paginaPrincipalPages.getBtnEnviar() ).click();

    }

    @Step
    public void escribirContrasena( ) {
        esperaExplicita.esperaExplicitaClick( paginaPrincipalPages.getDriver(), paginaPrincipalPages.getTxtContrasena() );
        paginaPrincipalPages.getDriver().findElement( paginaPrincipalPages.getTxtContrasena() ).sendKeys( "Qwertyuiop2023" );
    }

    @Step
    public void confirmarContrasena( ) {

        paginaPrincipalPages.getDriver().findElement( paginaPrincipalPages.getTxtConfirmarContrasena() ).sendKeys( "Qwertyuiop2023" );
    }

    @Step
    public void clickCrear( ) {

        paginaPrincipalPages.getDriver().findElement( paginaPrincipalPages.getBtnCrear() ).click();
    }

    @Step
    public void ocultarElemento( ) {
        // se utiliza la funcion javaExcutor para poder implementar codigo javaScript y asi poder ocultar el elemento

        ( (JavascriptExecutor) paginaPrincipalPages.getDriver() ).executeScript( "arguments[0].style.visibility='hidden';", paginaPrincipalPages.getDriver().findElement( paginaPrincipalPages.getVentanaEmergente() ) );

    }

    @Step
    public void escribirEmailInicioSesion( ) {
        esperaExplicita.esperaExplicitaClick( paginaPrincipalPages.getDriver(), paginaPrincipalPages.getTxtCorreoInicioSesion() );
        paginaPrincipalPages.getDriver().findElement( paginaPrincipalPages.getTxtCorreoInicioSesion() ).sendKeys( "alt.j9-foe4dt9i@yopmail.com" );
    }

    @Step
    public void escribirPasswordInicioSesion( ) {

        paginaPrincipalPages.getDriver().findElement( paginaPrincipalPages.getTxtPasswordInicioSesion() ).sendKeys( "Qwertyuiop2023" );
    }

    @Step
    public void clickEntrar( ) {
        paginaPrincipalPages.getDriver().findElement( paginaPrincipalPages.getBtnEntrar() ).click();
    }

    @Step
    public void registroCompleto( ) {
        ocultarElemento();
        clickMiCuenta();
        clickEntrar();
        clickRegistrarse();
        escribirEmail();
        clickEnviar();
        try {
            Thread.sleep( 20000 );
        } catch (InterruptedException e) {
            throw new RuntimeException( e );
        }
        escribirContrasena();
        confirmarContrasena();
        clickCrear();

    }

    @Step
    public void inicioSesion( ) {
        ocultarElemento();
        clickMiCuenta();
        clickEntrarCorreo();
        escribirEmailInicioSesion();
        escribirPasswordInicioSesion();
        clickEntrar();

    }
}
