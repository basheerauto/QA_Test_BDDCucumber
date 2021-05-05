Feature:User login to the Facebook and post the Status Successfully

  Background:
    When I open https://www.facebook.com
    Then I validate title and URL

  @Smoketest
  Scenario Outline:  To verify User login to the Facebook and post the Status Successfully
    When Tescase"<TCNum>" number and Testcase Description "<TCDesc>"
    When user enter login_id "<Login>" and password "<password>"
    Then click create new post and enter the post status as "<Postcomments>"
    Then click the post button "<TCNum>"
    Then close the browser

    Examples:
      |TCNum    |TCDesc                                                                 | Login               | password  |Postcomments|
      |TC_01    |To verify User login to the Facebook and post the Status Successfully  | digiumdsmb@gmail.com |Intel123* |Hello World!|