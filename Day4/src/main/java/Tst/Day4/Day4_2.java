package Tst.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4_2 {
	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();

		WebDriver we=new EdgeDriver();

		String url="https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb";

		we.get(url);

		we.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Surey");

		we.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("727821tuee147");

		we.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("Ram"); we.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("727821tuee147");

		we.findElement(By.xpath("//*[@id=\"input-theme-7\"]")).click();

		we.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("i am happy");

		we.findElement(By.xpath("//*[@id=\"input-amount\"]")).sendKeys("2");

		we.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click(); we.findElement(By.linkText("Continue")).click();
	}
}