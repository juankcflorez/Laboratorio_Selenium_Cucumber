package seleniumgludecode;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_buscador extends TestBase {



    @Given("^El usuario se debe encontrar en la pagina Home principal de imalittletester$")
    public void el_usuario_se_debe_encontrar_en_la_pagina_Home_principal_de_imalittletester() throws Throwable {

        Assert.assertTrue(homePage.homePageIsDisplayed());

    }

    @When("^Ingresar la palabra Selenium$")
    public void ingresar_la_palabra_Selenium()  {

        WebElement titleComicsLocator = driver.findElement(By.className("search-field"));
        titleComicsLocator.sendKeys("Selenium");


    }

    @And("^Lanzar las busqueda presionando la tecla Enter$")
    public void lanzar_las_busqueda_presionando_la_tecla_Enter() {

        WebElement titleComicsLocator2 = driver.findElement(By.className("search-field"));
        titleComicsLocator2.submit();

    }

    @Then("^Se deben visualizar los resultados de la busqueda$")
    public void se_deben_visualizar_los_resultados_de_la_busqueda()  {


        String url = driver.getCurrentUrl();

        //Assert.assertTrue("No se redirecciono correctamente a la pagina de Comics", pageTittle2Locator.isDisplayed());
        Assert.assertEquals("https://imalittletester.com/?s=Selenium", url);


    }



}
