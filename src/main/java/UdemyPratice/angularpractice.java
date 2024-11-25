package UdemyPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class angularpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("aishwarya");
		driver.findElement(By.name("email")).sendKeys("aishwarya@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456789");

		if (driver.findElement(By.id("exampleCheck1")).isSelected()) {
			System.out.println("checkbox already selected");
		} else {

			driver.findElement(By.id("exampleCheck1")).click();
			System.out.println("checked");

		}

		WebElement dropdownElement = driver.findElement(By.id("exampleFormControlSelect1"));

		Select dropdown = new Select(dropdownElement);

		dropdown.selectByIndex(1);

		driver.findElement(By.xpath("//input[@value='option1']")).click();
		driver.findElement(By.xpath("//input[@value='option2']")).click();

		WebElement radiobtn = driver.findElement(By.xpath("//input[@value='option3']"));
		if (radiobtn.isEnabled()) {
			radiobtn.click();
		} else {
			System.out.println("radio button is desable");
		}
		driver.findElement(By.name("bday")).sendKeys("10101997");
		driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();
		String t1 = driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]")).getText();

		String[] s1 = t1.split("\n");
		String s2 = s1[1];

		System.out.println(s2);

	}

}
