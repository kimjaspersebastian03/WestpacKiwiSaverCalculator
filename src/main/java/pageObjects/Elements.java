package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {

    public WebDriver driver;

    By openCalculatorBtn = By.xpath("//span[@class='MuiButton-label']");
    By currentAgeInpt = By.cssSelector("input#text-QUESTION_AGE");
    By nextBtn = By.cssSelector("form > .MuiButton-contained.MuiButton-containedPrimary.MuiButton-root.MuiButtonBase-root > .MuiButton-label");

    By firstHomeBtn = By.cssSelector("div[role='radioGroup'] > button:nth-of-type(1)  svg");

    By yearsDrpDwn = By.cssSelector("div:nth-of-type(5) div[role='button']");

    By inTwoYearsOpt = By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[3]");

    By empStatDrpDwn = By.xpath("//div[6]//div[@role='button']");

    By selfEmployedOpt = By.cssSelector("div#menu-  ul > li:nth-of-type(2)");

    By enterBalanceInpt = By.cssSelector("input#text-QUESTION_KIWISAVER_BALANCE");

    By next2Btn = By.cssSelector("div:nth-of-type(7) > .hcbogO.sc-gGmIRh > .kkUwKt.sc-AzgDb > form > .MuiButton-contained.MuiButton-containedPrimary.MuiButton-root.MuiButtonBase-root > .MuiButton-label");

    By contriFreqDrpDwn = By.cssSelector("div:nth-of-type(8) div[role='button']");

    By contriAnnualOpt = By.cssSelector("div#menu-  ul > li:nth-of-type(5)");

    By contriAmtInput = By.cssSelector("input#text-QUESTION_VOLUNTARY_CONTRIBUTION_AMOUNT");

    By next3Btn = By.cssSelector("div:nth-of-type(9) > .hcbogO.sc-gGmIRh > .kkUwKt.sc-AzgDb > form > .MuiButton-contained.MuiButton-containedPrimary.MuiButton-root.MuiButtonBase-root");


    By fundTypDrpDwn = By.cssSelector("div:nth-of-type(10) div[role='button']");

    By moderateOpt = By.cssSelector("div#menu-  ul > li:nth-of-type(5)");

    By projGrowthText = By.cssSelector("[font-size='12']");

    public Elements(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getOpenCalculatorBtn() {
        return driver.findElement(openCalculatorBtn);
    }

    public WebElement getCurrentAgeInpt() {
        return driver.findElement(currentAgeInpt);
    }

    public WebElement getNextBtn() {
        return driver.findElement(nextBtn);
    }

    public WebElement getFirstHomeBtn() {
        return driver.findElement(firstHomeBtn);
    }

    public WebElement getYearsDrpDwn() {
        return driver.findElement(yearsDrpDwn);
    }

    public WebElement getInTwoYearsOpt() {
        return driver.findElement(inTwoYearsOpt);
    }

    public WebElement getEmpStatDrpDwn() {
        return driver.findElement(empStatDrpDwn);
    }

    public WebElement getSelfEmployedOpt() {
        return driver.findElement(selfEmployedOpt);
    }

    public WebElement getEnterBalanceInpt() {
        return driver.findElement(enterBalanceInpt);
    }

    public WebElement getNext2Btn() {
        return driver.findElement(next2Btn);
    }

    public WebElement getcontriFreqDrpDwn() {
        return driver.findElement(contriFreqDrpDwn);
    }

    public WebElement getContriAnnualOpt() {
        return driver.findElement(contriAnnualOpt);
    }

    public WebElement getContriAmtInput() {
        return driver.findElement(contriAmtInput);
    }

    public WebElement getNext3Btn() {
        return driver.findElement(next3Btn);
    }


    public WebElement getFundTypDrpDwn() {
        return driver.findElement(fundTypDrpDwn);
    }

    public WebElement getModerateOpt() {
        return driver.findElement(moderateOpt);
    }

    public WebElement getProjGrowthText() {
        return driver.findElement(projGrowthText);
    }
}
