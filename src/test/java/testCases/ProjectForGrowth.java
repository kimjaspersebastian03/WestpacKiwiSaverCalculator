package testCases;

import base.Basepage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Elements;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectForGrowth extends Basepage implements ITestListener {


    public ProjectForGrowth() throws IOException {
        super();

    }

    @BeforeTest
    public void setup() throws IOException {
        driver = getDriver();
        driver.get(getUrl());
    }

    @AfterTest
    public void tearDown() {
        driver.close();
        driver = null;
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());
        takeScreenshot(result.getName());
    }

    private void takeScreenshot(String testName) {


        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            String destination = System.getProperty("user.dir") + "/screenshots/" + testName + timestamp() + ".png";
            File finalDestination = new File(destination);
            FileUtils.copyFile(source, finalDestination);
            System.out.println("Screenshot taken: " + destination);
        } catch (Exception e) {
            System.err.println("Exception while taking screenshot: " + e.getMessage());
        }
    }

    public String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }

    @Test
    public void calculateFund() {
        Elements elements = new Elements(driver);

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOf(elements.getOpenCalculatorBtn())).click();

        wait.until(ExpectedConditions.visibilityOf(elements.getCurrentAgeInpt())).sendKeys("41");

        wait.until(ExpectedConditions.visibilityOf(elements.getNextBtn())).click();

        wait.until(ExpectedConditions.visibilityOf(elements.getFirstHomeBtn())).click();

        wait.until(ExpectedConditions.visibilityOf(elements.getYearsDrpDwn())).click();

        wait.until(ExpectedConditions.visibilityOf(elements.getInTwoYearsOpt())).click();

        //fix for the firefox issue
        if (driver instanceof FirefoxDriver) {
            wait.until(ExpectedConditions.invisibilityOf(elements.getMenuElement()));
        }

        wait.until(ExpectedConditions.visibilityOf(elements.getEmpStatDrpDwn())).click();

        wait.until(ExpectedConditions.visibilityOf(elements.getSelfEmployedOpt())).click();

        wait.until(ExpectedConditions.visibilityOf(elements.getEnterBalanceInpt())).sendKeys("36000");

        wait.until(ExpectedConditions.visibilityOf(elements.getNext2Btn())).click();

        wait.until(ExpectedConditions.visibilityOf(elements.getcontriFreqDrpDwn())).click();

        wait.until(ExpectedConditions.visibilityOf(elements.getContriAnnualOpt())).click();

        wait.until(ExpectedConditions.visibilityOf(elements.getContriAmtInput())).sendKeys("4000");

        //fix for the firefox issue
        if (driver instanceof FirefoxDriver) {
            wait.until(ExpectedConditions.invisibilityOf(elements.getMenuElement()));
        }

        wait.until(ExpectedConditions.visibilityOf(elements.getNext3Btn())).click();

        wait.until(ExpectedConditions.visibilityOf(elements.getFundTypDrpDwn())).click();

        wait.until(ExpectedConditions.visibilityOf(elements.getModerateOpt())).click();

        String projectedFund = elements.getProjGrowthText().getAttribute("textContent");

        System.out.println("The projected fund at the age of 65 is "+ projectedFund);


    }




}
