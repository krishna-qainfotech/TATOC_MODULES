package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Action_keyword.FirstPageActions;
import Action_keyword.GridBoxActions;

public class MainTest {
	WebDriver driver;
	FirstPageActions firstpage;
	GridBoxActions gridboxpage;
	
	@BeforeTest
	public void openTatocLink() throws IOException {
		driver = new ChromeDriver();
		driver.get("http://10.0.1.86/tatoc");
		firstpage = new FirstPageActions( driver);
		gridboxpage = new GridBoxActions(driver);
	}
	
	@Test
	public void attempClickingBasicCourse() {
		firstpage.clickBasicCourse();
	}
	
	@Test
	public void attempGridBoxPage() {
		gridboxpage.clickGridBox("redbox");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		gridboxpage.clickGridBox("greenbox");
	}
	
	@Test
	public void attemptFrameAndDungeonPage() {
		
	}
}
