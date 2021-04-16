import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 2020mt93192	Swati Vidyadhar Shanbhag
 * 2020mt93203	Chinna R Tellapati
 * 2020mt93049	Naresh Kasthuri
 * 2020mt93169  TamilSelvan N
 */
@Test
public class flipkart {
    public static WebDriver driver;

    public static void initWebdriver() {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkasthuri\\Music\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
    }

  

    public static void endSession() {
        driver.close();
        driver.quit();
    }
	
	  public static void main(String[] args) throws InterruptedException {
        initWebdriver();
        
        endSession();
    }
}
