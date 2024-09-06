package HerokuApp;

import Pages.DropdownPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

/**
 * This test covers:
 * selecting some value in some dropdown element
 */
public class DropdownTest extends BaseTest {

    DropdownPage dropdownPage = new DropdownPage();

    @Test
    public void dropdownTest() {

        open("/dropdown");
        dropdownPage.selectOption("Option 2");
        String selectedOption = dropdownPage.getSelectedOption();
        Assert.assertNotNull(dropdownPage.dropdownElement(), "The field is NULL - SOS!!");
        Assert.assertEquals(selectedOption, "Option 2", "The option value does not match");

    }
}
