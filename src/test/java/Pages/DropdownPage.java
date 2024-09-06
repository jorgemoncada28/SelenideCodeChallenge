package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DropdownPage {

    public SelenideElement dropdownElement() {
        return $(By.xpath("//select[@id='dropdown']"));
    }

    public void selectOption(String option) {
        dropdownElement()
                .should(enabled, visible)
                .selectOption(option);
    }

    public String getSelectedOption() {
        return dropdownElement().getSelectedText();
    }

}
