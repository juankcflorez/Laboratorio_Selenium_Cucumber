package seleniumgludecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test extends TestBase {


    @Given("^El usuario se debe encontrar en el Home principal de imalittletester$")
    public void el_usuario_se_debe_encontrar_en_el_Home_principal_de_imalittletester() throws Throwable {

        Assert.assertTrue(homePage.homePageIsDisplayed());


    }

    @When("^Realice clic sobre el botón \"([^\"]*)\"$")
    public void realice_clic_sobre_el_botón(String arg1) throws Throwable {

        homePage.clickOnTitleComics();
    }

    @Then("^Se debe redirigir a la pantalla Comics$")
    public void se_debe_redirigir_a_la_pantalla_Comics() throws Throwable {

        Assert.assertTrue("No se redirecciono correctamente a la pagina Comics", comicsPage.isTitleComicsDisplayed());



    }




}
