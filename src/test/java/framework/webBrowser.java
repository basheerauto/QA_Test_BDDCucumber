/**
 * In this class contains webBrowser related methods in framework level
 *  1)Driver()---Intiate chromedriver.
 *  2)isElementPresentOnScreen(By locator)--verify if elements present in the page. *
 * Author:Basheer Ahamed
 * Date:05/09/2021
 */

package framework;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class webBrowser {

    public static WebDriver driver;

    //Initiate Webdriver with chrome driver
    public static void Driver(String URL) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        //Navigate to a URL
        driver.get(URL);
        System.out.println("URL Navigate Successfully");
    }



    //Verify isElementPresentOnScreen
    public static boolean isElementPresentOnScreen(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}



