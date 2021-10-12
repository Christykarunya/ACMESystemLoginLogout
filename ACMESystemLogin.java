package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACMESystemLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		String title = driver.findElement(By.xpath("//a[@class='navbar-brand']")).getText();
		System.out.println("Title of the page:" +title);
		
		//driver.findElement(By.xpath("//button[@class='navbar-toggle']")).click();
		//Thread.sleep(4000);
		
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(4000);
		
		driver.close();
	}

}
