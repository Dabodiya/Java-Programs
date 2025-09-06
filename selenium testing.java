
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.By;
public class FirstDemo {
	public void makeMyTrip() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\seleium testing\\chromedriver_win32//chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://www.makemytrip.com/railways/");
	
	System.out.println("Page Title : " + driver.getTitle() + "Page URL : " + driver.getCurrentUrl());
	
	
	driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div[2]/div/div[1]/label/span")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div/div/div/input")).sendKeys("Delhi");
	Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	int length = driver.findElements(By.cssSelector("ul.react-autosuggest_suggestions-list > li")).size();
	for(int i = 0; i < length; i++)
	{
		String element = driver.findElements(By.cssSelector("ul.react-autosuggest_suggestions-list > li >div > div > p.searchResult.font14.darkText > span")).get(i).getText();
		if(element.equals("Delhi"))
		{
			driver.findElements(By.cssSelector("ul.react-autosuggest_suggestions-list > li >div > div > p.searchResult.font14.darkText > span")).get(i).click();
			break;
		}
	}
	
	driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div[2]/div/div[2]/label/span")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/input")).sendKeys("Lucknow");
	Thread.sleep(2000);
	
	length = driver.findElements(By.cssSelector("ul.react-autosuggest_suggestions-list > li")).size();
	for(int i = 0; i < length; i++)
	{
		String element = driver.findElements(By.cssSelector("ul.react-autosuggest_suggestions-list > li >div > div > p.searchResult.font14.darkText > span")).get(i).getText();
		if(element.equals("Lucknow"))
		{
			driver.findElements(By.cssSelector("ul.react-autosuggest_suggestions-list > li >div > div > p.searchResult.font14.darkText > span")).get(i).click();
			break;
		}
	}
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div[2]/div/div[3]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[6]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div[2]/div/div[4]")).click();
	
	length = driver.findElements(By.cssSelector("ul.travelForPopup > li")).size();
	for(int i = 0; i < length; i++)
	{
		String element = driver.findElements(By.cssSelector("ul.travelForPopup > li")).get(i).getText();
		if(element.equals("Third AC"))
		{
			driver.findElements(By.cssSelector("ul.travelForPopup > li")).get(i).click();
			break;
		}
	}
	Thread.sleep(2000);
	driver.findElement(By.xpath("// *[@id='root']/div/div[2]/div/div/div/div[2]/p/a")).click();
	driver.close();

	
}
	public static void main(String[] args) throws InterruptedException{
		FirstDemo obj = new FirstDemo();
		obj.makeMyTrip();
	}

}
