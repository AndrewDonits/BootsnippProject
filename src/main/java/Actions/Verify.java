package Actions;

import Base.BaseFunctions;
import org.testng.Assert;

public class Verify extends BaseFunctions {

    public Verify() {
        super();
    }

    /**
     * urlText:
     * Verifies if the url is equal to a given URL
     * @param expectedURL The expected URL value
     */
    public void urlText(String expectedURL) {
        String actual = driver.getCurrentUrl();
        try {
            Assert.assertEquals(actual, expectedURL);
            System.out.println("Current URL is equal to expected one");
        } catch (Exception e) {
            Assert.fail("Current URL: " + actual + ", isn't equal to expected URL: " + expectedURL);
        }

    }
}
