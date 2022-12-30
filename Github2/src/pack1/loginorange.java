package pack1;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginorange {

	@Test
	public void launch() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Richie Zen Sixtus\\Downloads\\Programs\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost/orangehrm/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("Stc@1234");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		System.out.println("Add Employee");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();	
		
		driver.findElement(By.name("firstName")).sendKeys("Richie");
		driver.findElement(By.name("middleName")).sendKeys("Zen");
		Thread.sleep(3000);
		driver.findElement(By.name("lastName")).sendKeys("S");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	
	}

}


