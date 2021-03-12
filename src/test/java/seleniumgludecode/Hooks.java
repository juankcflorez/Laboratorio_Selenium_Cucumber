package seleniumgludecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;


import java.io.IOException;

public class Hooks {

private static WebDriver driver;

private static int numberofcase = 0;
private DriverManager driverManager;

@Before

    public void setUP()  {

        numberofcase ++;
        System.out.println("Se esta ejecutando el escenario nro"+ numberofcase);
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();


    }

@After
    public  void tearDown(){
    System.out.println("El escenario nro"+ numberofcase +"Se ejecutó correctamente");

    driverManager.quitDriver();

    }

    public static WebDriver getDriver(){

    return driver;
    }


}
