package OrangeHrmsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;



public class orangehrmdemo {
	@Test
	public void login()
	{
		System.setProperty("webdriver.gecko.driver","G:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://localhost/orangehrm/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("stc@1234");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();//login
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();//PIM
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();//Add employee
		
		driver.findElement(By.name("firstName")).sendKeys("Badiriya");
		driver.findElement(By.name("middleName")).sendKeys("A");
		driver.findElement(By.name("lastName")).sendKeys("Rahim");
		driver.findElement(By.name("")).sendKeys("badrysuhail");//username
		driver.findElement(By.name("")).sendKeys("ahsan12");//password
		driver.findElement(By.name("")).sendKeys("ahsan12");//confirmpassword
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();//save
		
	}

}

}
