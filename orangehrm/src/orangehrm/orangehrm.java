package orangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class orangehrm  {

	@Test
	
		public void launchorangehrm() throws Exception
		{
System.setProperty("webdriver.gecko.driver","C:\\Users\\MyPc\\Desktop\\Seleniumwebdriver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("http://localhost/orangehrm/web/index.php/auth/login");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.name("username")).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("Stc@1234");
driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	System.out.println("Add Employee");
	driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
	
	driver.findElement(By.name("firstName")).sendKeys("Jariya");
	driver.findElement(By.name("middleName")).sendKeys("Rahim");
	Thread.sleep(3000);
	driver.findElement(By.name("lastName")).sendKeys("JR");
	
	
	
	
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")).click();
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys("jariyarah");
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")).sendKeys("Stc@1234");
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")).sendKeys("Stc@1234");
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	}

}
