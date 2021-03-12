package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComicsPage extends  BasePage{

    public ComicsPage(WebDriver driver){
        super (driver);
    }

    By pageTitleLocator = By.className("page-title");
    private String titlePage = "Category: comics";

    public boolean isTitleComicsDisplayed() throws Exception{

        return this.isDisplayed(pageTitleLocator) && this. getText(pageTitleLocator).equals(titlePage);
    }

}
