import Base.BaseFunctions;
import org.testng.annotations.Test;


public class LoginSanity extends BaseFunctions {

    String email = "andonits5@gmail.com", password = "M@ymBHi2#ANshnX";


    @Test
    public void Test01_LoginPage_NewSimpleLogin() {
        tests.login.isLoginPage("Welcome back! Please sign in");
        tests.login.newLogin(email, password, true);
        tests.mainPage.isMainPage();
    }
}
