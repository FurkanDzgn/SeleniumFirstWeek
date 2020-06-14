package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathAdvance07 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://the-internet.herokuapp.com/typos");

        WebElement typo=driver.findElement(By.xpath("/html/body/div[2]/div/div/h3"));
        System.out.println(typo.getText());
        // throws no such element exception
        WebElement typo2=driver.findElement(By.xpath("//h3"));
        System.out.println(typo2.getText());

        // To store the webelements which is more than one,
        // we need to use the findElements() method

        // will return empty list
        List<WebElement> paragraphs=driver.findElements(By.xpath("//p"));

        for (WebElement p:paragraphs) {
            System.out.println(p.getText());
        }

        // a[contains(@href,'notification)]

        driver.navigate().to("https://the-internet.herokuapp.com/");
        // tagName[contains(@attributeName,'attributeValue)]
        WebElement notification=driver.findElement(By.xpath("//a[contains(@href,'notification')]"));
        System.out.println(notification.getText());
        notification.click();

        driver.navigate().back();

        WebElement notification2=driver.findElement(By.xpath("//a[contains(text(),'Notification')]"));
        System.out.println(notification2.getText());
        notification2.click();

    }
}
