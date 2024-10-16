package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePageBeta extends BaseTest {
    public HomepagePageBeta() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "menu-item-20")
    public WebElement practiceButton;

    //------------------

    public void clickOnPracticeButton() {
        practiceButton.click();
    }

}