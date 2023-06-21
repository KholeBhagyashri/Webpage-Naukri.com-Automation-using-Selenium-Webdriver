package SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		Thread.sleep(100);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Login
		driver.findElement(By.xpath("//*[@id=\"usernameField\"]")).sendKeys("btdhumal333@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("passwordField")).sendKeys("bhagyesh@082021");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[type=submit]")).click();
		Thread.sleep(5000);
		
		//Mouse Over
		WebElement Jobs = driver.findElement(By.xpath("/html/body/div[3]/div[2]/nav/ul/li[1]"));
		Actions mouseover = new Actions(driver);
		mouseover.moveToElement(Jobs).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/nav/ul/li[1]/div/ul/li[1]/a/div[1]")).click();
		
		//Check Box
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div[5]/div[1]/div[1]/div[1]/div[3]/article[1]/div[1]/i")).click();
		
		//Mouse Scrolling
		WebElement target = driver.findElement(By.xpath("//*[@id=\"root\"]/div[5]/div[1]/div[1]/div[1]/div[3]/article[3]/div[2]/div[1]/div/p"));
		Actions mousescroll = new Actions(driver);
		Thread.sleep(2000);
		mousescroll.scrollToElement(target).perform();
		
		WebElement target1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[5]/div[1]/div[1]/div[1]/div[3]/article[5]/div[2]/div[1]/div/p"));
		Actions mousescroll1 = new Actions(driver);
		Thread.sleep(2000);
		mousescroll1.scrollToElement(target1).perform();
		Thread.sleep(2000);
		
		//WebElement target2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[5]/div[1]/div[1]/div[1]/div[3]/article[7]/div[2]/div[1]/div[1]/p"));
		//Actions mousescroll2 = new Actions(driver);
		//Thread.sleep(2000);
		//mousescroll2.scrollToElement(target2).perform();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"reco-header\"]/div/span[2]/button")).click();
		//Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		//View and Update Profile
		
		driver.findElement(By.xpath("/html/body/main/div/div/div/div/div/div[1]/div/div[3]/div[2]/a")).click();
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//*[@id=\"_6unwd2zwwNavbar\"]/div")).click();
		
		WebElement upload = driver.findElement(By.xpath("//*[@id=\"attachCV\"]"));
		upload.sendKeys("C:\\Users\\btdhu\\Downloads\\Bhagyashri Khole.pdf");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/span/div/div/div/div/div/div[2]/div[1]/div/div/ul/li[4]/span")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"lazyKeySkills\"]/div/div/div/div[1]/span[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"keySkillSugg\"]")).sendKeys("Selenium Webdriver");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"sugDrp_keySkillSugg\"]/ul/li[1]/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"saveKeySkills\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/span/div/div/div/div/div/div[2]/div[1]/div/div/ul/li[7]/span")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"lazyProject\"]/div/div/div/div[1]/span[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"projectTitle\"]")).sendKeys("Webpage Automation using Selenium with Java");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"clientName\"]")).sendKeys("Academic Project");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"projectDetailsForm\"]/div[5]/div[3]/label")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"projStartYearFor\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"ul_projStartYear\"]/ul/li[1]/a")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"projStartMonthFor\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"ul_projStartMonth\"]/ul/li[5]/a")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='projEndYearFor']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='ul_projEndYear']/ul/li[1]/a")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='projEndMonthFor']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='ul_projEndMonth']/ul/li[6]/a")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"projectDetails\"]")).sendKeys("This Project Automates the profile of already registered user in Naukri.com");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"submitProject\"]")).click();
		Thread.sleep(500);
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		//Log Out
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[2]/div[2]/div/div[3]/div/div[1]/div[4]/a")).click();
		driver.close();
		driver.quit();
	}

}
