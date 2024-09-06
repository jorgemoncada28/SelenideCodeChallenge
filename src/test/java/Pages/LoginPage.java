package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement username() {
        return $(By.id("username"));
    }

    public SelenideElement password() {
        return $(By.xpath("//input[@name='password']"));
    }

    public SelenideElement loginButton() {
        return $(By.xpath("//button[@type='submit']"));
    }

    public void login(String username, String password) {
        username()
                .should(visible, enabled)
                .setValue(username);
        password()
                .should(visible, enabled)
                .setValue(password);
        loginButton().click();
    }
}
