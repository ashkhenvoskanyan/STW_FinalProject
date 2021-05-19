import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.JobPage;

import pages.SearchResultPage;


import static pages.SearchResultPage.findElements;

public class SearchTest extends BaseTest {

    @Test
    public void testSuccessfulSearch(){
        JobPage JobPage = HomePage.clickJobButton();
        JobPage.setSearchField("developer");
        JobPage.clickSearch();

        //Assert.assertEquals(findElements(),"developer");
    }

    @Test
    public void testFailSearch(){
        JobPage JobPage = HomePage.clickJobButton();
        JobPage.setSearchField("bb");
        JobPage.clickSearch();
       // Assert.assertEquals();
        SearchResultPage.Errormessage();
    }



}
