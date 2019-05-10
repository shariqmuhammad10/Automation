package Package1;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by shariq.muhammad on 3/8/2016.
 */
public class TestWikipedia {

    WebDriver driver ;
    WebDriverWait wait;


    @Before
            public void TestWiki(){
            driver = new FirefoxDriver();
            wait = new WebDriverWait(driver ,20);
    }

    @Test


        public void start(){

        driver.get("http://www.wikipedia.com");
        wait.until(ExpectedConditions.titleIs("Wikipedia"));
        WebElement englishTitle = driver.findElement(By.cssSelector("a[href='//en.wikipedia.org/'].link-box"));
        System.out.println(englishTitle);
        wait.until(ExpectedConditions.elementToBeClickable(englishTitle));
        englishTitle.click();
        WebElement frenchlink = driver.findElement(By.cssSelector("a[href='//fr.wikipedia.org/'].link-box"));
        wait.until(ExpectedConditions.elementToBeClickable(frenchlink));
        }


    @After
    public void closeBrowser(){

        driver.close();
    }


}
