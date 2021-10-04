package Workflows;

import Base.BaseFunctions;

public class MainPage extends BaseFunctions {

    public MainPage() {

    }

    /**
     * isMainPage:
     * Methods that verifies if main page has appeared.
     */
    public void isMainPage() {
        manage.wait.isElementVisible(bootUI.mainPage.createNewSnippets);
        manage.verify.urlText("https://bootsnipp.com/user");
    }
}
