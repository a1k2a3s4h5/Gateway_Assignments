import java.util.concurrent.TimeUnit;
//3.3 practical in which search and click perform.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishva Patel\\Downloads\\Webdriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        WebElement searchbox=driver.findElement(By.name("q"));
        WebElement clickbutton = driver.findElement(By.name("btnK"));
        
        searchbox.sendKeys("gateway group of companies");
        
        
        clickbutton.submit();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
        
        WebElement anchortag = driver.findElement(By.partialLinkText("Software Engineering Company, IT Consulting Services"));
        
        anchortag.click();
	}

}
