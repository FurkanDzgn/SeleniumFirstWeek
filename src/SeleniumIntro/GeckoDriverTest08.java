package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoDriverTest08 {
    public static void main(String[] args) {

        // this one will set the property for geckodriver, if the geckodriver is directly inside your
        // project you do not need to use setProperty method in Intellij
        System.setProperty("webdriver.gecko.driver","geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com/");

    }
}
