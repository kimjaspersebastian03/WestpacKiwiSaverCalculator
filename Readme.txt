Automation Framework: Selenium
Programming Language: Java
Builder: Maven

RUNNING THE TEST:
a. Open the project to an IDE (IntelliJ or Eclipse)
b. Find the testng.xml file and run it

COVERAGE:
There is only one case covered on this test due to time constraint, please see below for the set of answers used on this test:
Age=41
What will you be using your KiwiSaver savings for first? First Home
How many years until you expect to purchase your first home? In 2 years
What’s your employment status? Self Employed
What’s your current KiwiSaver balance? 36000
Do you make any contributions? Annual
How much are your annually contributions? 4000
What type of fund are you currently in? Moderate

AUTOMATION STRUCTURE:
Pom file
-Contains the project configuration information and dependencies
Path: root directory/

Testng file
-contains the test configuration 
Path: root directory/

Basepage Class
-Initializes the Webdriver
-Loads the test configuration from config.properties file
Path: src/main/java/base/Basepage.java

Config Properties
-Contains the global variable of the Automation Framework
Path: src/main/java/resources/config.properties

Elements Class
-Contains the WebElements and their locators
-Contains getter methods for Encapsulation
Path: src/main/java/pageObjects/Elements.java

ProjectForGrowth Class (Test Case)
-Contains test steps
Path: src/test/java/testCases/ProjectForGrowth.java

Driver folder
-Contains all the drivers for different browsers (chromedriver, geckodriver and msedgedriver)
Path: src/main/java/drivers

Screenshot folder
-Contains screenshot for failed and passed tests
Path: root diretory/screenshot

ADDED FEATURES:
Cross browser testing
-Allows running the test on differet browsers (Chrome, Firefox and Edge)
-To choose the browser to use, simply change the browser settings on the config.properties file. 
-Valid configuration values are "chrome" and "firefox", any values beyond this will result to the use of MS Edge browser
-The test works on the following browser versions:
Chrome - 122.0.6261.112
Firefox - 123.0.1 
Edge - 122.0.2365.66 
-I also added screenshot showing that the test worked on different browsers
Path: screenshot/Passed Tests

Screenshot Capture
-Captures screenshot only when test fails

Note:
An issue occurs when using only the firefox browser, it is about an element is blocking the target element to be clicked so I added a code snippet to wait  until the blocking element disappears so that the driver can successfully click the target element. I commented "//fix for the firefox issue" on top of the code snippet





