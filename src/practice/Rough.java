package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rough {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ram.kumar\\Desktop\\chrome.exe");
	   WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.orbitz.com");
		driver.findElement(By.xpath("//a[@id='primary-header-flight']")).click();
		driver.findElement(By.xpath("//label[@id='flight-type-one-way-label']")).click();
		driver.findElement(By.xpath("//input[@id='flight-origin']")).sendKeys("pune");
        driver.findElement(By.xpath("//input[@id='flight-destination']")).sendKeys("coimbatore");
        WebElement date=driver.findElement(By.xpath("//input[@id='flight-departing']"));
        date.sendKeys("03/01/2018");
        date.sendKeys(Keys.ENTER);

	}
}
