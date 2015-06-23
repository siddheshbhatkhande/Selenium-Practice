import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Test {

    public static void main (String args []) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\SeleniumTests\\chromedriver_win32\\chromedriver.exe");

        // Open Google site and Search for Facebook.

        WebDriver driver = new ChromeDriver();

        //loading google site

        driver.get("http://www.google.com");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // finding search box on google site id: "q"
       // driver.findElement(By.id("lst-ib")).click();

        //enter word facebook
        driver.findElement(By.id("lst-ib")).sendKeys("Facebook");

        // hitting Enter Key to search
        driver.findElement(By.id("sblsbb")).click();

        //driver.findElement(By.id("q")).sendKeys(Keys.ENTER);

        // code to search sign up option on search itself
        driver.findElement(By.linkText("Welcome to Facebook - Log In, Sign Up or Learn More")).click();

       driver.findElement(By.linkText("Sign Up")).click();

        //Enter First Name
        driver.findElement(By.id("u_0_0")).sendKeys("sid");

        // Enter Last Name
        driver.findElement(By.id("u_0_1")).sendKeys("ram");

        //entering email or mobile number
        driver.findElement(By.id("u_0_2")).sendKeys("siddheshbhatkhande@gmail.com");

        //Re-entering email or mobile number
        driver.findElement(By.id("u_0_4")).sendKeys("siddheshbhatkhande@gmail.com");

        //entering password
        driver.findElement(By.id("u_0_5")).sendKeys("autotest16#");

        //selecting Month
        Select monthVal = new Select (driver.findElement(By.id("month")));
        monthVal.selectByVisibleText("Jan");
        //Selecting Day
        Select dayVal = new Select (driver.findElement(By.id("day")));
        dayVal.selectByVisibleText("12");
        // Selecting Year
        Select yearVal = new Select (driver.findElement(By.id("year")));
        yearVal.selectByVisibleText("1987");
        // selecting gender
        driver.findElement(By.id("u_0_7")).click();
        // clicking on Sign Up Button to complete sign up
        driver.findElement(By.id("u_0_9")).click();



    }
}
