package Pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class DataTablePage {

    public ElementsCollection duesFromFirstTable() {
        return $$(By.xpath("//table[@id='table1']//tr/td[4]"));
    }

    public Double calculationDues() {
        Double total = 0.00;
        for (int i = 0; i < duesFromFirstTable().size(); i++) {
            String duesAmout = duesFromFirstTable().get(i).getText().replace("$", "");
            total = total + Double.parseDouble(duesAmout);
        }

        return total;
    }
}
