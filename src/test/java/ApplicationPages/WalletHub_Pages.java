/**
 * In this class contains Pagewise business methods of WalletHub
 * Author:Basheer Ahamed
 * Date:05/08/2021
 */

package ApplicationPages;

import framework.webBrowser;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WalletHub_Pages extends webBrowser {


    private static final String starvalue= "body > web-app:nth-child(1) > div:nth-child(1) > div:nth-child(2) > main:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(8) > section:nth-child(1) > modal-dialog:nth-child(5) > div:nth-child(1) > div:nth-child(1) > write-review:nth-child(1) > review-star:nth-child(4) > div:nth-child(1) > svg:nth-child(4)";
    private static final String ReviewTxt="Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test";



    public static void Login_WalletHub_LightUser(String username,String password) {
        try {
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[text()='Login']")).click();
            driver.findElement(By.name("em")).clear();
            driver.findElement(By.name("em")).sendKeys(username);
            driver.findElement(By.name("pw1")).clear();
            driver.findElement(By.name("pw1")).sendKeys(password);
            driver.findElement(By.xpath("//button[@data-hm-tap='doSubmit($event);']")).click();
            Thread.sleep(3000);
           // driver.findElement(By.xpath("//span[@class='w-icon-wallet']/following::span")).click();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong while login WalletHub page");
            driver.quit();
        }
    }

    public static void ClickReview_btn() {
        try {
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[@class='btn blue-brds']")).click();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong while clicking Review button");
            driver.quit();
        }
    }

    public static void selectTypeInsurance() {
        try {
            Thread.sleep(5000);
            driver.findElement(By.xpath("//span[normalize-space()='Select...']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//li[normalize-space()='Health Insurance']")).click();

        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong while selcting Insurance type");
            driver.quit();
        }
    }


    public static void select_Star_value() {
        try {
            Thread.sleep(5000);
            WebElement element = driver.findElement(By.cssSelector(starvalue));
            Actions action = new Actions(driver);
            action.moveToElement(element).build().perform();
            Thread.sleep(2000);
            element.click();
          //  driver.findElement(By.cssSelector(starvalue)).click();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong while select star value");
            driver.quit();
        }

    }

    public static void enter_Review_comments_submit() {
        try {
            Thread.sleep(5000);
            driver.findElement(By.xpath("//textarea[@placeholder='Write your review...']")).click();
            driver.findElement(By.xpath("//textarea[@placeholder='Write your review...']")).sendKeys(ReviewTxt);
            driver.findElement(By.xpath("//div[@class='sbn-action semi-bold-font btn fixed-w-c tall']")).click();
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong while submitting review comments");
            driver.quit();
        }
    }



    public static void verify_review_posted_message() {
        try {
            Thread.sleep(5000);
            String msg= driver.findElement(By.xpath("//h4[normalize-space()='Your review has been posted.']")).getText();
            assertEquals(msg,"Your review has been posted.");
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong verify message");
            driver.quit();
        }
    }

    public static void clickContinue_btn() {
        try {
            Thread.sleep(5000);
            driver.findElement(By.xpath("//div[@class='btn rvc-continue-btn']")).click();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong while clicking continue button");
            driver.quit();
        }
    }


    public static void assertreviewposted() {
        try {
            Thread.sleep(5000);
            WebElement element1 =  driver.findElement(By.cssSelector("div[class='brgm-button brgm-user brgm-list-box'] span[class='brgm-list-title']"));
            Actions action = new Actions(driver);
            action.moveToElement(element1).build().perform();
            Thread.sleep(2000);
            action.moveToElement(element1).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//a[normalize-space()='Profile']")).click();
            Thread.sleep(1000);
            driver.findElement((By.xpath("//a[normalize-space()='Test Insurance Company']"))).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[normalize-space()='Your Review']")).click();
            String reviewtxt=driver.findElement(By.xpath("//*[@id=\"reviews-section\"]/section/article[1]/div[4]")).getText();
            assertEquals(reviewtxt,ReviewTxt );
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong while verify the review post assert");
            driver.quit();
        }
    }



}
