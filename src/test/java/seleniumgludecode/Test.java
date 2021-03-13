package seleniumgludecode;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collections;
import java.util.List;


public class Test extends TestBase {

    private int inicio;
    private int cantidad;
    private int resto;



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


    @Given("^Hay (\\d+) Cervezas$")
    public void hay_Cervezas(int inicio) throws Throwable {
        this.inicio = inicio;

    }

    @When("^Tomo (\\d+) Cervezas$")
    public void tomo_Cervezas(int cantidad) throws Throwable {
        this.resto = this.inicio - cantidad;

    }

    @Then("^Deberian quedar (\\d+) cervezas$")
    public void deberian_quedar_cervezas(int resto) throws Throwable {

        Assert.assertEquals(resto, this.resto);

    }

    @Given("^Los siguientes usuarios existentes:$")
    public void los_siguientes_usuarios_existentes(DataTable table) throws Throwable {

        List<List<String>> rows = Collections.singletonList(table.asList(String.class));
        List<List<String>> rowswithoutHeading = rows.subList(1,rows.size());

        for (List<String> row: rowswithoutHeading){
            System.out.println("nombre "+ row.get(0) +" email: "+ row.get(1) + " twitter: " + row.get(2));
        }

    }




}
