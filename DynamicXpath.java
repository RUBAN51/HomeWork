package org.selenium.practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DynamicXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverPath = System.setProperty("webdriver.chrome.driver","/home/ruban/eclipse/chromedriver-linux64/chromedriver");
		System.out.println(driverPath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-orgins=*");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		capabilities.merge(capabilities);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@class='input_error form_input' and @id='user-name']")).sendKeys("locked_out_user");
		driver.findElement(By.xpath("//input[@type='password' or @id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[contains(@class,'submit-button btn_action')]")).click();
	
	}
}
