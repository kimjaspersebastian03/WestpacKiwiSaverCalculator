package testCases;

import java.io.IOException;
import java.util.function.Function;

import base.Basepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Elements;

public class ProjectForGrowth extends Basepage {


    public ProjectForGrowth() throws IOException {
        super();

    }

    @BeforeTest
    public void setup() throws IOException {
        driver = getDriver();
        driver.get(getUrl());
    }

//    @AfterTest
//    public void tearDown() {
//        driver.close();
//        driver = null;
//    }

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

        wait.until(ExpectedConditions.visibilityOf(elements.getEmpStatDrpDwn())).click();

        wait.until(ExpectedConditions.visibilityOf(elements.getSelfEmployedOpt())).click();

        wait.until(ExpectedConditions.visibilityOf(elements.getEnterBalanceInpt())).sendKeys("36000");

        wait.until(ExpectedConditions.visibilityOf(elements.getNext2Btn())).click();

        wait.until(ExpectedConditions.visibilityOf(elements.getcontriFreqDrpDwn())).click();

        wait.until(ExpectedConditions.visibilityOf(elements.getContriAnnualOpt())).click();

        wait.until(ExpectedConditions.visibilityOf(elements.getContriAmtInput())).sendKeys("4000");

        wait.until(ExpectedConditions.visibilityOf(elements.getNext3Btn())).click();

        wait.until(ExpectedConditions.visibilityOf(elements.getFundTypDrpDwn())).click();

        wait.until(ExpectedConditions.visibilityOf(elements.getModerateOpt())).click();

        String projectedFund = elements.getProjGrowthText().getAttribute("textContent");

        System.out.println("The projected fund at the age of 65 is "+ projectedFund);


    }




}
