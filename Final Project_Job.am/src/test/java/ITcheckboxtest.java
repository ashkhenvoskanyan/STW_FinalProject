import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.JobPage;

public class ITcheckboxtest extends BaseTest {
    @Test
    public void testSuccessfulITcheckbox() {
        JobPage JobPage = HomePage.clickJobButton();
        JobPage.ITcheckbox();

        //Assert.assertEquals();
    }

    @Test
    public void testSuccessfulArtcheckbox() {
        JobPage JobPage = HomePage.clickJobButton();
        JobPage.Artcheckbox();
    }
}