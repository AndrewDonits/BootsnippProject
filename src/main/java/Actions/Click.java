package Actions;

import Base.BaseFunctions;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Click extends BaseFunctions {

    public void on(WebElement elem) {
        try {
            manage.wait.isElementClickable(elem);
            elem.click();
            System.out.println("Clicked on the element successfully");
        } catch (Exception e) {
            Assert.fail("Failed to click on element");
        }

    }
}
