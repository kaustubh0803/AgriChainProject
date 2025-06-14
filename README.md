# AgriChainProject

# Problem 1

The Solution of the Coding challenge to  find the length of the longest substring without repeating characters is provided under the "LongestSubstring.java" file present at path below:

AgrichainProject/src/test/java/tests

# Problem 2

A] The test cases are provided in the Agrichain project folder in the below file

TEST CASES FOR AGRICHAIN WEBSITE.docx

B] Automation Framework

* The Automation framework has been designed using Selenium with Java, following PageObject model as design pattern and Integrating TestNg and Maven.

* The Test Scenario considered for the framework is such that "A user is on the Input Home page==> User Provides an input string in the input fiels==> User clicks on Submit button==>User is navigated to the Results page==>     User verifies the Output field as the longest substring for the provided input String"

*  src/main/java/pageobjects ==> Package containing the Page object classes consisting of locators and methods for the Homepage and ResultPage pages.

*  src/test/java/tests  ==> Package contains LongestSubstring.java class which has the programming logic for Problem-1. Also has the VerifyLongestSubstring.java which is the test class containing the test case execution fot     the test scenario.

*  src/test/java/baseUtilities ==> Package contains the BaseClass.java class which contains the utilities methods such as browser initialization, Application URL launch and browser shutdown.

*  pom.xml ==> contains the dependencies such as Selenium, TestNg etc.

*  testNg.xml ==> contains the execution steps to run the whole project components such as packages, classes or methods.
