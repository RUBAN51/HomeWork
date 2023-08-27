//window handling

package org.selenium.practice1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WinnHand {

public static void main(String[] args) {
		// TODO Auto-generated method stub

		        String driverPath = System.setProperty("webdriver.chrome.driver","/home/ruban/eclipse/chromedriver-linux64/chromedriver");
				System.out.println(driverPath);
				// Launch the browser
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				capabilities.merge(capabilities);
				ChromeDriver driver = new ChromeDriver(options);
				driver.get("https://www.naukri.com/");
				List <String> windowhandles = new ArrayList<String>(driver.getWindowHandles());
				System.out.println(windowhandles.size());
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
				driver.findElement(By.xpath("//a[@id='login_Laye/r']")).click();
				

				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
/*
				WebElement window = driver.findElement(By.xpath("//div[@class='drawer-wrapper ']"));
				driver.switchTo().window("//div[@class='drawer-wrapper ']");
				*/
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("RUban");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7638952");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
	}

}
