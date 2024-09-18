
package practise_5_9_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Setup WebDriver using WebDriver Manager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testLoginToGoogleDrive() {
        // Open Google Drive login page
        driver.get("https://www.facebook.com/");
        
        // Find and interact with the login elements
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("standard_user");

        WebElement nextButton = driver.findElement(By.id("identifierNext"));
        nextButton.click();

        // Wait for the password input element to be visible
        WebElement passwordInput = driver.findElement(By.name("password"));
        // You may want to use explicit wait here if necessary

        passwordInput.sendKeys("your_password");

        WebElement passwordNextButton = driver.findElement(By.id("passwordNext"));
        passwordNextButton.click();

        // You can add assertions or further test steps here if needed
    }

    @AfterClass
    public void tearDown() {
        // Close the browser after the test
        if (driver != null) {
            driver.quit();
        }
    }
}


