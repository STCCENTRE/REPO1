package Orangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class orangehrm {
	@Test
	
	  public void launchorangehrm() throws Exception
	  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\selenium\\chrome driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/orangehrm/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("Stc@1234");
	driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	 System.out.println("Add Employee");
	 driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
	 driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
		
	 driver.findElement(By.name("firstName")).sendKeys("gayathri");
	 driver.findElement(By.name("middleName")).sendKeys("nair");
	 Thread.sleep(3000);
	 driver.findElement(By.name("lastName")).sendKeys("sn");
		
		
		
	 driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")).click();
	 driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys("gayathri");
	 driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")).sendKeys("Stc@1234");
	 driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")).sendKeys("Stc@1234");
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	 }

	
	 }

	

