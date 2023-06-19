package youtube;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Counts {
	WebDriver driver;
	@BeforeTest
	public void lunchDriver () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=XLblJabipjo");	
		driver.manage().window().maximize();
	}
	@Test 
	public void LikeCount() {
		List <WebElement> YtLikes = driver.findElements(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-watch-flexy/div[5]/div[1]/div/div[2]/ytd-watch-metadata/div/div[2]/div[2]/div/div/ytd-menu-renderer/div[1]/ytd-segmented-like-dislike-button-renderer/yt-smartimation/div/div[1]/ytd-toggle-button-renderer/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]"));
		System.out.println("The Ytlikes Count "  + YtLikes.size());
		
		WebElement subscriberCountElement = driver.findElement(By.xpath("//span[@class='yt-subscription-button-subscriber-count-branded-horizontal']"));

	
		
		
	}
	
	
	
	@AfterTest
	public void closeDriver() throws Exception {
		Thread.sleep(1000);
		driver.close();
	}
	
	
}
