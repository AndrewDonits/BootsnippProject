package Actions;

import Base.BaseFunctions;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Update extends BaseFunctions {

    public Update() {
        super();
    }

    public void text(WebElement elem, String value) {
        try {
            elem.sendKeys(value);
            System.out.println("Element updated successfully with the following text: " + value);
        } catch (Exception e) {
            Assert.fail("Couldn't update the element with the following text: " + value);
        }
    }
}
