package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePageBeta extends BaseTest {
    public ProfilePageBeta() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Log out")
    public WebElement logOutButton;

    //---------------------

    public void clickOnLogOutButton() {
        logOutButton.click();
    }
}
