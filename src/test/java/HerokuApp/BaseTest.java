package HerokuApp;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.headless = true;
        Configuration.browser = "chrome";
    }
}
