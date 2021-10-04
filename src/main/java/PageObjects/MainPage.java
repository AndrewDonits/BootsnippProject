package PageObjects;

import Base.ManagePages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends ManagePages {

    @FindBy(xpath = "//a[@href='https://bootsnipp.com/user/snippets/new']")
    public WebElement createNewSnippets;


    public MainPage(WebDriver driver) {
        super(driver);
    }

}
