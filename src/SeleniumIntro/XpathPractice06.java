package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathPractice06 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("file:///C:/Users/12242/Desktop/After%203%20motnhs%20sublime/Techtorial%20(2).html");
        WebElement firstName=driver.findElement(By.xpath("//input[@name=\"firstName\"]"));
        firstName.sendKeys("Furkan");

        WebElement lastName=driver.findElement(By.xpath("//input[@name='lastName']")); // --> tag , attribute , value of attribue
        lastName.sendKeys("Duzgun");

        List<WebElement> links=driver.findElements(By.xpath("//a"));

        for (WebElement link:links) {
            String url=link.getAttribute("href");
            System.out.println(url);

        }


    }
}
