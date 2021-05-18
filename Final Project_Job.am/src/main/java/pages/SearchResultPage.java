package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultPage {
    private static WebDriver driver;
    private By searchField = By.name("q");
    private By searchButton = By.xpath("/html/body/div[2]/form/div[1]/div/div[2]/div[1]/div/div/button");
    private By errorMsg = By.xpath("/html/body/div[2]/form/div[2]/div[2]/ulclass=\"list-unstyled\"");
    private By location = By.className("text-right d-table-row wordBreak fontSize13");

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setSearchField(String keyword){

        driver.findElement(searchField).sendKeys(keyword);
    }
    public void clickSearch(){
        driver.findElement(searchButton).click();
    }
    public static void findElements() {
        List<WebElement> results = driver.findElements(By.className("text-dark font-weight-bold wordBreak jttl SpanSize"));
        for (WebElement result : results) {
            System.out.println("Paragraph text:" + result.getText());
        }
    }
    public void Errormessage(){
        driver.findElement(errorMsg).getText();
    }

    //serachfild searchbutton

    //element list

    //message fail test

    //
}
