package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicDay05 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        // option+return for mac , alt+return for windows

        driver.get("http://www.testdiary.com/training/selenium/selenium-test-page/");

        WebElement saveButton=driver.findElement(By.id("demo"));
        System.out.println(saveButton.isEnabled());
   //     saveButton.click();
//        System.out.println(saveButton.isEnabled());
//        System.out.println(saveButton.isSelected());

        WebElement radioButton=driver.findElement(By.id("java1"));
        radioButton.click();
        System.out.println(radioButton.isEnabled());

        System.out.println(saveButton.isEnabled());

        System.out.println("==========================");

        WebElement seleniumBox=driver.findElement(By.id("seleniumbox"));
        System.out.println(seleniumBox.isSelected()); // false
        seleniumBox.click();
        System.out.println(seleniumBox.isSelected()); // true
        WebElement restapiBox=driver.findElement(By.name("restapi"));
        System.out.println(restapiBox.isSelected()); // true
        restapiBox.click(); // unselected
        System.out.println(restapiBox.isSelected());

    }
}
