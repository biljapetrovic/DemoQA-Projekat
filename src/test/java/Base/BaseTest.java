package Base;

import Pages.HomepagePageBeta;
import Pages.LoginPageBeta;
import Pages.PracticePageBeta;
import Pages.ProfilePageBeta;
import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class BaseTest {
    public static WebDriver driver;
    public HomepagePageBeta homepagePageBeta;
    public PracticePageBeta practicePageBeta;
    public LoginPageBeta loginPageBeta;
    public ProfilePageBeta profilePageBeta;

    public ExcelReader excelReader;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();;

//        excelReader = new ExcelReader("TestData.xlsx");

        homepagePageBeta = new HomepagePageBeta();
        practicePageBeta = new PracticePageBeta();
        loginPageBeta = new LoginPageBeta();
        profilePageBeta = new ProfilePageBeta();
    }

}
