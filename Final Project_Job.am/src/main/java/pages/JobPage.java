package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JobPage {


    private final WebDriver driver;
    private By searchField = By.name("q");
    private By searchButton = By.xpath("/html/body/div[2]/form/div[1]/div/div[2]/div[1]/div/div/button");
    //private By result = By.className("col-sm-12 featured-jobs-link");
    private By ITcheckbox = By.xpath("//*[@id=\"collapse-1\"]/div/ul/li[13]/label/input");
    private By Artcheckbox = By.xpath("//*[@id=\"collapse-1\"]/div/ul/li[5]/label/input");


    public JobPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setSearchField(String keyword){

        driver.findElement(searchField).sendKeys(keyword);
    }
    public SearchResultPage clickSearch(){
        driver.findElement(searchButton).click();
        return new SearchResultPage(driver);

    }
    public SearchResultPage ITcheckbox(){
        driver.findElement(ITcheckbox).isSelected();
        driver.findElement(ITcheckbox).click();
        return new SearchResultPage(driver);

    }
    public SearchResultPage Artcheckbox(){
        driver.findElement(Artcheckbox).isSelected();
        driver.findElement(Artcheckbox).click();
        return new SearchResultPage(driver);
    }
}



