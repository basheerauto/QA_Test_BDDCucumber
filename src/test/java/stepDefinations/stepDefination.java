/**
 * In this class contains step definations of the feature file
 * Author:Basheer Ahamed
 * Date:02/19/2021
 */
package stepDefinations;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.utility;
import framework.webBrowser;
import ApplicationPages.*;
import javafx.application.Application;


public class stepDefination extends webBrowser{


    @When("^I open https://www\\.facebook\\.com$")
    public void i_open_https_www_facebook_com() throws Throwable {
        webBrowser.Driver("https://www.facebook.com"); // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I validate title and URL$")
    public void i_validate_title_and_URL() throws Throwable {
        ApplicationPages.Facebook_Page.verifyPagetitle("Facebook – log in or sign up");
    }

    @When("^user enter login_id \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_enter_login_id_and_password(String arg1, String arg2) throws Throwable {
        ApplicationPages.Facebook_Page.login_facebook(arg1,arg2);

    }

    @Then("^click create new post and enter the post status as \"([^\"]*)\"$")
    public void click_create_new_post_and_enter_the_post_staus_as(String arg1) throws Throwable {
        ApplicationPages.Facebook_Page.createpost(arg1);

    }

    @Then("^close the browser$")
    public void close_the_browser() throws Throwable {
        System.out.println("\n=====================================================================================================================");
        driver.quit();

    }

    @When("^Tescase\"([^\"]*)\" number and Testcase Description \"([^\"]*)\"$")
    public void tescase_number_and_Testcase_Description(String arg1, String arg2) throws Throwable {
        System.out.println("======"+"TestCase Number:"+arg1+"======"+"TestCase Description:"+arg2+"=============");
    }


    @Then("^click the post button \"([^\"]*)\"$")
    public void clickThePostButton(String arg0) throws Throwable {
        ApplicationPages.Facebook_Page.clickpost_button();
        Thread.sleep(5000);
        ApplicationPages.Facebook_Page.checkposttext();
        Thread.sleep(5000);
        utility.CaptureScreenshot(arg0+"_");
    }
}
