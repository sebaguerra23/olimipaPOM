package com.olimpica.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EsperaExplicita {

    public void esperaExplicitaClick(WebDriver driver, By localizador){
        WebDriverWait myWaitVar = new WebDriverWait(driver, 3000);
        myWaitVar.until(ExpectedConditions.elementToBeClickable(localizador));
    }
    public void esperaExplicitaTexto(WebDriver driver, By localizador){
        WebDriverWait myWaitVar = new WebDriverWait(driver, 3000);
        myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(localizador));
    }

    public void esperarCargaPagina(WebDriver driver){
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }
}
