package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectMay4 {
    public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
//        WebDriver driver= new ChromeDriver();
//        driver.get("file:///C:/Users/12242/Desktop/After%203%20motnhs%20sublime/Project.html");
//
//        WebElement element = driver.findElement(By.id("name"));
//        String el = element.getText();
//        System.out.println(el);

        System.setProperty("webdriver.driver.chrome","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/12242/Desktop/After%203%20motnhs%20sublime/Project.html");

        WebElement element = driver.findElement(By.id("male1"));
        String elementName = element.getText();
        System.out.println(elementName);
        System.out.println(element.isDisplayed());
        String expectedReg="Male";

        if(expectedReg.equals(elementName)){
            System.out.println("Test is passed");
        }else
            System.out.println("Test is failed");

        WebElement tattoos = driver.findElement(By.id("tattoos1"));
        String tattoosElemnt=tattoos.getText();
        System.out.println(tattoosElemnt);
        System.out.println(tattoos.isDisplayed());


        String[] idList = {"name","address","email","PhoneNumber","IQ"};
        String [] disNames = {"Name:","Address:","Email:","Phone Number:","IQ:"};

        for (int i=0;i<idList.length;i++){

            WebElement element1 = driver.findElement(By.id(idList[i]));
            String elementName1= element1.getText();
            if(disNames[i].equals(elementName1)){
                System.out.println("Test is passed "+idList[i]);
                System.out.println(disNames[i]+" is displayed "+element1.isDisplayed());
            }else {
                System.out.println("Test is failed.");
            }
        }

        WebElement element2=driver.findElement(By.id("Date"));
        String element2Name=element2.getText();
        System.out.println(element2Name);
        System.out.println(element2.isDisplayed());

    }
}
