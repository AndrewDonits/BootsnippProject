package Actions;

import Base.BaseFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class Wait extends BaseFunctions {

    public Wait() {
        super();
    }

    /**
     * isElementVisible:
     * Verifies if a given element is visible on page
     * @param elem A given web element
     */
    public void isElementVisible(WebElement elem) {
        try {
            driverWait.until(ExpectedConditions.visibilityOf(elem));
            System.out.println("Element is present in the page");
        } catch (Exception e) {
            Assert.fail("Element isn't present in the page");
        }
    }

    /**
     * isTextPresentInElement:
     * Verifies if a given element has a given text
     * @param elem A given web element
     * @param text A given web element text
     */
    public void isTextPresentInElement(WebElement elem, String text) {
        try {
            driverWait.until(ExpectedConditions.textToBePresentInElement(elem, text));
            System.out.println("The text:" + text + ", is present in the element");
        } catch (Exception e) {
            Assert.fail("The following text hasn't found in the element: " + text);
        }
    }

    /**
     * isElementClickable:
     * Verifies if a given element is clickable
     * @param elem A given web element
     */
    public void isElementClickable(WebElement elem) {
        try {
            driverWait.until(ExpectedConditions.elementToBeClickable(elem));
            System.out.println("Element is clickable");
        } catch (Exception e) {
            Assert.fail("The element isn't clickable");
        }
    }

}
