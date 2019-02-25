import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wdriver1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//Enter the url and get the page
		driver.get("http://www.naukari.com");
		//get the current url present in address bar and print it
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//get the title and print
		String title=driver.getTitle(); 
		System.out.println(title);
		//close all the browser
		driver.quit();
	}

}
