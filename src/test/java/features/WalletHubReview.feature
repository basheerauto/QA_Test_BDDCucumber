Feature:User login to WalletHub with light user and post the review comments Successfully

  Background:
    When I open https://wallethub.com/join/light
    Then I validate title and URL WalletHub page

  @Smoketest
  Scenario Outline: To verify  User login to WalletHub with light user and post the review comments Successfully
    When Tescase"<TCNum>" number and Testcase Description "<TCDesc>"
    When user enter light user login_id "<Login>" and password "<password>"
    Then navigate to  http://wallethub.com/profile/test_insurance_company/
    Then Then I validate title and URL Insurance company page
    Then click write Review button
    Then select four star value
    Then select type of Insurance
    Then enter Review comments and submit
    Then verify the Review submitted successfully message
    Then navigate to profile and assert the posted review "<TCNum>"
    Then close the browser
    Examples:
      |TCNum    |TCDesc                                                                                       | Login             | password  |
      |WHTC_01  |To verify  User login to WalletHub with light user and post the review comments Successfully | xxxxxxx@yahoo.com |xxxxxxxxxx |