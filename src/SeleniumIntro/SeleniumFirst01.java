package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirst01 {

    public static void main(String[] args) throws InterruptedException {

        // key = name of driver , value=location of your driver
        // selenium --> driver --> browser
        // driver types --> chrome, geckodriver(firefox), ie...
        // windows user please add .exe at the end --> chromedriver.exe
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
 //       System.setProperty("webdriver.chrome.driver","chromedrover.exe");

        // Webdriver is an interface.ChromeDriver is an Object.
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/"); // --> we navigated to google
        // getTitle(); --> return string value of title from page
        String googleTitle=driver.getTitle();// it will get the title from google
        System.out.println(googleTitle);
        String googleUrl=driver.getCurrentUrl();
        System.out.println(googleUrl);
        String getHtml= driver.getPageSource();
    //   System.out.println(getHtml);

        Thread.sleep(3000); // 3 sc --> in this line java wait 3 sc

        driver.get("https://www.techtorialacademy.com/"); // --> we navigated to Techtorial
        String techtorialTitle=driver.getTitle(); // it will get the title from Techtorial
        System.out.println(techtorialTitle);

        String techtorialUrl=driver.getCurrentUrl();
        System.out.println(techtorialUrl);

    }
}
