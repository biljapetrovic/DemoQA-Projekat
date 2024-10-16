package Tests;

import Base.BaseTest;
import Pages.HomepagePageBeta;
import Pages.LoginPageBeta;
import Pages.PracticePageBeta;
import Pages.ProfilePageBeta;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestBeta extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {

        
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homepagePageBeta = new HomepagePageBeta();
        practicePageBeta = new PracticePageBeta();
        loginPageBeta = new LoginPageBeta();
        profilePageBeta = new ProfilePageBeta();
        driver.navigate().to("https://practicetestautomation.com/");
    }
    @AfterClass
    public void  tearDown () {driver.quit();}

    @Test
    public void userCanLogIn() {
        homepagePageBeta.clickOnPracticeButton();
        practicePageBeta.clickOnTestLoginPageButton();
        loginPageBeta.inputUsername("student");
        loginPageBeta.inputPassword("Password123");
        loginPageBeta.clickOnSubmitButton();
        Assert.assertTrue(profilePageBeta.logOutButton.isDisplayed());
    }

    @Test
    public void userCannotLogInWithInvalidUsername() {
        homepagePageBeta.clickOnPracticeButton();
        practicePageBeta.clickOnTestLoginPageButton();
        loginPageBeta.inputUsername("non student");
        loginPageBeta.inputPassword("Password123");
        loginPageBeta.clickOnSubmitButton();
        Assert.assertTrue(loginPageBeta.submitButton.isDisplayed());
    }
}
