package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseFunctions {

    public static WebDriver driver;
    public static WebDriverWait driverWait;
    public static BootsnippUI bootUI;
    public static Tests tests;
    public static Manage manage;

    @BeforeClass
    public void beforeClass() {

    }

    @BeforeMethod
    public void beforeMethod() {
        String URL = "https://bootsnipp.com/login";

        //Chrome driver for my version of chrome
        WebDriverManager.chromedriver().browserVersion("94.0.4606.71").setup();

        // Latest chrome driver installed? use this setup instead:
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driverWait = new WebDriverWait(driver, 3);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(URL);
        bootUI = new BootsnippUI(driver);
        tests = new Tests();
        manage = new Manage();
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
