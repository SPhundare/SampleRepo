package java_Program;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_chromeBrowser\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://accounts.google.com/signup");
		
		TakesScreenshot tsc=(TakesScreenshot)driver;
		File sc=tsc.getScreenshotAs(OutputType.FILE);
		File screen=new File("C:\\Users\\91976\\OneDrive\\Desktop\\Screenshots");
		System.out.println("ScreenShot taken");
		
		

	}

}
