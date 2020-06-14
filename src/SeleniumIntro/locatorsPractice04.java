package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsPractice04 {

    public static void main(String[] args) {

        System.setProperty("webdriver.driver","chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/12242/Desktop/Techtorial.html");
     // file:///C:/Users/12242/Desktop/After%203%20motnhs%20sublime/Techtorial.html

        // findElement(locator); --> return type of this method is WebElement
        WebElement header = driver.findElement(By.id("techtorial1"));
        // getText() --> it will take the text from webelement. return type of getText method is String
        String hd=header.getText();
        System.out.println("header of the page--> "+hd);

        WebElement signOn = driver.findElement(By.id("signOn"));  // webElement

        String signText=signOn.getText(); // actual value come from website
        String expectedText="SIGN-ON"; // expected is coming from Business requirement(Ux designer, Confluence Page)
        if(signText.equals(expectedText)){
            System.out.println("Test is passed--> "+signText);
        }else{
            System.out.println("Test is failed.");
        }

        WebElement register = driver.findElement(By.id("register"));
        String regText = register.getText();
        String expectedReg="REGISTER";
        if(regText.equals(expectedReg)){
            System.out.println("Test is passed--> "+regText);
        }else{
            System.out.println("Test is failed.");
        }

        WebElement support = driver.findElement(By.id("support"));
        String supportText = support.getText();
        String expectedSup="SUPPORT";
        if(supportText.equals(expectedSup)){
            System.out.println("Test is passed--> "+supportText);
        }else{
            System.out.println("Test is failed.");
        }

        WebElement contact = driver.findElement(By.id("contact"));
        String contactText = contact.getText();
        String expectedCont="CONTACT";
        if(contactText.equals(expectedCont)){
            System.out.println("Test is passed--> "+contactText);
        }else{
            System.out.println("Test is failed.");
        }


    }
}
