package Base;

import Workflows.Login;
import Workflows.MainPage;

public class Tests {

    public Login login;
    public MainPage mainPage;

    Tests() {
        login = new Login();
        mainPage = new MainPage();
    }
}
