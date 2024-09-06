package HerokuApp;

import Pages.DataTablePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

/**
 * This test covers:
 * taking some numeric values from elements adding them to each other, and verifying the result.
 * verifying numeric values of elements
 */
public class DataTablesTest extends BaseTest {

    DataTablePage dataTablePage = new DataTablePage();

    @Test
    public void dataTableTest() {

        open("/tables");
        Double total = dataTablePage.calculationDues();
        Assert.assertEquals(total, 251.00, "The total amount does not match");
    }


}
