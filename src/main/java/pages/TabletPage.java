package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TabletPage {
    private WebDriver driver;
    List<WebElement> price;
    protected By sort= By.xpath("//button[@data-testid=sort'-button']");
    protected By low2High=By.xpath("//p[text()='Price Lowest to Highest']");
    protected By chkLow2Hy=By.xpath("//div[@data-testid='listing-price']");
    public TabletPage(WebDriver driver) {
        this.driver=driver;
    }{

    }
    public void clickSort(){
        driver.findElement(sort).click();
        driver.findElement(low2High).click();
        List<WebElement> actualPrice=driver.findElements(chkLow2Hy);

    }
}
