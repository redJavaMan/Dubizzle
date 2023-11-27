package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    protected By tablet = By.xpath("//h2[text()='Mobile Phones & Tablets']");


    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }

    public TabletPage clickTablet(){
        driver.findElement(tablet).click();
        return new TabletPage(driver);
    }

}
