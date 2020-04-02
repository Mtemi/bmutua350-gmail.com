package graph;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class JavaSelenium{
    public static void main(String[] args) throws InterruptedException, NoSuchElementException {
    	
    	System.setProperty("webdriver.chrome.driver","C:/Users/ICT/Documents/projects/chromedriver/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	System.out.println(driver.getCurrentUrl());  
    	String baseUrl = "https://onedrive.live.com/about/en-us/signin/"; 
        driver.get(baseUrl);

        System.out.println("Initial URL"
        		+ "\n"+driver.getCurrentUrl());
        driver.switchTo().frame(driver.findElement(By.className("SignIn")));
        WebElement email = driver.findElement(By.className("form-control"));
        email.sendKeys("beannsoftsweb@outlook.com");
        System.out.println("Email Entered");
        WebElement nextBtn = driver.findElement(By.xpath("//input[@type='submit']")); 
        nextBtn.click();
        System.out.println("Next Button Pressed");
        driver.switchTo().defaultContent();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Capturing Password Now");
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Mwanzo@#230101");
        System.out.println("Password Entered");
        WebElement SignInBtn = driver.findElement(By.id("idSIButton9")); 
        SignInBtn.click();
        System.out.println("Sign In Button Pressed");
        System.out.println("Trying to Login to OneDrive");
        String actualUrl="https://onedrive.live.com/about/en-us/signin/";
        String expectedUrl= driver.getCurrentUrl();
        if(actualUrl.equalsIgnoreCase(expectedUrl))
        {
            System.out.println("Login Failed");
        }
        else
        {
            System.out.println("Login Succeeded");
        } 

        System.out.println("Current URL"
        		+ "\n"+driver.getCurrentUrl());
        System.out.println("Start Uploading File.........");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://onedrive.live.com/?id=root&cid=8F3571DBA0C4B371");
        System.out.println("Check URL"
        		+ "\n"+driver.getCurrentUrl());
        //Tester.Browser.switchTo().defaultContent();
        WebElement uploadElement = driver.findElement(By.id("//div[@id='appRoot']"));
        uploadElement.click();
        System.out.println("Upload Button Clicked.........");
        //uploadElement.sendKeys("C:/Users/ICT/Documents/projects/chromedriver/newhtml.html");
        //driver.findElement(By.name("send")).click();
        //System.out.println("File Uploaded.........");
    }
}