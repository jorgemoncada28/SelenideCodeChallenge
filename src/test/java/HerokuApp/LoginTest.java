package HerokuApp;

import Pages.LoginPage;
import Pages.SecurePage;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

/**
 * This test covers:
 * clicking on an element, sending keys to the element, verifying string
 */
public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    SecurePage securePage = new SecurePage();

    @Test
    public void loginTest() {

        open("/login");
        loginPage
                .login("tomsmith", "SuperSecretPassword!");
        securePage
                .verifySuccessAlertMessage("You logged into a secure area!");
        Assert.assertTrue(WebDriverRunner.url().contains("secure"));
    }

}
