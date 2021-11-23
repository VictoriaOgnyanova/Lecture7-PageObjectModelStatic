package pages.adminarea;


import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Browser;


public class AdminDashboardPage extends BasePage {

    @FindBy(css = "div#content h1")
    private static WebElement dashboardHeading;

    static {
        PageFactory.initElements(Browser.driver, AdminDashboardPage.class);
    }

    /**
     * Asserts that the title of the Dashboard page equals the provided as parameter
     *
     * @param expectedDashboardTitle the expected dashboard page title as a String
     */
    public static void verifyDashboardTitle(String expectedDashboardTitle) {
        Assert.assertEquals(Browser.driver.getTitle(), expectedDashboardTitle);
    }

    /**
     * Asserts that the text of the heading in the Dashboard page
     * equals the provided as parameter
     *
     * @param expectedDashboardHeadingText the expected dashboard heading text
     * @param messageOnTestFailure the message that will appear in your test reports in case of failure
     */
    public static void verifyDashboardHeadingText(String expectedDashboardHeadingText, String messageOnTestFailure) {
        String actualDashboardHeadingText = dashboardHeading.getText();

        Assert.assertEquals(actualDashboardHeadingText, expectedDashboardHeadingText, messageOnTestFailure);
    }
}
