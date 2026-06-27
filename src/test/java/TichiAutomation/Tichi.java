package TichiAutomation;

import java.awt.Checkbox;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tichi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		String num = sc.nextLine();
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30l));
		
		driver.get("https://tichi-app-webapp-stage.web.app/");
		
		WebElement Signin = driver.findElement(By.xpath("//button[text()='Sign In']"));
		
		Signin.click();
		
		WebElement Email = driver.findElement(By.xpath("//input[@placeholder='Enter your email address']"));
		
		
		Email.sendKeys(email);
		
		WebElement Continuebtn = driver.findElement(By.xpath("//button[@type='submit']"));
		
		Continuebtn.click();
		
		WebElement FName = driver.findElement(By.id("firstName"));
		
		FName.sendKeys("Jegath");
		
		WebElement LName = driver.findElement(By.id("lastName"));
		
		LName.sendKeys("S R");
		
		WebElement MobileNumber = driver.findElement(By.id("phoneNumber"));
		
		MobileNumber.sendKeys(num);
		
		WebElement Pass = driver.findElement(By.id("password"));
		
		Pass.sendKeys("Jegath@1111");
		
		WebElement CPass = driver.findElement(By.id("confirmPassword"));
		
		CPass.sendKeys("Jegath@1111");
		
		WebElement Checkbox = driver.findElement(By.xpath("//button[@role='checkbox']"));
		
		Checkbox.click();
		
		WebElement SignUP = driver.findElement(By.xpath("//button[@type='submit']"));
		
		SignUP.click();

		driver.quit();
	}
}
