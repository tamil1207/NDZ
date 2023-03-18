package Reuse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Libgo {

	public static WebDriver driver;
	public static void Browser() {
		WebDriverManager.chromedriver().create();
		driver = new ChromeDriver();
		driver.get("http://ecomdemo.ndz.co.in:4007/");
	}
}
