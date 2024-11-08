package UdemyPratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println("Page Title :"+ driver.getTitle());
		System.out.println("Page URL :"+ driver.getCurrentUrl());
		driver.quit();
	}

}
