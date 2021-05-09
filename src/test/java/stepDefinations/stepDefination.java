/**
 * In this class contains step definations of the feature file
 * Author:Basheer Ahamed
 * Date:05/09/2021
 */
package stepDefinations;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.utility;
import framework.webBrowser;
import ApplicationPages.*;
import javafx.application.Application;

import static ApplicationPages.Facebook_Page.*;


public class stepDefination extends webBrowser{


    @When("^I open https://www\\.facebook\\.com$")
    public void i_open_https_www_facebook_com() throws Throwable {
        webBrowser.Driver("https://www.facebook.com"); // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I validate title and URL$")
    public void i_validate_title_and_URL() throws Throwable {
        verifyPagetitle("Facebook – log in or sign up");
    }

    @When("^user enter login_id \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_enter_login_id_and_password(String arg1, String arg2) throws Throwable {
        login_facebook(arg1,arg2);

    }

    @Then("^click create new post and enter the post status as \"([^\"]*)\"$")
    public void click_create_new_post_and_enter_the_post_staus_as(String arg1) throws Throwable {
        Thread.sleep(5000);
        createpost(arg1);

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
        Facebook_Page.clickpost_button();
        Thread.sleep(5000);
        checkposttext();
        Thread.sleep(5000);
        utility.CaptureScreenshot(arg0+"_");
    }


    //// =====================WalletHub step definations===========================================

    @When("^I open https://wallethub\\.com/join/light$")
    public void i_open_https_wallethub_com_join_light()  {
        webBrowser.Driver("https://wallethub.com/join/light");
        }

    @Then("^I validate title and URL WalletHub page$")
    public void iValidateTitleAndURLWalletHubPage() {
        verifyPagetitle("Join WalletHub");
    }

    @When("^user enter light user login_id \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_enter_light_user_login_id_and_password(String arg1, String arg2)  {
        ApplicationPages.WalletHub_Pages.Login_WalletHub_LightUser(arg1,arg2);

    }


    @Then("^navigate to  http://wallethub\\.com/profile/test_insurance_company/$")
    public void navigateToHttpWallethubComProfileTest_insurance_company() {
       driver.get("http://wallethub.com/profile/test_insurance_company/");
    }

    @Then("^Then I validate title and URL Insurance company page$")
    public void thenIValidateTitleAndURLInsuranceCompanyPage() {
        verifyPagetitle("test insurance company metatitle test");
    }

    @Then("^click write Review button$")
    public void clickWriteReviewButton() {
        ApplicationPages.WalletHub_Pages.ClickReview_btn();
    }

    @Then("^select four star value$")
    public void selectFourStarValue() {
        ApplicationPages.WalletHub_Pages.select_Star_value();
    }

    @Then("^select type of Insurance$")
    public void selectTypeOfInsurance() {
        ApplicationPages.WalletHub_Pages.selectTypeInsurance();
    }

    @Then("^enter Review comments and submit$")
    public void enterReviewCommentsAndSubmit() {
        ApplicationPages.WalletHub_Pages.enter_Review_comments_submit();

    }

    @Then("^verify the Review submitted successfully message$")
    public void verifyTheReviewSubmittedSucessfullyMessage() {
        ApplicationPages.WalletHub_Pages.verify_review_posted_message();
        ApplicationPages.WalletHub_Pages.clickContinue_btn();
    }


    @Then("^navigate to profile and assert the posted review \"([^\"]*)\"$")
    public void navigateToProfileAndAssertThePostedReview(String arg0) throws Throwable {
        Thread.sleep(5000);
        ApplicationPages.WalletHub_Pages.assertreviewposted();
        Thread.sleep(2000);
        utility.CaptureScreenshot(arg0+"_");
    }
}
