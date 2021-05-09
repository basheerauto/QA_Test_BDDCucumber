/**
 * In this class contains Pagewise business methods of facebook
 * Author:Basheer Ahamed
 * Date:05/08/2021
 */

package ApplicationPages;

import framework.webBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class Facebook_Page extends webBrowser {

    private static final String Login_button ="//button[normalize-space()='Log In']";
    private static final String createpost_lbl ="//div[@aria-label='Create']";
    private static final String clickpost_link ="//span[normalize-space()='Post']";
    private static final String postenter_edit ="//div[@data-block='true']//div";
    private static final String post_button="//div[@aria-label='Post']";

    //Verify webpage Title
    public static void verifyPagetitle(String Title) {
        try {
            Thread.sleep(5000);
            String j = driver.getTitle();
            System.out.println("Your page title Is : " + j);
            assertEquals(Title, driver.getTitle());
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong verify title");
            driver.quit();
        }
    }


    public static void login_facebook(String username,String password) {
        try {
            Thread.sleep(5000);
            driver.findElement(By.name("email")).clear();
            driver.findElement(By.name("email")).sendKeys(username);
            driver.findElement(By.name("pass")).clear();
            driver.findElement(By.name("pass")).sendKeys(password);
            driver.findElement(By.xpath(Login_button)).click();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong while login facebook");
            driver.quit();
        }
    }


    public static void createpost(String postcomments) {
        try {
            Thread.sleep(5000);
            driver.findElement(By.xpath(createpost_lbl)).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath(clickpost_link)).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath(postenter_edit)).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath(postenter_edit)).sendKeys(postcomments);
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong while posting facebook");
            driver.quit();
        }
    }


    public static void clickpost_button() {
        try {
            Thread.sleep(5000);
            driver.findElement(By.xpath(post_button)).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@aria-label='Facebook']")).click();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong while click post button in facebook");
            driver.quit();
        }
    }


    public static void checkposttext() {
        try {
            Thread.sleep(5000);

            WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Hello World!')]"));
            Actions action = new Actions(driver);
            action.moveToElement(element).build().perform();
            //driver.findElement(By.xpath("//div[contains(text(),'Hello World!')]")).click();
           String test= driver.findElement(By.xpath("//div[contains(text(),'Hello World!')]")).getText();
           assertEquals("Hello World!",test);
            System.out.println("Your posted comments Is : " + test);
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong while verify the review posting facebook");
            driver.quit();
        }
    }
}
