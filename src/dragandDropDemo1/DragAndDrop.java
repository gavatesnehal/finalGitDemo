package dragandDropDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.Chrome.driver", "D:\\jar\\chromedriver_win32.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//driver.manage().window().maximize();
		
		WebElement parentframe = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(parentframe); 
		
		WebElement childframe1 = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement childframe2 = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		
		Actions action = new Actions(driver); 
		//action.dragAndDrop(childframe1, childframe2).perform();
		action.clickAndHold(childframe1).moveToElement(childframe2).release().perform();
	
}
}