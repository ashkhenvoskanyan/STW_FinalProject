package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


    private static WebDriver driver;
    private static By JobsButton = By.linkText("Jobs");
    private static By SearchCandidates = By.linkText("Search Candidates");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public static JobPage clickJobButton(){
        driver.findElement(JobsButton).click();
        return new JobPage(driver);
    }

    public static CandidateSearchPage clickSearchCandidates(){
        driver.findElement(SearchCandidates).click();
        return new CandidateSearchPage(driver);
    }



}