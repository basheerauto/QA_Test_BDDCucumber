<table width="750">
<tbody>
<tr>
<td width="750">
<p style="text-align: center;">QA Test Assessment - FB</p>
</td>
</tr>
</tbody>
</table>
<p>&nbsp;</p>
<table width="750">
<tbody>
<tr>
<td width="156">
<p><strong>ASSIGNMENT #1</strong></p>
</td>
<td width="594">
<p>To verify User login to the Facebook and post the Status Successfully</p>
</td>
</tr>
<tr>
<td width="156">
<p><strong>Features To be tested</strong></p>
</td>
<td width="594"><strong>Feature</strong>:User login to the Facebook and post the Status Successfully<br /> <br /> &nbsp; <strong>Background</strong>:<br /> &nbsp;&nbsp;&nbsp; <strong>When </strong>I open https://www.facebook.com<br /> &nbsp;&nbsp;&nbsp; <strong>Then </strong>I validate title and URL<br /> <br /> &nbsp; @Smoketest<br /> &nbsp; <strong>Scenario Outline</strong>:&nbsp; To verify User login to the Facebook and post the Status Successfully<br /> &nbsp;&nbsp;&nbsp; <strong>When </strong>Tescase"<strong>&lt;TCNum&gt;</strong>" number and Testcase Description "<strong>&lt;TCDesc&gt;</strong>"<br /> &nbsp;&nbsp;&nbsp; <strong>When </strong>user enter login_id "<strong>&lt;Login&gt;</strong>" and password "<strong>&lt;password&gt;</strong>"<br /> &nbsp;&nbsp;&nbsp; <strong>Then </strong>click create new post and enter the post status as "<strong>&lt;Postcomments&gt;</strong>"<br /> &nbsp;&nbsp;&nbsp; <strong>Then </strong>click the post button "<strong>&lt;TCNum&gt;</strong>"<br /> &nbsp;&nbsp;&nbsp; <strong>Then </strong>close the browser<br /> <br /> &nbsp;&nbsp;&nbsp; <strong>Examples</strong>:<br /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <strong>|</strong><em>TCNum&nbsp;&nbsp;&nbsp; </em><strong>|</strong><em>TCDesc&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</em><strong>| </strong><em>Login&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </em><strong>| </strong><em>password&nbsp; </em><strong>|</strong><em>Postcomments</em><strong>|<br /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |</strong><strong>FBTC_01&nbsp; </strong><strong>|</strong><strong>To verify User login to the Facebook and post the Status Successfully&nbsp; </strong><strong>| </strong><strong>xxxxxxxxx@gmail.com </strong><strong>|</strong><strong>xxxxxxxx</strong> <strong>|</strong><strong>Hello World!</strong><strong>|</strong>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="156">
<p><strong>Pre-requisite </strong></p>
</td>
<td width="594">
<p><strong>Enter valid facebook &nbsp;username / password in the feature file.</strong></p>
</td>
</tr>
<tr>
<td width="156">
<p><strong>Framework</strong></p>
</td>
<td width="594">
<p>BDD Framework</p>
</td>
</tr>
<tr>
<td width="156">
<p><strong>Framework Design Tools</strong></p>
</td>
<td width="594">
<p>Java 1.8 , BDD Cucumber, Page Object Model, Selenium webdriver, Maven, JVM Cucumber Report</p>
</td>
</tr>
<tr>
<td width="156">
<p><strong>Version Control</strong></p>
</td>
<td width="594">
<p>GITHUB : Clone Repo URL: <a href="https://github.com/basheerauto/QA_Test_WalletHub">https://github.com/basheerauto/QA_Test_WalletHub</a></p>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="156">
<p><strong>Author </strong></p>
</td>
<td width="594">
<p>Basheer Ahamed</p>
</td>
</tr>
<tr>
<td width="156">
<p><strong>Run</strong></p>
</td>
<td width="594">
<p>mvn Clean Test</p>
</td>
</tr>
<tr>
<td width="156">
<p><strong>Browser</strong></p>
</td>
<td width="594">
<p>Chrome Driver Browser</p>
</td>
</tr>
<tr>
<td width="156">
<p><strong>Test Report Path</strong></p>
</td>
<td width="594">
<p>HTML Report: Project folder&rarr;target/Cucumber-html-report/index.html JVM Cucumber Report: Project Folder&rarr; target/Cucumber-JVM-Reports/cucumber-html[1]reports/feature-overview.htm</p>
</td>
</tr>
</tbody>
</table>
<p>&nbsp;</p>
<p>&nbsp;</p>
<table width="750">
<tbody>
<tr>
<td width="156">
<p><strong>ASSIGNMENT #2</strong></p>
</td>
<td width="594">To verify&nbsp; User login to WalletHub with light user and post the review comments Successfully
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="156">
<p><strong>Features To be tested</strong></p>
</td>
<td width="594"><strong>Feature</strong>:User login to WalletHub with light user and post the review comments Successfully<br /> <br /> &nbsp; <strong>Background</strong>:<br /> &nbsp;&nbsp;&nbsp; <strong>When </strong>I open https://wallethub.com/join/light<br /> &nbsp;&nbsp;&nbsp; <strong>Then </strong>I validate title and URL WalletHub page<br /> <br /> &nbsp; @Smoketest<br /> &nbsp; <strong>Scenario Outline</strong>: To verify&nbsp; User login to WalletHub with light user and post the review comments Successfully<br /> &nbsp;&nbsp;&nbsp; <strong>When </strong>Tescase"<strong>&lt;TCNum&gt;</strong>" number and Testcase Description "<strong>&lt;TCDesc&gt;</strong>"<br /> &nbsp;&nbsp;&nbsp; <strong>When </strong>user enter light user login_id "<strong>&lt;Login&gt;</strong>" and password "<strong>&lt;password&gt;</strong>"<br /> &nbsp;&nbsp;&nbsp; <strong>Then </strong>navigate to&nbsp; http://wallethub.com/profile/test_insurance_company/<br /> &nbsp;&nbsp;&nbsp; <strong>Then </strong>Then I validate title and URL Insurance company page<br /> &nbsp;&nbsp;&nbsp; <strong>Then </strong>click write Review button<br /> &nbsp;&nbsp;&nbsp; <strong>Then </strong>select four star value<br /> &nbsp;&nbsp;&nbsp; <strong>Then </strong>select type of Insurance<br /> &nbsp;&nbsp;&nbsp; <strong>Then </strong>enter Review comments and submit<br /> &nbsp;&nbsp;&nbsp; <strong>Then </strong>verify the Review submitted successfully message<br /> &nbsp;&nbsp;&nbsp; <strong>Then </strong>navigate to profile and assert the posted review "<strong>&lt;TCNum&gt;</strong>"<br /> &nbsp;&nbsp;&nbsp; <strong>Then </strong>close the browser<br /> &nbsp;&nbsp;&nbsp; <strong>Examples</strong>:<br /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <strong>|</strong><em>TCNum&nbsp;&nbsp;&nbsp; </em><strong>|</strong><em>TCDesc&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</em><strong>| </strong><em>Login&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </em><strong>| </strong><em>password&nbsp; </em><strong>|<br /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |</strong><strong>WHTC_01&nbsp; </strong><strong>|</strong><strong>To verify&nbsp; User login to WalletHub with light user and post the review comments Successfully </strong><strong>| </strong><strong>xxxxxxx@yahoo.com </strong><strong>|</strong><strong>xxxxxxxxxx</strong> <strong>|</strong>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="156">
<p><strong>Pre-requisite </strong></p>
</td>
<td width="594">
<p><strong>Enter valid light user login username / password in the feature file.</strong></p>
</td>
</tr>
<tr>
<td width="156">
<p><strong>Framework</strong></p>
</td>
<td width="594">
<p>BDD Framework</p>
</td>
</tr>
<tr>
<td width="156">
<p><strong>Framework Design Tools</strong></p>
</td>
<td width="594">
<p>Java 1.8 , BDD Cucumber, Page Object Model, Selenium webdriver, Maven, JVM Cucumber Report</p>
</td>
</tr>
<tr>
<td width="156">
<p><strong>Version Control</strong></p>
</td>
<td width="594">
<p>GITHUB : Clone Repo URL: <a href="https://github.com/basheerauto/QA_Test_WalletHub">https://github.com/basheerauto/QA_Test_WalletHub</a></p>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="156">
<p><strong>Author </strong></p>
</td>
<td width="594">
<p>Basheer Ahamed</p>
</td>
</tr>
<tr>
<td width="156">
<p><strong>Run</strong></p>
</td>
<td width="594">
<p>mvn Clean Test</p>
</td>
</tr>
<tr>
<td width="156">
<p><strong>Browser</strong></p>
</td>
<td width="594">
<p>Chrome Driver Browser</p>
</td>
</tr>
<tr>
<td width="156">
<p><strong>Test Report Path</strong></p>
</td>
<td width="594">
<p>HTML Report: Project folder&rarr;target/Cucumber-html-report/index.html JVM Cucumber Report: Project Folder&rarr; target/Cucumber-JVM-Reports/cucumber-html[1]reports/feature-overview.htm</p>
</td>
</tr>
</tbody>
</table>
