import org.testng.annotations.Test;
import pages.CandidateSearchPage;
import pages.HomePage;


public class CandidateSearchTest extends BaseTest {

    @Test
    public void testSuccessfulCandidateSearch() {
        CandidateSearchPage CandidateSearchPage = HomePage.clickSearchCandidates();
        CandidateSearchPage.setSearchField("developer");
        CandidateSearchPage.clickSearch();
    }

    @Test
    public void testFailCandidateSearch() {
        CandidateSearchPage CandidateSearchPage = HomePage.clickSearchCandidates();
        CandidateSearchPage.setSearchField("man");
        CandidateSearchPage.clickSearch();
    }
}


