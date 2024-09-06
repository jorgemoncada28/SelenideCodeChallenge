package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SecurePage {

    public SelenideElement successAlertMessage() {
        return $(By.cssSelector("div[class='flash success']"));
    }

    public void verifySuccessAlertMessage(String successMessage) {
        successAlertMessage()
                .shouldHave(visible)
                .shouldHave(text(successMessage));
    }
}
