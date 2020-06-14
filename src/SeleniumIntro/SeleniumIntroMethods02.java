package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroMethods02 {

    // What is the diffrenece between throw and throws
    // final, finally, finalize
    public static void main(String[] args) throws InterruptedException {
       // in every class before instantiating WebDriver object,
       // you must setProperty for Selenium

 //      System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
       System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        // driver.get waits for whole page to load
        driver.get("https://www.selenium.dev/");
        Thread.sleep(2000);
        // driver driver.navigate().to do not wait whole page to load
        driver.navigate().to( "https://www.oracle.com/java/");
        Thread.sleep(2000);
        // navigate()back navigates to previous page.
        driver.navigate().back(); // --> I will go back to Selenium website
        Thread.sleep(2000);
        // navigate().forward() navigates to forward
        driver.navigate().forward(); // --> it will go to the oracle website
        Thread.sleep(2000);
        // navigate().refresh() it refresh the page
        driver.navigate().refresh();

        //it will close your current tap/window
      //  driver.close(); // --> after close you can use the driver for previous pages.
        //  if you want to close all tabs/window
    //    driver.quit(); // --> after quit you can not use your driver anymore



    }
}
