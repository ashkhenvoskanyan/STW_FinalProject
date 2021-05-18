package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CandidateSearchPage {

    private final WebDriver driver;
    private By searchField = By.name("q");
    private By searchButton = By.xpath("/html/body/div[2]/div/div/div[1]/div/form/div/div/button");
    //private By result = By.className("d-table-cell");



    public CandidateSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSearchField(String keyword){

        driver.findElement(searchField).sendKeys(keyword);
    }

    public void clickSearch(){
        driver.findElement(searchButton).click();
    }


}
