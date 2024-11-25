
package UdemyPratice;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class spicejetsearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		// Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Delhi (DEL)']")).click();
	//	Thread.sleep(5000);
//		Select s = new Select(driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79 r-1ozqkpa']")));
//		s.selectByVisibleText("Ahmedabad");

		driver.findElement(By.xpath("//div[contains(text(),'AMD')]")).click();
	//	Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'DEL')]")).click();

		driver.findElement(By.xpath(
				"//div[@data-testid=\"undefined-calendar-picker\"]/div[3]/div[2]/div/div[3]/div/div[3]/div/div[3]/div/div[normalize-space(text()) = '1']"))
				.click();
		driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers\"]")).click();

		WebElement s1 = driver
				.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-q4m81j'][normalize-space()='1']"));
		WebElement s2 = driver.findElement(By.xpath("(//div/div[@class='css-76zvg2 r-homxoj r-adyw6z r-q4m81j'][normalize-space()='0'])[1]"));
		WebElement s3 = driver.findElement(By.xpath("(//div/div[@class='css-76zvg2 r-homxoj r-adyw6z r-q4m81j'][normalize-space()='0'])[2]"));
		
		String text1 = s1.getText();
		String text2 = s2.getText();
		String text3 = s3.getText();
		
		int i1 = Integer.parseInt(text1);
		int i2 = Integer.parseInt(text1);
		int i3 = Integer.parseInt(text1);
		
		for (i1 = 1; i1 <= 4; i1++) {
			driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]")).click();

		}
		
		for (i2 = 0; i2 <= 3; i2++) {
			driver.findElement(By.xpath("//div[@data-testid=\"Children-testID-plus-one-cta\"]")).click();

		}
		
		for (i3 = 0; i3 <= 0; i3++) {
			driver.findElement(By.xpath("//div[@data-testid=\"Infant-testID-plus-one-cta\"]")).click();

		}
	//	Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers-done-cta\"]")).click();

		driver.findElement(By.xpath("//div[contains(text(),'Currency')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'USD')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers-done-cta\"]")).click();
		
	//	Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();

		System.out.println("Searched successfully");
		//		Select curr = new Select(driver.findElement(By.xpath("//div[normalize-space()='Currency']")));
//		curr.getOptions();
	}

}
