package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) {
		// set up the path
		WebDriverManager.chromedriver().setup();
		//Launch the Browser(Chrome)
		ChromeDriver driver=new ChromeDriver();
		//Window maximize
		driver.manage().window().maximize();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
         //click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//get the title of the page
		String title = driver.getTitle();//ctrl+2+l
		System.out.println(title);
		//click crmsfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Hari");
		driver.findElement(By.id("lastNameField")).sendKeys("Sudhan");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		System.out.println("Hari");
		driver.close();
	}

}
