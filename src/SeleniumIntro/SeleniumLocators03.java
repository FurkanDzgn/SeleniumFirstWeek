package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLocators03 {
    public static void main(String[] args) {

        // this step is required to launch your browser(driver)
        // windows do not forget the .exe extension in your chromedriver.exe
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");

        // instantiate the WebDriver with ChromeDriver object
        WebDriver driver = new ChromeDriver();
        // without driver we can not navigate to page and open the chrome browser
        driver.navigate().to("file:///C:/Users/12242/Desktop/After%203%20motnhs%20sublime/Techtorial%20(2).html");
        // firstName text box. Return type of findElement is WebElement
         WebElement firstName=driver.findElement(By.name("firstName"));
         // sendKeys() method will take one parameter as string and send this value to your WebElement
        firstName.sendKeys("Furkan");
        firstName.clear();

        WebElement lastName=driver.findElement(By.name("lastName"));
        lastName.sendKeys("Duzgun");
        lastName.clear();

        WebElement phone=driver.findElement(By.name("phone"));
        phone.sendKeys("+12242010027");

        driver.findElement(By.name("userName")).sendKeys("furkanduzgun@gmail.com");


        WebElement address=driver.findElement(By.className("address"));
        address.sendKeys("2200 E Devon  Ave Suite 385");

        driver.findElement(By.className("cityName")).sendKeys("Mount Prospect");

        WebElement state=driver.findElement(By.className("className"));
        state.sendKeys("IL");

        WebElement zipCode=driver.findElement(By.className("postal"));
        zipCode.sendKeys("60056");

        // To be able to use the LinkTest locator, your webelement must be <a> tag and
        // you need use the text of this element
        // DOM -- Document Object Model
        // If you have more than one matching element,Selenium locator will execute the first matching
        // <a href="https://www.oracle.com/java/">Java</a>
        // <a href="https://www.oracle.com/java/technologies/javase-downloads.html">Java</a>
        WebElement javaButton=driver.findElement(By.linkText("Java"));
        javaButton.click(); // it will open java page

        driver.navigate().back(); // it will return back the techtorial page

        WebElement seleniumAutomation=driver.findElement(By.partialLinkText("Partial"));
        seleniumAutomation.click(); // it will go to the selenium page

        driver.navigate().back();

        // Finding WebElement with TagName <a>, <div> <tr> <td> <table> <p>
        WebElement techtorialHome=driver.findElement(By.tagName("a"));
        techtorialHome.click(); // in this line we have

        driver.navigate().back();

        WebElement submitButton=driver.findElement(By.id("submitbutton"));
        // submit method only works if your element is inside the <form> tag and type of element is "submit"
        System.out.println("Text of submit button"+submitButton.getText());
        // getAttribute() --> it will take one parameter as String(name of Attribute)
        String submitText=submitButton.getAttribute("value");
        System.out.println("getAttribute() -->>"+submitText);
        System.out.println(submitButton.getAttribute("class"));
        submitButton.submit();

        WebElement testNG=driver.findElement(By.linkText("TestNG"));
        String testNGLink=testNG.getAttribute("href");
        System.out.println(testNGLink);


    }
}
